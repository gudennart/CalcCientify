package Servidor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name="ServidorMensagens")
@SOAPBinding(style=Style.RPC)

public interface BaseInterfaceWS {
    @WebMethod double getServico(String nomeDoServico, double a, double b);
    @WebMethod String getCatalogo();
}
