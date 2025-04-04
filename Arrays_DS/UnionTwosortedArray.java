import java.util.*;

public class UnionTwoSortedArray {
    public static List<Integer> findUnion(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < a.length && j < b.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != Math.min(a[i], b[j])) {
                list.add(Math.min(a[i], b[j]));
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }
        
        return list;
    }

    public static void main(String[] args) {
        int a[] = {0, 0, 0, 7, 22, 31};
        int b[] = {7, 11, 13, 15, 22, 31};
        List<Integer> ans = findUnion(a, b);
        System.out.println(ans);
    }
}
