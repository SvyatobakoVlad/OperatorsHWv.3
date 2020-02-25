package com.itbulls.learnit.HW5.svyatobatko;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import java.util.Collection;

public class HomeWorkBook {
	

	

	
	public static void main(String[] args) {
		
	        String[] authorsBook1 = {"Gerbert Shildt"};
	        Book book1 = new Book("JavaOne", authorsBook1, "abra", 2015, 355, 406, "limp");

	        String[] authorBook2 = {"Bryus Ekkel"};
	        Book book2 = new Book("JavaTwo", authorBook2, "cada", 2014, 195, 432, "hard");

	        String[] authorBook3 = {"Blinov"};
	        Book book3 = new Book("JavaThree", authorBook3, "bra", 2008, 248, 198, "hard");
	        
	        Book[] books = {book1, book2, book3};

	        System.out.println("Book by Robert Winston: " + booksByAuthor("Gerbert Shildt", books));
	        System.out.println("Book by Transworld Digital: " + booksByPublisher("cada", books));
	        System.out.println("Book after 2009: " + booksAfterYear(2009, books));
	    
	    }

	    public static List<Book> booksByAuthor(String author, Book[] books) {
	        List<Book> result = new ArrayList<>();

	        for (Book book : books) {
	            for (String authorBook : book.getAuthors()) {
	                if (author.equals(authorBook)) {
	                    result.add(book);
	                }
	            }
	        }

	        return result;
	    }

	    public static List<Book> booksByPublisher(String publisher, Book[] books) {
	        List<Book> result = new ArrayList<>();

	        for (Book book : books) {
	            if (publisher.equals(book.getPublisher())) {
	                result.add(book);
	            }
	        }

	        return result;
	    }

	    public static List<Book> booksAfterYear(int year, Book[] books) {
	        List<Book> result = new ArrayList<>();

	        for (Book book : books) {
	            if (year < book.getYear()) {
	                result.add(book);
	            }
	        }

	        return result;
	    }
	}