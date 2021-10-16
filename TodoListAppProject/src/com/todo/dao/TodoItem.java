package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
	private int id;
    private String title;
    private String desc;
    private String current_date;
    private String category;
    private String due_date;
    private int is_completed;
    private int time;
    private int importance;


    public TodoItem(String title, String desc){
        this.title=title;
        this.desc=desc;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date= f.format(new Date());
    }
    
    public TodoItem(String title, String desc, String date){
        this.title=title;
        this.desc=desc;
        this.current_date = date;
    }
    
    public TodoItem(String title, String desc, String category, String due_date) {
    	this.title=title;
        this.desc=desc;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date= f.format(new Date());
        this.category = category;
        this.due_date = due_date;
    }
    
    public TodoItem(String title, String desc, String date, String category, String due_date) {
    	this.title=title;
        this.desc=desc;
        this.current_date = date;
        this.category = category;
        this.due_date = due_date;
    }
    
    public TodoItem(String title, String desc, String date, String category, String due_date, int is_completed, int time) {
    	this.title=title;
        this.desc=desc;
        this.current_date = date;
        this.category = category;
        this.due_date = due_date;
        this.is_completed = is_completed;
        this.time = time;
    }
    
    public TodoItem(int id, String title, String desc, String category, String current_date, String due_date,
			int is_completed, int time, int importance) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.current_date = current_date;
		this.category = category;
		this.due_date = due_date;
		this.is_completed = is_completed;
		this.time = time;
		this.importance = importance;
	}

	public int getId() {
    	return id;
    }
    
    public void setId(int id) {
		this.id = id;
		
	}
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }
    
    public String getCategory() {
    	return category;
    }
    
    public void setCategory(String category) {
    	this.category = category;
    }
    
    public String getDue_date() {
    	return due_date;
    }
    
    public void setDue_date(String due_date) {
    	this.due_date = due_date;
    }
    
    public int getIs_completed() {
    	return is_completed;
    }
    
    public void setIs_completed(int is_completed) {
    	this.is_completed = is_completed;
    }
    
    public int getTime() {
    	return time;
    }
    
    public void setTime(int time) {
    	this.time = time;
    }
    
    public int getImportance() {
    	return importance;
    }
    
    public void setImportance(int importance) {
    	this.importance = importance;
    }
    
    public boolean findKeyword(String keyword) {
    	if(title.contains(keyword) || desc.contains(keyword))
    		return true;
    	return false;
    }
    
    public boolean findCategory(String keyword) {
    	if(category.contains(keyword))
    		return true;
    	return false;
    }
    
    public String toString() {
    	String str;
    	str = id + " [" + category + "] [" + importance + "] " + title;
    	if(is_completed == 1)
    		str += "[V]";
    	str += " - " + desc + "(" + current_date + " ~ " + due_date + ") ";
    	
    	return str;
    }
    
    public String toSaveString() {
    	return category + "##" + title + "##" + desc + "##" + current_date + "##" + due_date 
    			+ "##" + is_completed + "##" + time + "##" + importance +  "\n";
    }
        
}
