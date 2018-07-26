package codeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Book;

public class BookTest {
	@Test
	public void bookTest()
	{
		Book testBook = new Book();
		assertEquals("Not Harry Potter","Harry Potter",testBook.getTitle());
	}
}
