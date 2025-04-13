
import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

public class AllPermutation {
	
//	public static void allpermutation(int a[], List<Integer> lst, List<List<Integer>> list, Map<Integer,Integer> map)
//	{
//		if(lst.size()==a.length)
//		{
//			list.add(new ArrayList<>(lst));
//			return;
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			if(!map.containsKey(a[i]))
//			{
//				lst.add(a[i]);
//				map.put(a[i], 1);
//				allpermutation(a, lst, list, map);
//				map.remove(a[i]);
//				lst.remove(lst.size()-1);
//			}
//		}
//	}
	public static void swap(int ind, int i, int a[])
	{
		int temp=a[ind];
		a[ind]=a[i];
		a[i]=temp;
	}
	public static void allpermutation(int a[], int ind, List<List<Integer>> list)
	{
		if(ind==a.length)
		{
			List<Integer> ans= new ArrayList<>();
			for(int i=0;i<a.length;i++)
			{
				ans.add(a[i]);
			}
			list.add(new ArrayList<>(ans));
			return;
		}
		
		for(int i=ind;i<a.length;i++)
		{
			swap(ind,i,a);
			allpermutation(a, ind+1, list);
			swap(ind,i,a);
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList();
		int a[]= new int[] {1,2,3};
		//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		allpermutation(a, 0, list);
		System.out.println(list);	

	}

}
