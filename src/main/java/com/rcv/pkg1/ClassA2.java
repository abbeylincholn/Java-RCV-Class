package com.rcv.pkg1;

public class ClassA2 {

	public static void main(String[] args) {

		ClassA1 ca = new ClassA1();
		ca.publicMethod();
		ca.defaultMethod();
		ca.protectedMethod();

	}

	public void MethodA2() {

		System.out.println("Public MethodA2");
	}

}
