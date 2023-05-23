package ModuloTres.Calculadora;

public class TestesCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(3, 7);
        System.out.println(soma);

        int soma2 = calculadora.somar(3, 0);
        System.out.println(soma2);

        int soma3 = calculadora.somar(0, 0);
        System.out.println(soma3);

        int soma4 = calculadora.somar(3, -2);
        System.out.println(soma4);
    }
}
