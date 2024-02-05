package Unit03.Xtras;
import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input A: ");
        Double a = s.nextDouble();

        System.out.println("Input B: ");
        Double b = s.nextDouble();

        System.out.println("Input C: ");
        Double c = s.nextDouble();

        s.close();

        Double sol1 = new Double(((b*-1) / (2 * a)) + (Math.sqrt((Math.pow(b,2) - (4*a*c))) / (2*a)));
        Double sol2 = new Double(((b*-1) / (2 * a)) - (Math.sqrt((Math.pow(b,2) - (4*a*c))) / (2*a)));
        if (sol1.isNaN() || sol2.isNaN()) {
            System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + " = 0 has no real solutions");
        }
        else {
            System.out.println("The solutions to " + a + "x^2 + " + b + "x + " + c + " = 0 are x = " + sol1 + " and x = " + sol2);
        }
        


    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver