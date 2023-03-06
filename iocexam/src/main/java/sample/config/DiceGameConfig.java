package sample.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.Dice;
import sample.Game;
import sample.Player;

@Configuration
public class DiceGameConfig {
	@Bean
	public Dice dice() {
		Dice dice = new Dice(6);
		return dice;
	}
	
	@Bean
	public Player kang(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("강경미");
		return player;
	}
	@Bean
	public Player kim() {
		Player player = new Player();
		player.setDice(dice());
		player.setName("김길동");
		return player;
	}
	@Bean
	public Player hong(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("홍당무");
		return player;
	}
	@Bean
	public Player lee(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("둘리");
		return player;
	}
	
	@Bean
	public Game game(List<Player> playerList) {
		Game game = new Game();
		game.setPlayerList(playerList);
		return game;
	}
}
