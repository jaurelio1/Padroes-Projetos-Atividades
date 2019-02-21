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
public class CalculadoraExistente {
    private int resultado = 0;
    public int multiplica(int v1, int v2){                
        if (v1 > v2){
            resultado = v1 + v1;
        }
        else if(v1 < v2){
            resultado = v2 + v2;
        }
        else if(v1 == 1){
            resultado = v2;
        }
        else if(v2 == 1){
            resultado = v1;
        }
        return resultado;
    }
    
    public int divide(int v1, int v2){
        return v1 - v2;
    }
}
