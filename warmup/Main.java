package warmup;

public class Main {

    public static void main(String[] args) {
        int a=0;
        int sum=0;
        while(a<1000)
        {
        if(a%3==0|| a%5==0)
        {
          sum+=a;
       }
          a++;
        }
                    
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: " + sum);

    }
}
