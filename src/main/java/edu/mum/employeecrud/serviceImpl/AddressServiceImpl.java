package edu.mum.employeecrud.serviceImpl;

import edu.mum.employeecrud.domain.Address;
import edu.mum.employeecrud.repository.AddressRepository;
import edu.mum.employeecrud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressRepository addressRepository;
    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public List<Address> findAll() {
        return (List<Address>) addressRepository.findAll();
    }
}
