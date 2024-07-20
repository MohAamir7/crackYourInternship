package arsh_dsa_sheet;

import java.util.Stack;

public class Daily_Tempratures {
	public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        Stack<Integer> s = new Stack<>();
        int[] a = new int[n];
        // s.push(temperatures[0]);

        for(int i =0;i<n;i++){
                while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                    a[s.peek()] = i-s.pop();
                }
                s.push(i);
        }   
        return a;
        
    }

}
