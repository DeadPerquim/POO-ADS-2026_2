package ads.poo;

public class Arqueiro extends Personagem{
    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacou com força " + getAtaque();
    }

    @Override
    public String mover() {
        return "Arqueiro se moveu com velocidade " + getVelocidade();
    }
}
