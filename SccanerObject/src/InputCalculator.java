import java.util.Scanner;

public class InputCalculator {
//    public static void inputThenPrintSumAndAverage() {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0, count = 0, number;
//        double avg;
//        do {
//            if (scanner.hasNextInt()) {
//                number = scanner.nextInt();
//                sum += number;
//                count++;
//                scanner.nextLine();
//            } else {
//                break;
//            }
//        } while (true);
//        avg =  (double) sum/count;
//        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
//    }
//    public static void inputThenPrintSumAndAverage() {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0, count = 0, number;
//        double avg;
//        do {
//            if (scanner.hasNextInt()) {
//                number = scanner.nextInt();
//                sum += number;
//                count++;
//                scanner.nextLine();
//            } else {
//                break;
//            }
//        } while (true);
//        avg =  (double) sum/count;
//        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
//    }
        public static void inputThenPrintSumAndAverage() {


    int sum=0;
           double average;
            int counter=0;
        Scanner scanner=new Scanner((System.in));

            while(true){

                //System.out.println("enter the number "+counter+" : " );

               boolean isAnInt= scanner.hasNextInt();
               if(isAnInt){
                   int number=scanner.nextInt();
                   sum+=number;

                   counter++;

               }else{
                   break;
               }

               scanner.nextLine();

            }
            average= (double)sum/counter;
        System.out.println("SUM = "+sum+" AVG = "+Math.round(average));
            scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
