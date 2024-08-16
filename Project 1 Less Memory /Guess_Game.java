import java.util.Scanner;

class Guesser {
    int gnum;

    int guessingNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser, choose a number between 1 to 10:");
        gnum = scan.nextInt();
        return gnum;
    }
}

class Player {
    int pnum;

    int predictingNum() {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Player , choose a number between 1 to 10:");
        pnum = scan.nextInt();
        return pnum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectingNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectingNumFromPlayers() {
        Player player = new Player();
        
        System.out.println("Player 1, choose a number between 1 to 10:");
        numFromPlayer1 = player.predictingNum();

        System.out.println("Player 2, choose a number between 1 to 10:");
        numFromPlayer2 = player.predictingNum();

        System.out.println("Player 3, choose a number between 1 to 10:");
        numFromPlayer3 = player.predictingNum();
    }

    void comparing() {
        if (numFromGuesser == numFromPlayer1)
            System.out.println("Player 1 won the game");
        else if (numFromGuesser == numFromPlayer2)
            System.out.println("Player 2 won the game");
        else if (numFromGuesser == numFromPlayer3)
            System.out.println("Player 3 won the game");
        else
            System.out.println("Nobody won the game");
    }
}

class Guess_Game {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectingNumFromGuesser();
        u.collectingNumFromPlayers();
        u.comparing();
    }
}
