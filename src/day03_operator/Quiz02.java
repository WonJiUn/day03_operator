package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		
		//입력한 데이터가 3의 배수인 경우 출력하시오
		
		System.out.print("숫자 입력 : ");
		num1 = sc.nextInt();
		
		if(num1 % 3 == 0) {
			System.out.println("3의배수 입니다");
		}
		
		System.out.println();
		//입력한 수의 절대값을 구하는 프로그램을 작성하시오
		
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.println("절대값 : " + (num1 * -1));
		}
		if(num1 >= 0) {
			System.out.println("절대값 : " + num1);
		}
		
		System.out.println();
		//두 수를 입력받아 큰 수를 출력하시오
		
		System.out.print("숫자 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("큰 수 : " + num1);
		}
		if(num1 < num2) {
			System.out.println("큰 수 : " + num2);
		}
		if(num1 == num2) {
			System.out.println("같은 값");
		}
		
		System.out.println();
		//세 수를 입력받아 큰 수를 출력하시오
		
		System.out.println("숫자 세개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("가장 큰 수 : " + num1);
		}
		else if((num2 > num1) && (num2 > num3)) {
			System.out.println("가장 큰 수 : " + num2);
		}
		else if((num3 > num1) && (num3 > num2)) {
			System.out.println("가장 큰 수 : " + num3);
		}
		else {
			System.out.println("서로 다른 숫자 세개를 입력해주세요");
		}
		
		
		System.out.println();
		//두 수를 입력 받아 큰 수가 짝수이면 출력하시오
		
		System.out.print("숫자 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if ((num1 > num2) && (num1 % 2 == 0)) {
			System.out.println(num1 + "이(가) 더 큽니다");
			System.out.println("짝수입니다");
		}
		else if((num2 > num1) && (num2 % 2 == 0)) {
			System.out.println(num2 + "이(가) 더 큽니다");
			System.out.println("짝수입니다");
		}
		else if((num1 > num2) && (num2 % 2 != 0)) {
			System.out.println(num1 + "이(가) 더 큽니다");
			System.out.println("홀수입니다");
		}
		else if((num2 > num1) && (num2 % 2 != 0)) {
			System.out.println(num2 + "이(가) 더 큽니다");
			System.out.println("홀수입니다");
		}
		else {
			System.out.println("서로 다른 숫자 두개를 입력해주세요");
		}
		
		
		
		System.out.println();
		//두 수를 입력받아 합이 짝수이고 3의 배수인 수를 출력하시오
		
		System.out.print("숫자 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		num3 = num1 + num2;
		
		System.out.println("합계 : " + num3);
		
		if((num3 % 2 == 0) && (num3 % 3 == 0)) {
			System.out.println("짝수이고 3의 배수입니다");
		}
		else {
			System.out.println("홀수이거나 또는 3의 배수가 아닙니다");
		}
	}
}
