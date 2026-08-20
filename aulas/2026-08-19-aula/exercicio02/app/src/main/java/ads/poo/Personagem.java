package ads.poo;

public class Personagem {
    private int vidaAtual;
    private int manaAtual;
    private int forcaAtual;


    public int definirVida(int novaVida) {
        vidaAtual = novaVida;
        return vidaAtual;
    }
    public int definirMana(int novaMana){
        manaAtual = novaMana;
        return manaAtual;
    }
    public int definirForca(int novaForca){
        forcaAtual = novaForca;
        return forcaAtual;
    }
    public String obterStatus(){
        return "oi" + vidaAtual + "iii";

    }


}
