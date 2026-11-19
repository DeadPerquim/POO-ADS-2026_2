package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
    private double x;
    private double y;

    public CartaGrafica(Naipe naipe, Valor valor, double x, double y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw draw){
        draw.picture(this.x, this.y, "Cartas/"+this.nomeDaimagem());
    }

    public String nomeDaimagem(){
        return this.valor.simbolo+this.naipe.sigla+".png";
    }
}
