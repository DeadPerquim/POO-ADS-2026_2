package ads.poo;

public class Pessoa {
    private static int pessoasRegistradas;
    private int id;
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        pessoasRegistradas++;
        id = pessoasRegistradas;

    }
    public int getPessoasRegistradas(){
        return pessoasRegistradas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" + "nome: " + nome + "\n" + "email: " + email;
    }
}
