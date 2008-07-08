package org.guanxi.common.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * <p>This class exists because the FilterWriter may choose one of three
 * methods with which to write the characters. By default all three of
 * these methods write directly to the internal Writer instead of all
 * calling the {@link #write(int)} method.</p>
 * 
 * <p>This changes that behaviour so that {@link #write(char[], int, int)}
 * and {@link #write(String, int, int)} call {@link #write(int)}. This means
 * that the filter needs to only implement a single method.</p>
 * 
 * @author matthew
 */
// default is not an accident. This class is not required outside this package.
abstract class ProperFilterWriter extends FilterWriter {

	public ProperFilterWriter(Writer out) {
		super(out);
	}
	
	public void write(String string, int offset, int length) throws IOException {
		write(string.toCharArray(), offset, length);
	}
	
	public void write(char[] cbuffer, int offset, int length) throws IOException {
		for ( int i = 0 ; i < length ; ++i ) {
			write(cbuffer[i + offset]);
		}
	}
}