import java.util.Scanner;

import src.Employee;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome:");
        String nome = input.nextLine();
        System.out.println("Insira o endereco:");
        String address = input.nextLine();
        System.out.println("Insira o n do cartão:");
        double card = input.nextDouble();

        Employee employee = new Employee(nome, address, card);

        System.out.println(employee.showEmployeeInfo());

        /* Scanner input = new Scanner(System.in);
        Random randInt = new Random();

        for(;;) {
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
            int num = randInt.nextInt(500);
            switch(cmd){
                case 1:
                    System.out.println("Adicionando empregado " + num);
                    System.out.println("Empregado adicionado!\n");
                    break;
                case 2:
                    System.out.println("Removendo empregado " + num);
                    System.out.println("Empregado removido!\n");
                    break;
                case 3:
                    System.out.println("Resgistrando ponto para o empregado " + num);
                    System.out.println("Ponto registrado!\n");
                    break;
                case 4:
                    System.out.println("Resultado de vendas: Fizemos muitas vendas esse mês :D\n");
                    break;
                case 5:
                    System.out.println("Taxa de serviço: 50%\n");
                    break;
                case 6:
                    System.out.println("Alterando dados do empregado " + num);
                    System.out.println("Dados alterados! \n");
                    break;
                case 7:
                    System.out.println("Gerando folha de pagamentos...\n");
                    System.out.println("Folha de pagamentos gerada!\n");
                    break;
                case 8:
                    System.out.println("Desfazendo ultima ação...\n");
                    break;
                case 9:
                    System.out.println("Agenda de pagamentos:\n");
                    System.out.println("Empregado " + num + ": 30/02\n");
                    break;
                case 10:
                    System.out.println("Criando novas agendas...\n");
                    System.out.println("Empregado " + num + ": 31/02\n");
                    break;
                case 11:
                    System.out.println("Saindo...\n");
                    return;
                default:
                    System.out.println("COMANDO INVALIDO\n");
                    break;
            }
        }

         */
    }
}
