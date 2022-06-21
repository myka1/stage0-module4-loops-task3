package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;

        if(lastFibonacci > 0){
            System.out.println(first);
            for(int i = 2; i <= lastFibonacci; i++){
                System.out.println(second);
                int temp = second;
                second = first + second;
                first = temp;
            }
        }
    }
}
