package com.bluearin.jpastudy3;

import com.bluearin.jpastudy3.model.JpaStudy3Svc;
import com.bluearin.jpastudy3.model.JpaStudy3Tckt;
import com.bluearin.jpastudy3.service.JpaStudy3Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaStudy3Test {

    @Autowired
    JpaStudy3Service jpaStudy3Service;

    @Test
    @Transactional
    public void testMain2() {
        JpaStudy3Tckt tckt = jpaStudy3Service.getTcktCustom(210340);
        System.out.println(tckt.toString());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testMain3() {
        List<JpaStudy3Svc> list = new ArrayList<>();
        JpaStudy3Svc svc = new JpaStudy3Svc();

        for(int i=0;i<10;i++) {
            svc = new JpaStudy3Svc();
            svc.setCmpnNo(10002);
            svc.setSvcNo(10253 + i);
            svc.setDispNm("JPA Study - Svc " + i+1);
            svc.setRegDt(new Date());
            svc.setSvcStatCd("TRUE");
            svc.setRegrNo(10008);
            svc.setSvcCdVal("TEST");
            list.add(svc);
        }

        try {
            jpaStudy3Service.insertSvcMultiple(list);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }
}
