//import java.util.*;

public class ToggleIthBit{
    public static void main(String[] args) {
        
        int a=13, i=2;
        int ans= (a ^ (1<<i));
        System.out.println(ans);
    }
}