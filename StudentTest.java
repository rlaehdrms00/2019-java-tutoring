package bbb;

public class StudentTest {

	public static void main(String[] args) {
    Student student1= new Student();
    Student student2= new Student("�赿��",20);
    student1.name= "�赿��";
	student1.age=20;
	student1.major="��ǻ����������";
    
	System.out.println(student1.name + student1.age + student1.major);
	System.out.println(student2.name);
}
}
