package com.kerrerain.bookmarks.domain.metadata;

import org.springframework.stereotype.Service;

@Service
public class MetadataService {

  public ApiMetadata getAPIMetadata() {
    return new ApiMetadata("0.0.1");
  }

}
