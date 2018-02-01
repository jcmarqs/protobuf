package com.mqs.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {
    public static void main(String... args) throws IOException {
        MessageProtos.Message message = MessageProtos.Message.newBuilder().setContent("hello protobuf").build();
        FileOutputStream fos = new FileOutputStream("/tmp/message");
        message.writeTo(fos);
    }
}
