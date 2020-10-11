package com.kerrerain.bookmarks.server;

import com.kerrerain.bookmarks.domain.metadata.ApiMetadata;
import com.kerrerain.bookmarks.domain.metadata.MetadataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

  private MetadataService metadataService;

  public RootController(@Autowired MetadataService metadataService) {
    this.metadataService = metadataService;
  }

  @RequestMapping("/")
  public ApiMetadata root() {
    return metadataService.getAPIMetadata();
  }
}
