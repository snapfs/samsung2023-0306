package sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import sample.domain.Product;

public class MyFirstAspect {
	public void before(JoinPoint jp) {
		// 메소드가 시작되기 전에 동작하는 어드바이스!!

		System.out.println("Hello Before!!!   ************************ 메소드가 호출 되기 전에 실행!!");

		Signature sig = jp.getSignature();

		System.out.println(sig.getName());

		Object[] args = jp.getArgs();
		for (Object object : args) {
			System.out.println("------>인자 ::: " + object);
		}
	}

	public void after() {
		System.out.println("Hello After!!  **************** 메소드가 호출된 후 실행됨!!!");
	}

	public void afterReturning(JoinPoint jp, Product product) {
		System.out.println("Hello AfterReturning!!   *************  메소드가 예외없이 실행이 종료 되었을때!!");
		Signature sig = jp.getSignature();

		System.out.println(sig.getName());

		Object[] args = jp.getArgs();
		for (Object object : args) {
			System.out.println("------>인자 ::: " + object);
		}
		
		product.setName("pen22222");
	}
	
	public void afterThrowing(Throwable ex) {
		System.out.println("Hello AfterThrowing!!   ***************  예외가 발생 되었을 때 실행!! ");
		System.out.println("exception value = "+ex);
	}
	
	public Product around(ProceedingJoinPoint pjp) throws Throwable {
System.out.println("Hello Around!!   ************  before 가 실행되기 전에 실행!!");
		
		Product product =(Product)	pjp.proceed();
		
		System.out.println("Hello Around!!   ************  after 가 실행된 후에 실행!!");
		
		product.setPrice(5000);
		
		return product;
	}

}
