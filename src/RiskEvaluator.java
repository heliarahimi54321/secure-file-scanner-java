public class RiskEvaluator {
    private final FileAnalyzer analyzer;

    public RiskEvaluator(FileAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    public String getRiskLevel() {
        String extension = analyzer.getFileExtension();
        String fileName = analyzer.getFileName().toLowerCase();
        long fileSize = analyzer.getFileSize();

        if (hasDoubleExtension(fileName)) {
            return "HIGH";
        }

        if (extension.equals("exe") || extension.equals("bat") || extension.equals("cmd") || extension.equals("jar") || extension.equals("vbs") || extension.equals("scr")) {
            return "HIGH";
        }

        if (extension.equals("zip") || extension.equals("rar")) {
            return "MEDIUM";
        }

        if (fileSize > 50 * 1024 * 1024) {
            return "MEDIUM";
        }

        return "LOW";
    }

    public String getReason() {
        String extension = analyzer.getFileExtension();
        String fileName = analyzer.getFileName().toLowerCase();
        long fileSize = analyzer.getFileSize();

        if (hasDoubleExtension(fileName)) {
            return "Double extension detected";
        }

        if (extension.equals("exe") || extension.equals("bat") || extension.equals("cmd") || extension.equals("jar") || extension.equals("vbs") || extension.equals("scr")) {
            return "Executable or script file";
        }

        if (extension.equals("zip") || extension.equals("rar")) {
            return "Compressed archive file";
        }

        if (fileSize > 50 * 1024 * 1024) {
            return "Large file size";
        }

        return "No obvious risk found";
    }

    private boolean hasDoubleExtension(String fileName) {
        int firstDot = fileName.indexOf(".");
        int lastDot = fileName.lastIndexOf(".");
        return firstDot != -1 && firstDot != lastDot;
    }
}