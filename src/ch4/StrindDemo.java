package ch4;

public class StrindDemo {
    public static void main(String[] args) {

        String str = "Hello";
        String str2 ="Hello";
        String str3 =new String("Hello");
        String str4 =str;
        System.out.println("str == str2 :"+ (str == str2));
        System.out.println("str == str3: "+ (str == str3));
        System.out.println("str == str4: "+(str == str4));
        System.out.println("str.equals(str2) " + str.equals(str2));
        System.out.println("str.equals(str3) " + str.equals(str3));
        System.out.println("str.equals(str4) " + str.equals(str4));



    }
}
