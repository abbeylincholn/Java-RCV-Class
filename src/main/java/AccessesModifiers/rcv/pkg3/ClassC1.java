package AccessesModifiers.rcv.pkg3;

import AccessesModifiers.rcv.pkg1.ClassA1;
import AccessesModifiers.rcv.pkg1.ClassA2;

public class ClassC1 {

	public static void main(String[] args) {

		ClassA1 ca = new ClassA1();
		ca.publicMethod();
		//ca.publicVariable;

		ClassA2 caa = new ClassA2();
		caa.MethodA2();

	}

}
