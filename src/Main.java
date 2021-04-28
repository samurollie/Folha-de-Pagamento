package src;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import src.employee.*;
import src.syndicate.*;

public class Main {
    public static void main(String[] args) {
        Random randInt = new Random();
        Scanner input = new Scanner(System.in);
        Stack<Integer> undo = new Stack<>();
        Stack<Integer> redo = new Stack<>();

        System.out.println("Bem-vindo!");
        System.out.println("Insira a quantidade inicial de empregados: ");
        int maxCapacity = input.nextInt();
        EmployeeList employees = new EmployeeList(maxCapacity);

        SyndicateList syndicate = new SyndicateList();

        for (;;) {
            System.out.println("Selecione uma opção:");
            System.out.println("(1) - Adicionar Empregado");
            System.out.println("(2) - Remover Empregado");
            System.out.println("(3) - Lançar cartão de ponto");
            System.out.println("(4) - Lançar resultado de venda");
            System.out.println("(5) - Lançar taxa de serviço");
            System.out.println("(6) - Alterar empregado");
            System.out.println("(7) - Rodar folha de pagamento");
            System.out.println("(8) - Undo/Redo");
            System.out.println("(9) - Agenda de Pagamento");
            System.out.println("(10) - Criar novas agendas de pagamento");
            System.out.println("(11) - Sair");
            int cmd = input.nextInt();
            input.nextLine();

            if (cmd <= 7)
                undo.push(cmd);

            switch (cmd) {
            case 1:
                if (employees.listSize() >= maxCapacity) {
                    System.out.println(
                            "Capacidade máxima de empregados alcançada! Deseja aumentar em quantos empregados?");
                    int newSize = input.nextInt();
                    maxCapacity += newSize;
                    employees.resize(maxCapacity);
                }

                System.out.println("Insira o nome do empregado:");
                String name = input.nextLine();

                System.out.println("Insira o endereco do empregado:");
                String address = input.nextLine();

                System.out.println("Como " + name + " deseja receber o seu salário?");
                System.out.println("(1) - Em mãos");
                System.out.println("(2) - Depósito bancário");
                System.out.println("(3) - Cheque pelos correios");
                int payment = input.nextInt();

                System.out.println("Gerando o nº do cartão...");
                int id = randInt.nextInt(maxCapacity); // Gera um número aletório de 0 a maxCapacity
                while (employees.containsId(id)) { // false = não tem alguem com aql numero
                    id = randInt.nextInt(maxCapacity);
                }
                employees.addEmployee(name, address, id, payment);

                System.out.println("Deseja fazer parte do sindicato?");
                System.out.println("(1) - Sim");
                System.out.println("(2) - Não");
                int isOnSyndicate = input.nextInt();

                if (isOnSyndicate == 1) {
                    syndicate.addEmployee(employees.getEmployee(id));
                    System.out.println(syndicate.showInfoOnSyndicate(employees.getEmployee(id)));
                }
                break;
            case 2:

                System.out.println("Insira o nº de identificação do empregado que deseja remover...");
                int number = input.nextInt();
                syndicate.removeEmployee(employees.getEmployee(number));
                employees.removeEmployee(number);
                break;
            case 3:
                System.out.println("Insira o id do empregado...");
                id = input.nextInt();
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
                System.out.println("Insira o nº de identificação do empregado que deseja alterar algum dado...");
                id = input.nextInt();

                while (true) {
                    Employee employee = employees.getEmployee(id);
                    System.out.println("Exibindo dados do empregado " + employee.getName());
                    System.out.println(employee.showEmployeeInfo());

                    if (syndicate.containsEmployee(employee)) {
                        System.out.println("Esse empregado faz parte do Sindicato");
                    } else {
                        System.out.println("Esse empregado não faz parte do Sindicato");
                    }

                    System.out.println("O que você deseja alterar?");
                    System.out.println("(1) - Nome             (2) - Endereço");
                    System.out.println("(3) - Tipo             (4) - Método de Pagamento");

                    if (syndicate.containsEmployee(employee)) {
                        System.out.println("(5) - Remover do Sindicato");
                        System.out.println("(6) - Id no Sindicato  (7) - Taxa Sindical");
                    } else {
                        System.out.println("(5) - Adicionar ao Sindicato");
                    }

                    int change = input.nextInt();

                    if (change == 1) {
                        System.out.println("Insira o novo nome:");
                        String newName = input.nextLine();
                        employees.getEmployee(id).setName(newName);
                    } else if (change == 2) {
                        System.out.println("Insira o novo Endereço:");
                        String newAddress = input.nextLine();
                        employees.getEmployee(id).setAddress(newAddress);
                    } else if (change == 3) {

                    } else if (change == 4) {
                        System.out.println("Selecione um novo método de pagamento:");
                        System.out.println("(1) - Em mãos");
                        System.out.println("(2) - Depósito bancário");
                        System.out.println("(3) - Cheque pelos correios");
                        int newPayment = input.nextInt();
                        employees.getEmployee(id).setPaymentMethod(newPayment);
                    } else {
                        if (syndicate.containsEmployee(employees.getEmployee(id))) {
                            if(change == 5) {
                                syndicate.removeEmployee(employee);
                            } else if (change == 6) {
                                
                            } else if (change == 7) {
                                System.out.println("Insira a nova taxa sindical:");
                                double newSyndicalCharge = input.nextDouble();
                                syndicate.getSyndicate(employee).setsyndicalCharge(newSyndicalCharge);
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        } else if (change == 5) { // Se ele nao tiver na lista e change for igual a 5, é pra adicionar
                            syndicate.addEmployee(employees.getEmployee(id));
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }

                    System.out.println("Dados alterados! \n");
                    System.out.println("Deseja alterar mais alguma coisa?");
                    System.out.println("(1) - Sim");
                    System.out.println("(2) - Não");
                    int continuar = input.nextInt();

                    if (continuar == 2) {
                        break;
                    }
                }

                break;
            case 7:
                System.out.println("Gerando folha de pagamentos...\n");
                System.out.println("Folha de pagamentos gerada!\n");
                break;
            case 8:
                System.out.println("(1) - Undo");
                System.out.println("(2) - Redo");
                int option = input.nextInt();

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

            input.nextLine();
            System.out.println("Pressione ENTER para continuar...");
            input.nextLine();
        }

    }
}
