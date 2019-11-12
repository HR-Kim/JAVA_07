package kr.co.sist02.arrayuse;

public class ArrayUse02 {
//2. 최대값, 최소값
	public static void main(String[] args) {
		int[] score = {79,88,91,95,65};
		int maxValue = score[0];
		int minValue = score[0];
		//최대값
		for(int i=0;i<score.length;i++) {
			//최대값
			if(score[i]>maxValue) {
				maxValue = score[i];
			}
			
			//최소값
			if(score[i]<minValue) {
				minValue = score[i];
			}
		}
		
		System.out.println("최대값:"+maxValue);
		System.out.println("최소값:"+minValue);

	}

}
