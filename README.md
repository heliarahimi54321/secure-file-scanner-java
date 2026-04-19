# Secure File Scanner Java

A Java console application designed to scan files and evaluate basic security risks based on file type, extension, size, and hash value.

## Overview

This project was built to practice Java programming, object-oriented design, file handling, and basic security concepts.

## Key Features

- Analyze file name, path, and size
- Generate SHA-256 hash values
- Detect suspicious file extensions
- Detect double extensions (example: invoice.pdf.exe)
- Evaluate file risk level (Low / Medium / High)
- Display clean scan reports in console

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- File Handling
- MessageDigest
- Console Application

## Project Structure

src/
- Main.java
- FileAnalyzer.java
- HashGenerator.java
- RiskEvaluator.java
- ReportPrinter.java

## How to Run

```bash
javac src/*.java
java -cp src Main
```
## Example Test Files

- notes.txt
- setup.exe
- invoice.pdf.exe

## Future Improvements

- GUI version
- Multiple file scanning
- Export report to file

## Author

Personal Java practice project focused on real-world file analysis and basic security awareness.
