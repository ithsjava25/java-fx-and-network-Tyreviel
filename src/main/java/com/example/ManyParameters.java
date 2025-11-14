package com.example;

public class ManyParameters {

    public ManyParameters(String computerName, int timeout,
                          String method, int size, byte[] data) {
        //exist for the ManyParametersBuilder class

    }


    static void main() {
        ManyParametersBuilder builder = new ManyParametersBuilder();
        builder
                .setComputerName("localhost")   //Fluent API
                .setTimeout(10)
                .setSize(0)
                .createManyParameters();
    }
}