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
        
        if(this.v1 < this.v2)menor = this.v1;
        else menor = this.v2;
        
        for(int i = 0; i < menor; i++){
            resultado += super.soma(this.v1, this.v2);
        }
        System.out.println("O resultado eh"+resultado);        
       
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