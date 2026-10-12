package ads.poo;

public class Email {
    private String valor;

    public Email(String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (valor != null && valor.matches(eR)){
            this.valor = valor;
        } else {
            this.valor = "";
        }

    }

    @Override
    public String toString() {
        return this.valor;
    }
}
