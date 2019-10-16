import java.util.Stack;

public class ReverseEveryWordInASentence {

    public static void main(String args[]){
        String s = "I am an Indian";
        System.out.println(getReverseValue(s));
    }

    private static String getReverseValue(String s) {
        String reverseString = "";
        Stack<Character> ch = new Stack<Character>();

        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!=' '){
                ch.push(s.charAt(i));
            }
            else {
                reverseString = reverseString + " ";
                while(ch.isEmpty()==false)
                    reverseString = reverseString + ch.pop();
            }
        }
        reverseString = reverseString + " ";
        while(ch.isEmpty()==false)
            reverseString = reverseString  + ch.pop();

        return reverseString;
    }


}
