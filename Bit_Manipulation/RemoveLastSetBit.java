//import java.util.*;

public class RemoveLastSetBit{
    public static void main(String[] args) {
        
        int n=13;
        int ans= (n & (n-1));
        System.out.println(ans);
    }
}