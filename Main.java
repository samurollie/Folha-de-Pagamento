import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import src.employee.*;

public class Main {
    public static void main(String[] args) {
        Random randInt = new Random();
        Scanner input = new Scanner(System.in);
        Stack<Integer> undo = new Stack<>();
        Stack<Integer> redo = new Stack<>();
        Employee Employees = new Employee(500);
        int id;

        for (;;) {
            System.out.println("Selecione uma opção:");
            System.out.println("(1) - Adicionar Empregado");
            System.out.println("(2) - Remover Empregado");
            System.out.println("(3) - Lançar cartão de ponto");
            System.out.println("(4) - Lançar resultado de venda");
            System.out.println("(5) - Lançar taxa de serviço");
            System.out.println("(6) - Alterar empregado");
            System.out.println("(7) - Rodar folha de pagamento");
            System.out.println("(8) - Undo e Redo");
            System.out.println("(9) - Agenda de Pagamento");
            System.out.println("(10) - Criar novas agendas de pagamento");
            System.out.println("(11) - Sair");
            int cmd = input.nextInt();
            input.nextLine();
            
            if (cmd <= 7) undo.push(cmd);

            switch (cmd) {
            case 1:
                Employees.add();
                break;
            case 2:
                /*
                 * System.out.println("Insira o nº do empregado que deseja remover..."); id =
                 * input.nextInt(); System.out.println("Removendo empregado " + id); if
                 * (empregados[id] == true) { empregados[id] = false;
                 * System.out.println("Empregado removido!\n"); break; }
                 * System.out.println("Empregado não encontrado!\n");
                 */
                break;
            case 3:
                id = randInt.nextInt(500);
                System.out.println("Resgistrando ponto para o empregado " + id);
                System.out.println("Ponto registrado!\n");
                break;
            case 4:
                System.out.println("Resultado de vendas: Fizemos muitas vendas esse mês :D\n");
                break;
            case 5:
                System.out.println("Taxa de serviço: 50%\n");
                break;
            case 6:
                id = randInt.nextInt(500);
                System.out.println("Alterando dados do empregado " + id);
                System.out.println("Dados alterados! \n");
                break;
            case 7:
                System.out.println("Gerando folha de pagamentos...\n");
                System.out.println("Folha de pagamentos gerada!\n");
                break;
            case 8:
                System.out.println("(1) - Undo");
                System.out.println("(2) - Redo");
                int option = input.nextInt();
                input.nextLine();

                if (option == 1) {
                    if (undo.size() > 0) {
                        System.out.println("Desfazendo ultima ação...\n");
                        // Adicionar a opção de desfazer a função em si
                        redo.push(undo.pop());
                    } else {
                        System.out.println("Não há nenhuma ação para ser desfeita!");
                    }
                } else {
                    if (redo.size() > 0) {
                        System.out.println("Refazendo a ultima ação...\n");
                        undo.push(redo.pop());
                    } else {
                        System.out.println("Não há nenhuma ação para ser refeita!");
                    }
                }
                break;
            case 9:
                id = randInt.nextInt(500);
                System.out.println("Agenda de pagamentos:\n");
                System.out.println("Empregado " + id + ": 30/02\n");
                break;
            case 10:
                id = randInt.nextInt(500);
                System.out.println("Criando novas agendas...\n");
                System.out.println("Empregado " + id + ": 31/02\n");
                break;
            case 11:
                System.out.println("Saindo...\n");
                input.close();
                return;
            default:
                System.out.println("COMANDO INVALIDO\n");
                break;
            }

            System.out.println("Pressione ENTER para continuar...");
            input.nextLine();
        }

    }
}
