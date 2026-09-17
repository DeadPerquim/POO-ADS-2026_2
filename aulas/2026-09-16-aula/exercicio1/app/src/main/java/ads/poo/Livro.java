package ads.poo;

public class Livro {
    private final String ISBN;
    private String autor;
    private int ano;

    public Livro(String ISBN, String autor, int ano) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + "\n" + "Autor: " + autor + "\n" + "Ano: " + ano;
    }
}
