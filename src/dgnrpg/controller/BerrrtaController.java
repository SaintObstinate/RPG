/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg.controller;

import dgnrpg.DAO;
import dgnrpg.view.TelaBerrrta;
import dgnrpg.view.TelaInicial;
import java.util.Random;

/**
 *
 * @author Bruno Balestra
 */
public class BerrrtaController {
    
    private static BerrrtaController instance = null;
    TelaBerrrta tb;
    DAO aux = DAO.getInstance();
    private BerrrtaController() {
    }
    public static BerrrtaController getInstance() {
          if (instance == null) {
        
            instance = new BerrrtaController();
        }
        return instance;
        }
    
    public void criarJanela() {
        TelaBerrrta tb = new TelaBerrrta();
        tb.setVisible(true);
        tb.setLocationRelativeTo(null);
    }
    
}
