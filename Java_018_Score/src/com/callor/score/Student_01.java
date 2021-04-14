package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *	1. https://github.com/callor.Reference/.../student.txt 데이터를 복사하여 
 * 	score패키지 아래에 student.txt 파일에 저장
 * 
 * 	2. student.txt 파일을 읽어 들인 후 학생들의 이름과 주소를 다음과 같은 형식으로 출력
 * 		(200명 학생 리스트를 출력)
 * 
 */
public class Student_01 {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "src/com/callor/score/student.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {

			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				System.out.println(reader);

				String[] scores = reader.split(":");
				System.out.printf("%s%s\n", scores[0], scores[1], scores[2], scores[3], scores[4]);
			}
			buffer.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
		}
	}
}