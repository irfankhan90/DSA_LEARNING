public class PowerofXN {
    public static int Power(int x, int n) {
        int result = 1;
        for(int i=1; i<=n; i++) {
            result = result * x;
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Power(x, n));
    }
    
}
