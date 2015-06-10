//TEAM PROJECT
//MATTHEW LANGFORD
//JONATHAN LANGFORD
public class Menu{

   public static void startMenu(){
     System.out.printf(" __  __                   _   _         _   _             "+"%n"+
                      "|  \\/  |                 | \\ | |   /\\  | | (_)            "+"%n"+
                      "| \\  / | __ _ _ __   __ _|  \\| |  /  \\ | |_ _  ___  _ __  "+"%n"+
                      "| |\\/| |/ _` | '_ \\ / _` | . ` | / /\\ \\| __| |/ _ \\| '_ \\ "+"%n"+
                      "| |  | | (_| | | | | (_| | |\\  |/ ____ \\ |_| | (_) | | | |"+"%n"+
                      "|_|  |_|\\__,_|_| |_|\\__,_|_| \\_/_/    \\_\\__|_|\\___/|_| |_|"+"%n");
     System.out.println("----------------------------------------------------------");
     
     
     System.out.printf("   Collect ten Mana souls from the Evil Monsters to win!%n%n");
     System.out.println("        Press any number to Begin your adventure!");
     System.out.println("                 Or Press 1 to Exit.");
     System.out.printf("                   Selection: ");
   }
   public static void heroMenu(){
     System.out.printf("          Please select a hero job:%n");
     System.out.printf("%nPress 1 to be a Steadfast Warrior!");
     System.out.printf("%n     You'll have high Health, medium Offense and medium Defense%n");
     System.out.printf("Press 2 to be a Powerful Mage!%n");
     System.out.printf("     You'll have medium Health, high Offense and medium Defense%n");
     System.out.printf("Press 3 to be a Resilent Priest!%n");
     System.out.printf("     You'll have medium Health, medium Offense and high Defense%n");
     System.out.printf("%nSelection: ");             
   }
   public static void ventureMenu(){
      System.out.printf("%n       Where will you explore?%n");     
      System.out.println("Press 1 to travel to the Dark Forest");
      System.out.println("Press 2 to travel to the Cold Mountains");
      System.out.println("Press 3 to travel to the Haunted Caves");
      System.out.printf("           Selection: ");
   }
}