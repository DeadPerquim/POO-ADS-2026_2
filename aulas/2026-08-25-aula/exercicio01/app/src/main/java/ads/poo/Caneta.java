package ads.poo;

public class Caneta {
    private String cor; // null
    private int nivelTinta; // 0% .. 100%
    private final double CONSUMO = 0.01;

    public Caneta(int nivelTinta, String cor) {
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(int nivelTinta) {
        this(nivelTinta, "azul");
    }

    public Caneta(){
        this(100);

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double desenhar(double x1, double y1, double x2, double y2) {
        double distancia;
        distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        if (nivelTinta>0){


        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("oi");
        sb.append(", boa noite");

        return "Caneta{" +
                "cor='" + cor + '\'' +
                ", nivelTinta=" + nivelTinta +
                '}';
    }

    //    public String toString(){
//        return "Cor: " + cor + "\nTinta: " + nivelTinta;
//    }

}


// método desenhar que recebe as coordenadas inicial e final
// se houver tinta suficiente, debite o consumo e retorne qual foi o consumo
// se não houver tinta sufieciente, retorne -1