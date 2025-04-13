

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumRecursion {

		
		public static int subsets(int a[],int i, List<Integer> lst, int n, int sum, int k)
		{
			if(i==n) {
				if(sum==k) {
					return 1;
				}
				return 0;
			}
			lst.add(a[i]);
			sum+=a[i];
			int left=subsets(a,i+1,lst,n,sum,k);
			sum-=lst.get(lst.size()-1);
			lst.remove(lst.size()-1);
			int right=subsets(a,i+1,lst,n,sum,k);
            return left+right;
		}

		public static void main(String[] args) {
			int a[]=new int[] {1,2,1};
            List<Integer> lst=new ArrayList<>();
			int ans=subsets(a,0,lst,a.length,0,2);
			 System.out.println(ans);

		}

}
