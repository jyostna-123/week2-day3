package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Chaaitra");
	}
	public void studentDept() {
		System.out.println("Computer engineering");
	}
	public void studentId() {
		System.out.println("CSE060505");
	}


	public static void main(String[] args) {
		
		Student Ca=new Student();
		Ca.collegeName();
		Ca.collegeCode();
		Ca.collegeRank();
		Ca.deptName();
		Ca.studentName();
		Ca.studentDept();
		Ca.studentId();

	}

}
