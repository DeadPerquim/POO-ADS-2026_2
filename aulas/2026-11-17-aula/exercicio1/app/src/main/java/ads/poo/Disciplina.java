package ads.poo;

public class Disciplina {
    private String sigla;
    private DiaDaSemana[] dias;

    public Disciplina(String sigla, DiaDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public DiaDaSemana[] getDias() {
        return dias;
    }

    public void setDias(DiaDaSemana[] dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        String frase = "Sigla: " + sigla + "\n"
                + "Dias com aula:";
        for (int i = 0; i < dias.length; i++) {
            frase += "\n" + dias[i];
        }
        frase += "\n";
        return frase;
    }
}
