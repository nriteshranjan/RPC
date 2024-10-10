package org.nriteshranjan.rpc;

import jakarta.xml.ws.Endpoint;
import org.nriteshranjan.rpc.services.impl.HelloWorldImpl;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/rpc/helloWorld", new HelloWorldImpl());
    }
}
