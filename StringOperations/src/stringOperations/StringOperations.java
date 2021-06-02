package stringOperations;

public class StringOperations {

	public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Khakang Rayhan";
        String str2 = " ";
        str2 = str.concat (" " + str1 + ", " ).concat ("How Are U?");
        
        System.out.println("String 2    :" + str2);
        System.out.println("Length      :" + str.length());
        System.out.println("Substring   :" + str2.substring(0,9));
        System.out.println("Uppercase   :" + str2.toUpperCase() + "\n");

        String str3 = "How Are U " + str1 + "?";

        System.out.println("String 3     : " + str3);
        System.out.println("String       : " + (str += str1));
        System.out.println("Index 'A'    : " + str1.indexOf('A'));
        System.out.println("Index 2      : " + str1.charAt(2) + "\n");
        System.out.println("Str2 length  : " + str2.length());
        System.out.println("Str3 length  : " + str3.length()); 
        System.out.println("Compare      : " + str2.compareTo(str3));
        System.out.println("Equals       : " + str2.equals(str3));

	}

}
