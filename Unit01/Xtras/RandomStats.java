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

        
        System.out.println("Minimum: " + Math.min(Math.min(Math.min(n1,n2),Math.min(n3,n4)),n5));

        System.out.println("Maximum: " + Math.max(Math.max(Math.max(n1,n2),Math.max(n3,n4)),n5));
    }
}
