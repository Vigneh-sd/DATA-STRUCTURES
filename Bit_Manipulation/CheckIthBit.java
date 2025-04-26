//import java.util.*;

public class CheckIthBit{
    public static void main(String[] args) {
        //left shift
        int a=5, i=1;
        // if((a & (1<<i))!=0) 
        // System.out.println("true");
        // else 
        // System.out.println("false");

        //right shift
        if(((a>>i) & 1) !=0)
          System.out.println("true");
          else 
          System.out.println("false");

    }
}