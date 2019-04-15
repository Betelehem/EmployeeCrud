package edu.mum.employeecrud.serviceImpl;

import edu.mum.employeecrud.domain.Position;
import edu.mum.employeecrud.repository.PositionRepository;
import edu.mum.employeecrud.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;
    @Override
    public Position findById(Long id) {
        return positionRepository.findById(id).get();
    }

    @Override
    public List<Position> findAll() {
        return (List<Position>) positionRepository.findAll();
    }
}
