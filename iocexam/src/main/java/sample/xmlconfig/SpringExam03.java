package sample.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.Game;
import sample.MyBean;

public class SpringExam03 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dicegame.xml");
		
		Game game = context.getBean(Game.class);
		game.play();
	}

}
