package br.ifsp.edu.CalcCientifica;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private double valorInputA;
    private double valorInputB;
    private double valorSaida;
    String tipoCalculadora="";
    
    List<ServicoInterface> servicos = new ArrayList<>();
    
    public Calculadora(String tipoCalculadora){
        this.tipoCalculadora=tipoCalculadora;
    }
    
    public String obterCatalogoServicosDisponiveis(){
        String catalogo="";
        int i = 0;
        for(ServicoInterface si: servicos){
            if(si.calculoE(this.tipoCalculadora)){
                catalogo+=si.getOperacao()+",";
                i++;    
            }   
        }
        catalogo=catalogo.substring(0, catalogo.length()-1);
        return catalogo;
    }
    
    public double calcular(String operacao) throws Exception{
        for(ServicoInterface si: servicos){
            if(si.calculoE(this.tipoCalculadora)){
                if(si.operacaoE(operacao)){
                    si.setValorInputA(valorInputA);
                    si.setValorInputB(valorInputB);
                    double res = 0;
                    try{
                        si.calcular();
                    }catch(Exception e){
                        throw new Exception("Erro");
                    }
                    return res;
                }
            }
        }
        return 0;
    }
    
    public void adcionaServico(ServicoInterface servico){
        servicos.add(servico);
    }

    public double getValorInputA() {
        return valorInputA;
    }

    public void setValorInputA(double valorInputA) {
        this.valorInputA = valorInputA;
    }

    public double getValorInputB() {
        return valorInputB;
    }

    public void setValorInputB(double valorInputB) {
        this.valorInputB = valorInputB;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }
}
