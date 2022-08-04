import java.util.Scanner;

public class MaxNumberFromString {
    public static String removeDigit(String number, char digit) {
        int i = 0;
        while(i < number.length() - 1){
            if(number.charAt(i) == digit && number.charAt(i) < number.charAt(i+1)){
                return number.substring(0, i) + number.substring(i+1);
            }
            i++;
        }
        i = number.length() - 1;
        while(i >= 0){
            if(number.charAt(i) == digit){
                return number.substring(0, i) + number.substring(i+1);
            }
            i--;
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String num=scn.next();
        char d=scn.next().charAt(0);

       System.out.println(removeDigit(num,d));

    }
    
}
