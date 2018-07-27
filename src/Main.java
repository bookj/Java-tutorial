import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // method
        System.out.println(3 * 5);
        System.out.println("area = " + 3 * 5);

        int width;  // -2^31 to 2^31-1
        int height;
        int area;

//        width = 3;
//        height = 5;
//        area = width * height;

//        System.out.println("area = " + area);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = in.nextInt();
//        System.out.println("Print width = " + width);
        System.out.print("Enter height: ");
        height = in.nextInt();
        area = width * height;
        System.out.println("area (" + width + " x " + height + ") = " + area);
    }
}
