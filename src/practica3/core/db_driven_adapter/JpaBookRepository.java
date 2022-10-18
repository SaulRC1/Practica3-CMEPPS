package practica3.core.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practica3.core.db_driven_adapter.jparepository.HAAJpaRepository;
import practica3.core.domain.Book;
import practica3.core.domain.BookDoesNotExistException;
import practica3.core.domain.BookEntity;
import practica3.core.driven_ports.BookRepository;

@Component
public class JpaBookRepository implements BookRepository {

	@Autowired
	private HAAJpaRepository haaJpaRepository;
	
	@Override
	public Book findById(Long id) {
		
		Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
		
		BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
		
		return bookEntity.toBook();
	}

}
