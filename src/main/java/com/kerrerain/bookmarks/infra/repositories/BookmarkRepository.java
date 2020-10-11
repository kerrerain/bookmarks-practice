package com.kerrerain.bookmarks.infra.repositories;

import com.kerrerain.bookmarks.infra.entities.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}
