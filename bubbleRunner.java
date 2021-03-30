/* NO NEED TO MODIFY FILE 
tests the bubble sort on a user-specified file that lists one entry per line
*/

import java.io.*;
import java.util.*;

public class bubbleRunner{

    public static void main(String[] args) throws IOException{
        ArrayList<String> list = new ArrayList<String>();
        String file = args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String newline;
        while ((newline = bufferedReader.readLine()) != null){
            list.add(newline);
        }
        bufferedReader.close();
        bubble.bubbleSort(list);
        for (String entry: list){
          System.out.println(entry);
        }
    }
}
