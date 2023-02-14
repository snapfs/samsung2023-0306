package aopexam.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import aopexam.domain.Product;

public class MyFirstAspect {
	public void before(JoinPoint jp) {
		System.out.println("**********Hello before!!!     *** 메소드가 호출되기 전에 실행되요~~");
		Signature sig = jp.getSignature();

		System.out.println("=====> 메소드명 :: " + sig.getName());

		Object[] args = jp.getArgs();

		for (Object object : args) {
			System.out.println("------->인자 :::   " + object);
		}
	}

	public void after() {
		System.out.println("Hell after!!!    #### 메소드가 호출 된 후에 실행 된다!!");
	}

	public void afterReturning(JoinPoint jp, Product product) {
		System.out.println("Hell afterReturning!!!    #### 메소드가 예외없이 실행이 종료되었을 때 실행!!!");

		Signature sig = jp.getSignature();

		System.out.println("=====> 메소드명 :: " + sig.getName());

		Object[] args = jp.getArgs();

		for (Object object : args) {
			System.out.println("------->인자 :::   " + object);
		}
		
		System.out.println("+++++"+product+"+++++++++++++");
	}
	
	public void afterThrowing(Throwable ex) {
		System.out.println("Hello afterThrowing~~~  ***********  예외가 발생되었을 때 실행됨!!! ");
		System.out.println("예외 :::: "+ ex.toString());
	}
	public Product around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Hello around!!!   *** before가 실행된 후에 실행!!");
		
		
		Product product = (Product)pjp.proceed();
		
		product.setPrice(product.getPrice()-1000);
		
		System.out.println("Hello around!!!   *** after가 실행되기 전에 실행됨!!! ");
		return product;
	}
}
