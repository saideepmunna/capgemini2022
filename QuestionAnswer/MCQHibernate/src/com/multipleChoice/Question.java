package com.multipleChoice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Question {
	@Id
	private int qNo;
	private String quesName;
	@OneToMany(mappedBy="question")
	private List<Answer> answer = new ArrayList<>();
	
	public int getQno() {
		return qNo;
	}
	public void setQno(int qno) {
		qNo = qno;
	}
	public String getQuesName() {
		return quesName;
	}
	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qNo=" + qNo + ", quesName=" + quesName + ", answer=" + answer + "]";
	}
	
	

}
