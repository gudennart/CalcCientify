package br.ifsp.edu.CalcCientifica;

public interface ServicoInterface {
    public double calcular() throws Exception;
    
    public boolean operacaoE(String operacao);
    public void setValorInputA(double valorInputA);
    public void setValorInputB(double valorInputB);
    public String getOperacao();
    public boolean calculoE(String tipoCalculo);
    public void setTipoCalculadora( String tipoCalculadora);
}
