import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Program88 {
    public static final int ARRAY_SIZE = 20;
    public static final int NUM_VALUES = 15;
    public static final int MIN_VALUE = 100000;
    public static final int MAX_VALUE = 999999; 

    public Integer[] array = new Integer[ARRAY_SIZE];

    public int hashFunction(int x) {
        return (x % 18) + 2;
    }

    public boolean insertValue(int value) {
        int index = hashFunction(value);
        int originalIndex = index;

        while (array[index] != null) {
            index = (index + 1) % ARRAY_SIZE;
            if (index == originalIndex) {
                System.out.println("Array is full or all spots are probed.");
                return false;
            }
        }

        array[index] = value;
        return true;
    }

    public Set<Integer> generateRandomValues() {
        Set<Integer> values = new HashSet<>();
        Random rand = new Random();

        while (values.size() < NUM_VALUES) {
            int value = rand.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
            values.add(value);
        }

        return values;
    }

    public void displayArray() {
        System.out.println("Final values in the array:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }

    public static void main(String[] args) {
        Program88 hashing = new Program88();

        Set<Integer> values = hashing.generateRandomValues();

        for (int value : values) {
            hashing.insertValue(value);
        }

        hashing.displayArray();
    }
}
