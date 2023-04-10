
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        System.out.println("                           ");
        System.out.println("Even numbers");

        int sum1=0;
        int sum2=0;
        int sum3=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0)
                sum1 += i;
        }
        System.out.println("sum of even numbers from 0 to 100 using for loop : "+sum1);

        int  num=0;
        while (num<=100) {
            if (num % 2 ==0)
                sum2 += num;
            num++;
        }
        System.out.println("sum of even numbers from 0 to 100 using while loop : "+sum2);
        int num1=0;
        do{
            if (num1 % 2 ==0) {
                sum3 += num1;
            }
            num1++;
        } while (num1 <=100);
        System.out.println("sum of even numbers from 0 to 100 using ( do while loop) : "+sum3);





        System.out.println("                           ");
        System.out.println("odd numbers");
        int sum11=0;
        int sum22=0;
        int sum33=0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
                sum11+= i;
        }
        System.out.println("sum of odd numbers from 0 to 100 using for loop : "+sum11);

        int  numm=0;
        while (numm<=100) {
            if (numm % 2 != 0)
                sum22 += numm;
            numm++;
        }
        System.out.println("sum of odd numbers from 0 to 100 using while loop : "+sum22);

        int num11=0;
        do{
            if (num11 % 2 != 0) {
                sum33 += num11;
            }
            num11++;
        } while (num11 <=100);
        System.out.println("sum of even numbers from 0 to 100 using ( do while loop) : "+sum33);




        System.out.println("                           ");
        System.out.println("Divided by 7");
        int sum111=0;
        int sum222=0;
        int sum333=0;
        for (int i = 0; i <= 100; i++) {
            if (i  % 7 ==0)
                sum111 += i;
        }
        System.out.println("sum of Divided by 7 from 0 to 100 using for loop : "+sum111);

        int  num12=0;
        while (num12<=100) {
            if (num12  % 7 ==0)
                sum222 += num12;
            num12++;
        }
        System.out.println("sum of Divided by 7 from 0 to 100 using while loop : "+sum222);

        int num111=0;
        do{
            if (num111  % 7 ==0) {
                sum333 += num111;
            }
            num111++;
        } while (num111 <=100);
        System.out.println("sum of Divided by 7 from 0 to 100 using ( do while loop) : "+sum333);




    }
}