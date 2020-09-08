package Servidor;

import javax.xml.ws.Endpoint;

public class PublicadorDoWebService {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9999/Servidor/ServidorMensagens", new ImplementacaoDaBaseInterfaceWS());
    }
}
