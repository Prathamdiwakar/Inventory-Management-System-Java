package Inventory.com;

import java.util.Scanner;

public class inventoryManagementsystem {
    public static void main(String[] args) {
        Inventory<item> inventory = new Inventory<>();
        Scanner scanner = new Scanner(System.in);
        boolean exist = false;

        while(!exist){
            System.out.println("\n==== Inventory System ====");
            System.out.println("1️⃣ Add Item");
            System.out.println("2️⃣ Remove Item");
            System.out.println("3️⃣ View Items");
            System.out.println("4️⃣ Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter The Name Of Item-");
                    String nt = scanner.nextLine();
                    System.out.println("Enter The Price:-");
                    int pr = scanner.nextInt();
                    System.out.println("Enter The Quantity Of The Item");
                    double qn = scanner.nextDouble();

                    inventory.addItem(new item(nt , pr , qn));
                    break;

                case 2:
                    System.out.println("Enter the Name of the Item");
                    String sc = scanner.nextLine();
                    item toRemove = null;

                    for(item i : inventory.getItems()){
                        if(i.getName().equalsIgnoreCase(sc)){
                            toRemove=i;
                            break;
                        }
                    }
                    if(toRemove!=null) {inventory.removeItem(toRemove);
                    }
                    else{ System.out.println("Item not found.");}
                           break;

                case 3:
                    inventory.viewItem();
                    break;

                case 4:
                    exist = true;
                    System.out.println("Existing System:---👋");
                    break;

                default:
                    System.out.println("Invalid choice try Again:--");
            }
        }
       scanner.close();
    }





}
