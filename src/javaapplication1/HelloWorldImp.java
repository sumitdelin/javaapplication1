package javaapplication1;

import javax.jws.WebService;

@WebService(endpointInterface = "javaapplication1.HelloWorld")
public class HelloWorldImp implements HelloWorld{
    @Override
    public String getHelloWorldString(String name) {
       return "hellow Mr : "+name;
    }
}
