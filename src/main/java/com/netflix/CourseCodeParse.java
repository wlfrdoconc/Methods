package com.netflix;

import java.util.Scanner;

public class CourseCodeParse {
    public static void main(String[] args) {

        // Scanner
        Scanner read = new Scanner(System.in);

        System.out.println("==== COURSE CODE PARSER ====");
        System.out.print("Enter the course title (Format - COURSE NAME (COURSE NUMBER)): ");
        String courseTitle = read.nextLine();

        // Extracted courseCodeVersion1 using indexOf and substring
        String courseCodeVersion1 = courseCodeMethod1(courseTitle);
        // Extracted courseCodeVersion2 using split() and replace()
        String courseCodeVersion2 = courseCodeMethod2(courseTitle);

        printCourseCode(courseCodeVersion1, courseCodeVersion2);

        read.close();
    }

    // 1. Make a method that passes in a courseTitle and returns the course code
    public static String courseCodeMethod1(String courseTitle) {
        // Remove leading and trailing spaces
        courseTitle = courseTitle.trim();

        // Find the position of the parentheses
        int startIndex = courseTitle.indexOf("(");
        int lastIndex = courseTitle.lastIndexOf(")");

        // Extracted courseCode
        String courseCode = courseTitle.substring(startIndex + 1, lastIndex);

        return courseCode;
    }

    // 2. BONUS - Solve using split() or replace()
    public static String courseCodeMethod2(String courseTitle) {
        // Remove leading and trailing spaces
        courseTitle = courseTitle.trim();

        // Splits the string into two parts wherever an opening parentheses appears
        // So parts[0] = Microsoft Azure Fundamentals
        // parts[1] = AZ-900)
        String[] parts = courseTitle.split("\\(");

        // Extracts the course code from the second part
        String courseCode = parts[1]; // Course code is now isolated in parts[1] and is now stored in courseCode

        // Removes the closing parentheses
        courseCode = courseCode.replace(")", "");

        return courseCode;
    }

    // Print method that displays the course code using two different methods
    public static void printCourseCode (String courseCodeVersion1, String courseCodeVersion2) {
        System.out.printf("Course code: %s\nCourse code: %s", courseCodeVersion1, courseCodeVersion2);
    }
}
