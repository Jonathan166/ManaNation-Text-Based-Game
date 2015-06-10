//TEAM PROJECT
//MATTHEW LANGFORD
//JONATHAN LANGFORD
import java.util.Random;
import java.util.Scanner;

public class Switches{
   static Scanner input = new Scanner(System.in);   
   static Random rand = new Random();
   static Hero myHero = new Hero(0,0,0, null);
   private boolean isFighting;
   private int location;
   private int count;
    
   Monster mob = new Monster(null,rand.nextInt(10)+10,rand.nextInt(10)+10,rand.nextInt(10)+10); 
   
   public Switches(boolean isf, int l, int c){
      isFighting = true;
      location = l;
      count = 0;
   }
    
     public int count(){
      myHero.setHealth(myHero.getHealth() + 1);
      myHero.setOffense(myHero.getOffense() + 1);
      myHero.setDefense(myHero.getDefense() + 1);  
      return count;
   }
   
   public static int startGame(){
      int choice = input.nextInt();
      System.out.println();
      if(choice != 1){ 
         Menu.heroMenu();
      }else if(choice == 1){
         System.out.print("Thanks for Playing!");
      }
      return choice;
   }
   
   public static int selectHero(){
      int selectHero = 0;
      switch(Game.heroSelect()){
         case 1: 
            System.out.printf("%nYou are a Warrior! Taking up your Sword and Shield, you venture on.%n");
            myHero = new Hero(20,15,15, "Warrior");
         break;
         case 2:
            System.out.printf("You are a Mage! Commanding the Elements, you venture on.%n");
            myHero = new Hero(15,20,15, "Mage");
         break;
         case 3:
            System.out.printf("You are a Priest! Righteous Staff in hand, you venture on.%n");
            myHero = new Hero(15,15,20, "Priest");
         break;
         default: 
            System.out.printf("That is not a valid selection%n%n");
            Menu.heroMenu();
            selectHero();
         break;      
      }  
      return selectHero;
   }
   
   public  int location(){
      int location = 0;
      System.out.println();           
      switch(Game.ventureChoice()){
         case 1:
            System.out.printf("You travel into the Dark Forest...%n");
         break;
         case 2:
            System.out.printf("You hike the Cold Mountains...%n");
         break;
         case 3:
            System.out.printf("You enter the Haunted Caves...%n");
         break;
         default: 
            System.out.printf("That is not a valid selection%n%n");
            Menu.ventureMenu();
            mob.getName();
         break;      
      } 
      System.out.println();
      return location;
   }
   public boolean isFighting(){
      boolean isFighting = true;
      if (isFighting == true){
         int fightChoice = input.nextInt();      
         System.out.println();
         switch(fightChoice){
            case 1: 
               System.out.printf("Your Bravery is unsurpassed, Fight On! %n%n");
               if((myHero.getOffense())+1 >= mob.getDefense()){
                  do{
                     System.out.printf("You're stronger than the %s, you Strike the %s for %d %n", mob.getName(), mob.getName(), damage());
                     System.out.printf("The %s has %d hit-points left%n", mob.getName(), lifeRemaining()); 
                  }while (lifeRemaining() > 0);
                     if(mob.getHealth() <= 0){
                        System.out.printf("The %s has no health left, the %s dies%n", mob.getName(), mob.getName());
                     }
                     System.out.printf("Congratulations you defeated the %s%n%nYou gained the %s's Mana soul!!%n", mob.getName(), mob.getName());
                     count++;
                     System.out.printf("You've collected %d Mana souls!%n",count);
                     System.out.printf("Your experience makes you stronger.%n");
                     mob = new Monster(mob.getName(),rand.nextInt(10)+10,rand.nextInt(10)+10,rand.nextInt(10)+10);
               }else if ((mob.getOffense())+1 >= myHero.getDefense()){
                  do{
                     System.out.printf("The %s is stronger than you, the %s Strikes you for %d%n",mob.getName(),mob.getName(),damage());
                     System.out.printf("You have %d hit-points left%n", lifeRemaining());
                  }while (myHero.getHealth() > 0);
                     System.out.printf("The %s destroyed you.%n%nA bright light revives you!%n",mob.getName());
                     System.out.printf("You lost a soul :(");
                     count--;
                     myHero.setHealth(myHero.getHealth()+20);
                     mob = new Monster(mob.getName(),rand.nextInt(10)+10,rand.nextInt(10)+10,rand.nextInt(10)+10);
               }else{
                  System.out.printf("You and the %s are of equal strength, you're spirit prevails! You overpower the %s%n%n",mob.getName(), mob.getName());
                  mob = new Monster(mob.getName(),rand.nextInt(10)+10,rand.nextInt(10)+10,rand.nextInt(10)+10);  
                  count++;
               }
            break;
            case 2:
               System.out.printf("You run for your life!..... %n");
               int runChance1 = rand.nextInt(2);
               if(runChance1 == 0){
                  System.out.printf("You ran away!%n");
                  Menu.ventureMenu();
                  Game.ventureChoice();
               }   
               else{
                  System.out.printf("It's too Fast!%n");
                  System.out.printf("Prepare to Fight!%n%n");
                  System.out.println("Press 1 to fight");
                  isFighting();
            break;               
            }
            default:
               System.out.printf("that is not a valid selection%n%n");
               System.out.println("Press 1 to fight, or 2 to try to run");
               isFighting();  
         }
      }return isFighting;
   }
   
   public int damage(){
      int damage;
      if(myHero.getOffense() >= mob.getDefense()){ 
         damage = (myHero.getOffense()+1 - mob.getDefense());
      }else{
         damage = (mob.getOffense()+1 - myHero.getDefense());
      }
      if(damage <= 0){
         damage = 5;
      }
      return damage;
   }
   
   public int lifeRemaining(){
      int lifeRemaining;
      
      if(myHero.getOffense() >= mob.getDefense()){
         lifeRemaining = (mob.getHealth() - damage());
         mob.setHealth((mob.getHealth() - damage()));
      }else{
         lifeRemaining = (myHero.getHealth() - damage());
         myHero.setHealth(myHero.getHealth() - damage());
      }
      return lifeRemaining;
   }  
}