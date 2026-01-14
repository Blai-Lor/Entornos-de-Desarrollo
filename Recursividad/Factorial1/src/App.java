public class App {
    public static int factorial(int n){
        if (n/10==0){
            return 1;
        }
        return factorial (n/10)+1;
    }
    
    public static void main(String[] args){
        System.out.println(factorial(321));
    }
}
