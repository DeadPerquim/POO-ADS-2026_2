package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String valor;

    public Telefone(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        if (this.valor == null) {
            return "";
        }

        try {
            String somenteNumeros = this.valor.replaceAll("[^0-9]", "");
            MaskFormatter mask = new MaskFormatter("+## (##) # ####-####");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(somenteNumeros);
        } catch (ParseException e){
            return this.valor;
        }
    }
}
