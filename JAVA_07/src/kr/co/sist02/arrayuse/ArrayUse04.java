package kr.co.sist02.arrayuse;

import java.util.Arrays;

public class ArrayUse04 {
//3. 섞기(shuffle)
//1~45 중복 되지 않는수 6개를 출력 하세요.
	
	public static void main(String[] args) {
		//1.값을 1~ 45할당
		int []numArray=new int[45];//1~ 45할당
		int []result=new int[6];//6개수
		
		for(int i=0;i<numArray.length;i++) {
			numArray[i] = i+1;
		}
		System.out.println("┌──────────────┐");
		System.out.println("│ Before       │");
		System.out.println("└──────────────┘");
		System.out.println("길이:"+numArray.length);
		System.out.println("값:"+Arrays.toString(numArray));
		
		//shuffle
		for(int i=0;i<6;i++) {
			int n=(int)(Math.random()*numArray.length);
			int tmp = numArray[i];
			numArray[i] = numArray[n];
			numArray[n] = tmp;
		}
		
		//System.arraycopy()
		System.arraycopy(numArray,0,result,0,6);
		
		System.out.println("┌──────────────┐");
		System.out.println("│ After        │");
		System.out.println("└──────────────┘");
		System.out.println("길이:"+result.length);
		System.out.println("값:"+Arrays.toString(result));

		
	
		
		for(int i=0;i<result.length-1;i++) {
			
			for(int j=0;j<result.length-1-i;j++) {
				if(result[j]>result[j+1]) {
					int tmp  = result[j];
					result[j]=result[j+1];
					result[j+1] = tmp;
				}
			}//for j
			
		}//for i
		System.out.println("┌──────────────┐");
		System.out.println("│ Sort         │");
		System.out.println("└──────────────┘");			
		System.out.println("값:"+Arrays.toString(result));
		
		
		
		
		
	}

}
