package kr.co.sist02.arrayuse;

public class ArrayUse01 {
//1. ����, ���
	public static void main(String[] args) {
		int[] score = {100,88,100,100,90};
		
		int sum     = 0; //����
		float avg   = 0f;//���
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		avg=sum/(float)score.length;
		
		System.out.println("����:"+sum);
		System.out.println("���:"+avg);
	}

}
