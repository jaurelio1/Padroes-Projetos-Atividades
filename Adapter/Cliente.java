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
public class Cliente {
    private int v1;
    private int v2;    
    private Alvo alvo = null;    
    
    public Cliente(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
        this.alvo = new Adapter();
    }
    
    public void multiplica(){
        if(this.alvo != null){
            this.alvo.multiplica(this.v1, this.v2);
        }
        else{
            System.out.println("Operacao nao realizada");
        }
    }
    
    public static void main(String[] args){
        Cliente cliente = new Cliente(2, 5);
        
        cliente.multiplica();              
    }
}
