package bbb;

public class Student {
    //오버로딩 -> 생성자에서 많이 사용하는패턴
	//특징-> 메소드 이름이같고/ 매개변수가 다른 형태
	
	//0개
	public Student (/*매개변수*/) {
	}
	
	//1개
	public Student (String name) { 
	this.name=name;
	}
	
	//2개
	public Student (String name,int age) {
	this.name=name; this.age=age;
	}
	
	//오버라이딩 -> extends 상속한 부모의 메소드를 재사용하는것
    public String studenntPrint() {
    	return "Hello";
    }
	
	
	public String name;
	public int age;
	public String major;

	public static void main(String[] args) {
		 
		     
	}

	

}
