import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        int a[] = {4,8,9};
        int n = a.length;
        int subsets = 1 << n; 
        List<List<Integer>> ans = new ArrayList<>();

        for (int mask = 0; mask < subsets; mask++) {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    res.add(a[i]);
                }
            }
            ans.add(res);
        }

        System.out.println(ans);
    }
}
