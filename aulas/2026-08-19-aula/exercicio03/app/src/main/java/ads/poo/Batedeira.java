package ads.poo;

public class Batedeira {
    private boolean ligadaTomada;
    private double volume;
    public static final double capacidadeTotal = 1000;
    private boolean ativada;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public String misturar(){
        if(isLigadaTomada()){
            if (volume < capacidadeTotal * 0.7){
                setAtivada(true);
                volume *= 1.3;
                return "Seu produto acabou de ser misturado: " + volume + "mL";
            }
            else {
                return "A batedeira vai transbordar após a mistura. Tente colocar menos volume";
            }

        }
        else {
            return "Não Está Ligada na Tomada";
        }
    }

    public void setLigadaTomada(boolean ligadaTomada) {
        this.ligadaTomada = ligadaTomada;
    }

    public boolean isLigadaTomada() {
        return ligadaTomada;
    }

    public void setAtivada(boolean ativada) {
        this.ativada = ativada;
    }

    public boolean isAtivada() {
        return ativada;
    }
}
