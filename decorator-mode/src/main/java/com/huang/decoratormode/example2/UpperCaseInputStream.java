package com.huang.decoratormode.example2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义输入流装饰者，将字母统一变大写
 *
 * @author hsz
 */

public class UpperCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toUpperCase(c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int c = super.read(b, off, len);
        for (int i = off; i < off + c; i++) {
            b[i] = (byte) Character.toUpperCase(b[i]);
        }
        return c;
    }
}
