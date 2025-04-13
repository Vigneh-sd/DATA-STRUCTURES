
import java.util.ArrayList;
import java.util.List;

public class SubsequenceRecursion {
	
  public static List<List<Integer>> subsets(int[] nums) {
	   List<Integer> lst=new ArrayList();
	   List<List<Integer>> list=new ArrayList();
       rec(nums,0,lst,nums.length,list);
       return list;
    }
	
	public static void rec(int a[],int i, List<Integer> lst, int n, List<List<Integer>> list)
	{
		if(i>=n) {
			list.add(new ArrayList<>(lst));
			return;
		}
		lst.add(a[i]);
		rec(a,i+1,lst,n,list);
		lst.remove(lst.size()-1);
		rec(a,i+1,lst,n,list);
	}

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		 List<List<Integer>> lst=subsets(a);
		 System.out.println(lst);

	}

}


// import java.util.ArrayList;
// import java.util.List;

// public class SubsequenceRecursion {
	
// 	public static void rec(int a[],int i, List<Integer> lst, int n)
// 	{
// 		if(i>=n) {
// 			System.out.println(lst);
// 			return;
// 		}
// 		lst.add(a[i]);
// 		rec(a,i+1,lst,n);
// 		lst.remove(lst.size()-1);
// 		rec(a,i+1,lst,n);
// 	}

// 	public static void main(String[] args) {
// 		int a[]=new int[] {1,2};
// 		List<Integer> lst=new ArrayList();
// 		rec(a,0,lst,a.length);

// 	}

// }
