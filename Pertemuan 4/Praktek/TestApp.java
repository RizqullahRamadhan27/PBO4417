public class TestApp {
    public static void main(String[] args){
    GamePlayer Hero = new GamePlayer();
    Hero.setDimensi(12,12);
    Hero.setPosition(10,220);
    System.out.println("Posisi Player: "+ Hero.getX()+","+Hero.getY());
    Hero.Run(12);
    System.out.println("Posisi Player: "+ Hero.getX()+","+Hero.getY());

    GamePlayer Hero2 = new GamePlayer();
    Hero2.setDimensi(12,32);
    Hero2.setPosition(10,10);


    GameEnemy mon = new GameEnemy();
    mon.setDimensi(12,32);
    mon.setPosition(10,10);

    GameEnv sce = new GameEnv();
    sce.addPlayer(Hero);
    sce.addPlayer(Hero);
    sce.addPlayer(Hero2);
    sce.getAllPlayers();
    sce.removePlayer(Hero);
    sce.getAllPlayers();
    sce.addEnemy(mon);
    sce.Interaction();

    }
}