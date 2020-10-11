package com.kerrerain.bookmarks.server.root;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

  @RequestMapping("/")
  public ApiMetadata root() {
    return new ApiMetadata("0.0.1");
  }
}
