public class PrimeNumber {
    public static void main(String[] args) {
        int number=12;
        int count=0;

        if(number>1){
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(number+" It is a primme Number");
            }
            else{
                System.err.println(number+" Not a prime Number");
            }

        }else{
    System.err.println(number+" It is not a prime number");
}
    }
}
