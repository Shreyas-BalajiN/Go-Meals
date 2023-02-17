package com.gomeals.service;

import com.gomeals.model.Complain;

import java.util.List;

public interface ComplainService {

    // CREATE COMPLAIN
    Complain createComplain(Complain complain);

    // RETRIEVE COMPLAIN
    Complain getComplainById(Integer id);

    // RETRIEVE ALL COMPLAINS
    List<Complain> getAllComplains();

    // UPDATE COMPLAIN
    Complain updateComplain(Complain complain);

    // DELETE COMPLAIN
    void deleteComplain(Integer id);



}
