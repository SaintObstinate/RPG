/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg.controller;

import dgnrpg.DAO;
import dgnrpg.view.TelaBerrrta;
import dgnrpg.view.TelaHazel;
import dgnrpg.view.TelaInicial;
import dgnrpg.view.TelaRosa;
import java.util.Random;

/**
 *
 * @author Bruno Balestra
 */
public class HazelController {
    
    private static HazelController instance = null;
    TelaBerrrta tb;
    DAO aux = DAO.getInstance();
    private HazelController() {
    }
    public static HazelController getInstance() {
          if (instance == null) {
        
            instance = new HazelController();
        }
        return instance;
        }
    
    public void criarJanela() {
        TelaHazel tb = new TelaHazel();
        tb.setVisible(true);
        tb.setLocationRelativeTo(null);
    }
    
}
