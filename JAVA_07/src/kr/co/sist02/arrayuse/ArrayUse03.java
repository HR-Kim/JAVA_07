package kr.co.sist02.arrayuse;

import java.util.Arrays;

public class ArrayUse03 {
//3. ����(shuffle)
//0~9
	public static void main(String[] args) {
		//1. ���� 0~9 �Ҵ�
		int []numArray=new int[10];
		for(int i=0;i<numArray.length;i++) {
			numArray[i]=i;
			System.out.println(numArray[i]);
		}
		System.out.println("��������������������������������������");
		System.out.println("�� Before          ��");
		System.out.println("��������������������������������������");
		System.out.println(Arrays.toString(numArray));
		//2. ����(shuffle): Math.random() �̿�
		for(int i=0;i<10;i++) {
			//0.0*10<=x<1.0*10
			//0<=x<10
			int n = (int)(Math.random()*numArray.length);//0~9���� ���� �߻��ϹǷ� +1�� �ʿ����
			//numArray[0] numArray[n]
//			int tmp = numArray[0];
//			numArray[0] = numArray[n];
//			numArray[n] = tmp;
			int tmp = numArray[i];
			numArray[i] = numArray[n];
			numArray[n] = tmp;
			
		}
		//3. �� ��ȯ
//		tmp = x;
//		x   = y;
//		y   = tmp;
		System.out.println("��������������������������������������");
		System.out.println("�� After           ��");
		System.out.println("��������������������������������������");
		System.out.println(Arrays.toString(numArray));
	}

}
