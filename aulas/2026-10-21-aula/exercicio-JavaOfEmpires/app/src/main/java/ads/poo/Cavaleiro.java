package ads.poo;

public class Cavaleiro extends Personagem{
    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro Atacando com força " + getAtaque();
    }

    @Override
    public String mover() {
        return "Cavaleiro se movendo com velocidade " + getVelocidade();
    }
}
