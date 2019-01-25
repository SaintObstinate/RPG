/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg.controller;

import dgnrpg.DAO;
import dgnrpg.view.TelaBerrrta;
import dgnrpg.view.TelaInicial;
import dgnrpg.view.TelaRosa;
import java.util.Random;

/**
 *
 * @author Bruno Balestra
 */
public class RosaController {
    
    private static RosaController instance = null;
    TelaBerrrta tb;
    DAO aux = DAO.getInstance();
    private RosaController() {
    }
    public static RosaController getInstance() {
          if (instance == null) {
        
            instance = new RosaController();
        }
        return instance;
        }
    
    public void criarJanela() {
        TelaRosa tb = new TelaRosa();
        tb.setVisible(true);
        tb.setLocationRelativeTo(null);
    }
    
}
