package com.mule.support;

public class Book {

    private String title;
    private String author;
    private Integer pages;
    private static int counter;
    private Integer id; // Must be unique per book
    
	public Book() {
    	this.id = ++counter;
	}
    
    public Book(String title, String author, Integer pages) {
    	this();
    	this.author = author;
    	this.title = title;
    	this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

	public void setId(Integer id) {
        this.id = id;
    }

}