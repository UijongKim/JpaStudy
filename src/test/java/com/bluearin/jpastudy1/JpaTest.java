package com.bluearin.jpastudy1;

import com.bluearin.jpastudy1.model.IncidentTckt;
import com.bluearin.jpastudy1.service.IncidentService;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaTest {

    @Autowired
    IncidentService incidentService;

    @Test
    @Transactional
    public void testMain2() {
        Optional<IncidentTckt> tckt = incidentService.getTckt(210399);

        System.out.println(tckt.get().toString());

    }
}
