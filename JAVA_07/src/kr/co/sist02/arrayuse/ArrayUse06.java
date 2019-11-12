package kr.co.sist02.arrayuse;

public class ArrayUse06 {
//	0의 개수 0
//	1의 개수 0
//	2의 개수 0
//	3의 개수 1
//	4의 개수 3
//	5의 개수 2
//	6의 개수 1
//	7의 개수 2
//	8의 개수 0
//	9의 개수 1

	public static void main(String[] args) {
		int[] numArr= {4,4,4,6,5,7,9,7,5,3};
		int[] count=new int[10];
		//빈도수 구하기.
		for(int i=0;i<numArr.length;i++) {
			count[numArr[i]]++;
		}

		for(int i=0;i<numArr.length;i++) {
			System.out.println(i+"의 개수 "+count[i]);
		}
		
	}

}
