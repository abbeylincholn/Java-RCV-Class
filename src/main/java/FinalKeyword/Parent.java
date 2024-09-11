package FinalKeyword;

public class Parent {

	// if you use final for class, you cannot inherit the class, if for variable, you cannot change value of the variable
	// if you use with a method, you cannot override that particular method. 

	public final int i = 20;

	public final void setData() {

		System.out.println(i);
	}

}
