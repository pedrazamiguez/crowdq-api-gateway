package es.pedrazamiguez.crowdq.apigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

  @GetMapping("/fallback/questions")
  public Mono<ResponseEntity<String>> questionServiceFallback() {
    return Mono.just(
        ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
            .body("Question Service is currently unavailable."));
  }
}
