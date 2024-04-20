import com.springframwork.salma.game.GameRunner;
import com.springframwork.salma.game.MarioGame;
import com.springframwork.salma.game.PacMangame;
import com.springframwork.salma.game.SuperContratGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        MarioGame marioGame=new MarioGame();
        SuperContratGame superContratGame =new SuperContratGame();
        PacMangame pacMangame=new PacMangame();
        GameRunner gameRunner=new GameRunner(pacMangame);
        gameRunner.run();
    }
}
