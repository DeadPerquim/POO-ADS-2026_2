package ads.poo;

public class App {
    public static void main(String[] args) {

        Horario horas1 = new Horario();
        IO.println("Construtor padrao");
        IO.println(horas1);
        horas1.emSegundos();
        IO.println("=======================");


        Horario horas2 = new Horario(11);
        IO.println("Construtor hora");
        IO.println(horas2);
        IO.println("=======================");

       Horario horas3 = new Horario(9, 20);
        IO.println("Construtor hora e minuto");
        IO.println(horas3);
        IO.println(horas3.porExtenso());
        IO.println("=======================");


        Horario horas4 = new Horario(18,5, 30);
        IO.println("Construtor hora, minuto e segundo");
        IO.println(horas4);
        IO.println(horas4.emSegundos());
        IO.println(horas4.porExtenso());
        IO.println(horas4 + " em segundos " + horas4.emSegundos());
        IO.println("Diferenca entre: " + horas3 + " e " + horas4 + " é " + horas3.diferenca(horas4));
        IO.println("=======================");

        Horario horas5 = new Horario(0,0,0);
        IO.println("Construtor hora, minuto e segundo");
        IO.println(horas5);
        IO.println(horas5.porExtenso());
        IO.println(horas5.emSegundos());
        IO.println(horas5.diferenca(horas4));
    }
}
