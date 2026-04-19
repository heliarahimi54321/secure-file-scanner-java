import java.io.File;

public class FileAnalyzer {
    private File file;

    public FileAnalyzer(File file) {
        this.file = file;
    }

    public String getFileName() {
        return file.getName();
    }

    public String getFilePath() {
        return file.getAbsolutePath();
    }

    public long getFileSize() {
        return file.length();
    }

    public String getFileExtension() {
        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf(".");

        if (lastDotIndex == -1 || lastDotIndex == fileName.length() - 1) {
            return "No extension";
        }

        return fileName.substring(lastDotIndex + 1).toLowerCase();
    }
}