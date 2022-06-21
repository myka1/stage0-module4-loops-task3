package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int divisor = 1;
        int greater;

        if(first >= second){
            greater = first;
        } else {
            greater = second;
        }

        for(int i = 1; i <= greater; i++) {
            if(first % i == 0 && second % i == 0) {
                divisor = i;
            }
        }
        System.out.println(divisor);
    }
}
