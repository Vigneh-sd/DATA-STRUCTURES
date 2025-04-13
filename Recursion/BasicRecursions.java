
public class BasicRecursions {
	
//	public static int[] rec(int a[])
//	{
//		int s=0,e=a.length-1;
//       int arr[]=soln(a,s,e);
//       return arr;
//	}
//	public static int[] soln(int a[],int s, int e)
//	{
//		if(s>=e) return a;
//		int temp=a[s];
//		a[s]=a[e];
//		a[e]=temp;
//		return soln(a,s+1,e-1) ;
//	}
	public static boolean palindrome(String s)
	{
		return pal(s,0,s.length()-1);
	}
	public static boolean pal(String s, int start, int end)
	{
		if(start>=end) return true;
		if(s.charAt(start)!=s.charAt(end)) return false;
		return pal(s,start+1,end-1);
	}
	
	public static void main(String[] args) {
		
//     int ans[] = new int[] {1,2,3,4,5};
//     int arr[]=rec(ans);
//     System.out.println(Arrays.toString(arr));
		String s="vick";
		boolean ans=palindrome(s);
		System.out.println(ans);
	}

}
