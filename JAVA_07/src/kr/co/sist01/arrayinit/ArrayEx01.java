package kr.co.sist01.arrayinit;

public class ArrayEx01 {
    //
	public static void main(String[] args) {
		int[] scoreArray=new int[5];//int �� 5���� �����Ҽ� �ִ� �迭
		int k=1;
		
		scoreArray[0]=80;
		scoreArray[1]=85;
		scoreArray[k+1]=90;
		scoreArray[3]=95;
		scoreArray[4]=97;
		
		int tmp =scoreArray[0]+scoreArray[1];
		System.out.println("tmp="+tmp);
		System.out.println("scoreArray.length="
				+scoreArray.length);
		//for���� ���� ��� ����� ���� ���
		for(int i=0;i<scoreArray.length;i++) {
			System.out.printf("scoreArray[%d]=%d\n"
					,i,scoreArray[i]);			
		}
		// java.lang.ArrayIndexOutOfBoundsException
		// �迭 index�� ��ȿ������ ���.
		System.out.printf("scoreArray[%d]=%d\n"
				,7,scoreArray[7]);	

	}

}
