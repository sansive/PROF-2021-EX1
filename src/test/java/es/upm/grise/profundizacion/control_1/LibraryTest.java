package es.upm.grise.profundizacion.control_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {

	private final String title1 = "title_1";
	private final Book book1 = new Book(title1);

	@Test
	public void addBookTest() throws DuplicatedBookException, NonExistingBookException, EmptyLibraryException {
		Library library = mock(Library.class);
		when(library.getBook(title1)).thenReturn(book1);

		library.addBook(book1);
		assertEquals(book1, library.getBook(title1));
	}
}
