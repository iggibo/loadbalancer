package com.test.loadBalancer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RoundRobinTest {

    @InjectMocks
    private RoundRobin roundRobin;

    @Test
    void getServerClientIpNull() {
        String server = roundRobin.getServer(null);
        Assertions.assertNotNull(server);
    }
}
