/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author User
 */
public class ATM {
private String accno;
private String name;
private String acc_type;
private long balance;
private String dateOpenAcc;
Scanner scan = new Scanner(System.in);

public void openAccount(){
    System.out.println("Enter Account No: ");
    accno = scan.next();
    System.out.println("Enter Account type: ");
    acc_type = scan.next();
    System.out.println("Enter you Name: ");
    name = scan.next();
    System.out.println("Enter Balance: ");
    balance = scan.nextLong();
        LocalDate d1 = LocalDate.now();  
        dateOpenAcc = d1.format(DateTimeFormatter.ISO_DATE);  
        
}
public void showAccount(){
    System.out.println("Name of account holder: "+ name);
    System.out.println("Account no. : "+accno);
    System.out.println("Account type: "+acc_type);
    System.out.println("Balance: "+balance);
    System.out.println("Date of Create: "+dateOpenAcc);
                
}
public void desposit(){
    long amt;
    System.out.println("Enter the amount you want to deposit:");
    amt = scan.nextLong();
    balance = balance + amt;
}
public void withdraw(){
    long amt;
    System.out.println("Enter the amount you want to withdraw: ");
amt = scan.nextLong();
if(balance >=amt){
    balance = balance - amt;
    System.out.println("Balance after withdrawal: " + balance);  
}else{
    System.out.println("Your balance is less than "+amt+"\tTransaction failed!");    
}}
public boolean search(String ac_no){
    if(accno.equals(ac_no)){
        showAccount();
        return (true);
    }
    return (false);
}

}
