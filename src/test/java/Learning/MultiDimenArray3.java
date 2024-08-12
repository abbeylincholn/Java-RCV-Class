package Learning;

public class MultiDimenArray3 {

	public static void main(String[] args) {

		//3D Array

		int[][][] myMultiDimArray = new int[2][3][4];
		myMultiDimArray[0][0][0] = 2;
		myMultiDimArray[0][0][1] = 3;
		myMultiDimArray[0][0][2] = 5;
		myMultiDimArray[0][0][3] = 6;

		myMultiDimArray[0][1][0] = 8;
		myMultiDimArray[0][1][1] = 9;
		myMultiDimArray[0][1][2] = 11;
		myMultiDimArray[0][1][3] = 13;

		myMultiDimArray[0][2][0] = 10;
		myMultiDimArray[0][2][1] = 14;
		myMultiDimArray[0][2][2] = 15;
		myMultiDimArray[0][2][3] = 17;

		myMultiDimArray[1][0][0] = 9;
		myMultiDimArray[1][0][1] = 8;
		myMultiDimArray[1][0][2] = 11;
		myMultiDimArray[1][0][3] = 12;

		myMultiDimArray[1][1][0] = 12;
		myMultiDimArray[1][1][1] = 14;
		myMultiDimArray[1][1][2] = 13;
		myMultiDimArray[1][1][3] = 15;

		myMultiDimArray[1][2][0] = 21;
		myMultiDimArray[1][2][1] = 40;
		myMultiDimArray[1][2][2] = 21;
		myMultiDimArray[1][2][3] = 8;

		// System.out.println(myMultiDimArray[1][2]);

		// OR
		//int[2][3][4];
		int[][][] myMultiDimArray1 = { { { 2, 3, 5, 6 }, { 8, 9, 11, 13 }, { 10, 14, 15, 17 } },
				{ { 9, 8, 11, 12 }, { 12, 14, 13, 15 }, { 21, 40, 21, 8 } } };

		//System.out.println(myMultiDimArray1[1][2]);

		for (int i = 0; i < myMultiDimArray1.length; i++) {
			for (int j = 0; j < myMultiDimArray1[i].length; j++)
				for (int k = 0; k < myMultiDimArray1[i][j].length; k++)

				{
					System.out.println(myMultiDimArray1[i][j][k]);

				}
		}

		System.out.println(myMultiDimArray[1][0][0]);
		System.out.println(myMultiDimArray1[1][0][0]);

	}

}
