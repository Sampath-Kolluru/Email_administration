import java.util.Random;
import java.util.Scanner;
//import javax.print.event.PrintJobListener;
//import javax.sound.sampled.SourceDataLine;

public class email{

private String Fname;
private String Lname;
private String dept;
private String pwd;
private String alternateEmail;
private int mailcap = 500;
private int defpwdlen = 10;
private String email;
 
// Constructor for 1st nd last name
public email(String Fname, String Lname){
    this.Fname = Fname;  
    this.Lname = Lname;
    // System.out.println("Email created for"  +""+ ""+ this.Fname + " " + this.Lname );
 
// showing dept
 this.dept = setdept();
//  System.out.println("Department:" +this.dept);
 
 // showing pwd
 this.pwd = generatepwd(defpwdlen);
//  System.out.println ("Your Password: "+this.pwd);

 // show email
 email = Fname.toLowerCase() + "." + Lname.toLowerCase() + "@" + dept + ".company.com";
//  System.out.println("Your Email:"+email);
}
 //set mailbox cap 

 public void setmailcap(int capacity){
  this.mailcap = capacity;
 }

 //alt email
 public void setaltemail(String altEmail) {
  this.alternateEmail = altEmail;
 }

 //chamge pwd
 public void changepwd(String pwd) {
  this.pwd = pwd;
 }

 public int getmailboxcap(){ return mailcap;}
 public String getaltmail(){return alternateEmail;}
 public String getpwdchange(){return pwd;}

 public String showInfo(){
  return "DISPLAY NAME: " + Fname + "" + Lname + 
         "\nCOMPANY EMAIL:" + email + 
         "\nYOUR PASSWORD :" + pwd +
         "\nMAILBOX CAPACITY :" + mailcap + "mb";
 }

 // asking for dept
  private String setdept(){
    System.out.println("Name:"+Fname+"\nDepartment Codes :\n1 Sales\n2 Development\n3 Accounting");
    System.out.print("Enter Department Code:");
    Scanner sc = new Scanner (System.in);
   int deptchoice = sc.nextInt();
    if(deptchoice==1){return "sales";}
    else if(deptchoice==2){return "dev";}
    else {return "acc";}
  
 } 

//generate random password
private String generatepwd(int lenght){
  String pwdset="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVW123456789@*^#$";
 char[] pwd = new char[lenght];
  for(int i=0;i<lenght;i++){
int rand = (int) (Math.random()* pwdset.length());
pwd[i] = pwdset.charAt(rand);
  }
  return new String(pwd);
}
}
