
package projetocalccientifica;

import br.ifsp.edu.CalcCientifica.Calculadora;
import br.ifsp.edu.CalcCientifica.Cosseno;
import br.ifsp.edu.CalcCientifica.Raiz;
import br.ifsp.edu.CalcCientifica.ServicoInterface;
import br.ifsp.edu.CalcCientifica.Somar;
import br.ifsp.edu.CalcCientifica.Subtracao;


public class ProjetoCalcCientifica {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora("cientifico");
        
        ServicoInterface servico01 = new Somar();
        ServicoInterface servico02 = new Cosseno();
        ServicoInterface servico03 = new Subtracao();
        ServicoInterface servico04 = new Raiz();
        
        
        calc.adcionaServico(servico01);
        calc.adcionaServico(servico02);
        calc.adcionaServico(servico03);
        calc.adcionaServico(servico04);
        
        calc.setValorInputA(2);
        calc.setValorInputB(3);
        
         try {
            double subtracao = calc.calcular("Subtracao");
            System.out.println("Resultado: " + subtracao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
        try {
            double raizQuad = calc.calcular("Raiz2");
            System.out.println("Resultado: " + raizQuad);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try{
        double soma = calc.calcular("Somar");
        System.out.println("Resultado: " + soma);            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double cosseno = calc.calcular("Cosseno");
            System.out.println("Resultado: " + cosseno);    
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }   
    }
}
