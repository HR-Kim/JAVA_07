package kr.co.sist01.arrayinit;

import java.util.Arrays;

public class ArrayEx03 {
//배열 Copy
	public static void main(String[] args) {
		int[] scoreArray=new int[5];
		int[] tmpArray=new int[scoreArray.length*2];
		
		//1~5할당.
		for(int i=0;i<scoreArray.length;i++) {
			scoreArray[i]=i+1;
		}
		System.out.println("┌──────────────┐");
		System.out.println("│ Before       │");
		System.out.println("└──────────────┘");
		System.out.println("길이:"+scoreArray.length);
		System.out.println("값:"+Arrays.toString(scoreArray));
		
		//값 copy
		for(int i=0;i<scoreArray.length;i++) {
			tmpArray[i] = scoreArray[i];
		}
		
		//주소 copy
		scoreArray = tmpArray;
		System.out.println("┌──────────────┐");
		System.out.println("│ After        │");
		System.out.println("└──────────────┘");
		System.out.println("길이:"+scoreArray.length);
		System.out.println("값:"+Arrays.toString(scoreArray));
				
		
		//API
		System.arraycopy(scoreArray, 0, tmpArray, 0, scoreArray.length);
		//scoreArray[0]에서 tmpArray[0]부터 scoreArray.length개의 데이터 복사
	}

}
