package com.jeeplus.common.utils.text;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * JDK7可直接使用java.nio.charset.StandardCharsets.
 * <p>
 * 也可以直接使用Guava Charsets.
 * <p>
 * 尽量使用Charsets.UTF8而不是"UTF-8"，减少JDK里的Charset查找消耗.
 *
 * @author calvin
 */
public class Charsets {
    public static final String UTF_8_NAME = "UTF-8";

    public static final Charset UTF_8 = StandardCharsets.UTF_8;
    public static final Charset US_ASCII = StandardCharsets.US_ASCII;
    public static final Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
}
