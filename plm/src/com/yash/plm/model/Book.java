package com.yash.plm.model;

/**
 * This class encapsulates different properties of entity book.
 */
public class Book {

	/**
	 * id attribute uniquely identifies a book.
	 */
	private int id;
	/**
	 * title attribute defines the title of the book.
	 */
	private String title;
	/**
	 * author attribute is the name of the author of the book.
	 */
	private String author;
	/**
	 * price attribute is the actual cost of the book.
	 */
	private float price;
	/**
	 * publisher attribute is the name of the publisher of the book.
	 */
	private String publisher;
	/**
	 * isbn attribute is the isbn number of the book.
	 */
	private Long isbn;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", publisher="
				+ publisher + ", isbn=" + isbn + "]";
	}
}
