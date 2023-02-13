package sample.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.Dice;
import sample.Game;
import sample.Player;

public class SpringExam2 {

	public static void main(String[] args) {
		
		System.out.println("ApplicationContext 생성전!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("dicegame.xml");
//		BeanFactory context = 
		System.out.println("ApplicationContext 생성후!!");
		
//		Dice dice = context.getBean(Dice.class);
//		
//		System.out.println(dice.getNumber());
//		System.out.println(dice.getNumber());
//		System.out.println(dice.getNumber());
//		System.out.println(dice.getNumber());
		
//		Player player = context.getBean(Player.class);
//		
//		player.play();
//		player.play();
//		player.play();
//		player.play();
		
		Game game = context.getBean(Game.class);
		game.play();
	
	}

}
