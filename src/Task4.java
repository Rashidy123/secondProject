public class Task4 {
    public static void main(String[] args) {
        String str="Madam";
        String rev="";
        for (int i=str.length()-1;i>=0;i--) {
            rev=rev+str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){

            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
