package cn.org.zhixiang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsApplicationTests {

    @Autowired
    KieSession kieSession;

    @Test
    public void contextLoads() {

        System.out.println(kieSession);
    }

    ;

}
