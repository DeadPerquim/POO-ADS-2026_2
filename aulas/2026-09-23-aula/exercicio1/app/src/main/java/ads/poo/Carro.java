package ads.poo;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro(String m, Motor mo){
        this.marca = m;
        this.propulsor = mo;
    }

//    Associação do Tipo Composição:
//    public Carro(String m){
//        this.marca = m;
//        this.propulsor = new Motor(1,1);
//    }

    public void acelerar(int valor){
        this.propulsor.acelerar(valor);
    }
    public void trocarMotor(Motor mo){
        this.propulsor = mo;
    }
}

