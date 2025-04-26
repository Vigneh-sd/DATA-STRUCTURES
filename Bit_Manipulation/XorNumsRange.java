public class XorNumsRange {

    public static int xor(int n)
    {
        if((n%4)==0)
        {
            return n;
        }
        else if(n%4==1)
        {
            return 1;
        }
        else if(n%4==2)
        {
            return n+1;
        }
        else{
            return 0;
        }
       
    
    }
    public static void main (String[] args) {
       int a=4, b=7;
       int xor1=xor(a-1);
       int xor2=xor(b);
       System.out.print(xor1^xor2);
       
    }
}