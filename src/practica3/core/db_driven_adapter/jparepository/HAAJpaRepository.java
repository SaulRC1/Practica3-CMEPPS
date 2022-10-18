package practica3.core.db_driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import practica3.core.domain.BookEntity;

public interface HAAJpaRepository extends JpaRepository<BookEntity, Long>{

}
