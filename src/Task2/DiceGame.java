package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame implements Game {

    private final int n;
    private final int k;
    ArrayList<Dicer> players = new ArrayList<>();

    DiceGame(int n, int k) {
        this.n = n;
        this.k = k;
        for (int i=0; i<n; i++) {
            Dicer player = new Dicer(0);
            players.add(player);
        }
    }

    public boolean someoneWon() {       // checks have we a winner or not
        for(Player player : players){
            if (player.getCount()==7) {
                return true;
            }
        }
        return false;
    }

    public int whoWon() {               // return index of a winner
        int index = -1;
        for(int i = 0; i < n; i++){
            if (players.get(i).getCount()==7) {
                index = i;
            }
        }
        return index;
    }

    public void play() {
        int i=0;
        while (!someoneWon()) {
            System.out.println("Round " + (i + 1));
            int maxCount = 0;
            int indexOfPlayer=0;
            for (int l = 0; l < players.size(); l++) {
                int countForDices = 0;
                for (int f = 0; f < k-1; f++) {                 // throwing of k dices once
                    countForDices += (int) (Math.random() * 6) + 1;
                }
                if (maxCount < countForDices) {
                    indexOfPlayer = l;
                    maxCount = countForDices;
                }
            }
            ++i;
            players.get(indexOfPlayer).upCount();   // increase count of victories for player who won this round
            System.out.println("Player " + (indexOfPlayer + 1) + " win the round " + i);
        }
        int indexOfWinner = whoWon();       // we get index of our final winner
        if (indexOfWinner == 0) {
            System.out.println("You win the game!");
        } else if (indexOfWinner == (n - 1)) {
            System.out.println("Computer win the game");
        } else {
            System.out.println("Player number " + (indexOfWinner + 1) + " win the game!");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players: ");
        int n = scanner.nextInt();
        System.out.println("Enter number of dices: ");
        int k = scanner.nextInt();
        Game game = new DiceGame(n, k);
        game.play();
    }
}
