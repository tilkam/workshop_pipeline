package com.yrgo.isbntools;

import java.util.ArrayList;
import java.util.List;


public class BookManager {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("069117654X", "Understanding the Digital World","Brian Kernighan"));
		books.add(new Book("0596009658","Learning the bash Shell","Cameron Newham"));
		for(Book book:books) {
			System.out.println(book);
		}
	}

}






