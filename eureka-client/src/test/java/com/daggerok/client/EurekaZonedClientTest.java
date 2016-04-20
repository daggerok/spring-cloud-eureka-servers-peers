package com.daggerok.client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(EurekaZonedClient.class)
public class EurekaZonedClientTest {

    @Test
    public void contextLoads() {}
}