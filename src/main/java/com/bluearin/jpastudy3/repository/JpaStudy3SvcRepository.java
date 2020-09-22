package com.bluearin.jpastudy3.repository;

import com.bluearin.jpastudy3.model.JpaStudy3Svc;
import com.bluearin.jpastudy3.model.JpaStudy3Tckt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface JpaStudy3SvcRepository extends CrudRepository<JpaStudy3Svc, Integer> {

}
