/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoAjedrez;

/**
 *
 * @author Ricardo
 */
public class Peon extends Pieza{
    String pieza;
    public Peon() {
    }

    public Peon(String color, String nombre) {
        super(color, nombre);
    }
    
    @Override
    public String figuraPieza() {
        if(this.getColor().compareToIgnoreCase("blanca")==0){
            pieza = "2659";
        }else{
            pieza = "265F";
        }
        return pieza;
    }
    
}
