/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao, op, n1, n2, soma, sub, div;
        try {
            //Menu Principal
            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("--------------"
                        + "---------MENU------------------------\n"
                        + "1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Faixa Etária\n5 - "
                        + "Numeros Primos\n6 - Mudança de Base\n7 - Sair"));
                switch (opcao) {
                    //Soma entre 2 numeros
                    case 1:
                        do {
                            //recebendo numeros
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                    + "---------------SOMA------------------------"
                                    + "\nNumero 1:"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                    + "---------------SOMA------------------------"
                                    + "\nNumero 2:"));
                            //Realizando e Apresentando soma
                            soma = n1 + n2;
                            JOptionPane.showMessageDialog(null, "--------"
                                    + "---------------SOMA--------------"
                                    + "----------\nResultado: " + soma);
                            //Apresentando opção de nova soma
                            do {
                                op = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                        + "---------------SOMA------------------------\n"
                                        + "1 - Nova Soma\n0 - Voltar"));
                                if (op != 1 && op != 0) {
                                    JOptionPane.showMessageDialog(null, "Opção Invalida!");
                                }
                            } while (op != 1 && op != 0);
                        } while (op != 0);
                        break;
                    case 2:
                        do {
                            //recebendo numeros
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                    + "-------------SUBTRAÇÃO----------------------"
                                    + "\nNumero 1:"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                    + "-------------SUBTRAÇÃO----------------------"
                                    + "\nNumero 2:"));
                            //Realizando e Apresentando subtração
                            sub = n1 - n2;
                            JOptionPane.showMessageDialog(null, "--------"
                                    + "-------------SUBTRAÇÃO------------"
                                    + "----------\nResultado: " + sub);
                            //Apresentando opção de nova subtração
                            do {
                                op = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                        + "-------------SUBTRAÇÃO----------------------\n"
                                        + "1 - Nova Subtração\n0 - Voltar"));
                                if (op != 1 && op != 0) {
                                    JOptionPane.showMessageDialog(null, "Opção Invalida!");
                                }
                            } while (op != 1 && op != 0);
                        } while (op != 0);
                        break;

                    case 3:
                        do {
                            //recebendo numeros
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                    + "--------------DIVISÂO----------------------"
                                    + "\nNumero 1:"));
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                    + "--------------DIVISÂO----------------------"
                                    + "\nNumero 2:"));
                            //Realizando e Apresentando divisão
                            if (n2 == 0) {
                                JOptionPane.showMessageDialog(null, "Não é possivel dividir por 0!");
                            } else {
                                div = n1 / n2;
                                JOptionPane.showMessageDialog(null, "--------"
                                        + "--------------DIVISÂO------------"
                                        + "----------\nResultado: " + div);
                            }
                            //Apresentando opção de nova divisão
                            do {
                                op = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                        + "--------------DIVISÂO----------------------\n"
                                        + "1 - Nova Divisão\n0 - Voltar"));
                                if (op != 1 && op != 0) {
                                    JOptionPane.showMessageDialog(null, "Opção Invalida!");
                                }
                            } while (op != 1 && op != 0);
                        } while (op != 0);
                        break;
                    case 4:
                        //Faixa Etaria - > Declarando variaveis
                        int qtd,
                         idade,
                         somai = 0,
                         somam = 0,
                         somaf = 0,
                         contm = 0,
                         contf = 0,
                         i;
                        char sexo;
                        //Recebendo Quantidade de Pessoas
                        do {
                            qtd = Integer.parseInt(JOptionPane.showInputDialog("----"
                                    + "--------------FAIXA-ETÁRIA-------------------"
                                    + "\n\nEntre com a quantidade de pessoas!"));
                            //For para receber todas as idades e sexos
                            for (i = 0; i < qtd; i++) {
                                idade = Integer.parseInt(JOptionPane.showInputDialog("Idade da " + (i + 1) + "º Pessoa:"));
                                //Verifica se é um sexo valido
                                do {
                                    sexo = JOptionPane.showInputDialog("Digite o sexo da " + (i + 1) + "º Pessoa:").charAt(0);
                                    if (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
                                        JOptionPane.showMessageDialog(null, "Sexo Invalido!");
                                    }
                                } while (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F');
                                //soma todas as idades
                                somai += idade;
                                //soma idade do sexo masculino e sexo feminino
                                if (sexo == 'm' || sexo == 'M') {
                                    somam += idade;
                                    contm++;
                                } else {
                                    somaf += idade;
                                    contf++;
                                }
                            }
                            //imprime resultados caso pessoas do sexo masculino for 0
                            if (contm == 0) {
                                JOptionPane.showMessageDialog(null, "Media de idade das pessoas: "
                                        + (somai / i) + "\nMedia de idade do sexo M: ---"
                                        + "\nMedia de idade do sexo F: "
                                        + (somaf / contf));
                                //imprime resultado caso pessoas do sexo feminino for 0
                            } else if (contf == 0) {
                                JOptionPane.showMessageDialog(null, "Media de idade das pessoas: "
                                        + (somai / i) + "\nMedia de idade do sexo M: "
                                        + (somam / contm) + "\nMedia de idade do sexo F: ---");
                                //imprime resultado caso haja pessoas de ambos os sexos
                            } else {
                                JOptionPane.showMessageDialog(null, "Media de idade das pessoas: "
                                        + (somai / i) + "\nMedia de idade do sexo M: "
                                        + (somam / contm) + "\nMedia de idade do sexo F: "
                                        + (somaf / contf));
                            }
                            //Opções de voltar ou fazer uma nova pesquisa
                            do {
                                op = Integer.parseInt(JOptionPane.showInputDialog("--------"
                                        + "-----------FAIXA-ETÁRIA-------------------\n"
                                        + "1 - Nova Pesquisa\n0 - Voltar"));
                                if (op != 1 && op != 0) {
                                    JOptionPane.showMessageDialog(null, "Opção Invalida!");
                                }
                            } while (op != 1 && op != 0);
                        } while (op != 0);
                        break;
                    //Saindo do Programa
                    case 7:
                        JOptionPane.showMessageDialog(null, "Você Saiu!");
                        break;
                    //Opções Invalidas
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Invalida!");
                }
            } while (opcao != 7);
        } catch (NumberFormatException e) {
            String ex = String.valueOf(e);
            if (ex.equals("java.lang.NumberFormatException: null")) {
                JOptionPane.showMessageDialog(null, "Você Saiu!");
            } else {
                JOptionPane.showMessageDialog(null, "Entrada Incompativel! "
                        + "Fim do Programa!");
            }
        }
    }

}
