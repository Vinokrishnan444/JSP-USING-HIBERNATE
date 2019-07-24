package com.niit.JSPwithHibernate;

public class Book {
int bookid;
String bookName;
String Author;
int Price;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public int getPrice() {
	return Price;
}
public void setPrice(int i) {
	Price = i;
}
}