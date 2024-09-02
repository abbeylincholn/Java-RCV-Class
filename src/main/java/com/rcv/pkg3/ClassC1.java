package com.rcv.pkg3;

import com.rcv.pkg1.ClassA1;
import com.rcv.pkg1.ClassA2;

public class ClassC1 {

	public static void main(String[] args) {

		ClassA1 ca = new ClassA1();
		ca.publicMethod();
		//ca.publicVariable;

		ClassA2 caa = new ClassA2();
		caa.MethodA2();

	}

}
