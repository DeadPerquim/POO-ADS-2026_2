package ads.poo;

public class Caneta {
    private String cor; // null
    private double nivelTinta; // 0% .. 100%
    private final double CONSUMO = 0.01;

    public Caneta(double nivelTinta, String cor) {
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(double nivelTinta) {
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

// metodo desenhar que recebe as coordenadas inicial e final
// se houver tinta suficiente, debite o consumo e retorne qual foi o consumo
// se não houver tinta sufieciente, retorne -1

// Cada unidade consome 0,01% de tinta

    public double desenhar(double x1, double y1, double x2, double y2) {
        double distancia;
        double consumo = 0;
        distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        if (distancia>1) {
            consumo = distancia * CONSUMO;
        }
        if (nivelTinta > consumo){
            this.nivelTinta -= consumo;
            return nivelTinta;
        }
        return -1;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("oi");
        sb.append(", boa noite");

        return "Cor: " + cor + '\n' + "Tinta: " + nivelTinta + "%";
    }
}
//    public String toString(){
//        return "Cor: " + cor + "\nTinta: " + nivelTinta;
//    }