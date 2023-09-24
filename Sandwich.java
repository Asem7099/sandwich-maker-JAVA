package sandwichmakerproject;
import java.util.Date;
import java.util.Scanner;
public class Sandwich 
{
    //Sandwich's prices
    double one=6;//price of sandwich 1 and 5
    double two=5;//price of sandwich 2
    double three=10;//price of sandwich 3
    double four=8;//price of sandwich 4
    String Add;//to write the ingrediense
    //discount
    double a=0.1;//10% 
    double b=0.15;//15% 
    double c=0.2;//20%
    double d=0.25;//25%
     
    Scanner scan=new Scanner(System.in);
    public void Enter() {
        String q;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@ _______________________________________________________________________________________ @@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                  WELCOME TO                                           |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                              Sandwich Maker Shop                                      |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|   Enter any key to continue...                                                        |@@");
        System.out.println("@@|_______________________________________________________________________________________|@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        q = scan.nextLine();
 }
        public void List ()
 { 
   int r = 0;//the type of sandwich
   int m=0;//the number of sandwichs
   double price=0;
   System.out.println(" ________________________________________________________________");
   System.out.println("|                                           	                 |");
   System.out.println("| 1  >> Cheese burger(Beef)(100 grams)                           |");
   System.out.println("|       Price(6$)   Calories(303)                                |");
   System.out.println("|                                                                |");
   System.out.println("| 2  >> Cheese burger(Chicken)(100 grams)                        |");
   System.out.println("|       Price(5$)   Calories(283)                                |");
   System.out.println("|                                                                |");
   System.out.println("| 3  >> Double Cheese burger(Beef)(200 grams)                    |");
   System.out.println("|       Price(10$)   Calories(616)                               |");
   System.out.println("|                                                                |");
   System.out.println("| 4  >> Double Cheese burger(Chicken)(200 grams)                 |");
   System.out.println("|       Price(8$)   Calories(576)                                |");
   System.out.println("|                                                                |");
   System.out.println("| 5  >> Hot dog sandwich(100 grams)                              |");
   System.out.println("|       Price(6$)   Calories(290)                                |");
   System.out.println("|________________________________________________________________|");
   r=scan.nextInt();
   int x;
   int y = 0;
   double z=0;//the price of ingrediense
if(r==1||r==2||r==3||r==4||r==5){   
 Ingrediense();
   y=scan.nextInt();
   if(y==1){Add="Extra cheese";z+=1.0;}
   else if(y==2){Add="French frise";z+=2.0;}
   else if(y==3){Add="Ketchup";z+=0.5;}
   else if(y==4){Add="Mayonnaise";z+=0.5;}
   else if(y==5){Add="Mustard";z+=0.5;}
   System.out.println("For more ingrediense Enter 1 or 0,to continue Enter other number");
   x=scan.nextInt();  
 for(int i=x;i<2;)
 {  
   System.out.println("________________________________________________________________");
   Ingrediense();
   y=scan.nextInt();
   if(y==1){Add+="+Extra cheese";z+=1;}
   else if(y==2){Add+="+French frise";z+=2;}
   else if(y==3){Add+="+Ketchup";z+=0.5;}
   else if(y==4){Add+="+Mayonnaise";z+=0.5;}
   else if(y==5){Add+="+Mustard";z+=0.5;}
   System.out.println("For more ingrediense Enter 1 or 0,to continue Enter other number");
      x=scan.nextInt();
       i=x;
 }
        if(r==1)
   {
     System.out.println("________________________________________________________________");
     System.out.println("Quantity: ");
     m=scan.nextInt();
     if(m==1){price=one+z;}
     else if(m==2){price=2*(one+z)-((a)*(2*(one+z)));}
     else if(m==3){price=(3*(one+z))-((b)*(3*(one+z)));}
     else if (m==4){price=(4*(one+z))-((c)*(4*(one+z)));}
     else {{price=(m*(one+z))-((d)*(m*(one+z)));}}       
     System.out.println("Your order is :"+m +" Cheese burger(Beef) with "+Add);
     System.out.println("The total price is :"+price);
   }
   else if(r==2)
   {
     System.out.println("________________________________________________________________");
     System.out.println("Quantity: ");
     m=scan.nextInt();
     if(m==1){price=two+z;}
     else if(m==2){price=2*(two+z)-((a)*(2*(two+z)));}
     else if(m==3){price=(3*(two+z))-((b)*(3*(two+z)));}
     else if(m==4){price=(4*(two+z))-((c)*(4*(two+z)));}
     else{{price=(m*(two+z))-((d)*(m*(two+z)));}}
     System.out.println("Your order is :"+m +" Cheese burger(Chicken) with "+Add);
     System.out.println("The total price is :"+price);
   }
   else if (r==3)
   {
     System.out.println("________________________________________________________________");
     System.out.println("Quantity: ");
     m=scan.nextInt();
     if(m==1){price=three+z;}
     else if(m==2){price=2*(three+z)-((a)*(2*(three+z)));}
     else if(m==3){price=(3*(three+z))-((b)*(3*(three+z)));}
     else if (m==4){price=(4*(three+z))-((c)*(4*(three+z)));}
     else {{price=(m*(three+z))-((d)*(m*(three+z)));}}
     System.out.println("Your order is :"+m +" Double Cheese burger(Beef) with "+Add);
     System.out.println("The total price is :"+price);
   }
   else if(r==4)
   {
     System.out.println("________________________________________________________________");
     System.out.println("Quantity: ");
     m=scan.nextInt();
     if(m==1){price=four+z;}
     else if(m==2){price=2*(four+z)-((a)*(2*(four+z)));}
     else if(m==3){price=3*(four+z)-((b)*(3*(four+z)));}
     else if(m==4){price=4*(four+z)-((c)*(4*(four+z)));}
     else {{price=(m*(four+z))-((d)*(m*(four+z)));}}  
     System.out.println("Your order is :"+m +" Double Cheese burger(Chicken) wiht "+Add);
     System.out.println("The total price is :"+price);
   }
   else if(r==5)
   {
     System.out.println("________________________________________________________________");
     System.out.println("Quantity: ");
     m=scan.nextInt();
     if(m==1){price=one+z;}
     else if(m==2){price=2*(one+z)-((a)*(2*(one+z)));}
     else if(m==3){price=3*(one+z)-((b)*(3*(one+z)));}
     else if(m==4){price=4*(one+z)-((c)*(4*(one+z)));}
     else {{price=(m*(one+z))-((d)*(m*(one+z)));}}  
     System.out.println("Your order is :"+m +" Hot dog sandwich wiht "+Add);
     System.out.println("The total price :"+price);
    }
  
else System.out.println("Invalid choise");
   }
else System.out.println("Invalid choise");
  }

public void Ingrediense()
 {
   System.out.println(" ________________________________________________________________");
   System.out.println("|                                           	                 |");
   System.out.println("| 1  >> Extra cheese                                             |");
   System.out.println("|       Price(1$)                                                |");
   System.out.println("|                                                                |");
   System.out.println("| 2  >> French frise                                             |");
   System.out.println("|       Price(2$)                                                |");
   System.out.println("|                                                                |");
   System.out.println("| 3  >> Ketchup                                                  |");
   System.out.println("|       Price(0.5$)                                              |");
   System.out.println("|                                                                |");
   System.out.println("| 4  >> Mayonnaise                                               |");
   System.out.println("|       Price(0.5$)                                              |");
   System.out.println("|                                                                |");
   System.out.println("| 5  >> Mustard                                                  |");
   System.out.println("|       Price(0.5$)                                              |");
   System.out.println("|________________________________________________________________|");
 }
 public void Time()
    {
        Date time = new Date();
        System.out.println(time);
    }
}
