 
package bankapp;

import java.util.Scanner;

//ronewadev
public class BankApp {

   static Scanner j = new Scanner(System.in);
    
public static void mainSwitch(){ 
        
      greetMenu();
    
       int x = j.nextInt();
        
        switch(x){
            
            case 1:
                card();
              break;
                
            case 2:
                cardless();
              break;
             
            case 3:
                cashIn();
              break;
              
            case 4:
                state();
              break;
              
              
        }
        
}    
            static void greetMenu(){
        
         Scanner j = new Scanner(System.in);
    
        String greet = "Welcome CashOn User :].";
        System.out.println(greet);
        
        
        
        System.out.println("Please select transaction you are to do.");
        System.out.println("1.Card Transactions");
        System.out.println("2.Cardless Banking");
        System.out.println("3.Cash Deposite");
        System.out.println("4.Print Statement");
        
        
    }
    public static void balances(){
      
          
          System.out.println("Welcome to Savings account.");
           System.out.println("Balance: R5434.87");
            System.out.println("*               *");
             System.out.println("*               *");
              System.out.println("*               *");
                System.out.println("Please enter the amount you want to Withdtraw");
                double b = j.nextDouble();
                   double bal = 5434.87;
                       double   remain = bal-b;
                       
                      
                      
                      if(b>bal){
                      
                      System.out.println("The amount can not exceed the balance. ");
                      
                      } else if(b<=bal && b>=0){
                      
                      System.out.println("Your remaining balance: " +remain);
                      
                       System.out.println("*             *");
                         System.out.println("**#Thank you#**");       
                      }   
        
    }
    
    public static void mainPin(){
        
    
        System.out.println("May You Please Enter Your PIN");
        
        int x = 0;
        x = j.nextInt();
        for(x=0; x>4 && x<=4; x++){
        
         System.out.println("Thank You");
        
        
        
        }
        
        
    }
    
    
    public static void card(){
     
        System.out.println("Are you using our banks card?");
      
        
        String decision = new String();
        decision = j.next();
       int n =  decision.length();
       
        if( n == 3){
            
                 System.out.println("Thank You. Please select the account");
                  System.out.print("1.Savings");
                   System.out.println("        2.Cheque");
                    System.out.print("3.Credit Card");
                     System.out.println("    4.E-money");
 
                     int v = j.nextInt();
                     
                     switch(v){
                         
                         case 1:
                              balances();
                           break;
                         
                        case 2:
                            
                            System.out.println("");
                            
                            
                           break;
                           
                        case 3:
                             
                           break;
                           
                        case 4:
                             
                           break;
                         
                         
                         
                     }
                     
                
             
             
        } else if (n == 2){
            
           System.out.println("Additional charges may apply.");
           System.out.println("Do you want to proceed?");
               
           
              String z;
              z = j.next();
              int r = z.length();
              
              if(r==3){
           System.out.println("Thank You. Please select the account");
                 System.out.print("1.Savings");
                 System.out.println("      2.Cheque");
                 System.out.print("3.Credit Card");
                 System.out.println("    4.E-money");
              
            balances();
                  
        }else{
            System.out.println("..wrong input..");
            System.out.println("*             *");
            System.out.println("*             *");
            System.out.println("*             *");
            System.out.println("**#Thank you#**");
         }
        }else if(n==2){
                      System.out.println("Welcome to Cheque");
                      System.out.println("Account balance: R00.00");
                      }
    
    }
    
      static void pinn(){
       
         
          int pin = j.nextInt();
          
             for(pin=0; pin>4 && pin<4 ;pin++){
             System.out.println("You may collect your cash");
             System.out.println("*                       *");
             System.out.println("*                       *");
             System.out.println("*                       *");
             System.out.println("********Thank you********");
             }
             
      
      }
      
    public static void cardless(){
         
         System.out.println("Please enter the 10 digits");
          
         int n = 0;
          
         if( n==10){
             System.out.println("please enter 4 secret pin");
                
             pinn();
         }else{
             System.out.println("digits insufficient");
             System.out.println("*                 *");
             System.out.println("*                 *");
             System.out.println("*                 *");
             System.out.println("*****Thank you*****");
         }
             
             
    }
    
    public static void cashIn(){
    
        
         
    }
      
    public static void state(){
    
        
        
    }
      
            
    public static void main(String[] args) {
       
         mainPin();
         mainSwitch();
        
        
        
    }
    
}
