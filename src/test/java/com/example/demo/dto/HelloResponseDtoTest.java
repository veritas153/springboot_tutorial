package com.example.demo.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HelloResponseDtoTest {

	@Test
	public void lombok_test() {
		//given
		String name = "test";
		int amount = 1000;
		
		//when
		HelloResponseDto dto = new HelloResponseDto(name, amount);
		
		//then
		assertThat(dto.getName()).isEqualTo(name);
		assertThat(dto.getAmount()).isEqualTo(amount);
		
	}
	
}
