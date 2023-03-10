package com.sb.basic.arraybasics;
public class ArrayBasics3 {

	private static final String movingAllElementsTowardsRighttwice = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBasics3 ar = new ArrayBasics3();
		// ar.movingAllElementsTowardsLeft();
		// ar.movingAllElementsTowardsRight();

		// ar.movingAllElementsTowardsLefttwice();
		// ar.movingAllElementsTowardsRighttwice();
		// ar.copyonearrayToanotherarray();
		// ar.reversethe_arrayelementinsamearray();

		 ar.removingAllDuplicateElementInGivenArray();
		 //ar.notRepeatedElementinGivenArray();
		//ar.notRepeatedElementinGivenArray_1();
	}

	private void notRepeatedElementinGivenArray_1() {
		// TODO Auto-generated method stub
		String[] name = { "m", "a", "d", "a", "m" };
		String first = name[0];
		String match1 = name[0];
		boolean match = false;
		for (int i = 0; i < name.length; i++) {

			for (int j = i + 1; j < name.length; j++) {
				match1 = name[0];
				String match2 = name[i];
				System.out.println("match1:: " + match1);
				
				String match3 = name[j];
				System.out.println("match3:: " + match3);

				if (match1.equals(match3) ){
					match = true;
					break;
				}
			}
		}
		if (match) {
			System.out.println(" IF " + match1 + " is non repeated element");

		}else {
			System.out.println(" ELSE " + match1 + " is repeated element");
		}

	}

	private void notRepeatedElementinGivenArray() {
		// TODO Auto-generated method stub
		char[] name = { 'm', 'a', 'd', 'a','m' };
		char first=' ';
		boolean match = false;
		for (int i = 0; i < name.length; i++) {
			 first = name[i];
			 match = false;
			for (int j = i + 1; j < name.length; j++) {
				if (first == name[j]) {
					match = true;
					break;
				}
			}if (match==false) {
				System.out.println(first + " is non repeated element");
				break;
		}
		

		}

	}

	private void removingAllDuplicateElementInGivenArray() {
		// TODO Auto-generated method stub
		char[] balls = { 'y', 'g', 'b', 'r', 'b', 'g', 'b', 'y', 'g', 'o', 'w', 'r' };

		int len = balls.length;
		int[] indicator = new int[len];
		char[] result = new char[len];
		int j = 0;
		while (j < balls.length) {
			int count = 1;
			char first = balls[j];

			int i;

			for (i = j + 1; i < balls.length; i++) {
				if (first != balls[i]) {
					continue;

				} else {
					count = count + 1;
					result[j] = 'y';
					indicator[i] = -1;
				}
			}

			if (result[j] != 'y') {
				result[j] = 'N';

				// System.out.println(first+ "is not repeated");
			} else {
				if (indicator[j] != -1) {
					System.out.println(first + "is repeated  " + count + "times");
				}
			}
			j++;
		}
	}

	private void reversethe_arrayelementinsamearray() {
		// TODO Auto-generated method stub
		int[] ar = { 4, 5, 6, 7 };
		int len = ar.length;
		for (int i = 0; i < ar.length - 2; i++) {
			int temp = ar[i];
			ar[i] = ar[len - (i + 1)];
			ar[len - (i + 1)] = temp;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

	private void copyonearrayToanotherarray() {
		// TODO Auto-generated method stub
		int[] a = { 4, 5, 6, 7 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		for (int j = 0; j < b.length; j++) {

			System.out.print(b[j] + " ");
		}
	}

	private void movingAllElementsTowardsRighttwice() {
		// TODO Auto-generated method stub
		int[] ar = { 8, 4, 7, 3 };

		for (int count = 0; count <= 1; count++) {
			int i;
			for (i = ar.length - 1; i > 0; i--)// 2
			{
				if (i > 0) {
					int temp = ar[i];
					ar[i] = ar[i - 1];
					ar[i - 1] = temp;
				} else
					break;

			}
		}
		for (int j = 0; j < ar.length; j++) {
			System.out.println(ar[j] + " ");
		}
	}

	private void movingAllElementsTowardsLefttwice() {
		// TODO Auto-generated method stub
		int[] ar = { 8, 4, 7, 3 };
		int temp = ar[0];
		int temp2 = ar[1];
		int i;
		for (i = 0; i < ar.length - 2; i++) {
			ar[i] = ar[i + 2];
			System.out.println(ar[i]);
		}
		ar[i] = temp;
		System.out.println(ar[i]);
		ar[i + 1] = temp2;
		System.out.println(ar[i + 1]);
	}

	private void movingAllElementsTowardsRight() {
		// TODO Auto-generated method stub
		int[] ar = { 8, 4, 7, 3 };
		int len = ar.length;
		int temp = ar[len - 1];

		int i;
		for (i = 1; i < ar.length; i++)// 2
		{

			ar[len - i] = ar[len - (i + 1)];// 7

			// System.out.print(ar[len-i]+" ");
		}
		ar[len - i] = temp;
		// System.out.println(ar[len-i]);
		for (int j = 0; j < ar.length; j++) {
			System.out.println(ar[j] + " ");
		}

	}

	private void movingAllElementsTowardsLeft() {
		// TODO Auto-generated method stub
		int[] ar = { 8, 4, 7, 3 };
		int temp = ar[0];
		int i;
		for (i = 0; i < ar.length - 1; i++) {
			ar[i] = ar[i + 1];
			System.out.println(ar[i]);
		}
		ar[i] = temp;
		System.out.println(ar[i]);

	}
}
