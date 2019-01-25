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
import dgnrpg.view.TelaRakan;
import java.util.Random;

/**
 *
 * @author Bruno Balestra
 */
public class RakanController {
    
    private static RakanController instance = null;
    TelaBerrrta tb;
    DAO aux = DAO.getInstance();
    private RakanController() {
    }
    public static RakanController getInstance() {
          if (instance == null) {
        
            instance = new RakanController();
        }
        return instance;
        }
    
    public void criarJanela() {
        TelaRakan tb = new TelaRakan();
        tb.setVisible(true);
        tb.setLocationRelativeTo(null);
    }
    
}
