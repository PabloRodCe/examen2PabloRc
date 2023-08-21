/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Pablo Rod
 */
public class Tickets {
   private int numero;
   private String tipo;
   
   tipo plataforma = new tipo();
   tipo caja = new tipo();
   tipo preferencial = new tipo();
   
   
   

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tickets(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
    
   
   
   
   
}
