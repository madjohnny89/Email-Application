

import javax.swing.*;

public class Email_Model {

    private String firstName;
    private String lastName;
    private String department;
    private String defaultEmailCapacity="500 Megabytes";
    private String password;
    private String email;
    private String companyPrefix;
    private String alternateEmail;


    public  Email_Model (String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
        this.department= setDepartment();
        this.password=randomPassGenerator(8);
        this.companyPrefix=setCompanyPrefix();
        this.email=setEmail();
        information();
    }


    private String setDepartment (){
       int code = Integer.parseInt(JOptionPane.showInputDialog("Enter The Department Code:\n" +
                "1:Sales\n" +
                "2:Development\n" +
                "3:Accounting\n" +
               "4:None"));

        if (code !=1 && code !=2 && code !=3 && code !=4) {
            JOptionPane.showMessageDialog(null, "Invalid Number.Enter a number between 1-4");
            setDepartment();
        }

        if (code==1){
            return "Sales";
        }
        else if (code==2){
            return "Development";
        }
        else if (code==3){
            return "Accounting";
        }
        else
            return "";
        }

    private String randomPassGenerator (int length){
        String passAll = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char [] password = new char[length];
        for (int i=0 ;i<length ; i++){
            int rand = (int) (Math.random()*passAll.length());
            password[i]= passAll.charAt(rand);

        }
        return new String(password);

    }
    private String setCompanyPrefix(){
        String co = JOptionPane.showInputDialog("Enter Your Company Name");
        return co;
    }

    private String setEmail (){
        return   firstName.replaceAll(" ","")+"."+lastName.replaceAll(" ","")+"@"+department+"."+companyPrefix.replaceAll(" ","")+".com";
    }
    public void information(){
        System.out.println("Hello "+firstName);
        System.out.println("Your Department is "+department);
        System.out.println("Your Email is "+email);
        System.out.println("Email Capacity "+defaultEmailCapacity);
        System.out.println("Password is "+password);
        System.out.println("Alternative Email Address is "+alternateEmail);
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setDefaultEmailCapacity(String emailCapacity){
        this.defaultEmailCapacity=emailCapacity;
    }
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }

    }





