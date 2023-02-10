package com.yrgo.isbntools;

public class StockSystem {

	private ExternalISBNDataService webService;
	private ExternalISBNDataService databaseService;
	
	public void setWebService (ExternalISBNDataService service) {
		this.webService = service;
	}
	
	public void setdatabaseService (ExternalISBNDataService databaseService) {
		this.databaseService = databaseService;
	}
	
	public String getIndicator(String isbn) {
		Book book = databaseService.lookup(isbn);
		if(book == null) {
			book = webService.lookup(isbn);
		}
		StringBuilder indicator = new StringBuilder();
		indicator.append(isbn.substring(isbn.length()-4));
		indicator.append(book.author().substring(0,1));
		indicator.append(book.title().split(" ").length);
		return indicator.toString();
	}

}
