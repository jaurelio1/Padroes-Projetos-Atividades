/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author José Aurélio
 */
public class Adapter extends CalculadoraExistente implements Alvo{
    private int v1;
    private int v2;
    private int menor;
    private int resultado = 0;
    
    @Override
    public void multiplica(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
        
        if(this.v1 < this.v2) menor = this.v1;
        else menor = this.v2;
        
        if(menor != 1){
            menor = menor - 1;
            if(menor == 0){
                resultado = super.soma(0, 0);
            }
            else{
                for(int i = 0; i < menor; i++){
                    if(menor + 1 == this.v1){
                        if(i > 0){
                            resultado = super.soma(resultado, this.v2);
                        }
                        else{
                            resultado = super.soma(this.v2, this.v2);
                        }                                
                    }
                    else{
                        if(i > 0){
                            resultado = super.soma(resultado, this.v1);
                        }
                        else{
                            resultado = super.soma(this.v1, this.v1);
                        }
                    }
                }                   
            }
        }
        else{
            if(menor == this.v1){
                resultado = super.soma(0, this.v2);
            }            
            else{
                resultado = super.soma(0, this.v1);
            }
        }       
        
        System.out.println("O resultado eh:" + resultado); 
    }       
        

    @Override
    public void divide(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
        
        if(this.v1 < this.v2){
            menor = this.v1;
            resultado = this.v2;
        }
        else {
            menor = this.v2;
            resultado = this.v1;
        }
        
        for(int i = 0; i < menor; i++){
            
        }
        
    }
}