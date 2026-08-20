package ads.poo;

public class App {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.definirValor(1);
        contador.incrementarValor();

        IO.println(contador.obterNovoValor());
        IO.println("Entre com um novo valor para o contador: ");
        }
    }

