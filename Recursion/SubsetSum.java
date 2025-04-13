
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
	public static void subsetsum(int a[],int i, List<Integer> list, int sum)
	{
		if(i==a.length)
		{
			list.add(sum);
			return;
		}
		subsetsum(a, i+1, list, sum+a[i]);
		subsetsum(a, i+1, list, sum);
	}

	public static void main(String[] args) {
	 int a[]= new int[] {1,2,3};
	 List<Integer> list= new ArrayList();
	 subsetsum(a, 0, list, 0);
	 Collections.sort(list);
	 System.out.println(list);

	}

}
