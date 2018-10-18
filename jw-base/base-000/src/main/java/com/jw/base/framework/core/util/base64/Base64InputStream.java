/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.base64;

import java.io.IOException;
import java.io.InputStream;

import com.jw.base.framework.core.Constant;

/**
 * ## 类说明：
 * 	A base64 encoding input stream.
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|Base64InputStream.java新增
 */
public class Base64InputStream extends InputStream {

	/**
	 * The underlying stream.
	 */
	private final InputStream inputStream;

	/**
	 * The buffer.
	 */
	private int[] buffer;

	/**
	 * A counter for values in the buffer.
	 */
	private int bufferCounter = 0;

	/**
	 * End-of-stream flag.
	 */
	private boolean eof = false;

	/**
	 * <p>
	 * It builds a base64 decoding input stream.
	 * </p>
	 * 
	 * @param inputStream
	 *            The underlying stream, from which the encoded data is read.
	 */
	public Base64InputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 * @throws IOException
	 */
	@Override
	public int read() throws IOException {
		if (buffer == null || bufferCounter == buffer.length) {
			if (eof) {
				return -1;
			}
			acquire();
			if (buffer.length == 0) {
				buffer = null;
				return -1;
			}
			bufferCounter = 0;
		}
		return buffer[bufferCounter++];
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	Reads from the underlying stream, decodes the data and puts the decoded
	 * 	bytes into the buffer.
	 * @throws IOException
	 */
	private void acquire() throws IOException {
		char[] four = new char[4];
		int i = 0;
		do {
			int b = inputStream.read();
			if (b == -1) {
				if (i != 0) {
					throw new IOException("Bad base64 stream");
				} else {
					buffer = new int[0];
					eof = true;
					return;
				}
			}
			char c = (char) b;
			if (Constant.chars.indexOf(c) != -1 || c == Constant.pad) {
				four[i++] = c;
			} else if (c != '\r' && c != '\n') {
				throw new IOException("Bad base64 stream");
			}
		} while (i < 4);
		boolean padded = false;
		for (i = 0; i < 4; i++) {
			if (four[i] != Constant.pad) {
				if (padded) {
					throw new IOException("Bad base64 stream");
				}
			} else {
				if (!padded) {
					padded = true;
				}
			}
		}
		int l;
		if (four[3] == Constant.pad) {
			if (inputStream.read() != -1) {
				throw new IOException("Bad base64 stream");
			}
			eof = true;
			if (four[2] == Constant.pad) {
				l = 1;
			} else {
				l = 2;
			}
		} else {
			l = 3;
		}
		int aux = 0;
		for (i = 0; i < 4; i++) {
			if (four[i] != Constant.pad) {
				aux = aux | (Constant.chars.indexOf(four[i]) << (6 * (3 - i)));
			}
		}
		buffer = new int[l];
		for (i = 0; i < l; i++) {
			buffer[i] = (aux >>> (8 * (2 - i))) & 0xFF;
		}
	}

	/**
	 * ## 方法说明：
	 * 	关闭
	 * @throws IOException
	 */
	@Override
	public void close() throws IOException {
		inputStream.close();
	}
}