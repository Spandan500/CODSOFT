import java.util.Scanner;
class Grade{
    public String grade(int avgp){
        switch (avgp / 10) {
            case 10:
                return "O";
            case 9:
                return "E";
            case 8:
                return "A";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Gradecal{
    public static void main(String[] args) {
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        //No of subjects
        System.out.println("Enter the number of subjects");
        int tsubs = sc.nextInt();
        int tmarks = 0;

        //Taking and adding all the marks
        for (int i=0; i < tsubs; i++) {
            System.out.println("Enter the marks obtained in subject" + (i + 1));
            int marks = sc.nextInt();
            tmarks += marks;
        }

        //Calculating percentage 
        int avgp = tmarks / tsubs;

        //Calculating grades
        String Grade = g.grade(avgp);

        System.out.println("Total marks obtained : " + tmarks);
        System.out.println("Percentage : " + avgp+"%");
        System.out.println("Grade : " + Grade);

        sc.close();
    }
}