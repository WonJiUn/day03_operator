package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		
		//�Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�
		
		System.out.print("���� �Է� : ");
		num1 = sc.nextInt();
		
		if(num1 % 3 == 0) {
			System.out.println("3�ǹ�� �Դϴ�");
		}
		
		System.out.println();
		//�Է��� ���� ���밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		System.out.print("���� �Է� : ");
		num1 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.println("���밪 : " + (num1 * -1));
		}
		if(num1 >= 0) {
			System.out.println("���밪 : " + num1);
		}
		
		System.out.println();
		//�� ���� �Է¹޾� ū ���� ����Ͻÿ�
		
		System.out.print("���� �ΰ� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("ū �� : " + num1);
		}
		if(num1 < num2) {
			System.out.println("ū �� : " + num2);
		}
		if(num1 == num2) {
			System.out.println("���� ��");
		}
		
		System.out.println();
		//�� ���� �Է¹޾� ū ���� ����Ͻÿ�
		
		System.out.println("���� ���� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("���� ū �� : " + num1);
		}
		else if((num2 > num1) && (num2 > num3)) {
			System.out.println("���� ū �� : " + num2);
		}
		else if((num3 > num1) && (num3 > num2)) {
			System.out.println("���� ū �� : " + num3);
		}
		else {
			System.out.println("���� �ٸ� ���� ������ �Է����ּ���");
		}
		
		
		System.out.println();
		//�� ���� �Է� �޾� ū ���� ¦���̸� ����Ͻÿ�
		
		System.out.print("���� �ΰ� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if ((num1 > num2) && (num1 % 2 == 0)) {
			System.out.println(num1 + "��(��) �� Ů�ϴ�");
			System.out.println("¦���Դϴ�");
		}
		else if((num2 > num1) && (num2 % 2 == 0)) {
			System.out.println(num2 + "��(��) �� Ů�ϴ�");
			System.out.println("¦���Դϴ�");
		}
		else if((num1 > num2) && (num2 % 2 != 0)) {
			System.out.println(num1 + "��(��) �� Ů�ϴ�");
			System.out.println("Ȧ���Դϴ�");
		}
		else if((num2 > num1) && (num2 % 2 != 0)) {
			System.out.println(num2 + "��(��) �� Ů�ϴ�");
			System.out.println("Ȧ���Դϴ�");
		}
		else {
			System.out.println("���� �ٸ� ���� �ΰ��� �Է����ּ���");
		}
		
		
		
		System.out.println();
		//�� ���� �Է¹޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		
		System.out.print("���� �ΰ� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		num3 = num1 + num2;
		
		System.out.println("�հ� : " + num3);
		
		if((num3 % 2 == 0) && (num3 % 3 == 0)) {
			System.out.println("¦���̰� 3�� ����Դϴ�");
		}
		else {
			System.out.println("Ȧ���̰ų� �Ǵ� 3�� ����� �ƴմϴ�");
		}
	}
}
