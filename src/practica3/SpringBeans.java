package practica3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import practica3.core.driven_ports.BookRepository;
import practica3.core.driver_ports.BookService;
import practica3.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {

	@Bean
	BookService bookService(final BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);
	}
	
}
