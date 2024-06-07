import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" Crea un programa que calcule quien gana más partidas al piedra,papel, tijera");
        String [] P1= {"R","P","S"};
        String [] P2={"R","P","S"};
        Random games = new Random();
        Scanner read = new Scanner(System.in);
        int game= read.nextInt();
        int player1Wins = 0;
        int player2Wins = 0;
        int ties = 0;
        for (int i= 1; i<=game;i++){
            int randomIndex1= games.nextInt(P1.length);
            int randomIndex2= games.nextInt(P2.length);
            String randomElementP1 = P1[randomIndex1];
            String randomElementP2 = P2[randomIndex2];
            String Winner1= "Player one wins";
            String Winner2= "Player two wins";
            String tie = "Tie";
            String concatenation = "["+randomElementP1 + " " + randomElementP2+"]";

            if(randomElementP1.equals("R") && randomElementP2.equals("S")||randomElementP1.equals("P") && randomElementP2.equals("R")||randomElementP1.equals("S") && randomElementP2.equals("P")){
                System.out.println(concatenation+" "+ Winner1);
                player1Wins++;
            }
            if(randomElementP1.equals("R") && randomElementP2.equals("P")||randomElementP1.equals("P") && randomElementP2.equals("S")||randomElementP1.equals("S") && randomElementP2.equals("R")){
                System.out.println(concatenation+" "+ Winner2);
                player2Wins++;
            }
            if(randomElementP1.equals("R") && randomElementP2.equals("R")||randomElementP1.equals("S") && randomElementP2.equals("S")||randomElementP1.equals("P") && randomElementP2.equals("P")){
                System.out.println(concatenation+" "+ tie);
                ties=ties+1;
            }
        }
        if (player1Wins > player2Wins) {
            System.out.println("Player one is the overall winner!");
        } else if (player2Wins > player1Wins) {
            System.out.println("Player two is the overall winner!");
        } else {
            System.out.println("It's a tie overall!");
        }
    }
}