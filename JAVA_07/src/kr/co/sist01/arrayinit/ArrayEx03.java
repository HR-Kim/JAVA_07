package kr.co.sist01.arrayinit;

import java.util.Arrays;

public class ArrayEx03 {
//�迭 Copy
	public static void main(String[] args) {
		int[] scoreArray=new int[5];
		int[] tmpArray=new int[scoreArray.length*2];
		
		//1~5�Ҵ�.
		for(int i=0;i<scoreArray.length;i++) {
			scoreArray[i]=i+1;
		}
		System.out.println("��������������������������������");
		System.out.println("�� Before       ��");
		System.out.println("��������������������������������");
		System.out.println("����:"+scoreArray.length);
		System.out.println("��:"+Arrays.toString(scoreArray));
		
		//�� copy
		for(int i=0;i<scoreArray.length;i++) {
			tmpArray[i] = scoreArray[i];
		}
		
		//�ּ� copy
		scoreArray = tmpArray;
		System.out.println("��������������������������������");
		System.out.println("�� After        ��");
		System.out.println("��������������������������������");
		System.out.println("����:"+scoreArray.length);
		System.out.println("��:"+Arrays.toString(scoreArray));
				
		
		//API
		System.arraycopy(scoreArray, 0, tmpArray, 0, scoreArray.length);
		//scoreArray[0]���� tmpArray[0]���� scoreArray.length���� ������ ����
	}

}
