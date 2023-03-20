import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Classes.BillManagementSystem;
import Classes.Meter;
import Classes.Nesco;
import Classes.User;
import FileIO.FileReadWrite;

public class Start {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BillManagementSystem managementSystem = new BillManagementSystem();
        boolean repeat = true;
        while(repeat) {
            System.out.println("\n------------------------------------------");
            System.out.println("ELECTRICITY BILL MANAGEMENT SYSTEM");
            System.out.println("------------------------------------------");
            System.out.println("Choose one from below :");
            System.out.println("1. User Management");
            System.out.println("2. Meter Mangement");
            System.out.println("3. Services");
            System.out.println("4. Show Files");
            System.out.println("5. Exit");
            System.out.print("your choice : ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("\n------------------------------------------");
                    System.out.println("User Management");
                    System.out.println("------------------------------------------");
                    System.out.println("\nChoose one from below :");
                    System.out.println("1. Add new User");
                    System.out.println("2. Remove a User");
                    System.out.println("3. Search a User");
                    System.out.println("4. Show all Users");
                    System.out.println("5. Go back");
                    System.out.print("your choice : ");
                    int op1 = sc.nextInt();
                    switch(op1) {
                        case 1:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Add new User");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter User Name :");
                            String uname = bfr.readLine();
                            System.out.println("Enter User ID :");
                            String uid = sc.next();
                            User user01 = new User(uname, uid);
                            if(managementSystem.addNewUser(user01)) {
                                System.out.println("User Added. ID " + user01.getId());
                            }else {
                                System.out.println("User Not Added");
                            }
                            break;
                        case 2:
                        System.out.println("\n---------------------------------------------");
                            System.out.println("Remove User");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter User ID to remove:");
                            String uid2 = sc.next();
                            if(managementSystem.removeUser(uid2)) {
                                System.out.println("User Removed");
                            }else {
                                System.out.println("User Not Removed");
                            }
                            break;
                        case 3:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Search User");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter User ID to search:");
                            String uid3 = sc.next();
                            User u = managementSystem.searchUser(uid3);
                            if(u != null) {
                                System.out.println("User Found");
                                u.showDetails();
                            }else {
                                System.out.println("User Not Found");
                            }
                            break;
                        case 4:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("All Users");
                            System.out.println("---------------------------------------------");
                            managementSystem.showAllUsers();
                            break;
                        case 5:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Go Back");
                            System.out.println("---------------------------------------------");
                            break;
                        default:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Invalid Choice");
                            System.out.println("---------------------------------------------");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n------------------------------------------");
                    System.out.println("Meter Management");
                    System.out.println("------------------------------------------");
                    System.out.println("\nChoose one from below :");
                    System.out.println("1. Add new Meter");
                    System.out.println("2. Remove a Meter");
                    System.out.println("3. Search a Meter");
                    System.out.println("4. Show all Meters");
                    System.out.println("5. Go back");
                    System.out.print("your choice : ");
                    int op2 = sc.nextInt();
                    switch(op2) {
                        case 1:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Add new Meter");
                            System.out.println("---------------------------------------------");
                            System.out.println("1. Nesco Meter");
                            System.out.println("2. Go Back");
                            int in = sc.nextInt();
                            if(in == 1) {
                                System.out.println("Enter Meter No :");
                                String mno1 = sc.next();
                                System.out.println("Enter User ID :");
                                String uid2 = sc.next();
                                System.out.println("Enter total unit :");
                                double d = sc.nextDouble();
                                if(managementSystem.searchUser(uid2) != null) {
                                    Nesco meter01 = new Nesco();
                                    meter01.setUserID(uid2);
                                    meter01.setMeterNo(mno1);
                                    meter01.setUnit(d);
                                    meter01.getBill(d);
                                    managementSystem.addNewMeter(meter01);
                                }else {
                                    System.out.println("Invalid User");
                                }
                            }else if(in == 2) {
                                System.out.println("Going Back...................");
                            }else {
                                System.out.println("INVALID INPUT");
                            }
                            break;
                        case 2:
                        System.out.println("\n---------------------------------------------");
                            System.out.println("Remove Meter");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Meter ID to remove:");
                            String mid3 = sc.next();
                            if(managementSystem.removeMeter(mid3)) {
                                System.out.println("Meter Removed");
                            }else {
                                System.out.println("Meter Not Removed");
                            }
                            break;
                        case 3:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Search Meter");
                            System.out.println("---------------------------------------------");
                            System.out.println("Enter Meter ID to search:");
                            String mid4 = sc.next();
                            Meter mm = managementSystem.searchMeter(mid4);
                            if(mm != null) {
                                System.out.println("Meter Found");
                                mm.showDetails();
                            }else {
                                System.out.println("Meter Not Found");
                            }
                            break;
                        case 4:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("All Meter");
                            System.out.println("---------------------------------------------");
                            managementSystem.showAllMeters();
                            break;
                        case 5:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Go Back");
                            System.out.println("---------------------------------------------");
                            break;
                        default:
                            System.out.println("\n---------------------------------------------");
                            System.out.println("Invalid Choice");
                            System.out.println("---------------------------------------------");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Services");
                    System.out.println("---------------------------------------------");
                    System.out.println("1. PayBill");
                    System.out.println("2. Show Bill");
                    System.out.println("3. Show All Meters");
                    int in1 = sc.nextInt();
                    if(in1 == 1) {
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Pay Bill");
                        System.out.println("---------------------------------------------");
                        System.out.println("Enter Meter ID to search:");
                        String mid5 = sc.next();
                        Nesco m5 = (Nesco) managementSystem.searchMeter(mid5);
                        if(m5 != null) {
                            System.out.println("Meter Found");
                            System.out.println("Meter Unit : " + m5.getUnit());
                            System.out.println("Meter Bill : " + m5.getBill(m5.getUnit()));
                            System.out.println("Enter bill : ");
                            double d2 = sc.nextDouble();
                            if(m5.payBill(d2)) {
                                m5.setBill(m5.getBill(m5.getUnit())-d2);
                                FileReadWrite fileReadWrite = new FileReadWrite();
                                fileReadWrite.writeInFile("Meter No : " + m5.getMeterNo() + "\nBill Paid : " + d2 + "\n");
                            }else {
                                System.out.println("invalid");
                            }
                            // m5.showDetails();
                        }else {
                            System.out.println("Meter Not Found");
                        }
                    }else if(in1 == 2) {
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Show Bill");
                        System.out.println("---------------------------------------------");
                        System.out.println("Enter Meter ID to search:");
                        String mid6 = sc.next();
                        Nesco m6 = (Nesco) managementSystem.searchMeter(mid6);
                        if(m6 != null) {
                            System.out.println("Meter Found");
                            System.out.println("Meter Unit : " + m6.getUnit());
                            System.out.println("Meter Bill : " + m6.getBill(m6.getUnit()));
                        }else {
                            System.out.println("Meter Not Found");
                        }
                    }else if( in1 == 3) {
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Show All Meters");
                        System.out.println("---------------------------------------------");
                        managementSystem.showAllMeters();
                    }else {
                        System.out.println("\n---------------------------------------------");
                        System.out.println("Invalid Choice");
                        System.out.println("---------------------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Show Files");
                    System.out.println("---------------------------------------------");
                    FileReadWrite fileReadWrite = new FileReadWrite();
                    fileReadWrite.readFromFile();
                    break;
                case 5:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Exit");
                    System.out.println("---------------------------------------------");
                    repeat = false;
                    break;
                default:
                    System.out.println("\n---------------------------------------------");
                    System.out.println("Invalid Choice");
                    System.out.println("---------------------------------------------");
                    break;
            }
        }
    }
}
