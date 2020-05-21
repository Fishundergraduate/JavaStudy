import java.util.Scanner;

public class StringArray{
    public static void main(final String[] args) {

        String todaysWeather[];
        System.out.println("Type String");
        todaysWeather = new String[255];
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            String str1 = scan.next();
            scan.close();
            todaysWeather[i] = str1 +"wahhahha";
        }
        for (String string : todaysWeather) {
            System.out.println(string + "\n");
        }
    }
}