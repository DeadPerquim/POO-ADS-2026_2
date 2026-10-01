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

    public String numeroPorExtenso(int n){
        switch(n){
            case 0: return "zero";
            case 1: return "um";
            case 2: return "dois";
            case 3: return "tres";
            case 4: return "quatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "sete";
            case 8: return "oito";
            case 9: return "nove";
            case 10: return "dez";
            case 11: return "onze";
            case 12: return "doze";
            case 13: return "treze";
            case 14: return "catorze";
            case 15: return "quinze";
            case 16: return "dezesseis";
            case 17: return "dezessete";
            case 18: return "dezoito";
            case 19: return "dezenove";
        }

        int dezena = n / 10;
        int unidade = n % 10;
        String extensoDezena = "";
        switch(dezena){
            case 20 -> extensoDezena = "vinte";
            case 30 -> extensoDezena = "trinta";
            case 40 -> extensoDezena = "quarenta";
            case 50 -> extensoDezena = "cinquenta";
        }

        return (unidade == 0) ? extensoDezena : extensoDezena + " e " + numeroPorExtenso(unidade);
    }
    public String porExtenso(){
        return numeroPorExtenso(hora) + " horas e "+ numeroPorExtenso(minuto) + " minutos e " + numeroPorExtenso(segundo) + " segundo";
    }

    public long emSegundos(){
        return hora * 3600L + minuto * 60L + segundo;
    }

    public long diferenca(Horario outro){
        return emSegundos() - outro.emSegundos();
    }
}
