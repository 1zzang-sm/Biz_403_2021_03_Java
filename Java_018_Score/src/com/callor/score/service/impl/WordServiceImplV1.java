package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.WordVO;
/*
 *  1. WordService interface를 implments하여 클래스 작성
 *  2. loadWord() method에서
 *  3. word.txt 파일을 읽어 영어 단어와 한글 뜻을 분리한 후 
 *  		List<WordVO> wordList에 추가
 */
import com.callor.score.service.WordService;

public class WordServiceImplV1 implements WordService {
	List<WordVO> wordList;
	FileReader fileReader;
	BufferedReader buffer;

	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();

	}

	@Override
	public void loadWord() {
		// TODO 영단어와 한글 뜻 분리

		String fileName = "src/com/callor/score/word.txt";
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String str = new String();
			
			while ((str = buffer.readLine()) != null) {
		
				String[] word = str.split(":");
				System.out.printf("(%s)> %s\n", word[0], word[1]);
				WordVO vo = new WordVO();
				vo.setEnglish(word[0]);
				vo.setKorea(word[1]);
				wordList.add(vo);
		
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "의 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewWord() {
		// TODO Auto-generated method stub

	}

}
