/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg;

import static java.lang.Math.round;

/**
 *
 * @author Bruno Balestra
 */
public class Stats {

    public int vida(int hp){
        return (int) round(hp*1.5);
    }
    
    public int mods(int s){
        if(s>=10 && s<20){
            return 2;
        }else if(s>=20 && s<30){
            return 4;
        }else if(s>=30 && s<40){
            return 6;
        }else if(s>=40 && s<50){
            return 8;
        }else if(s==50)
            return 10;
        else return 0;
    }
    public int mana(int level,int modSab){
        return (int) round(level/2 + modSab);
    }
    public int fatk(int str, int agi, int a1, int a2, int ac){
        return (int) round(0.25*str+0.1*agi)+a1+a2+ac;
    }
    public int matk(int inte, int agi, int a1, int a2, int ac){
        return (int) round(0.25*inte+0.1*agi)+a1+a2+ac;
    }
    public int crit(int str, int agi, int inte, int level){
        if(((0.003*(str+inte+(2*agi*0.7*level))/(100*level))*100)<0.15){
            System.out.println("****************************************** entrou no critico");
            return (int) round(((0.003*(str+inte+(2*agi*0.7*level))/(100*level))*100)*100);
        }
        else return 15;
    }
    public int def(int agi, int arm, int dex){
        if((0.7*arm+0.2*dex+0.1*agi)/2 < 17){
            return  (int) round((0.7*arm+0.2*dex+0.1*agi)/2);
        }
        else return 17;
    }
}
