package kr.co.sist02.arrayuse;

public class ArrayUse02 {
//2. �ִ밪, �ּҰ�
	public static void main(String[] args) {
		int[] score = {79,88,91,95,65};
		int maxValue = score[0];
		int minValue = score[0];
		//�ִ밪
		for(int i=0;i<score.length;i++) {
			//�ִ밪
			if(score[i]>maxValue) {
				maxValue = score[i];
			}
			
			//�ּҰ�
			if(score[i]<minValue) {
				minValue = score[i];
			}
		}
		
		System.out.println("�ִ밪:"+maxValue);
		System.out.println("�ּҰ�:"+minValue);

	}

}
