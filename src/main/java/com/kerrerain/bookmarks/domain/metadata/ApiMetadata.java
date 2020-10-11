package com.kerrerain.bookmarks.domain.metadata;

public class ApiMetadata {

  /*
   * A version complying with the Semantic Versioning Specification.
   */
  private String version;

  public ApiMetadata(String version) {
    this.version = version;
  }

  public String getVersion() {
    return this.version;
  }
}
