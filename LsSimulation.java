import java.io.File;
import java.util.Scanner;

public class LsSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full directory path: ");
        String path = scanner.nextLine();

        File dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("Error reading directory contents.");
            return;
        }

        for (File file : files) {
            String type = file.isDirectory() ? "<DIR>" : "<FILE>";
            StringBuilder perms = new StringBuilder();

            perms.append(file.canRead() ? "r" : "-");
            perms.append(file.canWrite() ? "w" : "-");
            perms.append(file.isHidden() ? "h" : "-");

            System.out.printf("%s %s %s%n", file.getAbsolutePath(), type, perms.toString());
        }
    }
}
