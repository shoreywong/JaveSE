package day0305;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * *)�����ۼӱ���sum=0.0
		 * *) ѭ����sum�ۼ�
		 * a 1 -1  1 -1     a*=-1
		 *   -  -  -  -  
		 * b 1  3  5  7     b+=2
		 * 
		 * i 1,2,3....10000 ���ƴ���
		 * 
		 * *)sum*4�Ľ�����Ǧ�ֵ
		 */
		
		double sum = 0;
		
		for(int a=1,b=1,i=1; 
		    i<=1000000; 
		    a*=-1,b+=2,i++) {
			
			sum += a/(double)b;
			
		}
		
		double pi =  sum * 4;
		System.out.println(pi);
		
		
	}
}
