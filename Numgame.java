import java.util.Scanner;

class rangen{
    public int generate(int max,int min){
        return(int) (Math.random()*(max - min + 1) + min);
    }
}

public class Numgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rangen rg = new rangen();
        int totalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.println(" Enter maximum number");
            int max = sc.nextInt();
            System.out.println("Enter minimum number");
            int min = sc.nextInt();
            sc.nextLine();

            int cnum = rg.generate(max, min);
            int attempts = 0;

            while (true) {
                System.out.println(" Guess a number in between "+max+" and "+min);
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cnum) {
                    System.out.println("It's greater");
                } else if (gnum < cnum){
                    System.out.println("It's smaller");
                } else{
                    System.out.println(" Correct guess");
                    win++;
                    break;
                }
            }
            totalAttempts += attempts;
            System.out.println("Attempts =" + attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / totalAttempts*100;
            System.out.printf(" Your winrate is %.2f%%\n", winrate);

            System.out.println("Play again (yes/no)");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }
}