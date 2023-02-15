package com.gomeals.service.implementation;

import com.gomeals.model.Complain;
import com.gomeals.repository.ComplainRepository;
import com.gomeals.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplainServiceImplementation implements ComplainService {
    @Autowired
    ComplainRepository complainRepository;

    @Override
    public Complain createComplain(Complain complain){
        return complainRepository.save(complain);
    }

    @Override
    public Complain getComplainById(Integer id){
        Complain complain = complainRepository.findById(id).orElse(null);
        return complain;
    }

}
