package org.enactor.commonlibrary.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMappingUtil
{
    public static String converObjectToString(Object value) throws JsonProcessingException
    {
        ObjectMapper objectMapper = CustomObjectMapper.getObjectMapper();
        return objectMapper.writeValueAsString(value);
    }
}
