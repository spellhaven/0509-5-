package com.spellhaven.springch6ex1_0509_5;

public class StudentInfo {
	
	private Student student;

// 원래 우리는 이런 생성자를 곧잘 만들었는데, 이 예제에서는 빈 생성자만 가지고 해 보자.
// 즉, 세터로만 student에 뭘 넣어 줄 수 있다. (세터만 인수가 있으니깡... 아래의 StudentInfo() 생성자는 인수가 없어서 뭐 못 받아들임...😩)
//	public StudentInfo(Student student) {
//		super();
//		this.student = student;
//	}
	
	public StudentInfo() {
		super();
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
