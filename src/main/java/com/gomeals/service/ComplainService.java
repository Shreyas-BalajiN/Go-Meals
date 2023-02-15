package com.gomeals.service;

import com.gomeals.model.Complain;

import java.util.List;

public interface ComplainService {

    Complain createComplain(Complain complain);

    Complain getComplainById(Integer id);


}
