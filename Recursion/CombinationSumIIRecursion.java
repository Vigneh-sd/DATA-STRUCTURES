
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIIRecursion {
		
		public static void combination(int a[],int ind, List<Integer> lst, List<List<Integer>> list, int k)
		{
			if(k==0)
			{
				list.add(new ArrayList<>(lst));
				return;
			}
			
			for(int i=ind;i<a.length;i++) {
				if(i>ind && a[i]==a[i-1]) continue; 
				if(a[i]>k) break;
				lst.add(a[i]);
				combination(a, i+1, lst, list, k-a[i]);
				lst.remove(lst.size()-1);
			}
		}

		public static void main(String[] args) {
		 int a[]= new int[] {1,2,1,4};
		 Arrays.sort(a);
		 List<List<Integer>> list= new ArrayList();
		 List<Integer> lst= new ArrayList();
		 combination(a, 0, lst, list, 4);
		 System.out.println(list);

		}

}
