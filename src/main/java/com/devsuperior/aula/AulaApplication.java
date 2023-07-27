package com.devsuperior.aula;

import com.devsuperior.aula.models.Order;
import com.devsuperior.aula.services.OrderService;
import com.devsuperior.aula.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private ShippingService shippingService;

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {SpringApplication.run(AulaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o código do pedido: ");
		int code = scanner.nextInt();
		System.out.print("Digite o valor do pedido: ");
		double basic = scanner.nextDouble();
		System.out.print("Digite o valor do desconto: ");
		double discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Codigo do pedido:" + order.getCode());
		System.out.printf("Valor total: %.2f%n", + orderService.total(order));
	}
}
