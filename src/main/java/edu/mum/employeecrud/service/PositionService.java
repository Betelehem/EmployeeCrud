package edu.mum.employeecrud.service;
import edu.mum.employeecrud.domain.Position;

import java.util.List;
public interface PositionService {
    public Position findById(Long id);
    public List<Position> findAll();
}
