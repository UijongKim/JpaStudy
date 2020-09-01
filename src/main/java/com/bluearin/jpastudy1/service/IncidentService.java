package com.bluearin.jpastudy1.service;

import com.bluearin.jpastudy1.model.IncidentTckt;
import com.bluearin.jpastudy1.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {

    @Autowired
    IncidentRepository incidentReporitory;

    public List<IncidentTckt> queryTcktList() {
        List<IncidentTckt> tcktList= incidentReporitory.findTop30ByOrderByTcktNoDesc();
        return tcktList;
    }

    public Optional<IncidentTckt> getTckt(int tcktNo) {
        return incidentReporitory.findById((long)tcktNo);
    }
}
