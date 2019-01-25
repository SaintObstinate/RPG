/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dgnrpg.Personagem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 *
 * @author Bruno Balestra
 */
public class DAO {
    
    private Connection con;

    //obj para preparação da consulta
    private PreparedStatement ps;

    //obj referencia a tabela gerada na consulta
    private ResultSet rs;
    
    //dados para getConnection
    private String database = "mydb";
    private String url = "jdbc:mysql://localhost:3306/" + database;
    private String user = "root";//user e senha do banco
    private String passoword = "";
    public Personagem berta;
    public Personagem rakan;
    public Personagem bloom;
    public Personagem rosa;
    public Personagem klein;
    public Personagem hazel;
    public DeBuffs bdf = new DeBuffs();
    //para validar se o metodo ocorreu com sucesso
    private boolean sucesso;
    
    
    public boolean connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, passoword);
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("ERRO DE CONEXÃO " + ex.getMessage());
            sucesso = false;

        }

        return sucesso;
    }
    
    private ArrayList<Personagem> personagens;
   
    
    public static DAO getInstance() {
        if (instance == null) {
            instance = new DAO();
             
        }
        return instance;
    }
  
    private static DAO instance = null;
    
    private DAO() {
        
        personagens = new ArrayList();
        berta = new Personagem();
       
    }
 
    public ArrayList<Personagem> getPersonagens() {
        connectToDB();
        
        String sql = "SELECT * FROM mydb.Character";
         ArrayList<Personagem> perso = new ArrayList<>();
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
           
            while (rs.next()) 
            {
                Personagem nCharacter = new Personagem();
                nCharacter.setId(rs.getInt("idCharacter"));
                nCharacter.setNome(rs.getString("nome"));
                nCharacter.setAgi(rs.getInt("agi"));
                nCharacter.setInte(rs.getInt("inte"));
                nCharacter.setStr(rs.getInt("str"));
                nCharacter.setVit(rs.getInt("vit"));
                nCharacter.setHP(rs.getInt("hp"));
                nCharacter.setMP(rs.getInt("mp"));
                nCharacter.setDef(rs.getInt("def"));
                nCharacter.setCrit(rs.getInt("crit"));
                nCharacter.setClasse(rs.getString("classe"));
                nCharacter.setRaca(rs.getString("raca"));
                nCharacter.setFatk(rs.getInt("fatk"));
                nCharacter.setMatk(rs.getInt("matk"));
                nCharacter.setDex(rs.getInt("dex"));
                nCharacter.setSab(rs.getInt("sab"));
                nCharacter.setLevel(rs.getInt("level"));
                nCharacter.setCar(rs.getInt("car"));
                nCharacter.setModCar(rs.getInt("modCar"));
                nCharacter.setModSab(rs.getInt("modSab"));
                nCharacter.setModDex(rs.getInt("modDex"));
                
                
                perso.add(nCharacter);
            }
            setPersonagem(perso);
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO " + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
        
        return perso;
    }
    
    
    public ArrayList<DeBuffs> getDebuffs() {
        connectToDB();
        
        String sql = "SELECT * FROM mydb.DeBuffs";
         ArrayList<DeBuffs> perso = new ArrayList<>();
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
           
            while (rs.next()) 
            {
                DeBuffs nCharacter = new DeBuffs();
                nCharacter.setId(rs.getInt("idDeBuffs"));
                nCharacter.setDamage(rs.getInt("damage"));
                nCharacter.setLightning(rs.getInt("lightning"));
                nCharacter.setDowndef(rs.getInt("downdef"));
                nCharacter.setPower(rs.getInt("power"));
                nCharacter.setShield(rs.getInt("shield"));
                
                
                
                perso.add(nCharacter);
            }
            
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO " + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
        
        return perso;
    }
    
    public Personagem getPersonagem(int id){
        connectToDB();
        Personagem nCharacter = new Personagem();
        System.out.println(id);
        String sql = "SELECT * FROM mydb.Character WHERE idCharacter = "+id;
        System.out.println(sql);
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();   
            while (rs.next()) 
            {
                nCharacter.setId(rs.getInt("idCharacter"));
                nCharacter.setNome(rs.getString("nome"));
                nCharacter.setAgi(rs.getInt("agi"));
                nCharacter.setInte(rs.getInt("inte"));
                nCharacter.setStr(rs.getInt("str"));
                nCharacter.setVit(rs.getInt("vit"));
                nCharacter.setHP(rs.getInt("hp"));
                nCharacter.setMP(rs.getInt("mp"));
                nCharacter.setDef(rs.getInt("def"));
                nCharacter.setCrit(rs.getInt("crit"));
                nCharacter.setClasse(rs.getString("classe"));
                nCharacter.setRaca(rs.getString("raca"));
                nCharacter.setFatk(rs.getInt("fatk"));
                nCharacter.setMatk(rs.getInt("matk"));
                nCharacter.setDex(rs.getInt("dex"));
                nCharacter.setSab(rs.getInt("sab"));
                nCharacter.setLevel(rs.getInt("level"));
                nCharacter.setCar(rs.getInt("car"));
                nCharacter.setModCar(rs.getInt("modCar"));
                nCharacter.setModSab(rs.getInt("modSab"));
                nCharacter.setModDex(rs.getInt("modDex"));
                nCharacter.setArm(rs.getInt("arm"));
                nCharacter.setAcc(rs.getInt("acc"));
                nCharacter.setMainWeapon(rs.getInt("mainWeapon"));
                nCharacter.setSecWeapon(rs.getInt("secWeapon"));
                
            }
            sucesso = true;
          
            while (rs.next()) 
            {
                nCharacter.setMainWeapon(rs.getInt("mainWeapon"));
                nCharacter.setSecWeapon(rs.getInt("secWeapon"));
            }
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO porra" + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
        
        return nCharacter;
    }
    public void setPersonagem(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }

    
 
    public boolean CadastraPerso(Personagem a){ // cadastra chars colocando no arraylist
        
        connectToDB();
        
        String sql = "INSERT INTO mydb.character (hp,mp,nome,classe,raca,fatk,matk,str,inte,agi,vit,car,dex,sab,level,def,crit,modCar,modSab,modDex,idCharacter,mainWeapon,secWeapon,arm,acc) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a.getHP());
            ps.setInt(2, a.getMP());
            ps.setString(3, a.getNome());
            ps.setString(4, a.getClasse());
            ps.setString(5, a.getRaca());
            ps.setInt(6, a.getFatk());
            ps.setInt(7, a.getMatk());
            ps.setInt(8, a.getStr());
            ps.setInt(9, a.getInte());
            ps.setInt(10, a.getAgi());
            ps.setInt(11, a.getVit());
            ps.setInt(12, a.getCar());
            ps.setInt(13, a.getDex());
            ps.setInt(14, a.getSab());
            ps.setInt(15, a.getLevel());
            ps.setInt(16, a.getDef());
            ps.setInt(17, a.getCrit());
            ps.setInt(18, a.getModCar());
            ps.setInt(19, a.getModSab());
            ps.setInt(20, a.getModDex());
            ps.setInt(21, a.getId());       
            ps.setInt(22, a.getMainWeapon());
            ps.setInt(23, a.getSecWeapon());
            ps.setInt(24, a.getArm());
            ps.setInt(25, a.getAcc());
            ps.execute();
   
            
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO MDS 1" + ex.getMessage());
           sucesso = false;
        }
        
        return sucesso;
    }
 
     public boolean CadastraDebuff(DeBuffs a){ // cadastra chars colocando no arraylist
        
        connectToDB();
        
        String sql = "INSERT INTO mydb.character (damage,lightning,downdef,power,shield) values (?,?,?,?,?);";
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a.getDamage());
            ps.setInt(2, a.getLightning());
            ps.setInt(3, a.getDowndef());
            ps.setInt(4, a.getPower());
            ps.setInt(5, a.getShield());
   
            ps.execute();
 
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO MDS 1" + ex.getMessage());
           sucesso = false;
        }
        
        return sucesso;
    }
    
    public void EditarChar(int id, Personagem a){
        connectToDB();
        String sql = "UPDATE mydb.Character SET hp=?,mp=?,nome=?,classe=?,raca=?,fatk=?,matk=?,str=?,inte=?,agi=?,vit=?,car=?,dex=?,sab=?,level=?,def=?,crit=?,modCar=?,modSab=?,modDex=?, mainWeapon=?,secWeapon=?,arm=?,acc=? WHERE idCharacter = ?";
        
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a.getHP());
            ps.setInt(2, a.getMP());
            ps.setString(3, a.getNome());
            ps.setString(4, a.getClasse());
            ps.setString(5, a.getRaca());
            ps.setInt(6, a.getFatk());
            ps.setInt(7, a.getMatk());
            ps.setInt(8, a.getStr());
            ps.setInt(9, a.getInte());
            ps.setInt(10, a.getAgi());
            ps.setInt(11, a.getVit());
            ps.setInt(12, a.getCar());
            ps.setInt(13, a.getDex());
            ps.setInt(14, a.getSab());
            ps.setInt(15, a.getLevel());
            ps.setInt(16, a.getDef());
            ps.setInt(17, a.getCrit());
            ps.setInt(18, a.getModCar());
            ps.setInt(19, a.getModSab());
            ps.setInt(20, a.getModDex());
            ps.setInt(21, a.getMainWeapon());
            ps.setInt(22, a.getSecWeapon());
            ps.setInt(23, a.getArm());
            ps.setInt(24, a.getAcc());
            ps.setInt(25, id);
            ps.executeUpdate();
            
           
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO" + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
    }



    
    public void DeletarCli(int a){
        connectToDB();
        a++;
        String sql = "DELETE FROM cliente WHERE idcliente = ?";
        
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a);
            ps.executeUpdate();
            
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO" + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
    }
    public void DeletarFuncionario(int a){
        connectToDB();
        a++;
        String sql = "DELETE FROM funcionario WHERE idfuncionario = ?";
        
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a);
            ps.executeUpdate();
                       
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO" + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
    }
    public void DeletarMedicamento(int a){
        connectToDB();
        a++;
        String sql = "DELETE FROM cliente WHERE idmedicamento = ?";
        
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a);
            ps.executeUpdate();
                       
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO" + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
    }
    public void DeletarVenda(int a){
        connectToDB();
        a++;
        String sql = "DELETE FROM venda WHERE idvenda = ?";
        
        try {
            
            //referenciando ps para preparar a consulta
            ps = con.prepareStatement(sql);
            ps.setInt(1, a);
            ps.executeUpdate();
                       
            sucesso = true;
            
        } catch (SQLException ex) {
           System.out.println("ERRO DE CONEXÃO" + ex.getMessage());
           sucesso = false;
        } finally{
            try{
            if(rs!=null){
                rs.close();
            }
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            
            }catch (SQLException ex){
                System.out.println("ERRO!!!");
            }
            
        }
    }
    
}