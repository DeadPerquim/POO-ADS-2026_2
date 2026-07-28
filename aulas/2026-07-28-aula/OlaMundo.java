
void main() {
    IO.println("Olá Mundo");

    char sexo = IO.readln("Entre com seu sexo (f/m): ").toLowerCase().charAt(0);

    int idade = Integer.parseInt(IO.readln("Qual é a sua idade? "));

    if (sexo == 'm' && idade >= 18) {
        IO.println("Masculino e maior de idade. Precisa apresentar atestado de reservista.");
    } else {
        if (sexo == 'm' && idade < 18) {
            IO.println("Masculino e menor de idade. Não precisa apresentar atestado de reservista.");
        } else {
            IO.print("Feminino. Não precisa apresentar atestado de reservista.");
        }
    }

    // TODO Faça um programa para ler a idade e o sexo de uma pessoa e informe se
    // ela precisa apresentar atestado de reservista

}