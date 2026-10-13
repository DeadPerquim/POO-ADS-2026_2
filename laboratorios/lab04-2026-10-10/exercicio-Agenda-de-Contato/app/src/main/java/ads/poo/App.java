package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class App {
    private Agenda agenda;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public App() {
        this.agenda = new Agenda();
    }

    public void menu() {
        int opcao = -1;

        do {
            exibirMenu();
            try {
                opcao = Integer.parseInt(IO.readln("Escolha uma opcao: "));
            } catch (NumberFormatException e) {
                IO.println("Opção inválida! Digite apenas números.");
                continue;
            }

            switch (opcao) {
                case 1 -> cadastrarContato();
                case 2 -> IO.println(this.agenda.toString());
                case 3 -> buscarContato();
                case 4 -> adicionarTelefone();
                case 5 -> adicionarEmail();
                case 6 -> atualizarTelefone();
                case 7 -> atualizarEmail();
                case 8 -> removerTelefone();
                case 9 -> removerEmail();
                case 10 -> removerContato();
                case 0 -> IO.println("Encerrando a agenda...");
                default -> IO.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
    }

    private void exibirMenu() {
        IO.println("\n=== AGENDA DE CONTATOS ===");
        IO.println("1. Adicionar Contato");
        IO.println("2. Listar Contatos");
        IO.println("3. Buscar Contato");
        IO.println("4. Adicionar Telefone");
        IO.println("5. Adicionar E-mail");
        IO.println("6. Atualizar Telefone");
        IO.println("7. Atualizar E-mail");
        IO.println("8. Remover Telefone");
        IO.println("9. Remover E-mail");
        IO.println("10. Remover Contato");
        IO.println("0. Sair");
    }

    private void cadastrarContato() {
        String nome = IO.readln("Nome: ");
        String sobrenome = IO.readln("Sobrenome: ");
        String dataStr = IO.readln("Data de Nascimento (dd/MM/yyyy): ");

        try {
            LocalDate dataNasc = LocalDate.parse(dataStr, formato);
            if (this.agenda.addContato(new Contato(nome, sobrenome, dataNasc))) {
                IO.println("Contato cadastrado com sucesso!");
            } else {
                IO.println("Erro ao cadastrar contato.");
            }
        } catch (Exception e) {
            IO.println("Data em formato inválido! Use dd/MM/yyyy.");
        }
    }

    private void buscarContato() {
        String nome = IO.readln("Nome: ");
        String sobrenome = IO.readln("Sobrenome: ");
        ArrayList<Contato> achados = this.agenda.findContato(nome, sobrenome);

        if (achados.size() == 0) {
            IO.println("Nenhum contato encontrado.");
        } else {
            for (Contato c : achados) {
                IO.println(c.toString());
            }
        }
    }

    private void adicionarTelefone() {
        IO.println(this.agenda.toString());
        try {
            int idx = Integer.parseInt(IO.readln("Índice do contato: "));
            String rotulo = IO.readln("Rótulo (ex: celular): ");
            String numero = IO.readln("Número (+5548998761234): ");

            if (this.agenda.addTelefone(rotulo, numero, idx)) {
                IO.println("Telefone adicionado com sucesso!");
            } else {
                IO.println("Erro ao adicionar telefone. Verifique o índice.");
            }
        } catch (NumberFormatException e) {
            IO.println("Índice inválido.");
        }
    }

    private void adicionarEmail() {
        IO.println(this.agenda.toString());
        try {
            int idx = Integer.parseInt(IO.readln("Índice do contato: "));
            String rotulo = IO.readln("Rótulo (ex: pessoal): ");
            String email = IO.readln("E-mail: ");

            if (this.agenda.addEmail(rotulo, email, idx)) {
                IO.println("E-mail adicionado com sucesso!");
            } else {
                IO.println("E-mail inválido ou índice incorreto.");
            }
        } catch (NumberFormatException e) {
            IO.println("Índice inválido.");
        }
    }

    private void atualizarTelefone() {
        IO.println(this.agenda.toString());
        try {
            int idx = Integer.parseInt(IO.readln("Índice do contato: "));
            String rotulo = IO.readln("Rótulo do telefone a alterar: ");
            String novoNumero = IO.readln("Novo número: ");

            if (this.agenda.updateTelefone(rotulo, novoNumero, idx)) {
                IO.println("Telefone atualizado com sucesso!");
            } else {
                IO.println("Erro ao atualizar telefone. Rótulo ou índice inexistente.");
            }
        } catch (NumberFormatException e) {
            IO.println("Índice inválido.");
        }
    }

    private void atualizarEmail() {
        IO.println(this.agenda.toString());
        try {
            int idx = Integer.parseInt(IO.readln("Índice do contato: "));
            String rotulo = IO.readln("Rótulo do e-mail a alterar: ");
            String novoEmail = IO.readln("Novo e-mail: ");

            if (this.agenda.updateEmail(rotulo, novoEmail, idx)) {
                IO.println("E-mail atualizado com sucesso!");
            } else {
                IO.println("Erro ao atualizar e-mail. Verifique a sintaxe do e-mail ou o rótulo.");
            }
        } catch (NumberFormatException e) {
            IO.println("Índice inválido.");
        }
    }

    private void removerTelefone() {
        IO.println(this.agenda.toString());
        try {
            int idx = Integer.parseInt(IO.readln("Índice do contato: "));
            String rotulo = IO.readln("Rótulo do telefone a remover: ");

            if (this.agenda.removeTelefone(rotulo, idx)) {
                IO.println("Telefone removido com sucesso!");
            } else {
                IO.println("Erro ao remover telefone. Rótulo ou índice inexistente.");
            }
        } catch (NumberFormatException e) {
            IO.println("Índice inválido.");
        }
    }

    private void removerEmail() {
        IO.println(this.agenda.toString());
        try {
            int idx = Integer.parseInt(IO.readln("Índice do contato: "));
            String rotulo = IO.readln("Rótulo do e-mail a remover: ");

            if (this.agenda.removeEmail(rotulo, idx)) {
                IO.println("E-mail removido com sucesso!");
            } else {
                IO.println("Erro ao remover e-mail. Rótulo ou índice inexistente.");
            }
        } catch (NumberFormatException e) {
            IO.println("Índice inválido.");
        }
    }

    private void removerContato() {
        IO.println(this.agenda.toString());
        try {
            int idx = Integer.parseInt(IO.readln("Índice do contato a remover: "));
            if (this.agenda.removeContato(idx)) {
                IO.println("Contato removido com sucesso!");
            } else {
                IO.println("Índice inválido.");
            }
        } catch (NumberFormatException e) {
            IO.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.menu();
    }
}
