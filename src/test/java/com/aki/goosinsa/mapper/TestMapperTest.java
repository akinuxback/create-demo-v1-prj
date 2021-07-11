package com.aki.goosinsa.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class TestMapperTest {

    @Autowired
    TestMapper testMapper;

    @Test
    void getTime() {
        String time = testMapper.getTime();
        log.info("time={}", time);
    }
}