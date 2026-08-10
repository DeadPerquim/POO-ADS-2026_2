public class Data {
    void main(){
        String disciplina = IO.readln("Entre com a sigla da disciplina: ").toUpperCase();
        String[] dias= new String[5];

        int i = 0;
        boolean sair = false;

        while (i < 5 && sair == false) {
            String dia = IO.readln("Informe o dia da semana ou nao para encerrar:");
            

            // if (dia.equals("seg")) {

            //     dias[i++] = dia;

            // } else if (dia.equals("ter")){

            //     dias[i++] = dia;
                
            // } else if (dia.equals("qua")){

            //     dias[i++] = dia;
                
            // } else if (dia.equals("qui")){

            //     dias[i++] = dia;
                
            // } else if (dia.equals("sex")){

            //     dias[i++] = dia;
                
            // }
            switch (dia) {
                case "seg", "ter", "qua", "qui", "sex":
                    dias[i++] = dia;
                    break;
                case "nao":
                    sair = true;  
                    break;  
                default:
                    IO.println("ERRO: Valor inválido. Entre com: seg, ter, qua, qui ou sex");
                    break;
            }
            // else{
            //     IO.println("ERRO: Valor inválido. Entre com: seg, ter, qua, qui ou sex");
            // }
        }
        String resposta = "Na disciplina " + disciplina + " você tem aulas nos seguintes dias: ";

        for (int j = 0; j < i; j++) {
            if (j > 0) {
                resposta += ", ";
            }
            resposta += dias[j];
        }

        IO.println(resposta);
    }
}

 // Faça um programa que o usuário deve informar:
    // - Sigla da Diciplina
    // - Todos os dias da semana que tem aula dessa disciplina
    // 
    // Por fim imprima:
    // Na Disciplina **** você tem aulas nos seguintes dias:
    // - seg
    // - qua
    // - sex