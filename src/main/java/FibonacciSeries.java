public class FibonacciSeries {

    public void fib(int n1,int n2,int count){
        System.out.print(n1 +" "+n2 +" ");
         int n3 = n1 + n2;
         for(int i = 3;i <= count;i++){
             n3 = n1 +n2;
             System.out.print(n3);
             n1 = n2;
             n2 = n3;
             System.out.print(" ");
         }
        System.out.println("");
    }

}
