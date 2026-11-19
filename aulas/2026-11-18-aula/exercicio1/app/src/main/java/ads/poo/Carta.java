package ads.poo;

public class Carta{
    protected Naipe naipe;
    protected Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }



    @Override
    public String toString() {
        return "" + valor + naipe;
    }
}
