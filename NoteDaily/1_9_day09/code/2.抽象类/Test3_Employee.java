class Test3_Employee {
	public static void main(String[] args) {
		Coder c = new Coder("xiaohong","007",8000);
		c.work();
		Manger m = new Manger("����ʦ","95565",4444,55555);
		m.work();
	}
}
abstract class Employee {
	private String name;
	private String id;
	private double salary;
	public Employee() {} 
	public Employee(String name,String id, double salary) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public abstract void work() ;	
}
class Coder extends Employee {
	public Coder() {} 
	public Coder(String name,String id, double salary) {
		super(name,id,salary);
	}
	public void work() {
		System.out.println("�ҵ�������" + this.getName() + ",�ҵĹ�����" + this.getId() + ",�ҵĹ�����" + this.getSalary()+ ",�ҵĹ������ô���");
		}
}
class Manger extends Employee {
	private int bonus;
	public Manger() {} 
	public Manger(String name,String id, double salary,int bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}
	public void work() {
		System.out.println("�ҵ�������"+this.getName()+",�ҵĹ�����"+this.getId()+",�ҵĹ�����"+this.getSalary()+",�ҵĽ�����:"+bonus+",�ҵĹ����ǹ���");
		}
	}
