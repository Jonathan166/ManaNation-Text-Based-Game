//TEAM PROJECT
//MATTHEW LANGFORD
//JONATHAN LANGFORD
public class Hero{
   private int health;
   private int offense;
   private int defense;
   private String job;
   
   public Hero(int h, int o, int d, String j){
      health = h;
      offense = o;
      defense = d;
      job = j;      
   }
      
   public int getHealth(){
      return health;
   }
   
   public int getOffense(){
      return offense;
   }
   
   public int getDefense(){
      return defense;
   }
   
   public void setHealth(int h){
      health = h;
   }
   
   public void setOffense(int o){
      offense = o;
   }
   
   public void setDefense(int d){
      defense = d;
   }
}