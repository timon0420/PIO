public class Main {
    public static void main(String[] args) {
        Player player1 = new PlayerComputer("Szymon");
        Player player2 = new PlayerComputer("Szymon1");
        Player player3 = new PlayerComputer("Szymon3");
        
        Game game = new Game();

        try {            
            game.addPlayer(player1);
            game.addPlayer(player2);
            game.addPlayer(player3);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        for (int i = 0; i < 10; i++) {
            game.play();
        }
        //game.printPlayers();

        game.printStats();
        
    }
}
