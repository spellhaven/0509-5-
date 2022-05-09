package com.spellhaven.springch6ex1_0509_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// CTX 문서를 이렇게 2개 받아들여도 문제없다, ㅋ.
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml", "classpath:applicationCTX2.xml");
		
		Student stu1 = ctx.getBean("student1", Student.class);
		System.out.println(stu1.getName());
		
		StudentInfo stuInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student stu00 = stuInfo.getStudent();
		System.out.println(stu00.getName());
		
		// 같은 객체다. 위에서는 student1 빈을 가져와서 찍고,
		// 아래에서는 student1이 들어 있는 studentInfo 빈을 가져와서 getStudent()로 student1을 뽑아냈기 때문이다.
		// 그러니까 당연히 같지, ㅋ.
		if(stu1.equals(stu00)) {
			System.out.println("stu1과 stu00 객체는 같은 객체이디.");
		}
		
		Student stu2 = ctx.getBean("student2", Student.class);
		System.out.println(stu2.getName());
		
		Family gildongFam = ctx.getBean("family", Family.class);
		System.out.println(gildongFam.getFather());
		System.out.println(gildongFam.getMother());
		System.out.println(gildongFam.getSister());
		System.out.println(gildongFam.getBrother());
	
		ctx.close();
		
	}

}
