public class Sum{
    public static void main(String[] args) {
        int sum=0;
        for(int i=2;i<=200;i+=2){
            sum=sum+i;
        }

        System.out.println("Sum of first 100 even numbers is: "+sum);
    }
}