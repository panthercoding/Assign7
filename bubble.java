import java.util.*;

public class bubble{

  public static void bubbleSort(ArrayList<String> list){
    for (int i = 0; i < list.size() - 1; i++){
      for (int j = 0; j < list.size() - 1; j++){
        if (/* complete boolean expression that is true
         only when element j comes after element j + 1 in a dictionary */)
          swap(list,j,j+1); /* swaps elements j and j+1 since
                            they are in wrong order, no need to change */
      }
    }
  }

  public static void swap(ArrayList<String> list, int index1, int index2){
    String temp = list.set(index1,list.get(index2));
    list.set(index2, temp);
  }

  public static void main(String[] args){ /*tester method */
    ArrayList<String> list = new ArrayList<String>();
    list.add("Apple");
    list.add("Zucchini");
    list.add("Cookie");
    bubbleSort(list);
    System.out.println(list);
  }

}
