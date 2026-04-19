public class ReportPrinter {
    public void printReport(FileAnalyzer analyzer, String hash, RiskEvaluator evaluator) {
        System.out.println();
        System.out.println("========== Scan Report ==========");
        System.out.println("File Name   : " + analyzer.getFileName());
        System.out.println("File Path   : " + analyzer.getFilePath());
        System.out.println("File Size   : " + analyzer.getFileSize() + " bytes");
        System.out.println("Extension   : " + analyzer.getFileExtension());
        System.out.println("SHA-256     : " + hash);
        System.out.println("Risk Level  : " + evaluator.getRiskLevel());
        System.out.println("Reason      : " + evaluator.getReason());
        System.out.println("=================================");
    }
}