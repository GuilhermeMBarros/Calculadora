package br.com.calculadora.pojo;
 
public class Operacoes {
 
    private double primeiroNumero;
    private double segundoNumero;
    private String operador;
    private double resultado;
 
    public Operacoes(double primeiroNumero, double segundoNumero, String operador) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
        this.operador = operador;
    }
 
    public double getPrimeiroNumero() {
        return primeiroNumero;
    }
 
    public double getSegundoNumero() {
        return segundoNumero;
    }
 
    public String getOperador() {
        return operador;
    }
 
    public double getResultado() {
        return resultado;
    }
 
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
 