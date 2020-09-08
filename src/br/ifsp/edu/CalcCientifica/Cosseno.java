package br.ifsp.edu.CalcCientifica;

public class Cosseno implements ServicoInterface{
    private double valorInputA;
    private double valorInputB;
    private String operacao= "Cosseno";
    private String tipoCalculo="cientifico";
    private String tipoCalculadora = "";
    
    @Override
    public double calcular() throws Exception {
        if(tipoCalculadora.equals(tipoCalculadora)){
            throw new Exception();
        }
        return Math.cos(valorInputA);
    }
    
    public boolean calculoE(String tipoCalculo){
        if(this.tipoCalculo.equals(tipoCalculo))
            return true;
        return false;
    }

    @Override
    public boolean operacaoE(String operacao) {
    return true;
    }

    @Override
    public void setValorInputA(double valorInputA) {
        this.valorInputA=valorInputA;
    }

    @Override
    public void setValorInputB(double valorInputB) {
        
    }

    @Override
    public String getOperacao() {
        return operacao;
    }

    @Override
    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora=tipoCalculadora;
    }
    
}
