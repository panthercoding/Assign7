// NO NEED TO MODIFY FILE 
// RUNNER CLASS FOR THE QUEUE DATA STRUCTURE

import java.util.*;

public class QueueRunner{
  public static void main(String[] args){

    Queue q = new Queue();
    System.out.print("Initial Queue: ");
    q.printQueue();

    Scanner scan = new Scanner(System.in); 
    
    boolean keepGoing = true;
    while (keepGoing){
      System.out.println("How would you like to change the queue");
      System.out.println("Type e for enqueue, type d for dequeue, or anything else to exit the program.");
      String instruction = scan.next();
      if (instruction.toLowerCase().compareTo("e") != 0 && instruction.toLowerCase().compareTo("d") != 0){
        keepGoing = false;
      }
      else{
          if (instruction.toLowerCase().compareTo("d") == 0){
            int removed = q.dequeue();
            System.out.println("Removed: " + removed);
          }
          else{
            System.out.println("What integer should be entered into the queue?");
            q.enqueue(scan.nextInt());
          }
          System.out.print("Current Queue: ");
          q.printQueue();
      }
    }

    
    }

  }
