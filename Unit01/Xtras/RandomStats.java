package Unit01.Xtras;

public class RandomStats {
    public static void main(String[] args) {
        double n1 = Math.random();
        System.out.println(n1);
        double n2 = Math.random();
        System.out.println(n2);
        double n3 = Math.random();
        System.out.println(n3);
        double n4 = Math.random();
        System.out.println(n4);
        double n5 = Math.random();
        System.out.println(n5);

        System.out.println("Average: " + (n1+n2+n3+n4+n5)/5);

        double g1 = Math.min(n1, n2);
        double g2 = Math.min(n3, n4);
        double g3 = Math.min(g1, g2);
        System.out.println("Minimum: " + Math.min(g3,n5));

        g1 = Math.max(n1, n2);
        g2 = Math.max(n3, n4);
        g3 = Math.max(g1, g2);
        System.out.println("Maximum: " + Math.max(g3,n5));
    }
}
