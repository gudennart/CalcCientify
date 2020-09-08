/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp.edu.CalcCientifica;

/**
 *
 * @author Nicolindo
 */
public class Subtracao implements ServicoInterface {
private double valorInputA;
    private double valorInputB;
    private String operacao = "Subtracao";
    private String tipoCalculo = "Comum";
    
    @Override
    public double calcular() throws Exception{
        return valorInputA - valorInputB;
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

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public boolean operacaoE(String operacao){
        if (this.operacao.equals(operacao)){
            return true;
        }
        return false;
    }

    public String getTipoCalculadora() {
        return tipoCalculo;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculo = tipoCalculadora;
    }

    @Override
    public boolean calculoE(String tipoCalculo) {
        return true;
    }   
}
