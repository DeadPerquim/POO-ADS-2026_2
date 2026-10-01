package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int numMaxTripulantes;
    private int numMaxPassageiros;
    private long capMaxComnusitvel;
    private boolean aviaoLigado;
    private ArrayList<Motor> motores;

    public Aviao(int numMaxTripulantes, int numMaxPassageiros, int capMaxComnusitvel, int totalDeMotores, boolean turbinaOuHelice) {
        this.numMaxTripulantes = numMaxTripulantes;
        this.numMaxPassageiros = numMaxPassageiros;
        this.capMaxComnusitvel = capMaxComnusitvel;
        this.motores = new ArrayList<>();
        for (int i = 0; i < totalDeMotores; i++) {
            this.motores.add(new Motor(turbinaOuHelice));


        }
    }

    public boolean ligarDesligarAviao(boolean estadoDoMotor) {
        this.aviaoLigado = estadoDoMotor;

        for (int i = 0; i < this.motores.size(); i++) {
            Motor motorAtual = this.motores.get(i);

            if (estadoDoMotor) {
                motorAtual.ligarMotor();
            } else {
                motorAtual.desligarMotor();
            }
        }
        return this.aviaoLigado;
    }

    public void ligarDesligarMotorIndividual(int indiceMotor, boolean estadoDesejado) {
        if (indiceMotor >= 0 && indiceMotor < this.motores.size()) {
            Motor motorEspecifico = this.motores.get(indiceMotor);

            if (estadoDesejado) {
                motorEspecifico.ligarMotor();
            } else {
                motorEspecifico.desligarMotor();
            }
        } else {
            System.out.println("Índice do motor é inválido!");
        }
    }
}