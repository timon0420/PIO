public class Main {
    public static void main(String[] args) {
        Player player1 = new PlayerComputer("Szymon");
        Player player2 = new PlayerComputer("Szymon1");
        Player player3 = new PlayerComputer("Szymon3");
        
        Game game = new Game();

        try {            
            game.addPlayer(player1);
            game.addPlayer(player1);
            game.addPlayer(player2);
            game.addPlayer(player3);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        game.play();
        game.removePlayer("Szymon1");
        game.removePlayer("Szymon15");
        game.printPlayers();
    }
}
