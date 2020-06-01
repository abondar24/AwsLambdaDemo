package org.abondar.experimental.awslambdademo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.fasterxml.jackson.databind.ObjectMapper;

public class S3Handler implements RequestHandler<S3Event, String> {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String handleRequest(S3Event input, Context context) {
        var logger = context.getLogger();
        var resp = "OK";

        var record = input.getRecords().get(0);

        var srcKey = record.getS3().getObject().getUrlDecodedKey();
        var bucket = record.getS3().getBucket().getName();

        logger.log(resp);
        logger.log("Record: "+record);
        logger.log("Bucket: " + bucket);
        logger.log("Source key: " + srcKey);

        return resp;
    }
}
