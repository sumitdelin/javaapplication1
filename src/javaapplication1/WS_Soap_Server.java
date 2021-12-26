package javaapplication1;
import javax.xml.ws.*;

public class WS_Soap_Server {

    public static void main(String[] args) throws Exception {
        Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImp());
    }

}
