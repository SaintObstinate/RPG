/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg.controller;

import dgnrpg.DAO;
import dgnrpg.Personagem;
import dgnrpg.view.TelaBerrrta;
import dgnrpg.view.TelaEquipamentos;
import dgnrpg.view.TelaLevelUp;

/**
 *
 * @author Bruno Balestra
 */
public class LevelUpController {
    private static LevelUpController instance = null;
    TelaLevelUp tup;
    DAO aux = DAO.getInstance();
    private LevelUpController() {
    }
    public static LevelUpController getInstance() {
          if (instance == null) {
        
            instance = new LevelUpController();
        }
        return instance;
        }
    
    public void criarJanela(Personagem x) {
        TelaLevelUp tup = new TelaLevelUp();
        tup.stats(x);
        tup.setVisible(true);
        tup.setLocationRelativeTo(null);
      
    }
    
     public void criarJanelaEquip(Personagem x) {
        TelaEquipamentos tup = new TelaEquipamentos();
        tup.stats(x);
        tup.setVisible(true);
        tup.setLocationRelativeTo(null);
      
    }
}
