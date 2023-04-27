import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CADASTRANDO USUARIO
        Pessoa p1 = new Pessoa();
        p1.cadastroPessoa();

        int opc;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\nOlá " + p1.nomeCompleto()+",\nSeja Bem-Vindo!");
            System.out.println("\n========BILHETERIA========" +
                    "\n\n1-INGRESSO NORMAL" +
                    "\n2-INGRESSO VIP" +
                    "\n3-FINALIZAR SESSÃO");
             opc = input.nextInt();
            System.out.println("==========================");
            if (p1.getIdade() > 18){
                switch (opc){
                    case 1:
                        Normal iNormal = new Normal();
                        iNormal.imprime();
                        iNormal.imprimeValor();
                        System.out.println("Saindo...\nVolte sempre " + p1.nomeCompleto()+"!");
                        System.exit(0);
                        break;
                    case 2:
                        Vip vip = new Vip();
                        vip.valorExtra();
                        System.out.println(p1.getNome() + " voce escolheu ingresso vip,e o ingresso vip tem o " +
                                "valor extra de: " + vip.valorAdicional + ", nós temos duas opções: " +
                                "\n1-SUPERIOR" +
                                "\n2-INFERIOR" +
                                "\n Qual sua opção: ");
                        int opc2 = input.nextInt();
                        System.out.println("==========================");
                        switch (opc2){
                            case 1:
                                CamaroteSuperior iSuperior = new CamaroteSuperior();
                                System.out.println(p1.getNome() + " você selecionou o ingresso VIP SUPERIOR que tem o " +
                                        "valor extra de R$" + iSuperior.getNovoValorExtra() +
                                        " \nTotalizando: R$"+iSuperior.retornaValorIngresso());
                                System.out.println("Saindo...\nVolte sempre " + p1.nomeCompleto()+"!");
                                System.exit(0);
                                break;
                            case 2:
                                CamaroteInferior iInferior = new CamaroteInferior();
                                iInferior.imprimeLocalizacao();
                                System.out.println("Saindo...\nVolte sempre " + p1.nomeCompleto()+"!");
                                System.exit(0);
                                break;

                        }
                        break;
                    case 3:
                        System.out.println("Saindo...\nVolte sempre " + p1.nomeCompleto()+"!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }else {
                System.out.println(p1.nomeCompleto() +" você tem "+p1.getIdade()+" anos, portando é menor de idade e você não pode co" +
                        "mprar ingresso para este show! " );
                System.out.println("Saindo...\nVolte quando você estiver maior de idade " + p1.nomeCompleto()+"!");
                System.exit(0);
            }

        }while (opc != 3);
            input.close();
        }

    }
