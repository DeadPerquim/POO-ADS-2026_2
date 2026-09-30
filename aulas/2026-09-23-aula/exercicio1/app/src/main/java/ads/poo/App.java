package ads.poo;

public class App {
    static void main(String[] args) {
        // Associação do Tipo Agregação
        Motor v8 = new Motor(1,1);
        Carro fusca = new Carro("VW", v8);

        fusca = null;
    }
}
