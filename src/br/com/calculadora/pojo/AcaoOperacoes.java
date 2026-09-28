package br.com.calculadora.pojo;
 
import br.com.calculadora.pojo.Operacoes;
 
public class AcaoOperacoes {
 
    public double calcular(Operacoes operacao) {
 
        double n1 = operacao.getPrimeiroNumero();
        double n2 = operacao.getSegundoNumero();
 
        double resultado;
 
        switch (operacao.getOperador()) {
 
        	// Somar
            case "+":
                resultado = n1 + n2;
                break;
 
                
            // Subtrair
            case "-":
                resultado = n1 - n2;
                break;
 
                
            // Multiplicar
            case "*":
                resultado = n1 * n2;
                break;
 
                
            // Dividir
            case "/":
 
                if (n2 == 0) {
                    throw new ArithmeticException(
                        "Não é possível dividir por zero."
                    );
                }
 
                resultado = n1 / n2;
                break;
                
                
            // Potencia
            case "^":
                resultado = Math.pow(n1, n2);
                break;
 
                
                
            // Raiz quadrada
            case "√":
                if (n1 < 0) {
                    throw new ArithmeticException(
                        "Não existe raiz quadrada real de número negativo."
                    );
                }
                resultado = Math.sqrt(n1);
                break;
                 
                
            default:
                throw new IllegalArgumentException(
                    "Operador inválido."
                );
        }
 
        operacao.setResultado(resultado);
 
        return resultado;
    }
}