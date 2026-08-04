public class Media {
    public static void main(String[] args) {
        
        String usuario = IO.readln("Qual é o seu nome de usuário:");

        double nota1 = Double.parseDouble(IO.readln("Insira sua primeira nota: "));
        double nota2 = Double.parseDouble(IO.readln("Insira sua segunda nota: "));

        double media = (nota1 + nota2)/2;

        if (media > 7) {
            IO.println("A sua Média é " + media + ". " + "Vocẽ está aprovado.");
            
        }
        else{
            IO.println("A sua Média é " + media + ". " + "Você está reprovado.");
        }

    }


    
    // Entrar com nome do usuário
    // Entrar as duas Notas
    // "A sua média é XX, você está (Aprovado/Reprovado)"


}

    //if (i == 5){
    //}

    //if (nome.equals)