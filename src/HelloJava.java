/**
 * Created by theji on 6/6/2017.
 */
public class HelloJava {
    public static void main(String[] args){
        boolean gameOver = false;
        int myScore = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        System.out.println("GitPush");
        for(int i=0;i<2;i++) {
            if (gameOver == false) {
                int finalScore = myScore + (levelCompleted * bonus);
                System.out.println("Total was " + finalScore);
            } else if (gameOver = true) {
                System.out.println(myScore);
            }
        }
//anuhya
//sridhar
//surya



    }
}
