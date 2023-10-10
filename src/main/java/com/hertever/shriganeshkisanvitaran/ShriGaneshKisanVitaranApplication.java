package com.hertever.shriganeshkisanvitaran;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hertever.shriganeshkisanvitaran.entity.Order;
import com.hertever.shriganeshkisanvitaran.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableMongoRepositories(basePackageClasses = UserRepository.class)
//@EnableJpaRepositories(excludeFilters =
//@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = UserRepository.class))
@SpringBootApplication
public class ShriGaneshKisanVitaranApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;
	private ObjectMapper objectMapper = new ObjectMapper();
	public static void main(String[] args) {
		SpringApplication.run(ShriGaneshKisanVitaranApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		orderRepository.deleteAll();
		orderRepository.save(Order.builder()
						.notes("testing 2...")
						.totalAmount(100)
						.build());
		System.out.println("Customers found with findAll():");
		for (Order order: orderRepository.findAll()) {
			System.out.println(objectMapper.writeValueAsString(order));
		}
	}
}
