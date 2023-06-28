package org.college;

public class Students {
		
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
public void getStudentInfo(int id,String name) {
	System.out.println(id+name);
}	
	public void getStudentInfo(String email,int phoneNumber) {
System.out.println(email+phoneNumber);
}
	
	public static void main(String[] args) {
		Students info=new Students();
		info.getStudentInfo(19);
		info.getStudentInfo(19,"Chaaitra");
	
	info.getStudentInfo("Chaaitra@gmail.com", 98765432);

	}

}
