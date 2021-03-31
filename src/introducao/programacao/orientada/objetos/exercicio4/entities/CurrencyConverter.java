package introducao.programacao.orientada.objetos.exercicio4.entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double amount){
        return (dollarPrice * amount) * (1 + IOF);
    }

}
