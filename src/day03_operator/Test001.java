package day03_operator;

import java.util.Scanner;

public class Test001 {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.print("�� �Է� : ");
		 int num = sc.nextInt();
		 String s1 = (num % 2 == 0)? "¦��" : "Ȧ��";
		 String s2 = (num % 3 == 0)? "3�� ���" : "3�� ����� �ƴϴ�";
		 
		 System.out.println(num + " = " + s1);
		 System.out.println(num + " = " + s2);
		 
		 System.out.print("�� �� �Է� : ");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 System.out.println("num1 : " + num1 + ", num2 : " + num2);
		 String s3 = (num1 >= num2)? "num1�� num2���� ũ�ų� ����" : "num2�� num1���� ũ��";
		 System.out.println(s3);
		 
	}
}
