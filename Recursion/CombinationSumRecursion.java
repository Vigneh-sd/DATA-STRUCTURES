
import java.util.ArrayList;
import java.util.List;

public class CombinationSumRecursion {
		
		public static void combination(int a[],int i, List<Integer> lst, List<List<Integer>> list, int n, int k)
		{
			if(i==n)
			{
				if(k==0) {
					list.add(new ArrayList<>(lst));
				}
				return;
			}
			
			if(a[i]<=k) {
				lst.add(a[i]);		
			combination(a, i, lst, list, n, k-a[i]);
			 lst.remove(lst.size()-1);		
			}	
			combination(a, i+1, lst, list, n, k);
		}

		public static void main(String[] args) {
		 int a[]= new int[] {1,2,4};
		 List<List<Integer>> list= new ArrayList();
		 List<Integer> lst= new ArrayList();
		 combination(a, 0, lst, list, a.length, 4);
		 System.out.println(list);

		}

}
