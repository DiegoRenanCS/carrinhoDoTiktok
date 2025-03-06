package com.mycompany.atividadeddm;

public class Carro {
    
    private Double consumo;
    private Double combustivel;
    
    public Carro(Double consumo, Double combustivel){
        this.consumo = consumo;
        this.combustivel = combustivel;
    }
    
    public void andar(){
        double combustivelNecessario = 1;
        double contadorKms = 0;
        if(combustivel >= combustivelNecessario){
            for(int cont = 0 ; cont < combustivel ; cont++){
                contadorKms++;
            }
            combustivel = combustivel - combustivel;
            System.out.println("Combustivel disponivel: " + combustivel);
        }
        else{
            System.out.println("Sem combustivel suficiente para andar.");
        }    
    }
    public Double exibirCombustivel(){

        return combustivel;
    }
    public void abastecer(Double litros){
        
        combustivel = combustivel + litros;
        
        System.out.println("Abastecido com " + litros + " litros.");
        
    }
}