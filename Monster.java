//TEAM PROJECT
//MATTHEW LANGFORD
//JONATHAN LANGFORD
import java.util.Random;

public class Monster{
   Random rand = new Random();
   private static String currentMob;
   private int health;
   private int offense;
   private int defense;

   //Random Possible Monsters depending on location
   String[] forestMobs = {"Massive Angry Treant","Venomous Rabid Snake","Deranged Dire Wolf"};
   String[] caveMobs = {"Blood Thirsty Spider","Ninja Troll","Angry Ogre"};
   String[] mountainMobs = {"Ice Dragon","Mountain Giant","Killer Minotaur"};
   
   //Monster Constructor
   public Monster(String n, int h, int o, int d){
      currentMob = n;
      health = h;
      offense = o; 
      defense = d;
   }
   
   public String monsterLocation(){
      switch(Game.ventureChoice()){
         case 1: 
            currentMob = forestMobs[rand.nextInt(forestMobs.length)];
            System.out.printf("%nYou travel into the Dark Forest...%n");
         break; 
         case 2: 
            currentMob = mountainMobs[rand.nextInt(mountainMobs.length)];
            System.out.printf("%nYou hike the Cold Mountains...%n");
            
         break; 
         case 3: 
            currentMob = caveMobs[rand.nextInt(caveMobs.length)];
            System.out.printf("%nYou enter the Haunted Caves...%n");
         break; 
         default:
            System.out.printf("%nThat is not a valid selection%n%n");
            Menu.ventureMenu();
            monsterLocation(); 
         break;    
      }return currentMob; 
   }
   
   public String getName(){
      return currentMob;
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
}