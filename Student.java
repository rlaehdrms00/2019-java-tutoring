package bbb;

public class Student {
    //�����ε� -> �����ڿ��� ���� ����ϴ�����
	//Ư¡-> �޼ҵ� �̸��̰���/ �Ű������� �ٸ� ����
	
	//0��
	public Student (/*�Ű�����*/) {
	}
	
	//1��
	public Student (String name) { 
	this.name=name;
	}
	
	//2��
	public Student (String name,int age) {
	this.name=name; this.age=age;
	}
	
	//�������̵� -> extends ����� �θ��� �޼ҵ带 �����ϴ°�
    public String studenntPrint() {
    	return "Hello";
    }
	
	
	public String name;
	public int age;
	public String major;

	public static void main(String[] args) {
		 
		     
	}

	

}
