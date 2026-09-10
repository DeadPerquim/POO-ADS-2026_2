package ads.poo;

public class App {
    public static void main(String[] args) {
        Batedeira philco = new Batedeira();
        int opcao;

        do {
            opcao = lerOpcaoPrincipal();

            switch (opcao) {
                case 1 -> {
                    philco.setLigadaTomada(true);
                    int opcaoMenu;

                    do {
                        opcaoMenu = lerOpcaoMenu();

                        switch (opcaoMenu) {
                            case 1 -> {
                                double volume = Double.parseDouble(IO.readln("Informe o volume em mL: "));
                                philco.setVolume(volume);
                                IO.println(philco.misturar());
                            }
                            case 2 -> {
                                philco.setAtivada(true);
                                IO.println("Parabéns! Você ativou a batedeira vazia! Está Feliz?");
                            }
                            case 3 -> IO.println(philco.misturar());
                            case 4 -> {
                                philco.setLigadaTomada(false);
                                IO.println("Batedeira desligada da tomada.");
                            }
                            case 5 -> IO.println("Voltando ao menu principal.");
                            default -> IO.println("Você teclou uma opção inválida.");
                        }
                    } while (opcaoMenu != 5 && philco.isLigadaTomada());

                    if (!philco.isLigadaTomada()) {
                        IO.println("A batedeira foi desligada da tomada.");
                    }
                }
                case 0 -> IO.println("Programa encerrado.");
                default -> IO.println("Você pressionou a tecla errada. Pressione 1 da próxima vez.");
            }
        } while (opcao != 0);
    }

    private static int lerOpcaoPrincipal() {
        return Integer.parseInt(IO.readln("Bem vindo à batedeira!\n" +
                "1 - Ligar na tomada.\n" +
                "0 - Sair.\n" +
                "Escolha: "));
    }

    private static int lerOpcaoMenu() {
        return Integer.parseInt(IO.readln("1 - Inserir Volume.\n" +
                "2 - Ativar batedeira.\n" +
                "3 - Misturar.\n" +
                "4 - Desligar da Tomada.\n" +
                "5 - Voltar para o menu principal.\n" +
                "Escolha: "));
    }
}
