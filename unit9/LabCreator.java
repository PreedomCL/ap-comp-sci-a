import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LabCreator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lab Name:");
        String labName = scanner.nextLine();

        System.out.println("Method Name:");
        String methodName = scanner.nextLine();

        ArrayList<String> data = new ArrayList<>();
        System.out.println("Enter data now. Enter \"done\" to finish");
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.equals("done"))
                break;
            data.add(line);
        }

        File labFile = new File(labName + ".java");
        if(labFile.createNewFile()) {
            FileWriter writer = new FileWriter(labFile);
            writer.write("import java.io.File;\n" +
                    "import java.io.FileNotFoundException;\n" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class " + labName + " {\n" +
                    "    public static void main(String[] args) throws FileNotFoundException {\n" +
                    "        Scanner scanner = new Scanner(new File(\"" + labName +"Data.dat\"));\n" +
                    "\n" +
                    "        while(scanner.hasNextLine()) {\n" +
                    "            System.out.println(" + methodName + "(scanner.nextLine()));\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    public static String " + methodName + "(String input) {\n" +
                    "        return input;\n" +
                    "    }\n" +
                    "}\n");
            writer.close();
        }else {
            System.out.println("Could not create " + labName + ".java! Maybe it already exists?");
            System.out.println("Exiting LabCreator...");
            return;
        }
        File inputFile = new File(labName + "Data.dat");
        if(inputFile.createNewFile()) {
            FileWriter writer = new FileWriter(inputFile);
            for(String s: data) {
                writer.write(s + "\n");
            }
            writer.close();
        }else {
            System.out.println("Could not create " + labName + "Data.dat! You may need to populate it manually");
        }
        System.out.println(labName + " successfully created in: " + System.getProperty("user.dir"));
    }

}
