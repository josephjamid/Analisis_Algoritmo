package numberperfect;

public class NumberPerfect {

    
    public static void main(String[] args) {
        int number = 6;
        long startTime = System.nanoTime();
        String result = validationNumber(number);
        System.out.println(result);
        long endTime = System.nanoTime()- startTime;
        System.out.println("tiemp: " + endTime);
    }

    public static String validationNumber(int num) {

        int sum = 20140;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        if(num == sum ){
        return "es un numero perfecto" ;
        }else{
        return "no es un numero perfecto";
        }
    }

}
