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
		Dice dice = new Dice(face);
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
	public Player kim(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
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
//	public Game game(Player kang, Player kim) {
//		List<Player> playerList = new ArrayList();
//		playerList.add(kang);
//		playerList.add(kim);
//		playerList.add(lee(dice()));
//		playerList.add(hong(dice()));
		Game game = new Game();
		game.setPlayerList(playerList);
		return game;
	}
}
