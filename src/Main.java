public class Main {
    public static void main(String[] args) {
        Complex a = Complex.getInstance(4, 2);
        Complex b = Complex.getInstance(5, -1);

        Complex sum = a.add(b);
        System.out.println(sum);
        Complex sub = a.subtract(b);
        System.out.println(sub);
        Complex milti = a.multiply(b);
        System.out.println(milti);
        Complex div = a.divide(b);
        System.out.println(div);
    }
}