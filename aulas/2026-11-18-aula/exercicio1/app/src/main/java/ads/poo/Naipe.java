package ads.poo;

public enum Naipe {
    OURO(1, "\u2662", "o"),
    ESPADAS(2, "\u2660", "e"),
    COPAS(3, "\u2661", "c"),
    PAUS(4, "\u2663", "p");

    public final int valor;
    public final String simbolo;
    public final String sigla;

    Naipe(int valor, String simbolo, String sigla) {
        this.valor = valor;
        this.simbolo = simbolo;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return this.simbolo;
    }
}
