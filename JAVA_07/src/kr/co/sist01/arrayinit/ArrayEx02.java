package kr.co.sist01.arrayinit;
import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] iArray01=new int[10];
		int[] iArray02=new int[10];
		//int[] iArray03=new int[] {8,10,13,44,48};
		int[]   iArray03={8,10,13,44,48};
		char[]  chArray04= {'a','b','c','d'};
		//0���� �ʱ�ȭ
		for(int i=0;i<iArray01.length;i++) {
			System.out.print(iArray01[i]+",");			
		}
		System.out.println();
		System.out.println(Arrays.toString(iArray01));
		
		//������ �� �Ҵ�.
		for(int i=0;i<iArray02.length;i++) {
			//1~10���� ���� ����:0.0<=x<1.0
			int tmp = (int)(Math.random()*10)+1;
			iArray02[i] = tmp; 
		}
		System.out.println(Arrays.toString(iArray02));
		System.out.println(Arrays.toString(iArray03));
		//��ü �ּ�.
		System.out.println("chArray04:"+chArray04);
		System.out.println("chArray04:"+Arrays.toString(chArray04));
	}
//	�迭�� �ʱ�ȭ	: �迭�� ������ ���ÿ� �ʱ�ȭ ��.		
//	ex) int[] scoreArray =new int[]{5,6,7,8,9};		
//	= int[] scoreArray ={5,6,7,8,9};//new int[] ��������		
//	= int[] scoreArray;		
//	   scoreArray= new int[]{5,6,7,8,9};//error scoreArray = {5,6,7,8,9};		

//	�迭��� ���	: int[] iArray = {100,95,98,90};	
//	for(int i=0;i<iArray.length;i++){	
//	    System.out.print(iArray[i]+",");//Arrays.toString(iArray);	
//	}	
	
}
