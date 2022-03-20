package br.edu.ifpb.filipe.projetojpaspring;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifpb.filipe.projetojpaspring.model.entity.Dog;

@Repository
public interface DogDAO extends PagingAndSortingRepository<Dog, Integer>{

}
