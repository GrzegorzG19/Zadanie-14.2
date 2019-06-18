import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan;
        ArrayList<Double> listing = new ArrayList<>();
        File file = new File("text.txt");
        try {
            scan = new Scanner(file);
            while (scan.hasNextDouble()) {
                listing.add(scan.nextDouble());
            }
            System.out.println(listing.toString());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

    ile(listing);


    }
    public static void ile(ArrayList listing){
        for (int i = 0; i < listing.size(); i++) {
            int a = 0;
            for (int j = 0; j < listing.size(); j++) {
                if (listing.get(i).equals(listing.get(j))) {
                    a += 1;
                }
            }
            if (a > 0) {
                System.out.println(listing.get(i) + " powtarza się " + a);
            }
        }
    }
}
