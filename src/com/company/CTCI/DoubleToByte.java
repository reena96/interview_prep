package com.company.CTCI;

import java.nio.ByteBuffer;

public class DoubleToByte {

    public static byte[] convertToByteArray(double value) {
        byte[] bytes = new byte[8];
        ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
        buffer.putDouble(value);
        return buffer.array();

    }


    public static void main(String[] argv) {
        System.out.println(convertToByteArray(21.3F));
    }
}