package edu.mum.employeecrud.repository;

import edu.mum.employeecrud.domain.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends CrudRepository<Position,Long> {
}
