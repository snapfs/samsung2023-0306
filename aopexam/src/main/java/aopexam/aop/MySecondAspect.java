package aopexam.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import aopexam.domain.Product;
@Aspect
@Component
public class MySecondAspect {
	
	@Pointcut("execution(* findProduct(*))")
	private void pc() {}
	
	@Pointcut("execution(* *(*))")
	private void pc2() {}
	
	@Before("execution(* *(*))")
	public void before(JoinPoint jp) {
		System.out.println("**********Hello before!!!     *** 메소드가 호출되기 전에 실행되요~~");
		Signature sig = jp.getSignature();

		System.out.println("=====> 메소드명 :: " + sig.getName());

		Object[] args = jp.getArgs();

		for (Object object : args) {
			System.out.println("------->인자 :::   " + object);
		}
	}
	@After("execution(* findProduct(*))")
	public void after() {
		System.out.println("Hell after!!!    #### 메소드가 호출 된 후에 실행 된다!!");
	}
	
	@AfterReturning(value = "pc2()", returning = "product")
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
	
	@AfterThrowing(value = "pc()", throwing = "ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("Hello afterThrowing~~~  ***********  예외가 발생되었을 때 실행됨!!! ");
		System.out.println("예외 :::: "+ ex.toString());
	}
	
	@Around("pc()")
	public Product around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Hello around!!!   *** before가 실행된 후에 실행!!");
		
		
		Product product = (Product)pjp.proceed();
		
		product.setPrice(product.getPrice()-1000);
		
		System.out.println("Hello around!!!   *** after가 실행되기 전에 실행됨!!! ");
		return product;
	}
}
