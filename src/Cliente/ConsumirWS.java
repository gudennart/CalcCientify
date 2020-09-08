package Cliente;

import Servidor.BaseInterfaceWS;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ConsumirWS {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:9999/Servidor/ServidorMensagens?wsdl");
        QName qname = new QName("http://Servidor/", "ImplementacaoDaBaseInterfaceWSService");
        
        Service service=Service.create(url, qname);
        
        BaseInterfaceWS receptorCliente=service.getPort(BaseInterfaceWS.class);
        
        System.out.println(receptorCliente.getServico("Somar",2,3));
        
        System.out.println(receptorCliente.getServico("Subtracao",3,2));
        
        System.out.println(receptorCliente.getServico("Raiz",16,0));
        
        System.out.println(receptorCliente.getServico("Cosseno",90,0));
        
        System.out.println(receptorCliente.getCatalogo());
        
    }
}
