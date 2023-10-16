package com.example.back;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class BackApplicationTests {

    @Test
    void test(){
        assertThat(1+10).isEqualTo(10);
    }
}
