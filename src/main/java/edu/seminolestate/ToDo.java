package edu.seminolestate;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo implements Serializable {
	
	public ToDo() {
		
	}
	
	@Id
	private int ttaskID;
	private String task;
	
	public ToDo(int newttaskID, String newTask) {
		this.settaskID(newttaskID);
		this.setTask(newTask);
	}
	
	public void settaskID(int newttaskID) {
		if(newttaskID > 0) {
			this.ttaskID = newttaskID;
		}
	}
	
	public void setTask(String newTask) {
		if(newTask != null && newTask.length() > 0) {
			this.task = newTask;
		}
	}
	
	public int getttaskID() {
		return ttaskID;
	}
	
	public String getTask() {
		return task;
	}
	
}