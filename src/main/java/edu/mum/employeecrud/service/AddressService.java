package edu.mum.employeecrud.service;

import edu.mum.employeecrud.domain.Address;
import java.util.List;

public interface AddressService {
    public Address findById(Long id);
    public List<Address> findAll();
}
