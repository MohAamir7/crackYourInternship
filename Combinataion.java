package arsh_dsa_sheet;
import java.util.*;
public class Combinataion {
	 List<List<Integer>> list = new ArrayList<>();

	    public List<List<Integer>> combine(int n, int k) {
	        List<Integer> ll = new ArrayList<>();
	        boolean[] arr = new boolean[n+1];
	        allCombi(k, 1, ll, n);
	        return list;

	    }

	    public void allCombi(int k, int idx, List<Integer> ll, int n) {
	        if (ll.size() == k) {
	            list.add(new ArrayList<>(ll));
	            return;
	        }

	        for (int i = idx; i <= n; i++) {
	            // if (arr[i] == false) {
	            //     arr[i]=true;
	            //     ll.add(i);
	            //     allCombi(k, i + 1, ll, n,arr);
	            //     ll.remove(ll.size() - 1);
	            //     arr[i]=false;

	            // }
	            ll.add(i);
	            allCombi(k,i+1,ll,n);
	            ll.remove(ll.size()-1);

	        }
	    }

}
