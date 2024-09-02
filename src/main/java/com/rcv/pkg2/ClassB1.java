package com.rcv.pkg2;

import com.rcv.pkg1.ClassA1;
import com.rcv.pkg1.ClassA2;

public class ClassB1 extends ClassA1 { // ClassB1 inheriting ClassA1 to access protected 

	public static void main(String[] args) {

		ClassA1 ca = new ClassA1();
		ca.publicMethod();
		//ca.publicVariable;

		ClassA2 caa = new ClassA2();
		caa.MethodA2();

		ClassB1 cb = new ClassB1();
		cb.protectedMethod();

	}

}
