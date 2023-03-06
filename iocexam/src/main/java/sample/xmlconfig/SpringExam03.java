package sample.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.Game;
import sample.MyBean;
import sample.config.DiceGameConfig;

public class SpringExam03 {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("dicegame.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(DiceGameConfig.class);
		
		Game game = context.getBean(Game.class);
		game.play();
	}

}
