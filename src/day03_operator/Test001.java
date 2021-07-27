package day03_operator;

import java.util.Scanner;

public class Test001 {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.print("수 입력 : ");
		 int num = sc.nextInt();
		 String s1 = (num % 2 == 0)? "짝수" : "홀수";
		 String s2 = (num % 3 == 0)? "3의 배수" : "3의 배수가 아니다";
		 
		 System.out.println(num + " = " + s1);
		 System.out.println(num + " = " + s2);
		 
		 System.out.print("두 수 입력 : ");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 System.out.println("num1 : " + num1 + ", num2 : " + num2);
		 String s3 = (num1 >= num2)? "num1이 num2보다 크거나 같다" : "num2가 num1보다 크다";
		 System.out.println(s3);
		 
	}
}
