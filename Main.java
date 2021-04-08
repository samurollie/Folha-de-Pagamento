import java.util.Random;
import java.util.Scanner;

import src.employee.*;

public class Main {
    public static void main(String[] args) {
        Random randInt = new Random();
        Scanner input = new Scanner(System.in);
        Employee employeeList[] = new Employee[500];
        int id;

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
            input.nextLine();

            switch(cmd){
                case 1:
                    System.out.println("Insira o nome do empregado:");
                    String name = input.nextLine();

                    System.out.println("Insira o endereco do empregado:");
                    String address = input.nextLine();

                    System.out.println("Como " + name + " deseja receber o seu salário?");
                    System.out.println("(1) - Em mãos");
                    System.out.println("(2) - Depósito bancário");
                    System.out.println("(3) - Cheque pelos correios");
                    int payment = input.nextInt();
                    
                    System.out.println("Que tipo de empregado " + name + " será?");
                    System.out.println("(1) - Horista");
                    System.out.println("(2) - Assalariado");
                    int type = input.nextInt();
                    int comissioned = 2;
                    if (type == 2) {
                        System.out.println("Será um empregado comissionado?");
                        System.out.println("(1) - Sim");
                        System.out.println("(2) - Não");
                        comissioned = input.nextInt();
                    }

                    System.out.println("Gerando o nº do cartão...");
                    id = randInt.nextInt(500); // Gera um número aletório de 0 a 500
                    while(employeeList[id] != null) { // Null = não tem alguem com aql numero
                        id = randInt.nextInt(500);
                    }
                    
                    System.out.println("Adicionando empregado " + id);
                    
                    if(type == 1) {
                        employeeList[id] = new Hourly(name, address, id, payment);
                    } else {
                        if(comissioned == 1) {
                            employeeList[id] = new Comissioned(name, address, id, payment, 1, 1, null);
                        } else {
                            employeeList[id] = new Salaried(name, address, id, payment, 1);
                        }
                    }

                    System.out.println("Empregado adicionado!\n");
                    System.out.println(employeeList[id].showEmployeeInfo());
                    break;
                case 2:
                    /* System.out.println("Insira o nº do empregado que deseja remover...");
                    id = input.nextInt();
                    System.out.println("Removendo empregado " + id);
                    if (empregados[id] == true) {
                        empregados[id] = false;
                        System.out.println("Empregado removido!\n");
                        break;
                    }
                    System.out.println("Empregado não encontrado!\n"); */
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
                    System.out.println("Desfazendo ultima ação...\n");
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
        }

    }
}
