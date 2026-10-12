package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;

        this.telefones = new HashMap<>();
        this.emails = new HashMap<>();


    }

    public boolean addTelefone(String rotulo, String valor){
        if (rotulo == null && valor == null) {
            return false;
        } else{
            this.telefones.put(rotulo, new Telefone(valor));
            return true;
        }
    }

    public boolean addEmail(String rotulo, String valor){
        try {
            Email email = new Email(valor);
            this.emails.put(rotulo, email);
            return true;
        } catch (IllegalArgumentException email){
            return false;
        }
    }

    public boolean removeTelefone(String rotulo){
        return this.telefones.remove(rotulo) != null;
    }

    
}
