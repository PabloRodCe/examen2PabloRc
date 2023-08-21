/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;




/**
 *
 * @author Pablo Rod
 */
public class controller extends ListaTickets<Tickets> {

    public controller(int numero, String tipo) {
        super(numero, tipo);
    }
   


    public String generarticket(){
       
     Tickets ticket = new Tickets(01,"tipo");
     
     list.add(ticket);
     
     
    }
}
