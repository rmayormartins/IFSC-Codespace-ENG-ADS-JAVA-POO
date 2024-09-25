package Aulas;
public class B2FormatacaoESaida {
    public static final double PI = 3.1416;

    public static void main(String[] args) {
        float valor = 12.123456789f;
        
        System.out.printf("Float com 6 casas decimais: %.6f\n", valor);
        System.out.printf("Float em notação científica: %e\n", valor);
        System.out.printf("Valor da constante PI: %.4f\n", PI);
    }
}
