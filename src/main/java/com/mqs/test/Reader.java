package com.mqs.test;

import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    public static void main(String... args) throws IOException {
        MessageProtos.Message message = MessageProtos.Message.newBuilder().mergeFrom(new FileInputStream("/tmp/message")).build();
        System.out.println(message);
    }
}
