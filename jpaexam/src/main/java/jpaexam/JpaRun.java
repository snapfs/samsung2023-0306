package jpaexam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaRun {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexam");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin(); // 트랜잭선 시작!!!

		try {

//등록!!!  			
//			Product product = new Product(); // product 엔티티 생성!!
////			product.setId(1L);
//			product.setName("pen");
//			product.setPrice(3000); // 여기까지는 비영속 상태!!
//
//			System.out.println("persist before!!!");
//			em.persist(product); // product 가 영속 상태가 된다!! 이때 DB에 저장되는 것은 아니고, 영속성 컨텍스트가 관리하는 상태가 된다!!!
//			System.out.println("persist after!!!");
//		
//			System.out.println(product.getId());
			
			
//수정			
//			Product findProduct = em.find(Product.class, 2L);
//			findProduct.setPrice(1000);
//			findProduct.setPrice(2000);
//			findProduct.setPrice(3000);
//			
//			findProduct.setPrice(1000);
			
//삭제        
			Product removeProduct = em.find(Product.class, 2L);
			em.remove(removeProduct);
			
			
			System.out.println("commit 전!!");
			tx.commit();
			System.out.println("commit 후!!");
			
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}

		
	}

}
