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
public class Player {
    
//atribut
    String name;
    int speed,healthPoin,damage,armor;
    
    //method
    void run(){
        System.out.println(name+" is Running....");
        System.out.println("Speed" + speed);
    }
    
    void attack(){
        System.out.println(name+" is Attacking...");
        System.out.println("Attack" + damage );
    }
    
    void defend(){
        System.out.println(name+" is Defending....");
        System.out.println("Defend" + armor);
    }
    
    boolean isDead(){
        if (healthPoin<=0) return true;
            return false;
    }}

