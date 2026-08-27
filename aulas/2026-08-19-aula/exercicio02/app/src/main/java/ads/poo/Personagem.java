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

    public String definirClasse(){
        if (manaAtual >= 125 && forcaAtual < 100){
            return "Mago";
        } else if (forcaAtual >= 125 && manaAtual < 100) {
            return "Barbáro";
            
        } else if ((vidaAtual >= 76 && vidaAtual <= 124) &&
                (manaAtual >=76 && manaAtual <=124) &&
                (forcaAtual >=76 && forcaAtual <=124)){
            return "Guerreiro";
        } else {
            return "Classe Indefinida! Tente colocar um status entre 50 e 150 (Obs: Apenas um dos três Status pode estar abaixo de 76 ou acima de 124)";
        }
    }

    public String obterStatus(){
        return "Classe: " + definirClasse() +  "\nVida : " + vidaAtual + "\nMana: " + manaAtual + "\nForca: " + forcaAtual;

    }
}
