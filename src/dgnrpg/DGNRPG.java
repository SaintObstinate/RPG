/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg;

import dgnrpg.view.TelaInicial;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno Balestra
 */
public class DGNRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        DAO dao = DAO.getInstance();
        Personagem berrrta = new Personagem();
        Personagem bloom = new Personagem();
        Personagem klein = new Personagem();
        Personagem rakan = new Personagem();
        Personagem rosa = new Personagem();
        Personagem hazel = new Personagem();
        DeBuffs dbs = new DeBuffs();
        Stats status = new Stats();
        
        if(dao.getPersonagens().isEmpty()){
            berrrta.setId(1);
            berrrta.setStr(10);
            berrrta.setInte(43);
            berrrta.setAgi(37);
            berrrta.setVit(30);
            berrrta.setLevel(16);
            berrrta.setArm(30);
            berrrta.setAcc(3);
            berrrta.setCar(7);
            berrrta.setDex(15);
            berrrta.setSab(10);         
            berrrta.setMainWeapon(15);
            berrrta.setSecWeapon(4);
            
            berrrta.setModSab(status.mods(berrrta.getSab()));
            berrrta.setMP(status.mana(berrrta.getLevel(), berrrta.getModSab()));
            berrrta.setHP(status.vida(berrrta.getVit()));
            berrrta.setDef(status.def(berrrta.getAgi(), berrrta.getArm(), berrrta.getDex()));
            berrrta.setCrit(status.crit(berrrta.getStr(), berrrta.getAgi(), berrrta.getInte(),berrrta.getLevel()));
            berrrta.setFatk(status.fatk(berrrta.getStr(),berrrta.getAgi(), berrrta.getMainWeapon(), berrrta.getSecWeapon(), berrrta.getAcc()));
            berrrta.setMatk(status.matk(berrrta.getInte(),berrrta.getAgi(), berrrta.getMainWeapon(), berrrta.getSecWeapon(), berrrta.getAcc()));          
            berrrta.setModDex(status.mods(berrrta.getDex()));
            berrrta.setModCar(status.mods(berrrta.getCar()));
            berrrta.setNome("Berrrta");
            berrrta.setClasse("Warrior");
            berrrta.setRaca("Faunus");
            berrrta.setHpAtual(berrrta.getHP());
            berrrta.setMpAtual(berrrta.getMP());
            dao.CadastraPerso(berrrta);
            dao.berta=berrrta;
            
            
           //----------------------------------------//
            bloom.setId(2);
            bloom.setStr(5);
            bloom.setInte(65);
            bloom.setAgi(35);
            bloom.setVit(15);
            bloom.setLevel(16);
            bloom.setArm(25);
            bloom.setAcc(3);
            bloom.setCar(5);
            bloom.setDex(7);
            bloom.setSab(20);         
            bloom.setMainWeapon(15);
            bloom.setSecWeapon(4);
            
            bloom.setModSab(status.mods(bloom.getSab()));
            bloom.setMP(status.mana(bloom.getLevel(), bloom.getModSab()));
            bloom.setHP(status.vida(bloom.getVit()));
            bloom.setDef(status.def(bloom.getAgi(), bloom.getArm(), bloom.getDex()));
            bloom.setCrit(status.crit(bloom.getStr(), bloom.getAgi(), bloom.getInte(),bloom.getLevel()));
            bloom.setFatk(status.fatk(bloom.getStr(),bloom.getAgi(), bloom.getMainWeapon(), bloom.getSecWeapon(), bloom.getAcc()));
            bloom.setMatk(status.matk(bloom.getInte(),bloom.getAgi(), bloom.getMainWeapon(), bloom.getSecWeapon(), bloom.getAcc()));          
            bloom.setModDex(status.mods(bloom.getDex()));
            bloom.setModCar(status.mods(bloom.getCar()));
            bloom.setNome("Bloom");
            bloom.setClasse("Sorcerer");
            bloom.setRaca("Elf");
            bloom.setHpAtual(bloom.getHP());
            bloom.setMpAtual(bloom.getMP());
            dao.CadastraPerso(bloom);
            dao.bloom=bloom;
           
            //----------------------------------------//
            klein.setId(3);
            klein.setStr(55);
            klein.setInte(17);
            klein.setAgi(27);
            klein.setVit(21);
            klein.setLevel(16);
            klein.setArm(25);
            klein.setAcc(3);
            klein.setCar(9);
            klein.setDex(10);
            klein.setSab(10);         
            klein.setMainWeapon(15);
            klein.setSecWeapon(4);
            
            klein.setModSab(status.mods(klein.getSab()));
            klein.setMP(status.mana(klein.getLevel(), klein.getModSab()));
            klein.setHP(status.vida(klein.getVit()));
            klein.setDef(status.def(klein.getAgi(), klein.getArm(), klein.getDex()));
            klein.setCrit(status.crit(klein.getStr(), klein.getAgi(), klein.getInte(),klein.getLevel()));
            klein.setFatk(status.fatk(klein.getStr(),klein.getAgi(), klein.getMainWeapon(), klein.getSecWeapon(), klein.getAcc()));
            klein.setMatk(status.matk(klein.getInte(),klein.getAgi(), klein.getMainWeapon(), klein.getSecWeapon(), klein.getAcc()));          
            klein.setModDex(status.mods(klein.getDex()));
            klein.setModCar(status.mods(klein.getCar()));
            klein.setNome("Klein");
            klein.setClasse("Archer");
            klein.setRaca("RX-K9");
            klein.setHpAtual(klein.getHP());
            klein.setMpAtual(klein.getMP());
            dao.CadastraPerso(klein);
            dao.klein=klein;
            
            //----------------------------------------//
            rakan.setId(4);
            rakan.setStr(10);
            rakan.setInte(70);
            rakan.setAgi(10);
            rakan.setVit(30);
            rakan.setLevel(16);
            rakan.setArm(25);
            rakan.setAcc(3);
            rakan.setCar(19);
            rakan.setDex(3);
            rakan.setSab(10);         
            rakan.setMainWeapon(15);
            rakan.setSecWeapon(4);
            
            rakan.setModSab(status.mods(rakan.getSab()));
            rakan.setMP(status.mana(rakan.getLevel(), rakan.getModSab()));
            rakan.setHP(status.vida(rakan.getVit()));
            rakan.setDef(status.def(rakan.getAgi(), rakan.getArm(), rakan.getDex()));
            rakan.setCrit(status.crit(rakan.getStr(), rakan.getAgi(), rakan.getInte(),rakan.getLevel()));
            rakan.setFatk(status.fatk(rakan.getStr(),rakan.getAgi(), rakan.getMainWeapon(), rakan.getSecWeapon(), rakan.getAcc()));
            rakan.setMatk(status.matk(rakan.getInte(),rakan.getAgi(), rakan.getMainWeapon(), rakan.getSecWeapon(), rakan.getAcc()));          
            rakan.setModDex(status.mods(rakan.getDex()));
            rakan.setModCar(status.mods(rakan.getCar()));
            rakan.setNome("Rakan");
            rakan.setClasse("Bard");
            rakan.setRaca("Faunus");
            rakan.setHpAtual(rakan.getHP());
            rakan.setMpAtual(rakan.getMP());
            dao.CadastraPerso(rakan);
            dao.rakan=rakan;
           
             //----------------------------------------//
            rosa.setId(5);
            rosa.setStr(55);
            rosa.setInte(5);
            rosa.setAgi(25);
            rosa.setVit(30);
            rosa.setLevel(16);
            rosa.setArm(25);
            rosa.setAcc(3);
            rosa.setCar(11);
            rosa.setDex(10);
            rosa.setSab(11);         
            rosa.setMainWeapon(15);
            rosa.setSecWeapon(4);
            
            rosa.setModSab(status.mods(rosa.getSab()));
            rosa.setMP(status.mana(rosa.getLevel(), rosa.getModSab()));
            rosa.setHP(status.vida(rosa.getVit()));
            rosa.setDef(status.def(rosa.getAgi(), rosa.getArm(), rosa.getDex()));
            rosa.setCrit(status.crit(rosa.getStr(), rosa.getAgi(), rosa.getInte(),rosa.getLevel()));
            rosa.setFatk(status.fatk(rosa.getStr(),rosa.getAgi(), rosa.getMainWeapon(), rosa.getSecWeapon(), rosa.getAcc()));
            rosa.setMatk(status.matk(rosa.getInte(),rosa.getAgi(), rosa.getMainWeapon(), rosa.getSecWeapon(), rosa.getAcc()));          
            rosa.setModDex(status.mods(rosa.getDex()));
            rosa.setModCar(status.mods(rosa.getCar()));
            rosa.setNome("Rosa");
            rosa.setClasse("Bard");
            rosa.setRaca("Faunus");
            rosa.setHpAtual(rosa.getHP());
            rosa.setMpAtual(rosa.getMP());
            dao.CadastraPerso(rosa);
            dao.rosa=rosa;
           
            
             //----------------------------------------//
            hazel.setId(6);
            hazel.setStr(19);
            hazel.setInte(45);
            hazel.setAgi(26);
            hazel.setVit(30);
            hazel.setLevel(16);
            hazel.setArm(25);
            hazel.setAcc(3);
            hazel.setCar(9);
            hazel.setDex(11);
            hazel.setSab(12);         
            hazel.setMainWeapon(15);
            hazel.setSecWeapon(4);
            
            hazel.setModSab(status.mods(hazel.getSab()));
            hazel.setMP(status.mana(hazel.getLevel(), hazel.getModSab()));
            hazel.setHP(status.vida(hazel.getVit()));
            hazel.setDef(status.def(hazel.getAgi(), hazel.getArm(), hazel.getDex()));
            hazel.setCrit(status.crit(hazel.getStr(), hazel.getAgi(), hazel.getInte(),hazel.getLevel()));
            hazel.setFatk(status.fatk(hazel.getStr(),hazel.getAgi(), hazel.getMainWeapon(), hazel.getSecWeapon(), hazel.getAcc()));
            hazel.setMatk(status.matk(hazel.getInte(),hazel.getAgi(), hazel.getMainWeapon(), hazel.getSecWeapon(), hazel.getAcc()));          
            hazel.setModDex(status.mods(hazel.getDex()));
            hazel.setModCar(status.mods(hazel.getCar()));
            hazel.setNome("Hazel");
            hazel.setClasse("Sorcerer");
            hazel.setRaca("Human");
            hazel.setHpAtual(hazel.getHP());
            hazel.setMpAtual(hazel.getMP());
            dao.CadastraPerso(hazel);
            dao.hazel=hazel;
           
        }else{
            dao.berta=dao.getPersonagem(1);
            dao.berta.setHpAtual(dao.getPersonagem(1).getHP());
            dao.berta.setMpAtual(dao.getPersonagem(1).getMP());
            
            dao.bloom=dao.getPersonagem(2);
            dao.bloom.setHpAtual(dao.getPersonagem(2).getHP());
            dao.bloom.setMpAtual(dao.getPersonagem(2).getMP());
            
            dao.klein=dao.getPersonagem(3);
            dao.klein.setHpAtual(dao.getPersonagem(3).getHP());
            dao.klein.setMpAtual(dao.getPersonagem(3).getMP());
            
            dao.rakan=dao.getPersonagem(4);
            dao.rakan.setHpAtual(dao.getPersonagem(4).getHP());
            dao.rakan.setMpAtual(dao.getPersonagem(4).getMP());
            
            dao.rosa=dao.getPersonagem(5);
            dao.rosa.setHpAtual(dao.getPersonagem(5).getHP());
            dao.rosa.setMpAtual(dao.getPersonagem(5).getMP());
            
            dao.hazel=dao.getPersonagem(6);
            dao.hazel.setHpAtual(dao.getPersonagem(6).getHP());
            dao.hazel.setMpAtual(dao.getPersonagem(6).getMP());
        }
        TelaInicial ti = new TelaInicial();
        ti.setLocationRelativeTo(null);
        ti.setVisible(true);
        
    }
    
}
