/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg.controller;



import dgnrpg.DAO;
import dgnrpg.view.TelaInicial;
import javax.swing.JOptionPane;

/**
 *
 * @author cliente
 */
public class InicioController {
    private static InicioController instance = null;
    TelaInicial telaInicio;
    DAO aux = DAO.getInstance();
    private InicioController() {
    }
    public static InicioController getInstance() {
          if (instance == null) {
        
            instance = new InicioController();
        }
        return instance;
        }
    
    public void criarJanela() {
     
        telaInicio= new TelaInicial();       
    }
  
    public void telaBerrrta(){       
         BerrrtaController telaBer = BerrrtaController.getInstance();
         telaBer.criarJanela();
    }
    

}
