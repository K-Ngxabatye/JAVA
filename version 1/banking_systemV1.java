
import java.util.Scanner;


public class banking_systemV1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //.......................................
        //User Info
        String password = "pass123";
        double balance = 150;
        String user_info = "Joe Doe";
        //.......................................
        //Logic Data
        int pass_tries = 3;
        boolean loggedIn = false;
     
        //:::::::::::::::::::::::::::::::::::::::
        //LOGIC
        
      
        while(pass_tries >0  && !loggedIn ){
              System.out.print("Please enter you password : ");
              String pass_w = input.nextLine();

            if (pass_w == password){
                System.out.println("Your balance is :" + balance);
                    System.out.println("Do you want to make a withdrawal y/n? : ");
                String withdraw = input.next();
        } if (pass_w != password){
              pass_tries = -1;  
              System.out.println("You entered the wwrong password, please try again :");
                              
        } if (pass_tries == 0){
            System.out.println("You ran out of tries, please try again later or contact uni bank at 00000");
        }if (pass_w == password){
            System.out.println("Welcome Mr " + user_info);
            System.out.println("Your balance is"+ balance);
            System.out.println("Do you want to withdraw Y/N?");
            String with_permission = input.next();
            if (with_permission.equalsIgnoreCase("Y")){
                System.out.println("How much? :");
                int with_amou = input.nextInt();
                double new_amou = balance - with_amou;
        
                
        System.out.println("You withdrawed :"+new_amou);
        
                
             
        
                        input.close(); 
        
        }
          
        
                              
            
  
            }
            
     
        }
          // this version has bugs like: when i enter the correct password, iot says it  is  wrong and cuts off, there is a problem with the logic, i also did not use the boolean          
        

        

    }
}

    
