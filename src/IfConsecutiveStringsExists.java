public class IfConsecutiveStringsExists {

    //Input S1 : ABCD S2 : ARTYBJLKCERETDJL OUTPUT : TRUE
    //Input S2 : DFLLJ S2:KHGFDKJHGDOFH OUTPUT :FALSE

    public static Boolean returnOccurenceOfConsecutiveSubString(String s1, String s2) {
        Boolean flag = false;

        int i =0,j=0;
        String s3 =" ";
        while(i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;

            }
            i++;
        }
        return j==s1.length();
    }

    public static void main(String args[]){
        String s1 = "ABCD";
        String s2 = "AGHIO";
        System.out.println(returnOccurenceOfConsecutiveSubString(s1,s2));
    }

}
