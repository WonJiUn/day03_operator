package day03_operator;

public class Ex06_Op {
	public static void main(String[] args) {
		
		/*
		 ++ : 자기자신을 1 증가시킨다
		 -- : 자기자신을 1 감소시킨다
		 - a = a - 1, a = a + 1
		 */
		
		int su1 = 5;
		su1++;	// 후치 또는 후위
		System.out.println(su1);	//6
		++su1;	// 전치 또는 전위
		System.out.println(su1);	//7
		
		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1;		//연산보다 자기자신을 먼저 증가
		n1 = 10;	
		n3 = n1++;		//모든 연산이 끝난후에 자기자신 증가
		System.out.println(n2);		//11	
		System.out.println(n3);		//10
		
	}
}
