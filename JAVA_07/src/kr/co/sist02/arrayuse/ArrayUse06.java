package kr.co.sist02.arrayuse;

public class ArrayUse06 {
//	0�� ���� 0
//	1�� ���� 0
//	2�� ���� 0
//	3�� ���� 1
//	4�� ���� 3
//	5�� ���� 2
//	6�� ���� 1
//	7�� ���� 2
//	8�� ���� 0
//	9�� ���� 1

	public static void main(String[] args) {
		int[] numArr= {4,4,4,6,5,7,9,7,5,3};
		int[] count=new int[10];
		//�󵵼� ���ϱ�.
		for(int i=0;i<numArr.length;i++) {
			count[numArr[i]]++;
		}

		for(int i=0;i<numArr.length;i++) {
			System.out.println(i+"�� ���� "+count[i]);
		}
		
	}

}
