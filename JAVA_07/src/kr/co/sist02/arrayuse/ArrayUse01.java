package kr.co.sist02.arrayuse;

public class ArrayUse01 {
//1. ÃÑÇÕ, Æò±Õ
	public static void main(String[] args) {
		int[] score = {100,88,100,100,90};
		
		int sum     = 0; //ÃÑÇÕ
		float avg   = 0f;//Æò±Õ
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		avg=sum/(float)score.length;
		
		System.out.println("ÃÑÇÕ:"+sum);
		System.out.println("Æò±Õ:"+avg);
	}

}
