/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlRoom controlroom=new ControlRoom();
        controlroom.AddDefence(new Helicopter(controlroom));
        controlroom.AddDefence(new Tank(controlroom));
        controlroom.AddDefence(new Submarine(controlroom));
        
        
    }
    
}
