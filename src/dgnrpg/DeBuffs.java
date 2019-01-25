/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg;

import java.util.Random;

/**
 *
 * @author Bruno Balestra
 */
public class DeBuffs {
    
    private int damage;
    private int lightning;
    private int downdef;   
    private int power;
    private int shield;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLightning() {
        return lightning;
    }

    public void setLightning(int lightning) {
        this.lightning = lightning;
    }

    public int getDowndef() {
        return downdef;
    }

    public void setDowndef(int downdef) {
        this.downdef = downdef;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }
    
    public boolean lightning(){
        Random r = new Random();
        if(r.nextInt(101)<=40&&r.nextInt()>=0){
            return true;
        }else return false;      
    }
}
