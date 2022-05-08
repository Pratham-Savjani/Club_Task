import java.util.*;

public class CountStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        str = " " + str;
        char[] s = str.toCharArray();
        int countw, countl, countn;
        countw = countl = countn = 0;
        for (int i = 0; i <= n; i++) {
            if (s[i] == 32) {
                if (i != n) {
                    if (s[i + 1] != 32)// here 32 is ascii value for [space]
                        countw++;
                    else
                        continue;
                }
            }
            if (s[i] >= 48 && s[i] <= 57) {// here 48 to 57 is ascii value for numbers
                countn++;
            }
            if (s[i] >= 65 && s[i] <= 90 || s[i] >= 97 && s[i] <= 122) {//Here 65 to 90 is the ascii values of Uppercase alphabets and 97 to 122 for lowercase
                countl++;
            }
        }
        System.out.println("Words:" + countw + " Lettrs:" + countl + " Numbers:" + countn);
    }
}