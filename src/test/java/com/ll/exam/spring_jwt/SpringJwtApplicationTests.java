package com.ll.exam.spring_jwt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJwtApplicationTests {

	@Value("${custom.jwt.secretKey}")
	private String secretKey;

	@Test
	@DisplayName("secretKey 키가 존재해야합니다.")
	void t1() {

		System.out.println(secretKey);
	}

}
