/**Class: Poem
 * @author Derron Pierre
 * @version 1.0
 * Course: ITEC 2140 Spring 2024
 * Written: April 17, 2024
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class PoemReader {
    public static void main(String[] args) {
        ArrayList<Poem> poems = new ArrayList<>(); // Create an ArrayList to store Poem objects

        // Read poem information from poem2.txt and create Poem objects
        try (BufferedReader br = new BufferedReader(new FileReader("poem2.txt"))) {
            String name;
            String poet;

            while ((name = br.readLine()) != null && (poet = br.readLine()) != null) {
                Poem poem = new Poem(); // Create a new Poem object
                poem.setName(name.trim()); // Set poem name
                poem.setPoet(poet.trim()); // Set poet name
                poems.add(poem); // Add Poem object to ArrayList
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage()); // Print error message if file reading fails
            return;
        }

        // Print poem information to the console
        for (Poem poem : poems) {
            System.out.println("Poem Name: " + poem.getName());
            System.out.println("Poet: " + poem.getPoet());
            System.out.println();
        }
    }
}
