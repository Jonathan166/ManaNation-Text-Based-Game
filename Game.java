//TEAM PROJECT
//MATTHEW LANGFORD
//JONATHAN LANGFORD
import java.util.Random;
import java.util.Scanner;

public class Game{
   static Scanner input = new Scanner(System.in); 
   static Monster mob =new Monster(null,0,0,0);
   public static void main(String[] args){
      
      Random rand = new Random();
      Switches select = new Switches(true,0, 0);
      boolean running = true;
      
      while (running){ 
         Menu.startMenu(); 
         if(Switches.startGame() != 1){
            Switches.selectHero();
            while(select.count() < 10){
            
               Menu.ventureMenu();
               
               System.out.printf("%nVenturing on you encounter a %s %n", mob.monsterLocation());
               System.out.println("Press 1 to fight, or 2 to try to run");
               System.out.printf("Selection: ");
               select.isFighting();
                 
                   
           }   System.out.printf("%n        THE END");
         } 
      break; 
      }   
   } 
  
   public static int heroSelect(){
      int heroSelect = input.nextInt();
      return heroSelect;
   }
   
   public static int ventureChoice(){
      int ventureChoice = input.nextInt();
      return ventureChoice;
   }    
}