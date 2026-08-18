package ads.poo;

public class Carro {
    //Atributos
    private int velocidadeAtual;
    private String marca = "Ferrari";
    String cor = "Vermelho";
    String piloto = "Michael Schumacher";
    Boolean Desbloqueado = true;

    //métodos
    public void acelerar(int incremento){
        if ((velocidadeAtual + incremento) > 100){
            velocidadeAtual = 100; }
        else{
            velocidadeAtual += incremento;
        }

    }
    public int obterVelocidadeAtual(){
        return velocidadeAtual;

    }
}

//Limite maximo de velocidade é 100.