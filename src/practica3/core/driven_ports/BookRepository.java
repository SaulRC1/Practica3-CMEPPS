package practica3.core.driven_ports;

import practica3.core.domain.Book;

public interface BookRepository {

	Book findById(Long id);
	
}
