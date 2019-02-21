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
    private int resultado;
    
    @Override
    public int soma(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;

        if(this.v1 == 1){
            resultado = super.multiplica(0, this.v2);
        }
        else if(this.v2 == 1){
            resultado = super.multiplica(this.v1, 0);
        }        
        else if(this.v1 == 0){
            resultado = super.multiplica(0, 0);
        }
        else if(this.v2 == 0){
            resultado = super.multiplica(0, 0);
        }
        else{
            resultado = super.multiplica(this.v1, this.v2);
        }
        
        return resultado;        
    }    

    @Override
    public int subtrai(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
        
        return super.divide(this.v1, this.v2);
    }
}