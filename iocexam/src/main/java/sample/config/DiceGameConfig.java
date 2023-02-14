package sample.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import sample.Dice;
import sample.Game;
import sample.Player;

@Configuration
@PropertySource({
	"classpath:game.properties"
})
public class DiceGameConfig {
	@Bean
	public Dice dice(@Value("${face}") int face) {
//		return new Dice(6);
		Dice dice = new Dice();
		dice.setFace(face);
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
	public Player hong(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
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
//	public Game game(List<Player> playerList) {
	public Game game(Player kim, Player lee) {
		Game game = new Game();
		List<Player> playerList = new ArrayList();
		playerList.add(lee);
		playerList.add(kim);
		game.setPlayerList(playerList);
		return game;
		
	}
	
}
