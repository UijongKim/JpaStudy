package com.bluearin.jpastudy1.repository;

import com.bluearin.jpastudy1.model.IncidentTckt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IncidentRepository extends CrudRepository<IncidentTckt, Long>  {
    List<IncidentTckt> findTop30ByOrderByTcktNoDesc();
}
