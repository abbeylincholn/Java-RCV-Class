package com.rcv.pkg1;

public class ClassA1 {

	// The four types of access modifiers

	public int publicVariable = 1;
	int defaultVariable = 2;
	private int privateVariable = 3;
	protected int protrectedVariable = 4;

	public static void main(String[] args) {

		ClassA1 ca = new ClassA1();
		ca.privateMethod();

	}

	public void publicMethod() {

		System.out.println("Public Method");
	}

	void defaultMethod() {

		System.out.println("Default Method");
	}

	private void privateMethod() {

		System.out.println("Private Method");
	}

	protected void protectedMethod() {

		System.out.println("Protected Method");
	}

}
