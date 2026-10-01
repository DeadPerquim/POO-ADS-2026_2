package ads.poo;

public class Motor {
    private boolean turbinaOuHelice;
    private boolean ligado;

    public Motor(boolean turbinaOuHelice){
        this.turbinaOuHelice = turbinaOuHelice;
        this.ligado = false;
    }

    public boolean ligarMotor(){
        return this.ligado = true;
    }

    public boolean desligarMotor(){
        return this.ligado = false;
    }
    public String getTipoMotor() {
        if (this.turbinaOuHelice) {
            return "Turbina";
        } else {
            return "Hélice";
        }
    }
}
