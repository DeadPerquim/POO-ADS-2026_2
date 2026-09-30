package ads.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Motor> listaDeMotores = new ArrayList<>();

        Motor motor1 = new Motor(true);
        Motor motor2 = new Motor(true);
        Motor motor3 = new Motor(true);
        Motor motor4 = new Motor(true);

        listaDeMotores.add(motor1);
        listaDeMotores.add(motor2);
        listaDeMotores.add(motor3);
        listaDeMotores.add(motor4);

        Aviao meuLindoeMaravilhosoAviao =new Aviao(6, 269, 91380, listaDeMotores);
    }
}
