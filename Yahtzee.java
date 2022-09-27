/**
Yahtzee for Java.
*/
import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    
    int[] dice = {(int)(Math.random() * 6 + 1), (int)(Math.random() * 6 + 1), (int)(Math.random() * 6 + 1), (int)(Math.random() * 6 + 1), (int)(Math.random() * 6 + 1)};
    Scanner title = new Scanner(System.in);
    // Title from https://patorjk.com/software/taag/#p=display&f=Big%20Money-ne&t=YAHTZEE
    System.out.println(" /$$     /$$ /$$$$$$  /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$$$");
    System.out.println("|  $$   /$$//$$__  $$| $$  | $$|__  $$__/|_____ $$ | $$_____/| $$_____/");
    System.out.println(" \\  $$ /$$/| $$  \\ $$| $$  | $$   | $$        /$$/ | $$      | $$");
    System.out.println("  \\  $$$$/ | $$$$$$$$| $$$$$$$$   | $$       /$$/  | $$$$$   | $$$$$");
    System.out.println("   \\  $$/  | $$__  $$| $$__  $$   | $$      /$$/   | $$__/   | $$__/");
    System.out.println("    | $$   | $$  | $$| $$  | $$   | $$     /$$/    | $$      | $$");
    System.out.println("    | $$   | $$  | $$| $$  | $$   | $$    /$$$$$$$$| $$$$$$$$| $$$$$$$$");
    System.out.println("    |__/   |__/  |__/|__/  |__/   |__/   |________/|________/|________/");
    System.out.println("");
    System.out.println("");
    System.out.println("Press ENTER to play.");
    String option = title.nextLine();
    switch (dice[0]) {
      case 1:
        /*Modified dice images from https://codegolf.stackexchange.com/questions/2602/draw-dice-results-in-ascii*/
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|  o  |");
        System.out.println("|     |");
        System.out.println("-------");
        break;
      case 2:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|     |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 3:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|  o  |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 4:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|     |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 5:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|  o  |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 6:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      default:
        System.out.println("Invalid roll");
    } switch (dice[1]) {
      case 1:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|  o  |");
        System.out.println("|     |");
        System.out.println("-------");
        break;
      case 2:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|     |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 3:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|  o  |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 4:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|     |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 5:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|  o  |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 6:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      default:
        System.out.println("Invalid roll");
    } switch (dice[2]) {
      case 1:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|  o  |");
        System.out.println("|     |");
        System.out.println("-------");
        break;
      case 2:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|     |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 3:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|  o  |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 4:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|     |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 5:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|  o  |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 6:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      default:
        System.out.println("Invalid roll");
    } switch (dice[3]) {
      case 1:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|  o  |");
        System.out.println("|     |");
        System.out.println("-------");
        break;
      case 2:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|     |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 3:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|  o  |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 4:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|     |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 5:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|  o  |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 6:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      default:
        System.out.println("Invalid roll");
    } switch (dice[4]) {
      case 1:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|  o  |");
        System.out.println("|     |");
        System.out.println("-------");
        break;
      case 2:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|     |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 3:
        System.out.println("-------");
        System.out.println("|o    |");
        System.out.println("|  o  |");
        System.out.println("|    o|");
        System.out.println("-------");
        break;
      case 4:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|     |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 5:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|  o  |");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      case 6:
        System.out.println("-------");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("|o   o|");
        System.out.println("-------");
        break;
      default:
        System.out.println("Invalid roll");
    }
  }
  public static void StraightCheck() {
    //Small Straight
    if (dice[0] == 1 && dice[1] == 2 && dice[2] == 3 && dice[3] == 4 || dice[1] == 1 && dice[2] == 2 && dice[3] == 3 && dice[4] == 4 || dice[0] == 2 && dice[1] == 3 && dice[2] == 4 && dice[3] == 5 || dice[1] == 2 && dice[2] == 3 && dice[3] == 4 && dice[4] == 5 || dice[0] == 3 && dice[1] == 4 && dice[2] == 5 && dice[3] == 6 || dice[0] == 3 && dice[1] == 4 && dice[2] == 5 && dice[3] == 6) {
      //30 points
    }
    //Large Straight
    if (dice[0] == 1 && dice[1] == 2 && dice[2] == 3 && dice[3] == 4 && dice[4] == 5 || dice[0] == 2 && dice[1] == 3 && dice[2] == 4 && dice[3] == 5 && dice[4] == 6) {
      //40 points
    }
  }
}
