public class Main {
    public static void main(String[] args) {
        int[] stepsRobot = {10, 5, -2};

        int x = 0;
        int y = 0;

        for (int i = 0; i < stepsRobot.length; i++) {
            if (i == 2) {
                y = y - stepsRobot[i];
            } else if (i==0){
                y = y + stepsRobot[i];
            }else{
                x = x - stepsRobot[i];
            }
        }
        System.out.println("Finals coordinates: (x: " + x + ", y: " + y + ")");
    }
}