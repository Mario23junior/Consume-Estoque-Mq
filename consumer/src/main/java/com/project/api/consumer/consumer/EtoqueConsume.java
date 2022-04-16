package com.project.api.consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.project.estoque.constant.RabbitmqConstantes;
import com.project.estoque.dto.EstoqueDto;

@Component
public class EtoqueConsume {
 
	@RabbitListener(queues = RabbitmqConstantes.FILA_ESTOQUE)
	private void consumidor(EstoqueDto estoqueDto) {
		System.out.println(estoqueDto.getId());
		System.out.println(estoqueDto.getQuantidade());
		System.out.println("#####################################");
		
	}
}
