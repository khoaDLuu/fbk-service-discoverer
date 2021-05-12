package com.filmbooking.service_discoverer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
  properties = {"spring.cloud.config.enabled=false"}
)
class ServiceDiscovererApplicationTests {

	@Test
	void contextLoads() {
	}

}
