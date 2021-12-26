package javaapplication1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class WS_Soap_Client {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7779/ws/hello?wsdl");
        QName qname = new QName("http://javaapplication1/", "HelloWorldImpService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.getHelloWorldString("sumit "));
    }
}
