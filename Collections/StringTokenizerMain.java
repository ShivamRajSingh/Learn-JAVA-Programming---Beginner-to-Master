import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerMain{
    public static void main(String[] args) {
        String str1 = "Name=Sandy;Address=Bengaluru;State=Karnataka;Country=India";
        String str2 = "Name=Pratham\nAddress=Gurugram\nState=Haryana\nCountry=India";
        String str3 = "Name=Anjali Address=Noida State=Uttar Pradesh Country=India";

        String str4 = "1,2,3,4,5,6,7";
        
        StringTokenizer stk = new StringTokenizer(str4, "=,");

        String s;
        ArrayList<Integer> al = new ArrayList<>();

        while(stk.hasMoreTokens()){
            s = stk.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
    }
}