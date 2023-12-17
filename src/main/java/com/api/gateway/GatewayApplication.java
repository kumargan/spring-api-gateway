package com.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
//
//	@RequestMapping("/circuitbreakerfallback")
//	public String circuitbreakerfallback() {
//		return "This is a fallback";
//	}
//
//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("path_route", r -> r.path("/v1/get")
//						.uri("http://www.iana.org/domains/special"))
//				.route("host_route", r -> r.host("*.myhost.org")
//						.uri("http://httpbin.org"))
//				.route("rewrite_route", r -> r.host("*.rewrite.org")
//						.filters(f -> f.rewritePath("/foo/(?<segment>.*)",
//								"/${segment}"))
//						.uri("http://httpbin.org"))
//				.route("circuitbreaker_route", r -> r.host("*.circuitbreaker.org")
//						.filters(f -> f.circuitBreaker(c -> c.setName("slowcmd")))
//						.uri("http://httpbin.org"))
//				.route("circuitbreaker_fallback_route", r -> r.host("*.circuitbreakerfallback.org")
//						.filters(f -> f.circuitBreaker(c -> c.setName("slowcmd").setFallbackUri("forward:/circuitbreakerfallback")))
//						.uri("http://httpbin.org"))
//				.route("websocket_route", r -> r.path("/echo")
//						.uri("ws://localhost:9000"))
//				.build();
//	}
}
