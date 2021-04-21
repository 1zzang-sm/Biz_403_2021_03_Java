package com.callor.app.model;

public class ScoreVO {
	
	private String strNum;
	private Integer Kor;
	private Integer eng;
	private Integer math;
	
	private Integer avg;
	private Integer total;
	public ScoreVO() {
		
	}
	
	public ScoreVO(String strNum, Integer kor, Integer eng, Integer math, Integer avg, Integer total) {
		super();
		this.strNum = strNum;
		Kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.total = total;
	}

	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", Kor=" + Kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg
				+ ", total=" + total + "]";
	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public Integer getKor() {
		return Kor;
	}
	public void setKor(Integer kor) {
		Kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}

}
