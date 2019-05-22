class Test2_Employee {
	public static void main(String[] args) {
		Employee e = new Employee("dj",5585,5522.5) ;
		e.work();
	}
}
class Employee {
	private String name;
	private int id;
	private double salary;
	public Employee() {
	}
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id =id;
	}
	public int getId() {
		return id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalery() {
		return salary;
	}
	public void work() {
		System.out.println("我的姓名是"+name+",我的工号是:"+id+",我的工资是"+salary+"我的工作是敲代码");
	}
}