package com.gomeals.service.implementation;

import com.gomeals.model.Complain;
import com.gomeals.repository.ComplainRepository;
import com.gomeals.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComplainServiceImplementation implements ComplainService {
    @Autowired
    ComplainRepository complainRepository;

    @Override
    public Complain createComplain(Complain complain){
        return complainRepository.save(complain);
    }

    @Override
    public Complain getComplainById(Integer complainId){
        Complain complain = complainRepository.findById(complainId).orElse(null);
        return complain;
    }

    @Override
    public List<Complain> getAllComplains() {
        List<Complain> complains = new ArrayList<>();
        complainRepository.findAll().forEach(complain -> complains.add(complain));
        return complains;
    }

    @Override
    public Complain updateComplain(Complain complain) {
        return complainRepository.save(complain);
    }

    @Override
    public void deleteComplain(Integer complainId) {
        complainRepository.deleteById(complainId);
    }
}
