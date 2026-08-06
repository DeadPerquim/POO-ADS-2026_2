import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {
            String linha = leitor.nextLine();
            String[] campos = linha.split(",");

            IO.print(linha + " ");
            
            IO.println();
        }

        

        leitor.close();
    }
}
