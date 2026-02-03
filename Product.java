public class Product {
    public static int multiply(int a, int b) {
        int product  = a  * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int product = multiply(a,b);
        System.out.println("Product is : " + product);
    }
    
}
