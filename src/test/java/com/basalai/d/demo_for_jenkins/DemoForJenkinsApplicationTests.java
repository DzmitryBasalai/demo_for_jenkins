package com.basalai.d.demo_for_jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoForJenkinsApplicationTests {

    @Test
    void contextLoads() {
       // throw new RuntimeException("test exc");
        assertThat(true).isTrue();
    }

}
