import java.io.*;

public class HistoryManager {

    private static final String FILE_PATH = "history.txt";

    // Saves a calculation to the history file.
    public void saveHistory(String record) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {

            writer.write(record);
            writer.newLine();

        } catch (IOException e) {

            System.out.println("Error saving history.");

        }
    }

    // Displays all saved calculations.
    public void showHistory() {

        File file = new File(FILE_PATH);

        if (!file.exists()) {

            System.out.println("\nNo history found.");

            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

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

        } catch (IOException e) {

            System.out.println("Error reading history.");

        }
    }

    // Clears all saved calculations.
    public void clearHistory() {

        File file = new File(FILE_PATH);

        if (!file.exists()) {

            System.out.println("History is already empty.");

            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("");

            System.out.println("History cleared successfully.");

        } catch (IOException e) {

            System.out.println("Unable to clear history.");

        }
    }
}
