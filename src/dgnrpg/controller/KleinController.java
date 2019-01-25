/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg.controller;

import dgnrpg.DAO;
import dgnrpg.view.TelaBerrrta;
import dgnrpg.view.TelaBloom;
import dgnrpg.view.TelaInicial;
import dgnrpg.view.TelaKlein;
import java.util.Random;

/**
 *
 * @author Bruno Balestra
 */
public class KleinController {
    
    private static KleinController instance = null;
    TelaBerrrta tb;
    DAO aux = DAO.getInstance();
    private KleinController() {
    }
    public static KleinController getInstance() {
          if (instance == null) {
        
            instance = new KleinController();
        }
        return instance;
        }
    
    public void criarJanela() {
        TelaKlein tb = new TelaKlein();
        tb.setVisible(true);
        tb.setLocationRelativeTo(null);
    }
    
}
