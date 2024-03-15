import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScoreUpdater scoreUpdater = new ScoreUpdater();
        scoreUpdater.registerObserver(new Client("Client 1"));
        scoreUpdater.registerObserver(new Client("Client 2"));

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score (or press Enter to exit): ");
            String score = in.nextLine();
            if (score.isEmpty()) break;
            scoreUpdater.setScore(score);
        }
        in.close();
    }
}