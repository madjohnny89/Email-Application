import javax.swing.*;

public class Activity_Main {

    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter The First Name");
        String lastName = JOptionPane.showInputDialog("Enter The Last Name");
        Email_Model model= new Email_Model(firstName,lastName);
        System.out.println();
        model.setAlternateEmail("Ariful15-10675@diu.edu.bd");
        model.setDefaultEmailCapacity("1 Gigabytes");
        model.setPassword("23672302");
        model.information();





    }

}
