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
    private int v1;
    private int v2;
    
    public int soma(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
        
        return this.v1 + this.v2;
    }
    
    public int subtrai(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;        
        
        return this.v1 - this.v2;
    }
}
