package Servidor;

import br.ifsp.edu.CalcCientifica.Calculadora;
import br.ifsp.edu.CalcCientifica.Cosseno;
import br.ifsp.edu.CalcCientifica.Raiz;
import br.ifsp.edu.CalcCientifica.ServicoInterface;
import br.ifsp.edu.CalcCientifica.Somar;
import br.ifsp.edu.CalcCientifica.Subtracao;
import javax.jws.WebService;

@WebService(endpointInterface="Servidor.BaseInterfaceWS")

public class ImplementacaoDaBaseInterfaceWS implements BaseInterfaceWS{
    public String tipoOperacao="";
    
    Calculadora calc = new Calculadora("comum");
        
    @Override
    public double getServico(String nomeDoServico, double a, double b) {
        calc.setValorInputA(a);
        calc.setValorInputB(b);
        
        ServicoInterface servico01 = new Somar();
        calc.adcionaServico(servico01);
        
        ServicoInterface servico02 = new Cosseno();
        calc.adcionaServico(servico02);
        
        ServicoInterface servico03 = new Subtracao();
        calc.adcionaServico(servico03);
        
        ServicoInterface servico04 = new Raiz();
        calc.adcionaServico(servico04);
    
        double total=0;
        try{
            total = calc.calcular(nomeDoServico);
            System.out.println("Resultado: " + total);            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        this.tipoOperacao=nomeDoServico;
        return total;
    }
    
    @Override
    public String getCatalogo() {
        return tipoOperacao;
    }
    
}
