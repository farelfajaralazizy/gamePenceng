/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author farelfajar
 */
public class Game {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //membuat objek
        Player superpowers = new Player();
        Player enemy       = new Player();
        
        superpowers.name = "Adi";
        superpowers.speed = 20;
        superpowers.healthPoin = 0;
        superpowers.damage = 23;
        superpowers.armor = 30;
        
        enemy.name = "Albi";
        enemy.speed = 20;
        enemy.healthPoin = 100;
        enemy.damage = 23;
        enemy.armor = 30;
        
        
        
        
        //menjalankan method
        superpowers.run();
        superpowers.attack();
        superpowers.defend();
        enemy.run();
        enemy.attack();
        enemy.defend();
        
        if (superpowers.isDead()) {
            System.out.println("ALBI WIN ");
            
            if (enemy.isDead()) {
                System.out.println("ADI WIN");
                
            }
            
          
            
        }
    }}
        
    
    

    

