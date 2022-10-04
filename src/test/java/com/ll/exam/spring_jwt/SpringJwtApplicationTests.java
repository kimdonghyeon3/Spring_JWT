package com.ll.exam.spring_jwt;

import com.ll.exam.spring_jwt.jwt.JwtProvider;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Base64;
import javax.crypto.SecretKey;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringJwtApplicationTests {

	@Autowired
	private JwtProvider jwtProvider;
	@Value("${custom.jwt.secretKey}")
	private String secretKeyPlain;

	@Test
	@DisplayName("secretKey 키가 존재해야한다.")
	void t1() {
		assertThat(secretKeyPlain).isNotNull();
	}

	@Test
	@DisplayName("sercretKey 원문으로 hmac 암호화 알고리즘에 맞는 SecretKey 객체를 만들 수 있다.")
	void t2() {
		String keyBase64Encoded = Base64.getEncoder().encodeToString(secretKeyPlain.getBytes());
		SecretKey secretKey = Keys.hmacShaKeyFor(keyBase64Encoded.getBytes());

		assertThat(secretKey).isNotNull();
	}

	@Test
	@DisplayName("JwtProvider 객체로 시크릿키 객체를 생성할 수 있다.")
	void t3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Method getSecretKey = JwtProvider.class.getDeclaredMethod("getSecretKey");
		getSecretKey.setAccessible(true);
		SecretKey secretKey = (SecretKey) getSecretKey.invoke(jwtProvider);

		assertThat(secretKey).isNotNull();
	}

	@Test
	@DisplayName("SecretKey는 한번만 생성되어야 한다.")
	void t4()  throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{
		Method getSecretKey = JwtProvider.class.getDeclaredMethod("getSecretKey");
		getSecretKey.setAccessible(true);


		SecretKey secretKey1 = (SecretKey) getSecretKey.invoke(jwtProvider);
		SecretKey secretKey2 = (SecretKey) getSecretKey.invoke(jwtProvider);

		System.out.println("secretKey1 = " + secretKey1);
		System.out.println("secretKey2 = " + secretKey2);

		assertThat(secretKey1).isEqualTo(secretKey2);
	}

}
