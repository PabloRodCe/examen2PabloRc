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

    public ListaTikets(int numero, String tipo) {
        super(numero, tipo);
    }
    
    
    public boolean agregar(String ticket){
    this.list.add(ticket);
    return true;
    }
    public boolean eliminar(String ticket){
    list.remove(ticket);
    return true;
    
    }
    public boolean buscar(String ticket){
    return false;
    }
    
    
}
