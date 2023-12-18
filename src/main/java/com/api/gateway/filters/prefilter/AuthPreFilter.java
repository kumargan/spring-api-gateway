package com.api.gateway.filters.prefilter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Slf4j
@Component
public class AuthPreFilter extends AbstractGatewayFilterFactory<AuthPreFilter.Config> {
    public AuthPreFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        //Custom Pre Filter. Suppose we can extract JWT and perform Authentication
        return (exchange, chain) -> {
            log.info("First pre filter" + exchange.getRequest());
            //Custom Post Filter.Suppose we can call error response handler based on error code.


//            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//                log.info("First post filter");
//            }));

            return chain.filter(exchange);
        };
    }

    public static class Config {
        // Put the configuration properties
    }
}