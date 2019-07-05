import java.util.Scanner;

public class ReadingInt {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
int sum=0;

int counter=0;
        while (counter<10){

                String string="Enter the number "+(counter+1)+":";
            System.out.println(string);
            boolean hasNextInt= reader.hasNextInt();
            if(hasNextInt) {
                int number = reader.nextInt();
                    counter++;
                    sum+=number;

                    System.out.println(string+number);


            }else{
                System.out.println("Invalid Value");
            }
            System.out.println("sum = "+sum);
            reader.nextLine();

        }




    }
}
