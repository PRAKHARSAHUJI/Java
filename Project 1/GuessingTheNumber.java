import java.util.Scanner;

class Guesser
{
    int gnum;
    int guessingNum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser ,  Choose a number between 1 to 10 ");
        gnum = scan.nextInt();
        return gnum;
    }

}


class Player
{
    int pnum;
    int predictingNum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player ,  Choose a number between 1 to 10 ");
        pnum = scan.nextInt();
        return pnum;
    }

}

class Umpire
{
   int numFromGuessor;
   int numFromPlayer1;
   int numFromPlayer2;
   int numFromPlayer3;


   void collectingNumFromGuessor()
   {
    Guesser g = new Guesser();
    numFromGuessor = g.guessingNum();
   }
   void collectingNumFromPlayers()
   {
    Player p1 = new Player();
    numFromPlayer1 = p1.predictingNum();
    Player p2 = new Player();
    numFromPlayer2 = p2.predictingNum();
    Player p3 = new Player();
    numFromPlayer3 = p3.predictingNum();
   }
   void comparing()
   {
    if(numFromGuessor==numFromPlayer1)
    System.out.println("Player 1 Won the Game");
    else if(numFromGuessor==numFromPlayer2)
    System.out.println("Player 2 Won the Game");
    else if(numFromGuessor==numFromPlayer3)
    System.out.println("Player 3 Won the Game");
    else
    System.out.println("Nobody Won the Game");

   }


}


class GuessingTheNumber
{
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectingNumFromGuessor();
        u.collectingNumFromPlayers();
        u.comparing();
    }
}