// NO NEED TO MODIFY FILE 
// RUNNER CLASS FOR THE STACK DATA STRUCTURE

import java.util.*;

public class StackRunner{
  public static void main(String[] args){

    Stack s = new Stack();
    System.out.print("Initial Stack: ");
    s.printStack();

    Scanner scan = new Scanner(System.in); 
    
    boolean keepGoing = true;
    while (keepGoing){
      System.out.println("How would you like to change the stack");
      System.out.println("Type pop, push, or anything else to exit the program.");
      String instruction = scan.next();
      if (instruction.toLowerCase().compareTo("pop") != 0 && instruction.toLowerCase().compareTo("push") != 0){
        keepGoing = false;
      }
      else{
          if (instruction.toLowerCase().compareTo("pop") == 0){
            int removed = s.pop();
            System.out.println("Removed: " + removed);
          }
          else{
            System.out.println("What integer should be pushed into the stack?");
            s.push(scan.nextInt());
          }
          System.out.print("Current Stack: ");
          s.printStack();
      }
    }

    
    }

  }
