package arsh_dsa_sheet;

public class Reverse_Words_in_String {
	public String reverseWords(String s) {
        String[] ans = s.trim().split("\\s+");
        // String ans2 = "";

        StringBuilder ans2 = new StringBuilder();
        for(int i = ans.length-1;i>0;i--){
            // ans2 += ans[i]+" ";
            ans2.append(ans[i]+" ");
        }
        // return ans2+ans[0];
        ans2.append(ans[0]);
        return ans2.toString();
        
    }

}
