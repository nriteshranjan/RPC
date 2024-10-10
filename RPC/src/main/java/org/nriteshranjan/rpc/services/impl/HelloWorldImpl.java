package org.nriteshranjan.rpc.services.impl;

import jakarta.jws.WebService;
import org.nriteshranjan.rpc.services.HelloWorld;

@WebService(endpointInterface = "org.nriteshranjan.rpc.services.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String name) {
        return "This is the message from the server for " + name;
    }
}
