public class ConsecutiveSubstring {


//Input = "aabbc" = Output = a2b2c1
public static void main(String args[]){

    String s = "aabbccddeffg";
    char[] c = s.toCharArray();
    int count=1;
    String res ="";
    for(int i =0;i<c.length;i++){

       if(i+1 < c.length) {
           if (c[i] == c[i + 1]) {
               count++;
               continue;
           }
       }
        res = res + c[i] + count;
        count = 1;
    }
    System.out.println(res);
}

}
