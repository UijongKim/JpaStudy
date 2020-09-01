package com.bluearin.jpastudy2.repository;

import com.bluearin.jpastudy2.model.JpaStudy2Tckt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface JpaStudy2Repository extends CrudRepository<JpaStudy2Tckt, Long> {

//    @Query("SELECT m" +
//            " FROM JpaStudy2Tckt m" +
//            " INNER JOIN JpaStudy2Svc s" +
//            " ON s.svcNo = m.svcNo" +
//            " WHERE m.tcktNo = ?1")
//    JpaStudy2Tckt findByCustom(Long tcktNo);

    @Query("SELECT m FROM JpaStudy2Tckt m WHERE m.tcktNo = ?1")
    JpaStudy2Tckt findByCustom(Long tcktNo);
}
