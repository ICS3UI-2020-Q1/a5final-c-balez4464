import java.util.Scanner;

/**
 *This program displays all the even numbers up to the users number
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user for starting value
    System.out.println("What number do you want to begin counting from?");
    int startValue = input.nextInt();

    //asks user for ending value
    System.out.println("What number do you want to end counting at?");
    int endValue = input.nextInt();

    //prints users number at the beginng only if its odd
    int printStart = startValue % 2;
    if (printStart != 0){
      System.out.println(startValue);
    }
    

    //for loop for counting up to nuber and displaying even numbers
    for (int i = startValue; i < endValue; i++){
      int evenNumber = i % 2;
      //only prints if the number is even
      if(evenNumber == 0){
        System.out.println(i);
      }
    }
    //prints last number
    System.out.println(endValue);
  }
}
