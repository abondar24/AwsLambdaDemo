package org.abondar.experimental.awslambdademo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest {


    @Test
    public void demoTest() {
        var context = new TestContext();
        var handler = new DemoHandler();

        var result = handler.handleRequest(new HashMap<>(), context);
        System.out.println(result);
        assertTrue(result.contains("OK"));
    }
}
