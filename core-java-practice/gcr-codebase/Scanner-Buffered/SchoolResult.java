import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolResult {

	private static final String INPUT_FILE = "students.txt";
	private static final String OUTPUT_FILE = "report_card.txt";

	public static void main(String[] args) {
		List<StudentResult> results = readResultsFromFile(INPUT_FILE);

		if (results.isEmpty()) {
			System.out.println("No valid student records found.");
			return;
		}

		writeReportCards(OUTPUT_FILE, results);
		System.out.println("Report cards appended to: " + OUTPUT_FILE);
	}

	private static List<StudentResult> readResultsFromFile(String fileName) {
		List<StudentResult> results = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;

			while ((line = reader.readLine()) != null) {
				line = line.trim();

				if (line.isEmpty()) {
					continue;
				}

				StudentResult result = parseStudentLine(line);
				if (result != null) {
					results.add(result);
				}
			}
		} catch (FileNotFoundException exception) {
			System.out.println("Input file not found: " + fileName);
			System.out.println("Please create the file and use this format:");
			System.out.println("Name,mark1,mark2,mark3");
		} catch (IOException exception) {
			System.out.println("Error while reading file: " + exception.getMessage());
		}

		return results;
	}

	private static StudentResult parseStudentLine(String line) {
		String[] parts = line.split(",");

		if (parts.length < 2) {
			System.out.println("Skipping invalid line: " + line);
			return null;
		}

		String name = parts[0].trim();
		if (name.isEmpty()) {
			System.out.println("Skipping invalid line: " + line);
			return null;
		}

		int total = 0;
		int count = 0;

		for (int i = 1; i < parts.length; i++) {
			try {
				total += Integer.parseInt(parts[i].trim());
				count++;
			} catch (NumberFormatException exception) {
				System.out.println("Skipping invalid mark in line: " + line);
				return null;
			}
		}

		if (count == 0) {
			System.out.println("Skipping invalid line: " + line);
			return null;
		}

		double average = (double) total / count;
		return new StudentResult(name, total, count, average);
	}

	private static void writeReportCards(String fileName, List<StudentResult> results) {
		File outputFile = new File(fileName);
		boolean addHeader = !outputFile.exists() || outputFile.length() == 0;

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
			if (addHeader) {
				writer.write("==============================");
				writer.newLine();
				writer.write("         REPORT CARDS         ");
				writer.newLine();
				writer.write("==============================");
				writer.newLine();
			}

			for (StudentResult result : results) {
				writer.write("Student Name : " + result.name);
				writer.newLine();
				writer.write("Marks Total  : " + result.totalMarks);
				writer.newLine();
				writer.write("Subjects     : " + result.subjectCount);
				writer.newLine();
				writer.write("Average      : " + String.format("%.2f", result.average));
				writer.newLine();
				writer.write("Result       : " + (result.average >= 40 ? "Pass" : "Fail"));
				writer.newLine();
				writer.write("------------------------------");
				writer.newLine();
			}
		} catch (IOException exception) {
			System.out.println("Error while writing report: " + exception.getMessage());
		}
	}

	private static class StudentResult {
		private final String name;
		private final int totalMarks;
		private final int subjectCount;
		private final double average;

		private StudentResult(String name, int totalMarks, int subjectCount, double average) {
			this.name = name;
			this.totalMarks = totalMarks;
			this.subjectCount = subjectCount;
			this.average = average;
		}
	}
}

