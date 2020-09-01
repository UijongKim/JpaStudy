package com.bluearin.jpastudy2;

import com.bluearin.jpastudy2.model.JpaStudy2Tckt;
import com.bluearin.jpastudy2.service.JpaStudy2Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaTest {

    @Autowired
    JpaStudy2Service jpaStudy2Service;

    @Test
    @Transactional
    public void testMain() {
        Optional<JpaStudy2Tckt> tckt = jpaStudy2Service.getTckt(210340);
        System.out.println(tckt.get().toString());

    }

    @Test
    @Transactional
    public void testMain2() {
        JpaStudy2Tckt tckt = jpaStudy2Service.getTcktCustom(210340);
        System.out.println(tckt.toString());

    }
}
