# Mime type utilities

[![Build Status](https://travis-ci.com/binaryspaceship/mimetype.svg?branch=master)](https://travis-ci.com/binaryspaceship/mimetype)

This package contains utilities for manipulating mime types in Java.

## Usage

#### Find mime type for file extension:

```
import com.binaryspaceship.mimetype.MimeTypeMapping;

class Solution {
  public String getMimeTypeForFileExtension(String extension)
  {
    // For extension "jpeg" returns "image/jpeg"
    return MimeTypeMapping.extensionToMimeType(extension);
  }
}

```

#### Find  file extension for mime type:

```
import com.binaryspaceship.mimetype.MimeTypeMapping;

class Solution {
  public String getFileExtensionForMimeType(String mimetype)
  {
    // For mimetype "image/jpeg" returns "jpeg" (without dot in extension)
    return MimeTypeMapping.mimeTypeToExtension(mimeType);
  }
}

```
