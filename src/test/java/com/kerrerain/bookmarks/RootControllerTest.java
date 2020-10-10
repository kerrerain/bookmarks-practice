package com.kerrerain.bookmarks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RootControllerTest {

  @Test
  public void shouldBlockIfNotAuthenticated(@Autowired WebTestClient client) {
    // Given

    // When
    var response = client //
        .get() //
        .uri("/") //
        .exchange();

    // Then
    response.expectStatus().isUnauthorized();
  }

  @Test
  public void shouldReturnMetadatas(@Autowired WebTestClient client) {
    // Given

    // When
    var response = client //
        .get() //
        .uri("/") //
        .headers(headers -> headers.setBasicAuth("admin", "admin")) //
        .exchange();

    // Then
    response.expectStatus().isOk();
    response.expectBody() //
        .jsonPath("$.version") //
        .isEqualTo("0.0.1");
  }
}
