import java.util.Scanner;

public class IT26102367Lab04Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double examMarks,labMarks,examPercentage,labPercentage,finalMarks;

        System.out.print("Please enter exam marks (out of 100): ");
        examMarks = input.nextDouble();

        if (examMarks >= 0 && examMarks <= 100) {

            System.out.print("Please enter lab submission marks (out of 100): ");
            labMarks = input.nextDouble();

            if (labMarks >= 0 && labMarks <= 100) {

                System.out.print("Please enter the percentage given for the exam: ");
                examPercentage = input.nextDouble();

                if (examPercentage >= 0 && examPercentage <= 100) {

                    System.out.print("Please enter the percentage given for the lab submission: ");
                    labPercentage = input.nextDouble();

                    if (labPercentage >= 0 && labPercentage <= 100) {

                        if (examPercentage + labPercentage == 100) {

                            finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

                            System.out.println("Final Exam Marks is: " + finalMarks);

                        } else {
                            System.out.println("Invalid percentages. They must add up to 100.");
                        }

                    } else {
                        System.out.println("Invalid input for lab percentage. Terminating program.");
                    }

                } else {
                    System.out.println("Invalid input for exam percentage. Terminating program.");
                }

            } else {
                System.out.println("Invalid input for lab submission marks. Terminating program.");
            }

        } else {
            System.out.println("Invalid input for exam marks. Terminating program.");
        }
    }
}