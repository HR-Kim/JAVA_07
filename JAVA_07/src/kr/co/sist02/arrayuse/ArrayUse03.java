package kr.co.sist02.arrayuse;

import java.util.Arrays;

public class ArrayUse03 {
//3. 섞기(shuffle)
//0~9
	public static void main(String[] args) {
		//1. 값을 0~9 할당
		int []numArray=new int[10];
		for(int i=0;i<numArray.length;i++) {
			numArray[i]=i;
			System.out.println(numArray[i]);
		}
		System.out.println("┌─────────────────┐");
		System.out.println("│ Before          │");
		System.out.println("└─────────────────┘");
		System.out.println(Arrays.toString(numArray));
		//2. 섞기(shuffle): Math.random() 이용
		for(int i=0;i<10;i++) {
			//0.0*10<=x<1.0*10
			//0<=x<10
			int n = (int)(Math.random()*numArray.length);//0~9까지 난수 발생하므로 +1할 필요없음
			//numArray[0] numArray[n]
//			int tmp = numArray[0];
//			numArray[0] = numArray[n];
//			numArray[n] = tmp;
			int tmp = numArray[i];
			numArray[i] = numArray[n];
			numArray[n] = tmp;
			
		}
		//3. 값 교환
//		tmp = x;
//		x   = y;
//		y   = tmp;
		System.out.println("┌─────────────────┐");
		System.out.println("│ After           │");
		System.out.println("└─────────────────┘");
		System.out.println(Arrays.toString(numArray));
	}

}
