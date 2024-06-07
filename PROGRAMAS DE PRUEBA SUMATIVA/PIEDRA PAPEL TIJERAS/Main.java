import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(" Crea un programa que calcule quien gana más partidas al piedra,papel, tijera");
        String [] P1= {"R","P","S"};
        String [] P2={"R","P","S"};
        Random games = new Random();

        for (int i= 1; i<=3;i++){
            int randomIndex1= games.nextInt(P1.length);
            int randomIndex2= games.nextInt(P2.length);
            String randomElementP1 = P1[randomIndex1];
            String randomElementP2 = P2[randomIndex2];

            String concatenation = "["+randomElementP1 + " " + randomElementP2+"]";

            if(randomElementP1.equals("R") && randomElementP2.equals("S")||randomElementP1.equals("P") && randomElementP2.equals("R")||randomElementP1.equals("S") && randomElementP2.equals("P")){
                System.out.println(concatenation+" "+ "Player one wins");
            }
            if(randomElementP1.equals("R") && randomElementP2.equals("P")||randomElementP1.equals("P") && randomElementP2.equals("S")||randomElementP1.equals("S") && randomElementP2.equals("R")){
                System.out.println(concatenation+" "+ "Player two wins");
            }
            if(randomElementP1.equals("R") && randomElementP2.equals("R")||randomElementP1.equals("S") && randomElementP2.equals("S")||randomElementP1.equals("P") && randomElementP2.equals("P")){
                System.out.println(concatenation+" "+ "Tie");
            }
            
        }
    }
}