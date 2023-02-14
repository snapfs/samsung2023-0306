package sample.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.Game;
import sample.config.DiceGameConfig;

public class DiceGameRun {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DiceGameConfig.class);
		Game game = context.getBean(Game.class);
		game.play();
	}
}
