public class CountprimesInRange {

    public static int[] sieve(int n)
    {
        int boxes[]= new int[n+1];
        for(int i=0;i<boxes.length;i++)
        {
            boxes[i]=1;
        }
        boxes[0]=boxes[1]=0;

        for(int i=2;i*i<=n;i++)
        {
            if(boxes[i]==1)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    boxes[j]=0;
                }
            }
        }

        int pre[]= new int[n+1];
        for(int i=1;i<=n;i++)
        {
            pre[i]=pre[i-1]+boxes[i];
        }
        return pre;
    }

    public static void main (String[] args) {
        int n=1000000;
        int pre[]=sieve(n);

        int l=10, r=20;
        System.out.println(pre[r]-pre[l-1]);

        l=1; r=10;
        System.out.println(pre[r]-pre[l-1]);

        l=15; r=30;
        System.out.println(pre[r]-pre[l-1]);

        l=1; r=100;
        System.out.println(pre[r]-pre[l-1]);
    }
}
