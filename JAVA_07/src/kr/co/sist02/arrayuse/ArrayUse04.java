package kr.co.sist02.arrayuse;

import java.util.Arrays;

public class ArrayUse04 {
//3. ����(shuffle)
//1~45 �ߺ� ���� �ʴ¼� 6���� ��� �ϼ���.
	
	public static void main(String[] args) {
		//1.���� 1~ 45�Ҵ�
		int []numArray=new int[45];//1~ 45�Ҵ�
		int []result=new int[6];//6����
		
		for(int i=0;i<numArray.length;i++) {
			numArray[i] = i+1;
		}
		System.out.println("��������������������������������");
		System.out.println("�� Before       ��");
		System.out.println("��������������������������������");
		System.out.println("����:"+numArray.length);
		System.out.println("��:"+Arrays.toString(numArray));
		
		//shuffle
		for(int i=0;i<6;i++) {
			int n=(int)(Math.random()*numArray.length);
			int tmp = numArray[i];
			numArray[i] = numArray[n];
			numArray[n] = tmp;
		}
		
		//System.arraycopy()
		System.arraycopy(numArray,0,result,0,6);
		
		System.out.println("��������������������������������");
		System.out.println("�� After        ��");
		System.out.println("��������������������������������");
		System.out.println("����:"+result.length);
		System.out.println("��:"+Arrays.toString(result));

		
	
		
		for(int i=0;i<result.length-1;i++) {
			
			for(int j=0;j<result.length-1-i;j++) {
				if(result[j]>result[j+1]) {
					int tmp  = result[j];
					result[j]=result[j+1];
					result[j+1] = tmp;
				}
			}//for j
			
		}//for i
		System.out.println("��������������������������������");
		System.out.println("�� Sort         ��");
		System.out.println("��������������������������������");			
		System.out.println("��:"+Arrays.toString(result));
		
		
		
		
		
	}

}
