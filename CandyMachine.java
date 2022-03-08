import java.util.Scanner;
    class CandyMachine{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        // Display the menu
        System.out.println("1\t MAX");
        System.out.println("2\t SNOWBEAR");
        System.out.println("3\t X.O.");
        System.out.println("4\t MENTOS");
    
    System.out.println("-------------------------- "); 
        
        System.out.println("Please enter the number of your choice:");
           System.out.println("-------------------------- "); 
   
        int choice=sc.nextInt();
          System.out.println("-------------------------- ");
        switch (choice) {
              
            case 1: System.out.println("MAX cost 10php"); 
	   break;
            case 2: System.out.println("SNOWBEAR cost 15php");
                    break;
            case 3: System.out.println("X.O. cost 20php"); 
                    break;
            case 4: System.out.println("MENTOS cost 30php"); 
                     break;
            default: System.out.println("Invalid choice");
        System.out.println("-------------------------- "); 
      }
       System.out.println("-------------------------- "); 
        System.out.println("Please enter the amount your money "); 
         System.out.println("-------------------------- ");
       Scanner k = new Scanner(System.in);
       
          int Purchase=k.nextInt();
          System.out.println("-------------------------- ");
        

        if (choice == 1){
                int  total = Purchase - 10;
                if(total <= -1)
                {
                  System.out.println("invalid amount: ");
                } else{
                  System.out.println("Change: "+ total);
                  System.out.println("You can now collect the items below.");
                  System.out.println("************************");
                  System.out.println("Thank you for purchasing");
                  System.out.println("************************");
                }
                
          }
          if (choice == 2){
                int  total = Purchase - 15;
                if(total <= -1)
                {
                  System.out.println("invalid amount: ");
                } else{
                  System.out.println("Change: "+ total);
                  System.out.println("You can now collect the items below.");
                  System.out.println("************************");
                  System.out.println("Thank you for purchasing");
                  System.out.println("************************");
                }
                
          }
          if (choice == 3){
                int  total = Purchase - 20;
                if(total <= -1)
                {
                  System.out.println("invalid amount: ");
                } else{
                  System.out.println("Change: "+ total);
                  System.out.println("You can now collect the items below.");
                  System.out.println("************************");
                  System.out.println("Thank you for purchasing");
                  System.out.println("************************");
                }
                
          }
          if (choice == 4){
                int  total = Purchase - 30;
                if(total <= -1)
                {
                  System.out.println("invalid amount: ");
                } else{
                  System.out.println("Change: "+ total);
                  System.out.println("You can now collect the items below.");
                  System.out.println("************************");
                  System.out.println("Thank you for purchasing");
                  System.out.println("************************");
                }
                
          }
        



}
}