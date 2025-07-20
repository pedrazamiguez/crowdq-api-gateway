package es.pedrazamiguez.crowdq.apigateway.config.filter;

import java.util.Objects;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RequestRateLimiterFilterConfiguration {

  @Bean
  KeyResolver userKeyResolver() {
    return exchange ->
        Mono.just(
            Objects.requireNonNull(exchange.getRequest().getHeaders().getFirst("Authorization")));
  }
}
