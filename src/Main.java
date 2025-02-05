import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double ftemp = getUserinfo();

        while(ftemp>=-460) {

            double new_temp = convert(ftemp);
            printedtemp(new_temp);
             ftemp = getUserinfo();

        }


    }

    static double getUserinfo(){
        System.out.println("What's the temp in farenheit");
        double temp = input.nextDouble();
        input.nextLine();

        return temp;

    }

    static double convert(double ftemp){
        double newtemp = (ftemp-32)*(.555555555555);
        return newtemp;

    }

    static double printedtemp (double new_temp){
        System.out.println("Your new temp is "+ Math.floor(new_temp*100)/100);

        return new_temp;
    }



}