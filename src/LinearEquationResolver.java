import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a:");
        double a = scanner.nextDouble();
        System.out.println("input b:");
        double b = scanner.nextDouble();
        if (a==0){
            if (b==0){
                System.out.println("PT vo so nghiem");
            }else {
                System.out.println("PT vo nghiem");
            }
        }else {
            System.out.println("PT co nghiem : "+ -b/a);
        }
    }
}
