package com.rakuten;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> list;
    static double grandtotal=0;
    public static void showDetails()
    {
        System.out.println("Product Id \t\t ProductName \t Quantity \tPrice \t\t TotalPrice");
        for (Product p : list){
            double total = p.getQuantity()*p.getPricepItem();
            grandtotal +=total;
            System.out.println(p.getPid() + "  \t\t" + p.getName() + "   \t\t" + p.getQuantity() +"    \t\t"+ p.getPricepItem() + "\t  \t" + total);
        }
        System.out.println("\t\t\t\t\t Your grand total of all the item is " + grandtotal);
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        list = new ArrayList<>();
        System.out.println("How many item you are purchased");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter product  Id " + (i+1));
            int id = sc.nextInt();
            System.out.println("Enter product name " + (i+1));
            String name = sc.next();
            System.out.println("Enter quantity of item " + (i+1));
            int q = sc.nextInt();
            System.out.println("Enter amount of one item " + (i+1));
            double amount = sc.nextDouble();
            Product p = new Product(id,name,q,amount);
            list.add(p);
        }
        showDetails();
    }
}
