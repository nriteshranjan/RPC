package org.nriteshranjan.rpcclient;

import jakarta.xml.ws.Service;
import org.nriteshranjan.rpcclient.services.HelloWorld;

import javax.xml.namespace.QName;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) {
        try {
            // Service URL
            URL serviceUrl = new URL("http://localhost:8888/rpc/helloWorld?wsdl");

            // QName with target namespace
            QName serviceQName = new QName("http://impl.services.rpc.nriteshranjan.org/", "HelloWorldImplService");
            Service service = Service.create(serviceUrl, serviceQName);

            // Port QName
            QName helloWorldQName = new QName("http://impl.services.rpc.nriteshranjan.org/", "HelloWorldImplPort");
            HelloWorld hello = service.getPort(helloWorldQName, HelloWorld.class);

            String response = hello.sayHello("Ritesh");
            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
