package ads.poo;

public class Contador {
    private int valorAtual;

    public void definirValor(int novoValor){
        valorAtual = novoValor;

    }
    public void incrementarValor(){
        valorAtual += 1;
    }
    public int obterNovoValor(){
        return valorAtual;
    }
}
