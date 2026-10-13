package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

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

    public boolean removeEmail(String rotulo){
        return this.emails.remove(rotulo) != null;
    }

    public boolean updateTelefone(String rotulo, String valor){
        if (rotulo == null || valor == null){
            return false;
        }
        if (this.telefones.containsKey(rotulo)){
            this.telefones.replace(rotulo, new Telefone(valor));
            return true;
        } else {
            return false;
        }
    }

    public boolean updateEmail(String rotulo, String valor){
        if (rotulo == null || valor == null){
            return false;
        }

        if (this.emails.containsKey(rotulo)) {
            try {
                this.emails.replace(rotulo, new Email(valor));
                return true;
            } catch (IllegalArgumentException e){
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder resultado = new StringBuilder("Nome: " + this.nome + " " + this.sobrenome + "\\n");
        resultado.append("Data Nasc: ").append(this.dataNasc.format(formatoData)).append("\\n");
        resultado.append("Telefones:\\n");

        for (String rotulo : this.telefones.keySet()) {
            Telefone tel = this.telefones.get(rotulo);
            resultado.append(" ").append(rotulo).append(": ").append(tel).append("\\n");
        }

        resultado.append("E-mails:\\n");
        for (String rotulo : this.emails.keySet()) {
            Email email = this.emails.get(rotulo);
            resultado.append(" ").append(rotulo).append(": ").append(email).append("\\n");
        }

        return resultado.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(HashMap<String, Telefone> telefones) {
        this.telefones = telefones;
    }

    public HashMap<String, Email> getEmails() {
        return emails;
    }

    public void setEmails(HashMap<String, Email> emails) {
        this.emails = emails;
    }
}
