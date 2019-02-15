package exam;

class Student{
	String name;
	int grade;
	String schoolname;

}
public class StudentArray extends Student{
	public static void main(String[] args) {
		Student[] stu = new Student[10]; // 데이터타입 stu배열 stu방만 생성

		for(int i=0; i<stu.length; i++) {
			stu[i] = new Student();  // 메모리 할당
			stu[i].grade=i+1;
			System.out.println(stu[i].grade);
		} 
		
	}
}
