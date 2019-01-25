/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgnrpg;

/**
 *
 * @author Bruno Balestra
 */
public class Personagem{
   
   private Stats status = new Stats();
   private DeBuffs[] bfd = new DeBuffs[4];
   private int id;
   private String nome;
   private String classe;
   private String raca;
   private int HP;
   private int MP;
   private int matk;
   private int fatk;
   private int str;
   private int inte;
   private int agi;
   private int vit;
   private int car;
   private int dex;
   private int sab;
   private int level;
   private int def;
   private int crit;
   private int modCar;
   private int modSab;
   private int modDex;
   private int hpAtual;
   private int mpAtual;
   private int mainWeapon;
   private int SecWeapon;
   private int arm;
   private int acc;
   private int pocHP;
   private int pocMP;
   
    public Stats getStatus() {
        return status;
    }

    public void setStatus(Stats status) {
        this.status = status;
    }

    public DeBuffs[] getBfd() {
        return bfd;
    }

    public void setBfd(DeBuffs[] bfd) {
        this.bfd = bfd;
    }

    public int getMainWeapon() {
        return mainWeapon;
    }

    public void setMainWeapon(int mainWeapon) {
        this.mainWeapon = mainWeapon;
    }

    public int getSecWeapon() {
        return SecWeapon;
    }

    public void setSecWeapon(int SecWeapon) {
        this.SecWeapon = SecWeapon;
    }

    public int getArm() {
        return arm;
    }

    public void setArm(int arma) {
        this.arm = arma;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getPocHP() {
        return pocHP;
    }

    public void setPocHP(int pocHP) {
        this.pocHP = pocHP;
    }

    public int getPocMP() {
        return pocMP;
    }

    public void setPocMP(int pocMP) {
        this.pocMP = pocMP;
    }
  
   
  
    
   
    public int getHpAtual() {
        return hpAtual;
    }

    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }

    public int getMpAtual() {
        return mpAtual;
    }

    public void setMpAtual(int mpAtual) {
        this.mpAtual = mpAtual;
    }
    public int getModCar() {
        return modCar;
    }

    public void setModCar(int modCar) {
        this.modCar = modCar;
    }

    public int getModSab() {
        return modSab;
    }

    public void setModSab(int modSab) {
        this.modSab = modSab;
    }

    public int getModDex() {
        return modDex;
    }

    public void setModDex(int modDex) {
        this.modDex = modDex;
    }
   

   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public int getFatk() {
        return fatk;
    }

    public void setFatk(int fatk) {
        this.fatk = fatk;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getSab() {
        return sab;
    }

    public void setSab(int sab) {
        this.sab = sab;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }
    
}
