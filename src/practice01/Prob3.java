package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner scanner = new Scanner( System.in );
		int input = scanner.nextInt();
		int sum = 0;
		if(input % 2 == 0) {
			for(int i = 2; i <= input; i+=2) {
				sum += i;
			}
		} 
		else if(input % 2 == 1) {
			for(int i = 1; i <= input; i+=2) {
				sum += i;
			}
		}
		System.out.println("결과 값 : " + sum);
		scanner.close();
	}
}
