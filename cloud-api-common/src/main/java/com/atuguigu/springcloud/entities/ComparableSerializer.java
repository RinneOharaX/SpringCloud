//package com.atuguigu.springcloud.entities;
//
//import java.io.IOException;
//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.databind.JsonSerializer;
//import com.fasterxml.jackson.databind.SerializerProvider;
//
//public class ComparableSerializer extends JsonSerializer<Comparable> {
//    @Override
//    public void serialize(Comparable value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
//        jgen.writeString(value.toString());
//    }
//}