/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.base64;

import java.io.IOException;
import java.io.OutputStream;

import com.jw.base.framework.core.Constant;

/**
 * ## 类说明：
 * 	A base64 decoding output stream.
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|Base64OutputStream.java新增
 */
public class Base64OutputStream extends OutputStream {

	/**
	 * The underlying stream.
	 */
	private OutputStream outputStream = null;

	/**
	 * A value buffer.
	 */
	private int buffer = 0;

	/**
	 * How many bytes are currently in the value buffer?
	 */
	private int bytecounter = 0;

	/**
	 * A counter for the current line length.
	 */
	private int linecounter = 0;

	/**
	 * The requested line length.
	 */
	private int linelength = 0;

	/**
	 * <p>
	 * It builds a base64 encoding output stream writing the encoded data in the
	 * given underlying stream.
	 * </p>
	 * 
	 * <p>
	 * The encoded data is wrapped to a new line (with a CRLF sequence) every 76
	 * bytes sent to the underlying stream.
	 * </p>
	 * 
	 * @param outputStream
	 *            The underlying stream.
	 */
	public Base64OutputStream(OutputStream outputStream) {
		this(outputStream, 76);
	}

	/**
	 * <p>
	 * It builds a base64 encoding output stream writing the encoded data in the
	 * given underlying stream.
	 * </p>
	 * 
	 * <p>
	 * The encoded data is wrapped to a new line (with a CRLF sequence) every
	 * <em>wrapAt</em> bytes sent to the underlying stream. If the
	 * <em>wrapAt</em> supplied value is less than 1 the encoded data will not
	 * be wrapped.
	 * </p>
	 * 
	 * @param outputStream
	 *            The underlying stream.
	 * @param wrapAt
	 *            The max line length for encoded data. If less than 1 no wrap
	 *            is applied.
	 */
	public Base64OutputStream(OutputStream outputStream, int wrapAt) {
		this.outputStream = outputStream;
		this.linelength = wrapAt;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	写
	 * @param b
	 * @throws IOException
	 */
	@Override
	public void write(int b) throws IOException {
		int value = (b & 0xFF) << (16 - (bytecounter * 8));
		buffer = buffer | value;
		bytecounter++;
		if (bytecounter == 3) {
			commit();
		}
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	关闭
	 * @throws IOException
	 */
	@Override
	public void close() throws IOException {
		commit();
		outputStream.close();
	}

	/**
	 * ## 方法说明：
	 * 	It commits 4 bytes to the underlying stream.
	 * @throws IOException
	 */
	protected void commit() throws IOException {
		if (bytecounter > 0) {
			if (linelength > 0 && linecounter == linelength) {
				outputStream.write("\r\n".getBytes());
				linecounter = 0;
			}
			char b1 = Constant.chars.charAt((buffer << 8) >>> 26);
			char b2 = Constant.chars.charAt((buffer << 14) >>> 26);
			char b3 = (bytecounter < 2) ? Constant.pad : Constant.chars.charAt((buffer << 20) >>> 26);
			char b4 = (bytecounter < 3) ? Constant.pad : Constant.chars.charAt((buffer << 26) >>> 26);
			outputStream.write(b1);
			outputStream.write(b2);
			outputStream.write(b3);
			outputStream.write(b4);
			linecounter += 4;
			bytecounter = 0;
			buffer = 0;
		}
	}

}