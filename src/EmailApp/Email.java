package EmailApp;


import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapicity =500;
    private  int deafaultpasswordlength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

        // Constructor to recieve the first name and last name
     public Email(String firstName , String lastName){
         this.firstName =  firstName;
         this.lastName =    lastName;
      //   System.out.println("Email Created: " + this.firstName + "  "+this.lastName);

         // call a methodask for the department and return for the department
          this.department = SetDepartment();
         // System.out.println("Department:" +this.department);

         // call a method that return a random password
           this.password = randomPassword(deafaultpasswordlength);
         //  System.out.println("your password is -:"+this.password);

         // combine to genrate email
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+department+"."+companySuffix;
          //  System.out.println("your email is :" +email);


     }
         // ask for the department
     private String SetDepartment() {
         System.out.println("New worker:"+ firstName +" Department codes :\n1 for sales\n2 for accounting\n3 for accounting\n0 for none\nEnter department codes");
         Scanner in = new Scanner(System.in);
         int depChoice =in.nextInt();
         if(depChoice ==1 ) {
             return "sales";
         }
         else if(depChoice == 2){
             return "dev";
         }
         else if(depChoice == 3){
             return "acct";
         }
         else {
             return " ";
         }
     }

       // Genrate a random password
     private String randomPassword(int length){
         String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
          char[] password = new char[length];
          for(int i=0;i<length; i++){
           int rand = (int)(Math.random() * passwordSet.length());
            password[i] =passwordSet.charAt(rand);
          }
          return new String(password);
     }

       // Set the mailbox capicity
    public void  setMailboxCapicity(int capicity){
         this.mailboxCapicity = capicity;

    }
      // Set the alternative email
    public void setAlternateEmail(String altEmail){
         this.alternateEmail = altEmail;
    }
     // Change the password
    public void changePassword(String password){
         this.password = password;
    }
    public int getMailboxCapicity() {
         return mailboxCapicity;
     }
    public String getAlternateEmail(){
         return alternateEmail;
     }
    public  String getPassword(){
         return password;
    }
    public String showinfo(){
         return "DISPLAY NAME :" + firstName + " " + lastName + "\nCOMPANY EMAIL:"+ email +
                 "\nMAILBOX CAPICITY :"+mailboxCapicity + "mb";

     }
}
