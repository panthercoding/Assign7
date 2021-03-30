import java.util.*;

public class Queue{
  
  private ArrayList<Integer> list;

  public Queue(){ //initializes the array-list
    list = new ArrayList<Integer>();
  }
  
  //TODO: should insert an element at index 0 and not return anything
  public void enqueue(int newElement){
    /* missing code */
  }

  //TODO: should remove the last element and return its value
  public int dequeue(){
    /* missing code */
  }

  // NO NEED TO MODIFY ANYTHING BELOW THIS LINE //
  public void printQueue(){ //prints out the queue elements
    System.out.println(list);
  }
  public int get(int index){ //accesses the element at a certain index
    return(list.get(index));
  }
}
