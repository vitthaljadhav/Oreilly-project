package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.spring5webapp.model.Publisher;
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
