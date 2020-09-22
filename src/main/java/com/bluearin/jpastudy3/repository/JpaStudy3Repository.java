package com.bluearin.jpastudy3.repository;

import com.bluearin.jpastudy3.model.JpaStudy3Tckt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface JpaStudy3Repository extends CrudRepository<JpaStudy3Tckt, Long>  {

    @Query("SELECT m " +
            ", CASE WHEN sp.wrkflwStepNo = 10003 AND m.prntsTcktNo IS NOT NULL THEN 'TSTACTG40' " +
            "ELSE '' END " +
            ", s " +
            ", COALESCE(s.regDt, 'NULL')" +
            ", TRIM(' abc def ')" +
            ", ABS(-10)" +
            ", UPPER('abc')" +
            ", LENGTH('abcdefg')" +
            ", CONCAT('con', 'cat')" +
            ", sf_com_enckey() " +
            "FROM JpaStudy3Tckt m " +
            "INNER JOIN m.svc s " +
            "INNER JOIN m.pri p " +
            "INNER JOIN m.step sp " +
            "INNER JOIN m.escal e " +
            "LEFT JOIN m.escal f " +
            "ON f.archvCd = 'ARCHV10' " +
            "INNER JOIN m.alrt a " +
            "WHERE m.tcktNo = ?1")
    JpaStudy3Tckt findByCustom(Long tcktNo);


}
