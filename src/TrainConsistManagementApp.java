import java.util.*;

// Bogie class representing passenger bogies
class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " Bogie - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create a List to store bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));
        System.out.println("======================================\nUC7 - Sort Bogies by Capacity (Comparator)\n======================================");
        System.out.println("before sorting by capacity:\n");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }
        System.out.println("after sorting by capacity:\n");
        // Step 3: Sort bogies by capacity using Comparator (ascending)
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 4: Display sorted bogies


        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }
        System.out.println("\nUC7 sorting completed...");





    }
}