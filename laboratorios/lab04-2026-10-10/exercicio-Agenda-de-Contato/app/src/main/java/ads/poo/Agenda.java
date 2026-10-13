package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c){
        if (c != null){
            this.contatos.add(c);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> encontrados = new ArrayList<>();
        for (Contato c : this.contatos) {
            if (c.getNome().equalsIgnoreCase(nome) && c.getSobrenome().equalsIgnoreCase(sobrenome)){
                encontrados.add(c);
            }
        }
        return encontrados;
    }

    public  boolean removeContato(int indiceContatoNaLista){
        if (0 <= indiceContatoNaLista && indiceContatoNaLista < this.contatos.size()){
            this.contatos.remove(indiceContatoNaLista);
            return true;
        } else {
            return false;
        }
    }

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < this.contatos.size()){
            Contato c = this.contatos.get(indiceContatoNaLista);
            return c.addTelefone(rotulo, valor);
        } else {
            return false;
        }
    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < this.contatos.size()){
            Contato c = this.contatos.get(indiceContatoNaLista);
            return c.addEmail(rotulo, valor);
        } else {
            return false;
        }
    }

    public boolean updateTelefone(String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < this.contatos.size()){
            Contato c = this.contatos.get(indiceContatoNaLista);
            return c.updateTelefone(rotulo, valor);
        } else {
            return false;
        }
    }

    public boolean updateEmail(String rotulo, String valor, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < this.contatos.size()){
            Contato c = this.contatos.get(indiceContatoNaLista);
            return c.updateEmail(rotulo, valor);
        } else {
            return false;
        }
    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < this.contatos.size()){
            Contato c = this.contatos.get(indiceContatoNaLista);
            return c.removeTelefone(rotulo);
        } else {
            return false;
        }
    }

    public boolean removeEmail(String rotulo, int indiceContatoNaLista){
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < this.contatos.size()){
            Contato c = this.contatos.get(indiceContatoNaLista);
            return c.removeEmail(rotulo);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String resultado = "=== AGENDA DE CONTATOS ===\n";

        if (this.contatos.size() == 0){
            resultado += "Nenhum contato cadastrado na agenda.\n";
        } else {
            for (int i = 0; i < this.contatos.size(); i++) {
                resultado += "Contato [" + i + "]\n";
                resultado += this.contatos.get(i).toString() + "\n";
                resultado += "---------------------------------\n";
            }
        }
        return resultado;
    }
}
