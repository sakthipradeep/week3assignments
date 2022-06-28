package assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id :"+id);
	}
	public void getStudentInfo(String Name) {
		System.out.println("student name is:"+Name);
	}
public void email(String NAMEE,int NAMEE1,String NAM) {
	System.out.println("student email:"+NAMEE+NAMEE1+NAM);
}
public void number(int number) {
	System.out.println("student number is:"+number);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students student=new Students();
		student.getStudentInfo(555);
		student.getStudentInfo("SAKTHI");
		student.email("sakthi", 555,"@gmailcom");
		student.number(123456789);
	}

}
