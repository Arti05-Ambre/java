import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    float bat_avg;

    CricketPlayer(String name, int innings, int notout, int runs) {
        this.name = name;
        this.no_of_innings = innings;
        this.no_of_times_notout = notout;
        this.total_runs = runs;
        this.bat_avg = 0;
    }

    static float avg(CricketPlayer p) {
        int outs = p.no_of_innings - p.no_of_times_notout;

        if (outs == 0)
            return p.total_runs;

        return (float) p.total_runs / outs;
    }

    static void sort(CricketPlayer[] players) {

        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {

                if (players[j].bat_avg > players[j + 1].bat_avg) {

                    CricketPlayer temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println(
            name + "\t" +
            no_of_innings + "\t" +
            no_of_times_notout + "\t" +
            total_runs + "\t" +
            bat_avg
        );
    }
}

public class CricketDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Enter player name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of innings: ");
            int innings = sc.nextInt();

            System.out.print("Enter number of times not out: ");
            int notout = sc.nextInt();

            System.out.print("Enter total runs: ");
            int runs = sc.nextInt();

            players[i] = new CricketPlayer(name, innings, notout, runs);

            players[i].bat_avg = CricketPlayer.avg(players[i]);
        }

        CricketPlayer.sort(players);

        System.out.println("\n--- Players Sorted By Batting Average ---");
        System.out.println("Name\tInnings\tNotOut\tRuns\tAverage");

        for (int i = 0; i < n; i++) {
            players[i].display();
        }

        sc.close();
    }
}
