package calculator.history;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HistoryManager {

    // Location of the history file
    private static final String FILE_PATH = "data/history.txt";

    // Saves a calculation to the history file.
     
    public void saveHistory(String record) {

        try {

            File file = new File(FILE_PATH);

            // Create the data folder if it doesn't exist
            File parentFolder = file.getParentFile();

            if (!parentFolder.exists()) {
                parentFolder.mkdirs();
            }

            // Create history file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

            writer.write(record);
            writer.newLine();

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving history.");

        }

    }

    //Displays all saved calculations.
  
    public void showHistory() {

        File file = new File(FILE_PATH);

        if (!file.exists()) {

            System.out.println("\nNo history found.");

            return;
        }

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\n========== CALCULATION HISTORY ==========");

            boolean empty = true;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
                empty = false;

            }

            if (empty) {
                System.out.println("History is empty.");
            }

            System.out.println("=========================================");

            reader.close();

        } catch (IOException e) {

            System.out.println("Error reading history.");

        }

    }

    // Clears all saved calculations
     
    public void clearHistory() {

        try {

            File file = new File(FILE_PATH);

            if (!file.exists()) {

                System.out.println("History is already empty.");

                return;

            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            // Writing nothing empties the file
            writer.write("");

            writer.close();

            System.out.println("History cleared successfully.");

        } catch (IOException e) {

            System.out.println("Unable to clear history.");

        }

    }

}
