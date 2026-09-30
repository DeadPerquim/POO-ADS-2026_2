package ads.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this(0, 0, 0);
    }

    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public Horario(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Horario(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public boolean setHora(int hora) {
        if (hora < 0 || hora > 23) {
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            return false;
        } else {
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            return false;
        } else {
            this.segundo = segundo;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
