package com.mycompany.atividadeddm;

import java.util.Scanner;

public class AtividadeDDM {
    
    public static void main(String[] args) throws InterruptedException{
        
        Scanner scanner = new Scanner(System.in);
            
        Double consumo = 15.0;
        Double limiteTanque = 40.0;
        Double combustivel = 0.0;

        
        System.out.println("1.Nivel de combustivel. \n2.Abastecer Carro. \n3.Andar com o Carro. \n4.Sair.");
        int opcao = 0;
               
        Carro carro = new Carro(consumo,combustivel);
        do{
            System.out.print("Digite uma opcao:");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println(carro.exibirCombustivel());
                    break;
                case 2:
                    System.out.print("Quantos litros voce deseja abastecer: ");
                    Double litros = scanner.nextDouble();
                    
                    if(litros <= limiteTanque){
                        carro.abastecer(litros);
                    }
                    else{
                        System.out.print("Limite do tanque ultrapassado tente novamente.");
                    }

                    break;
                case 3:
                    if(carro.exibirCombustivel() > 0 ){

                        String[] carrinho = {
                                "         ___________",
                                "        //    ||   \\\\",
                                "_______//_____|| ___\\\\_______",
                                "|     ___             ___    )",
                                "|___ /   \\___________/   \\___|",
                                "     \\___/           \\___/"
                            };

                            for (int i = 0; i < carro.exibirCombustivel()*2; i++) {
                                Thread.sleep(200);
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                limparTela();

                                for (String linha : carrinho) {
                                    System.out.println(" ".repeat(i) + linha);
                                }
                            }
                    }
                    carro.andar();             
                    break;
                case 4:
                    System.out.print("Encerrando o programa...");
                    break;
                
                default:
                    System.out.println("Alternativa Indisponivel");
            }
        }while(opcao != 4);
    }
    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
  

