

import java.util.Scanner;

public class Yamaha {
    Jupiter[] jupiters = new Jupiter[1]; // Mảng lưu trữ 3 xe Jupiter
    Serius[] seriuses = new Serius[1]; // Mảng lưu trữ 3 xe Serius

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Select: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Error.");
            }
        } while (choice != 5);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input info for 3 Jupiters:");
        for (int i = 0; i < jupiters.length; i++) {
            System.out.println("Jupiter " + (i + 1) + ":");
            jupiters[i] = new Jupiter();
            jupiters[i].input();
        }
        System.out.println("Input info for 3 Seriuses:");
        for (int i = 0; i < seriuses.length; i++) {
            System.out.println("Serius " + (i + 1) + ":");
            seriuses[i] = new Serius();
            seriuses[i].input();
        }
    }

    public void display() {
        System.out.println("Jupiter's Info:");
        for (Jupiter j : jupiters) {
            if (j != null) {
                j.display();
            }
        }
        System.out.println("Serius's Info:");
        for (Serius s : seriuses) {
            if (s != null) {
                s.display();
            }
        }
    }

    public void sort() {
        // Sắp xếp xe Jupiter theo thời gian bảo hành
        for (int i = 0; i < jupiters.length - 1; i++) {
            for (int j = i + 1; j < jupiters.length; j++) {
                if (jupiters[i].getWarranty() > jupiters[j].getWarranty()) {
                    Jupiter temp = jupiters[i];
                    jupiters[i] = jupiters[j];
                    jupiters[j] = temp;
                }
            }
        }
        // Sắp xếp xe Serius theo thời gian bảo hành
        for (int i = 0; i < seriuses.length - 1; i++) {
            for (int j = i + 1; j < seriuses.length; j++) {
                if (seriuses[i].getWarranty() > seriuses[j].getWarranty()) {
                    Serius temp = seriuses[i];
                    seriuses[i] = seriuses[j];
                    seriuses[j] = temp;
                }
            }
        }
        System.out.println("Sorting completed.");
        display();
    }

    public void search() {
        System.out.println("Motorbike name Serius:");
        for (Serius s : seriuses) {
            if (s != null && s.getName().equalsIgnoreCase("Serius")) {
                s.display();
            }
        }
        for (Jupiter s : jupiters) {
            if (s != null && s.getName().equalsIgnoreCase("Serius")) {
                s.display();
            }
        }
    }

    public static void main(String[] args){
        Yamaha ya = new Yamaha();
        ya.menu();
    }
}