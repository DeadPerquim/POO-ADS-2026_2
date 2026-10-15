package ads.poo;

import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class App {
    public static void main(String[] args) {
        Telefone deMesa = new Telefone(1234,"5678abc", "Intelbras", 200, new Dimensao(15,10,5));

        SemFio pessoal = new SemFio(9876, "543abc", "Nokia", 5,new Dimensao(20,10,5), 2.4, 30, 200);

        IO.println(deMesa);

        IO.println(pessoal);

    }
}
