/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.binaryspaceship.mimetype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Verifies that mapping between mime types and file extensions work correctly.
 * 
 * @author metamaker (Dmytro Yurchenko)
 * @author www.binaryspaceship.com
 * @version 1.0.0
 */
class MimeTypeMappingTest {
    @Test
    void test_extensionToMimeType_knownExtension()
    {
        final String mimeType = "image/jpeg";
        final String extension = "jpeg";

        assertEquals(mimeType, MimeTypeMapping.extensionToMimeType(extension));
    }

    @Test
    void test_extensionToMimeType_unknownExtension()
    {
        final String extension = "jpeg.unknown.type";

        assertNull(MimeTypeMapping.extensionToMimeType(extension));
    }

    @Test
    void test_extensionToMimeType_nullExtension()
    {
        assertNull(MimeTypeMapping.extensionToMimeType(null));
    }

    @Test
    void test_mimeTypeToExtension_knownMimeType()
    {
        final String mimeType = "image/jpeg";
        final String extension = "jpeg";

        assertEquals(extension, MimeTypeMapping.mimeTypeToExtension(mimeType));
    }

    @Test
    void test_mimeTypeToExtension_unknownMimeType()
    {
        final String mimeType = "image/unknown-jpeg-type";

        assertNull(MimeTypeMapping.mimeTypeToExtension(mimeType));
    }

    @Test
    void test_mimeTypeToExtension_nullMimeType()
    {
        assertNull(MimeTypeMapping.mimeTypeToExtension(null));
    }
}