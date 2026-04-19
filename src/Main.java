import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      Secure File Scanner");
        System.out.println("================================");
        System.out.print("Enter file path: ");

        String filePath = input.nextLine().replace("\"", "").trim();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File not found.");
            input.close();
            return;
        }

        if (!file.isFile()) {
            System.out.println("The path is not a valid file.");
            input.close();
            return;
        }

        FileAnalyzer analyzer = new FileAnalyzer(file);
        String hash = HashGenerator.generateSHA256(file);
        RiskEvaluator evaluator = new RiskEvaluator(analyzer);
        ReportPrinter printer = new ReportPrinter();

        printer.printReport(analyzer, hash, evaluator);

        input.close();
    }
}