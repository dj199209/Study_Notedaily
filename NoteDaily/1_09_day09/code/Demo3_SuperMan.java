class Demo3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan(); //��������ָ���������,��������Ϊ����
									//��������ָ����������������ת��
		System.out.println(p.name);
		p.talkwork(); 
		SuperMan sm = (SuperMan)p;    //����ת��
		sm.fly();
		/*
		�������������Զ����������ǿ������ת��
		*/
		int i = 10;
		byte b = 20;
		i = b; //�Զ���������
		b = (byte)i;//ǿ������ת��
		
	}
}
class Person {
	String name = "jhon";
public void talkwork () {
	System.out.println("������!");
	}
	
}
class SuperMan extends Person {
	String name = "superMan";
	public void talkwork() {
		System.out.println("�������ڵ�����!");
	}
	public void fly(){
		System.out.println("�ɳ�ȥ����");
	}
}