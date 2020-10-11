package com.kerrerain.bookmarks.domain.bookmark;

import java.util.List;

import com.kerrerain.bookmarks.infra.bookmark.Bookmark;
import com.kerrerain.bookmarks.infra.bookmark.BookmarkRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookmarkService {

  private BookmarkRepository bookmarkRepository;

  public BookmarkService(@Autowired BookmarkRepository bookmarkRepository) {
    this.bookmarkRepository = bookmarkRepository;
  }

  public void createBookmark(String name, String url) {
    var bookmark = new Bookmark();
    bookmark.setName(name);
    bookmark.setUrl(url);

    this.bookmarkRepository.save(bookmark);
  }

  public List<Bookmark> getBookmarkList() {
    return this.bookmarkRepository.findAll();
  }

  public void clearAllBookmarks() {
    this.bookmarkRepository.deleteAll();
  }

}
