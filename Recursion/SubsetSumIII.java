import java.util.ArrayList;
import java.util.List;


class SubsetSumIII {
   public static void subsets(int a[],int i, List<Integer> lst, List<List<Integer>> list, int sum, int k, int n)
		{
			if(i==a.length) {
				if(sum==k && lst.size()==n) {
				 list.add(new ArrayList<>(lst));
				}
				return ;
			}
			lst.add(a[i]);
			sum+=a[i];
			subsets(a,i+1,lst,list,sum,k,n);
			sum-=lst.get(lst.size()-1);
			lst.remove(lst.size()-1);
			subsets(a,i+1,lst,list,sum,k,n);
		}
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> lst = new ArrayList();
        List<List<Integer>> list = new ArrayList();
        int a[]=new int[9];
        for(int i=0;i<9;i++)
        {
            a[i]=i+1;
        }
        subsets(a,0,lst,list,0,n,k);
        return list;
    }
} 