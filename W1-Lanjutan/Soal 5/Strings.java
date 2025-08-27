import java.util.Scanner;

public class Strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String kata1 = sc.nextLine();
        String kata2 = sc.nextLine();

        System.out.println(kata1.length() + kata2.length());
        System.out.println(kata1.compareTo(kata2) > 0 ? "Yes" : "No");
        kata1 = kata1.substring(0,1).toUpperCase() + kata1.substring(1);
        kata2 = kata2.substring(0,1).toUpperCase() + kata2.substring(1);
        System.out.println(kata1 +" " +kata2);
        
    }
}