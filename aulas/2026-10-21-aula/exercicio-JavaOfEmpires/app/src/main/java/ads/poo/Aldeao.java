package ads.poo;

public class Aldeao extends Personagem{
    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String atacar() {
        return "Aldeão atacando com força " + getAtaque();
    }

    @Override
    public String mover() {
        return "Aldeão se movendo com velocidade " + getAtaque();
    }
}
