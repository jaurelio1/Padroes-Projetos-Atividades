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
    private int menor;
    private Alvo alvo = null;
    private int resultadoSoma = 0;
    private int resultadoSubtrai = 0;
    
    public Cliente(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
        this.alvo = new Adapter();
    }
    
    public int multiplica(){
        if(alvo != null){
            if(v1 < v2){
                menor = v1;
            }
            else if(v2 > v1){
                menor = v2;
            }
            for(int i = 0; i < menor; i ++){
                resultadoSoma = resultadoSoma + alvo.soma(v1, v2);
            }
        }
        else{
            System.out.println("Operacao nao realizada");
        }
        return this.resultadoSoma;
    }
    
    public int divide(){
        if(this.alvo != null){
            for(int j = 0; j < v2; j++){
                this.resultadoSubtrai = this.resultadoSubtrai + this.alvo.subtrai(v1, v2);                
            }           
        }
        else{
            System.out.println("Operacao nao realizada");
        }
        return this.resultadoSubtrai;
    }
    
    
    public static void main(String[] args){
        Cliente cliente = new Cliente(1, 5);
        
        System.out.println(cliente.multiplica());        
    }
}
