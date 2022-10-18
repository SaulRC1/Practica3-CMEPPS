package practica3.core.driver_ports;

import practica3.core.domain.Book;
import practica3.core.driven_ports.BookRepository;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id);
	}
	
}
