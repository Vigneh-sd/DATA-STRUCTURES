//import java.util.*;

public class SetIthBit{
    public static void main(String[] args) {
        
        int a=5, i=1;
        int ans= (a | (1<<i));
        System.out.println(ans);
    }
}