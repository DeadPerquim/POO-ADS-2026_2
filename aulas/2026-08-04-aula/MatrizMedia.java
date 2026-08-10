public class MatrizMedia {
    
public static void main(String[] args) {
    double[][] notas = new double[3][2]; //lin col

    for (int i = 0; i < 3; i++) { // percorre linhas
        
        for (int j = 0; j < 2; j++) { //percorre colunas
            notas[i][j] = Double.parseDouble(IO.readln("Entre com a notas: "));
            
            
        }
        double media = (notas[i][0] + notas[i][1])/2;
        IO.println(media);

    }

    IO.println();
}
}



//Fazer uma matriz que tem a nota 3 alunos em 2 provas e calcular a média deles
// Depois disso imrpimir na tela as a media das notas da Prova1, depois a media das notas da Prova2 e por fim a Média das Médias dos alunos.


// for (int i = 0; i < vetor.length; i++){
//         IO.print(vetor[]);
//     }
    
//     for (int valor : vetor){
//         IO.println(valor);
//     }

//     int[] vetor = new int[5];
//     String[] nomes = new String[5];

//     int[][] matriz = new int[2][3]; //lin col

//     matriz[0][0] = 10;
//     matriz[0][1] = 5;
//     matriz[0][2] = 40;
