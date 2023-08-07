public class sub_3_cse_04 {

    public static void main(String[] args) {
        char ch= '7' ;

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("\n" + ch + " is an UpperCase character");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println("\n" + ch + " is an LowerCase character");
        }
        else{
            System.out.println("\n" + ch + " is not an aplhabetic character");
        }
    }

}
