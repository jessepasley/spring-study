# Notes

What is ctx (ApplicationContext)?
ctx.getBeanDefinitionNames()

@SpringBootApplication == @Configuration + @EnableAutoConfiguration + @ComponentScan
@Bean
@RestController == @Controller + @ResponseBody
@SpringBootTest
@AutoConfigureMockMvc
@Autowired
@Test

Add this in pom.xml to add tests:
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-test</artifactId>
	<scope>test</scope>
</dependency>

Or if using gradle:
testImplementation('org.springframework.boot:spring-boot-starter-test')