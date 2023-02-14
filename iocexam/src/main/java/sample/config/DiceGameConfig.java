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
//		return new Dice(6);
		Dice dice = new Dice();
		dice.setFace(6);
		return dice;
	}
	
	@Bean
	public Player kang(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("kang");
		return player;
	}
	
	@Bean
	public Player hong() {
		Player player = new Player();
		player.setDice(dice());
		player.setName("hong");
		return player;
	}
	@Bean
	public Player kim(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("kim");
		return player;
	}
	@Bean
	public Player lee(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("lee");
		return player;
	}
	@Bean
	public Game game(List<Player> playerList) {
		Game game = new Game();
		game.setPlayerList(playerList);
		return game;
		
	}
	
}
