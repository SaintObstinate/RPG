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
import java.util.Random;

/**
 *
 * @author Bruno Balestra
 */
public class BloomController {
    
    private static BloomController instance = null;
    TelaBerrrta tb;
    DAO aux = DAO.getInstance();
    private BloomController() {
    }
    public static BloomController getInstance() {
          if (instance == null) {
        
            instance = new BloomController();
        }
        return instance;
        }
    
    public void criarJanela() {
        TelaBloom tb = new TelaBloom();
        tb.setVisible(true);
        tb.setLocationRelativeTo(null);
    }
    
}
