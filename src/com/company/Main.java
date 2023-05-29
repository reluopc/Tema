package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



                      ///////////////// Tema  PPT  ///////////////////


        //PPT.Page 51
        // Exemplul 1.

        // Exemplu 1.

//        Integer [] array={2,4,6,8};
//        boolean b= Arrays.asList(array).contains(3);
//        System.out.println(b);


        // Exemplul 2.

//        String[ ] array = {"a","b","c","d"};
//        boolean b = Arrays.asList(array).contains("d");
//        System.out.println(b);



                            // Exercitii

        //1.
        // Maxim se va afisa 17
//        int[] sir={1, 5, 2, 8, 9, 14, 3, 4, 17, 10, 11};
//        int maxim =0;
//        int sir2=17;
//
//
//
//
//
//        for(int i=0; i<sir.length; i=i+1);
//
//        if(sir[0]>maxim);
//        System.out.println(" Maximul este "+ sir2);




            //2
//        // Verificam dacă un numar se afla în intervalul [5,10].
//
//        int nr1=4;
//        if(nr1>=5 && nr1<=10){
//            System.out.println("Numarul"+nr1+"se afla in intervalul[5,10]");
//        }else{
//            System.out.println("Numarul "+ nr1 +" Nu se afla in intervalul [5,10]");
//        }





            //3
//       Verificam daca un numar este par sau impar
//
//
//        int a1=2;
//        int a2=3;
//
//        if (a1>3) {
//            System.out.println(a1 + " este numar par");
//        } else {
//            System.out.println(a2 + " este numar impar");
//        }




        //4.
        //Afiseaza fiecare litera a unui string pe rand nou utilizand structura repetitiva while

//        int i = 1;
//        while (i < 2) {
//            System.out.println("A");
//            System.out.println("B");
//            System.out.println("C");
//            System.out.println("D");
//            System.out.println("E");
//            System.out.println("F");
//
//            i++;






        //5. Page power Point 58.
        // Daca se da sirul

//        int[] sir = {1, 2, 3, 4, 5};
//        for (int i = 0; i < sir.length; i++) {
//            System.out.print(sir[i]+" ");

        // .............. Trebuie rezolvat....................






        // Exercitiul 1   Page 59
        //Se da String-ul „Maria merge cu bicicleta”. Sa se afiseze caracterul de pe pozitia 7.

//        String maria = "Maria merge cu bicicleta";
//        System.out.println(maria.charAt(6));




        //Exercitiul 2  Page 59
        //Se da String-ul „Azi este o zi minunata”. Sa se inlocuiasca toate aparitiile caracterului „z” cu „t”.
//        String Az = "Azi este o zi minunata";
//        System.out.println(Az.replace("z","t"));



        //Exercitiul 3. Page 59
        //3. Se da String-ul „Mere”. Sa se inlocuiasca prima aparitie a caracterului „e” cu „a”.
//        String Az2= "Mere";
//        System.out.println("Mere".replaceFirst("e", "a"));



        //Exercitiul 4. Page 59
        //Se da String-ul „236524”. Sa se afiseze substring-ul „65”.

//        String az3 = "236524";
//        String substring = az3.substring(2, 4);
//        System.out.println(substring);


        //Exercitiul 5. Page 60
        //Sa se afiseze sirul 100, 98, 96 , … , 2, 0.






        //Exercitiul 6. Page 60
        //Sa se declare tabloul de String-uri {„mere” , „pere” , „visine” , „portocale”}
        // Sa se afiseze elementele tabloului cu spatii intre ele.

//        String[]fructe={"mere","pere","visine","portocale"};
//        for(int fru=0; fru<fructe.length; fru++){
//            System.out.print(fructe[fru]+ " ");
//        }




        //Exercitiul 7. Page 60
        //Sa se afiseze toate numerele pare de la 1 pana la 100 cu virgula intre ele

//        StringBuilder a1 = new StringBuilder();
//        StringBuilder a2= new StringBuilder();
//
//        for(int i=2; i<=100; i+=2) {
//            a1.append(i).append(" ,");
//            System.out.println();
//            a2.append(i).append("  ");
//        }
//        a1.deleteCharAt(a1.length()-1);
//
//        //Afiseaza numerele pare de la 2-100
//        System.out.println(a1.toString());
//
//        //in rand se afiseaza numarul acestora
//        System.out.println(a2.toString());




        //Exercitiul 8. Page 60
        //Se da un numar N. Determinati si afisati valoarea sumei S=1+2+3+…+N


//        Scanner scanner =new Scanner(System.in);
//        System.out.print(" Numarul este 5: ");
//        int N =scanner.nextInt();
//
//        int suma=0;
//        for (int i=1; i<=N; i++){
//            suma+=1;
//        }
//        System.out.println();







        /////////////////    Tema w3resource /////////////////////////////


        //Syntax

        //public class MyClass {
        //  public static void main(String[] args)


            //Exercise

            //Variables

            //1.
            //Create a variable named carName and assign the value Dacia to it.
            //String carName="Dacia";


            //2
            //Create a variable named maxSpeed and assign the value 180 to it.
            // String maxSpeed ="180";


            //3
            //Display the sum of 8 + 10, using two variables: x and y.
            //int x = 8;
            //int y= 10;
            //System.out.println(8+10);


            //4
            //Create a variable called z, assign x + y to it, and display the result.
            //int x =1;
            //int y = 4;
            //int z = 1+4;
            //System.out.println(1+4);


            //5
            //Fill in the missing parts to create three variables of the same type, using a comma-separated list:

            //int x = 6;
            //int y = 2;
            //int z=10;
            //System.out.println(x + y + z);


            //Data Types


            //1
            //Add the correct data type for the following variables:
            //int myNumber=9;
            //double myFloat = 8.99;
            //String  myLetter = "A";
            //boolean myBool = false;
            //String myText = " Hello, im Pro in Java ";


            //2
            //byte, short, int, long, float, double, boolean and char are called:

            // ....  data types.


            //3
            //Type casting - convert the following double type (myDouble) to an int type:
            //double myDouble =4.78d;
            //int myInt =(int) myDouble;


            //System.out.printf("%arg", numer );
//
//             System.out.printf("%o",83);
//             System.out.println();
//             System.out.printf("%02d",8);
//
//             System.out.println();
//             System.out.printf("%02d",857);
//









                ///////////////////Tema -w3resource.com //////////////////


            //1.

            //Write a Java program to print 'Hello, this message is made for homework ' on screen and your name on a separate line.
           // Expected Output :
           // Hello
           // This message is made for
//        System.out.println("Hello");
//        System.out.println("This message is made for homework");




         //2.
        //Write a Java program to print the sum of two numbers.
        //Test Data: 80+20
        //Expected Output : 100

        //System.out.println(80+20);


        //3.

        //Write a Java program to divide two numbers and print them on the screen.
        //Test Data :50/8
        //Expected Output : 6

        //System.out.println(50/8);



        //4.
        //Write a Java program to print the results of the following operations.
//        Test Data:
//        a. -5 + 8 * 6
//        b. (55+9) % 9
//        c. 20 + -3*5 / 8
//        d. 5 + 15 / 3 * 2 - 8 % 3
//        Expected Output :
//        43
//        1
//        19
//        13

//        System.out.println(-5+8*6);
//        System.out.println((55+9)%9);
//        System.out.println(20+-3*5/8);
//        System.out.println(5+15/3*2-8%3);




        //5.
        // Write a Java program that takes two numbers as input and displays the product of two numbers.
        //Test Data:
        //Input first number: 25
        //Input second number: 5
        //Expected Output :
        //25 x 5 = 125

//        int a=25;
//        int b=5;
//        System.out.println(a*b);




        //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        // Test Data:
        //Input first number: 125
        //Input second number: 24
        //Expected Output :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5

//        int a=125;
//        int b=24;
//        int addition=125+24;
//        int multiply=3000;
//        int subtract=125-24;
//        int divide =125/24;
//        int mod=125%24;

//
//        System.out.println(addition);
//        System.out.println(multiply);
//        System.out.println(subtract);
//        System.out.println(divide);
//        System.out.println(mod);



        //7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        //Test Data:
        //Input a number: 8
        //Expected Output :
        //8 x 1 = 8
        //8 x 2 = 16
        //8 x 3 = 24
        //8 x 10 = 80

//        int number=8;
//
//        for (int i = 1; i <= 10; i++) {
//            int result = number * i;
//            System.out.println(number + " x " + i + " = " + result);
//        }




        //8
        //Write a Java program to display the following pattern.
        //    Sample Pattern :

        //J    a   v     v  a
        //J   a a   v   v  a a
        //J  J  aaaaa   V V  aaaaa
        //JJ  a     a   V  a     a


//        System.out.println("J    a   v     v  a");
//        System.out.println("J   a a   v   v  a a");
//        System.out.println("J  J  aaaaa   V V  aaaaa");
//        System.out.println("JJ  a     a   V  a     a");


        // 9. Write a Java program to compute the specified expressions and print the output.
        //       Test Data:
        //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        //Expected Output
        //2.138888888888889

//        double number1 =25.5*3.5-3.5*3.5;
//        double number2= 40.5-4.5;
//        System.out.println(number1/number2);





        //10
        //Write a Java program to compute a specified formula.
        //      Specified Formula :
        //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        //Expected Output
        //2.9760461760461765

//        double a=4.0;
//        double a1= (1-(1.0/3));
//        double a2= (1.0/5);
//        double a3= (1.0/7);
//        double a4= (1.0/9);
//        double a5= (1.0/11);
//
//        System.out.println(a*(a1+a2-a3+a4-a5));





        //11
        //Write a Java program to print the area and perimeter of a circle.
          //      Test Data:
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586

//
//        double radius=7.5;
//        double perimeter = 2 * Math.PI * radius;
//        double area = Math.PI * radius * radius;
//
//        System.out.println("Perimeter is = " + perimeter);
//        System.out.println("Area is = " + area);


        //12.
        // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.\

//        int number =10;
//        int number2=20;
//        int number3=4;
//        double average= (number+number2+number3)/3;
//        System.out.println(number+number2+number3+average);





        //13. Write a Java program to print the area and perimeter of a rectangle.
        //Test Data:
        //Width = 5.5 Height = 8.5
        //Expected Output
        //Area is 5.6 * 8.5 = 47.60
        //Perimeter is 2 * (5.6 + 8.5) = 28.20










       //14
        //Write a Java program to print an American flag on the screen.
        //Expected Output

//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================


//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");




        //15


























































































    }
}