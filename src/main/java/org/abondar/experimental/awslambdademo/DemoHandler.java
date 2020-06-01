package org.abondar.experimental.awslambdademo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;


public class DemoHandler  implements RequestHandler<Map<String,String>,String> {

    private final ObjectMapper mapper = new ObjectMapper();


    @Override
    public String handleRequest(Map<String, String> input, Context context) {
        var logger = context.getLogger();
        var resp = "OK";

        try {
            logger.log("Event: "+mapper.writeValueAsString(input));

        } catch (IOException ex){
            logger.log("Error: "+ex.getMessage());
            resp = "NOT OK";
        }


        return resp;
    }
}
