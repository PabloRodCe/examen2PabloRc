/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.ArrayList;

/**
 *
 * @author Pablo Rod
 */
public class ListaTikets extends Tickets {
    ArrayList<String> list = new  ArrayList<>();

    public ListaTikets(int numero, char tipo) {
        super(numero, tipo);
    }
    
    
    public boolean agregar(Tickets ticket){
    this.list.add(ticket);
    return true;
    }
    public boolean eliminar(Tickets ticket{
    ticket.delete(ticket);
    }
    public boolean buscar(Tickets ticket){
    
    }
    
    
}
