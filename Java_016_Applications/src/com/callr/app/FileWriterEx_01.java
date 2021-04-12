package com.callr.app;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 1. Random 클래스를 사용하여 0 ~ 100까지 범위의 난 수 2개를 생성한 후 4칙 연산을 수행한다.
 * 2. FileWriter, PrintWriter 클래스를 사용하여 src/com/callor/app/data.txt파일에 4칙 연산결과를
 * 		다음과 같이 저장한다
 * ※ 뺄셈과 나눗셈은 큰수 - 작은수, 큰수 / 작은수 로 연산
 */
public class FileWriterEx_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		String fileName = "src/com/callr/app/data.txt";

		FileWriter fileWriter = null;
		PrintWriter out = null;

		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			out.println("=".repeat(15));
			out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
			if (num1 > num2) {
				out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
				out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
				out.println("=".repeat(15));
				System.out.println("생성완료");
			}else {
				out.println("앞수가 뒷수보다 더 적어서 다시 해야함.");
			}
			out.flush();
			out.close();

		} catch (Exception e) {
			System.out.println("파일을 만들수 없음.");
		}
	}
}
