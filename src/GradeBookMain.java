public class GradeBookMain {

    public static void main(String[] args) {
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook gradeBook = new GradeBook("INTRODUCTION TO JAVA 101", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",gradeBook.getCourseName());
        gradeBook.processGrades();

    }
}
