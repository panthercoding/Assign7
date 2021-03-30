import java.util.*;

public class Stack{
  
  private ArrayList<Integer> list;

  public Stack(){ //initializes the array-list
    list = new ArrayList<Integer>();
  }
  
  //TODO: should insert new element at index 0 and not return anything
  public void push(int newElement){
    /* missing code */
  }

  //TODO: should remove the element at index 0 and return its value
  public int pop(){
    /* missing code */
  }

  // NO NEED TO MODIFY ANYTHING BELOW THIS LINE //
  public void printStack(){ //prints out the stack elements
    System.out.println(list);
  }
  public int get(int index){ //accesses the element at a certain index
    return(list.get(index));
  }
}
