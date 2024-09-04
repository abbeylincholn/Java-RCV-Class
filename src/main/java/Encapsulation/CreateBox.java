package Encapsulation;

public class CreateBox {

	public static void main(String[] args) {

		// the first box data contains invalid data which can still be done in the Set and Get method... 
		//but the invalid data can be stop by providing logic in the set methods with the help of encapsulations 

		Common cm = new Common();
		//int h = cm.height = 10;
		//int l = cm.length = -20;
		//int b = cm.width = 30;

		int b = cm.setWidth(10);
		int l = cm.setLength(20);
		int h = cm.setHeigth(15);

		cm.setBoxDimension(l, b, h);

		System.out.println(cm.getLength());

	}

}
