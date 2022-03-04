package com.multipleChoice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
    @Id
    private int ansId;
    private String ans;
    @ManyToOne
    private Question question;
    
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
    
    
	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", ans=" + ans + ", question=" + question + "]";
	}
    
} 
