package com.kerrerain.bookmarks.domain.bookmark;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookmarkServiceTest {

  @Autowired
  private BookmarkService service;

  @Test
  public void shouldSaveAndLoadBookmark() {
    // Given
    service.clearAllBookmarks();
    service.createBookmark("Spring data reference",
        "https://docs.spring.io/spring-data/jpa/docs/2.3.4.RELEASE/reference/html");

    // When
    var actual = service.getBookmarkList();

    // Then
    assertEquals(1, actual.size());
  }

}
