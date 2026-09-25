package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(int hp, int giroAtual, int cilindros) {
        this.hp = hp;
        this.giroAtual = giroAtual;
        this.cilindros = cilindros;
    }

    public void acelerar(int v){
        giroAtual += v;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    public void setGiroAtual(int giroAtual) {
        this.giroAtual = giroAtual;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
}
