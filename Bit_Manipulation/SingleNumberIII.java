public class SingleNumberIII {
    public static void main (String[] args) {
        int a[]= {1,2,3,4,5,5,4,1};
        int xor=0;
        for(int i=0;i<a.length;i++)
        {
            xor=xor^a[i];
        }
        int setbit= xor & (-xor);
        int num1=0, num2=0;
        
        for(int i=0;i<a.length;i++)
        {
            if((a[i] & setbit)==0)
            {
                num1^=a[i];
            }
            else{
                num2^=a[i];
            }
        }
       System.out.println(num1+" "+ num2);
       
       
    }
}