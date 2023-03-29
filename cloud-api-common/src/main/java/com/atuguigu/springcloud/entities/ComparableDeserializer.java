//package com.atuguigu.springcloud.entities;
//
//import java.io.IOException;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//
//public class ComparableDeserializer extends JsonDeserializer<Comparable> {
//    @Override
//    public Comparable deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
//        String value = jp.readValueAs(String.class);
//        //根据实际需求转换成相应的类型
//        return Integer.valueOf(value);
//    }
//}