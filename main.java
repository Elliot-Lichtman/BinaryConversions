import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Binary binaryConverter = new Binary();

        Scanner kbd = new Scanner(System.in);
        System.out.println("Type B to convert to binary, T to convert to base 10.");
        String choice = kbd.next().toLowerCase();

        if (choice.equals("b")){
            System.out.println("Type the number in base 10 you want to convert:");
            Long num = kbd.nextLong();
            System.out.println("Here's your result:");
            System.out.println(binaryConverter.convertIntToStr(num));
        }

        else{
            System.out.println("Type the number in base 2 that you want to convert:");
            String str = kbd.next();
            System.out.println("Here's your result:");
            System.out.println(binaryConverter.convertStrToInt(str));
        }

    }

}
