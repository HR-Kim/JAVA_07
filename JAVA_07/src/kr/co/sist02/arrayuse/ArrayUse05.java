package kr.co.sist02.arrayuse;

import java.util.Arrays;

public class ArrayUse05 {

	public static void main(String[] args) {
		int []numArr = {3,1,4,2,0};
		System.out.println("��������������������������������");
		System.out.println("�� Before       ��");
		System.out.println("��������������������������������");
		System.out.println("�迭����:"+numArr.length);
		System.out.println("�迭:"+Arrays.toString(numArr));

		Arrays.sort(numArr);
		System.out.println("^�迭:"+Arrays.toString(numArr));
		
		for(int i=0;i<numArr.length-1;i++) {
			boolean changed = false;
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {// > ASC, < DESC
					int temp = numArr[j];
					numArr[j]= numArr[j+1];
					numArr[j+1]=temp;
					changed = true;
				}
			}//for j
			
		}//--for i
		
		System.out.println("��������������������������������");
		System.out.println("�� After        ��");
		System.out.println("��������������������������������");
		System.out.println("�迭����:"+numArr.length);
		System.out.println("�迭:"+Arrays.toString(numArr));
		
		
		
		
	}
//	���� ������ ù ��° �ڷ�� �� ��° �ڷḦ, �� ��° �ڷ�� �� ��° �ڷḦ, �� ��°�� �� ��°��, �� �̷� ������ (������-1)��° �ڷ�� ������ �ڷḦ ���Ͽ� ��ȯ�ϸ鼭 �ڷḦ �����Ѵ�.
//	1ȸ���� �����ϰ� ���� ���� ū �ڷᰡ �� �ڷ� �̵��ϹǷ� 2ȸ�������� �� ���� �ִ� �ڷ�� ���Ŀ��� ���ܵǰ�, 2ȸ���� �����ϰ� ���� ������ �� ��° �ڷ������ ���Ŀ��� ���ܵȴ�. �̷��� ������ 1ȸ�� ������ ������ ���Ŀ��� ���ܵǴ� �����Ͱ� �ϳ��� �þ��.
}
