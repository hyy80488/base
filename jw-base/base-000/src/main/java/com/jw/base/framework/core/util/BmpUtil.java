package com.jw.base.framework.core.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import javax.imageio.ImageIO;

public class BmpUtil {

	/** 
	 * ## 方法说明：
	 * 	bmp 转jpg
	 * @param byt
	 * @return
	 * @throws Exception
	*/
	public static byte[] bmpTojpg(byte[] is) throws Exception {
		InputStream inStream = null;
		ByteArrayOutputStream outStream = null;
		BufferedImage bi = null;
		byte[] b = null;
		try {
			inStream = new ByteArrayInputStream(is);
			bi = ImageIO.read(inStream);
			//            Image Itemp = bi.getScaledInstance(wdith, height, BufferedImage.SCALE_SMOOTH);
			//            BufferedImage thumbnail = new BufferedImage(wdith, height, BufferedImage.TYPE_INT_RGB);
			//            thumbnail.getGraphics().drawImage(Itemp, 0, 0, null);

			outStream = new ByteArrayOutputStream();

			// 绘图
			//            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			//            JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(thumbnail);
			//            param.setQuality(1.0f, false);
			//            encoder.encode(thumbnail);

			ImageIO.write(bi, "jpg", outStream);

			b = outStream.toByteArray();
			return b;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(inStream)) {
				inStream.close();
			}
			if (Objects.nonNull(outStream)) {
				outStream.flush();
				outStream.close();
			}
			if (Objects.nonNull(bi)) {
				bi.flush();
				bi = null;
			}
		}
		return null;
	}

	public static int constructInt(byte[] in, int offset) {
		int ret = ((int) in[offset + 3] & 0xff);
		ret = (ret << 8) | ((int) in[offset + 2] & 0xff);
		ret = (ret << 8) | ((int) in[offset + 1] & 0xff);
		ret = (ret << 8) | ((int) in[offset + 0] & 0xff);
		return (ret);
	}

	public static int constructInt3(byte[] in, int offset) {
		int ret = 0xff;
		ret = (ret << 8) | ((int) in[offset + 2] & 0xff);
		ret = (ret << 8) | ((int) in[offset + 1] & 0xff);
		ret = (ret << 8) | ((int) in[offset + 0] & 0xff);
		return (ret);
	}

	public static long constructLong(byte[] in, int offset) {
		long ret = ((long) in[offset + 7] & 0xff);
		ret |= (ret << 8) | ((long) in[offset + 6] & 0xff);
		ret |= (ret << 8) | ((long) in[offset + 5] & 0xff);
		ret |= (ret << 8) | ((long) in[offset + 4] & 0xff);
		ret |= (ret << 8) | ((long) in[offset + 3] & 0xff);
		ret |= (ret << 8) | ((long) in[offset + 2] & 0xff);
		ret |= (ret << 8) | ((long) in[offset + 1] & 0xff);
		ret |= (ret << 8) | ((long) in[offset + 0] & 0xff);
		return (ret);
	}

	public static double constructDouble(byte[] in, int offset) {
		long ret = constructLong(in, offset);
		return (Double.longBitsToDouble(ret));
	}

	public static short constructShort(byte[] in, int offset) {
		short ret = (short) ((short) in[offset + 1] & 0xff);
		ret = (short) ((ret << 8) | (short) ((short) in[offset + 0] & 0xff));
		return (ret);
	}

	static class BitmapHeader {
		public int iSize, ibiSize, iWidth, iHeight, iPlanes, iBitcount, iCompression, iSizeimage, iXpm, iYpm, iClrused, iClrimp;

		// 读取bmp文件头信息  
		public void read(InputStream fs) throws IOException {
			final int bflen = 14;
			byte bf[] = new byte[bflen];
			fs.read(bf, 0, bflen);
			final int bilen = 40;
			byte bi[] = new byte[bilen];
			fs.read(bi, 0, bilen);
			iSize = constructInt(bf, 2);
			ibiSize = constructInt(bi, 2);
			iWidth = constructInt(bi, 4);
			iHeight = constructInt(bi, 8);
			iPlanes = constructShort(bi, 12);
			iBitcount = constructShort(bi, 14);
			iCompression = constructInt(bi, 16);
			iSizeimage = constructInt(bi, 20);
			iXpm = constructInt(bi, 24);
			iYpm = constructInt(bi, 28);
			iClrused = constructInt(bi, 32);
			iClrimp = constructInt(bi, 36);
		}
	}

	public static Image read(InputStream fs) {
		try {
			BitmapHeader bh = new BitmapHeader();
			bh.read(fs);
			if (bh.iBitcount == 24) {
				return (readImage24(fs, bh));
			}
			if (bh.iBitcount == 32) {
				return (readImage32(fs, bh));
			}
			fs.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return (null);
	}

	//24位  
	protected static Image readImage24(InputStream fs, BitmapHeader bh) throws IOException {
		Image image;
		if (bh.iSizeimage == 0) {
			bh.iSizeimage = ((((bh.iWidth * bh.iBitcount) + 31) & ~31) >> 3);
			bh.iSizeimage *= bh.iHeight;
		}
		int npad = (bh.iSizeimage / bh.iHeight) - bh.iWidth * 3;
		int ndata[] = new int[bh.iHeight * bh.iWidth];
		byte brgb[] = new byte[(bh.iWidth + npad) * 3 * bh.iHeight];
		fs.read(brgb, 0, (bh.iWidth + npad) * 3 * bh.iHeight);
		int nindex = 0;
		for (int j = 0; j < bh.iHeight; j++) {
			for (int i = 0; i < bh.iWidth; i++) {
				ndata[bh.iWidth * (bh.iHeight - j - 1) + i] = constructInt3(brgb, nindex);
				nindex += 3;
			}
			nindex += npad;
		}
		image = Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(bh.iWidth, bh.iHeight, ndata, 0, bh.iWidth));
		fs.close();
		return (image);
	}

	//32位  
	protected static Image readImage32(InputStream fs, BitmapHeader bh) throws IOException {
		Image image;
		int ndata[] = new int[bh.iHeight * bh.iWidth];
		byte brgb[] = new byte[bh.iWidth * 4 * bh.iHeight];
		fs.read(brgb, 0, bh.iWidth * 4 * bh.iHeight);
		int nindex = 0;
		for (int j = 0; j < bh.iHeight; j++) {
			for (int i = 0; i < bh.iWidth; i++) {
				ndata[bh.iWidth * (bh.iHeight - j - 1) + i] = constructInt3(brgb, nindex);
				nindex += 4;
			}
		}
		image = Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(bh.iWidth, bh.iHeight, ndata, 0, bh.iWidth));
		fs.close();
		return (image);
	}

	/*
	 转换 
	StringBuffer secBook1 = new StringBuffer();
	secBook1.append("wtLohdXc1GgN9Wewd3tdrUtce6rsN48KLk04FEwwy5P7D0r3KExT1uAy/TH8aLxyZ5xh3D1+lib3");
	secBook1.append("yc/NAB166ZmWKYx+6ZQ8CbKCoBl9IS5QwuXa+AiAgeI8gMJ7f6PDBYgq6qcmhpkN/qjkLb8BN9b3");
	secBook1.append("Mv4P2gripI2ZrSzwxN4sqYHKEZhN2/HDXKoiYJcadnts+673dlS0mskZcC3G2z5xwa0lYywieVaY");
	secBook1.append("ntz/oprIvRi6qs/tzsCQix5O1UmeGTl/iX9p9DSGAOrOOzChOynWijibiXdSirGhQVKPKmTa7U/v");
	secBook1.append("P9lFeIKeEAz1cgI4Jq3x4cQUgRbxid1cqhX7aNny0hQdvYRQbZGvDedZKN7oZ4Ty1dsERAiCSqfM");
	secBook1.append("pnM/vH11CcmjZxdkORUjBcj2hcZAI0PLtI2px8aMAZjQfJjc3nLbdi2G1Fo4J4QeG1YlFPsTPTIo");
	secBook1.append("6yyUAylPPolS9hycWLAytrV6iSAk2VVRXGyo3IUP8uGA/V8mvvNW56WIHGN7zarU6sOxqRnqlB4J");
	secBook1.append("q7AogKuB2MasMXURN/C89k89sZcA0jdABGU6bFo0OelEtl1RSoYqHYaPqUcImD0P7iOg3amWyT7X");
	secBook1.append("XjtnZyWNBz13OmvchzOTFdFoVnLCr9yuzXXowjqZpsBz328yXnPCft0Bx0xsjEdG8Z9b9HgFLCkb");
	secBook1.append("b4eUeAx2gmYXRqgMw5BENPEx5avHXyfeQ+ejYmmHrahytartjj6Tt81QN82M9V3Kw/noBZfklShl");
	secBook1.append("W2N6fPzWo5QzHPoGwNHnKIvs3yN/vCUJgTp00oH2+WEjcNJZq0Td1WuPfzkLf6BkJrVGieU08Iwl");
	secBook1.append("FZXS+SGaG/tQ96G+lAxBJQDYsaLb77d5/5Q6GwR6eEjyXRdOBGIVari2c9Ak9MCqQ3nT3oOow5mg");
	secBook1.append("72FJfw07lAxUL0VvGoeEeLihrDBOCSvQslN77CjJEYHqvuk25FwXlgyI1CSLqbYPKsZDw2cshrGN");
	secBook1.append("jt8Lai/vPxQXOJWoz6ZX/V/RilZ4wE4ue6bhWHA1HuxbeO+8Yb1vA6+Vaph0elhishn4bBJn/+jG");
	secBook1.append("LZ3Wf6xNgfxxu2dA1Zg2jOFjGURzT9B7VXFpYp02qiI9jU4aimxHqJafgVhcwcq4hwQ802Ag38qS");
	secBook1.append("lnjvfTHSme5vRH9UnGEfxKv+1m8lptkd+jGMbWXuWc6eCs0E81U8DBxk7nIFBZZvbGfDYC5y5s7K");
	secBook1.append("Q6wIAaefuQr8xKU5Gu/9j1QUA4M3Oicx3xlYQEqPG8pO8v/rI8XvIBXo2HyAXLa6NCqK+364clLB");
	secBook1.append("SKoQWawatgG26I49G74pitmpxPWISbqzVjQnHPS+0vV0GkS2aGac5B0h4CuCHOGk3PIRvrQPywHI");
	secBook1.append("vhooGJyCcdLLgDycX7W//6pptxVeW8u1l+zK1Eid1WMiiAq3e9ogqdhgC1jbbHimOTdLrJM4YTo0");
	secBook1.append("qPfToSNOEADQNS1Dft8V/GUz6I9SEULMU+5UKGgp54aCEkG3ugU42R2J6QYEdfAiNqyNHKmKeL9o");
	secBook1.append("MJlSr9civN3dJqDOF3qNW5USzp+Zs/6JSizbhEX0Td9Fd5ytXPHlvQoMU/qUrXFZNsogfHy9N9Uu");
	secBook1.append("sjr/XGDRI+WGiIDHbuw/q7y7dS+uP1PidhSuHx9IZ+nj2+Nnj8wgcdqY3INnv+zktAHzg8ZehSEu");
	secBook1.append("EEVS6oYE500Yg9HIDFLwhE8wB24TKvQYW/1TlzjzBL014baLQUz7iQf7");
	
	String jsonString1 = AESUtil.Decrypt(secBook1.toString(), key);
	System.out.println("jsonString：" + jsonString1);
	List<String> strings1 = FastJsonUtil.toBean(jsonString1, List.class);
	
	Map<String, String> map1 = new HashMap<String, String>();
	for (Integer i = 0; i < 256; i++) {
		map1.put(StringUtils.leftPad(Integer.toHexString(i), 2, "0"), strings1.get(i));
	}
	int indexOf = picStr.indexOf("ug0mAQ9hvxydt2KFPd4XFg==");
	String encryString = picStr.substring(0, indexOf);
	String decrypt = SymmetricUtil.Decrypt(encryString,map1);
	String decPicStr = decrypt + picStr.substring(indexOf+24);
	{
		//decPicStr = Base64Util.decode(ByteUtil.string2Bytes(decPicStr));
		byte[] b = Base64Util.decode(ByteUtil.string2Bytes(decPicStr));
		 OutputStream os = null;
	            String path = "D:";
	            // 2、保存到临时文件
	            // 输出的文件流保存到本地文件
	
	            File tempFile = new File(path);
	            if (!tempFile.exists()) {
	                tempFile.mkdirs();
	            }
	            os = new FileOutputStream(tempFile.getPath() + File.separator + "666.bmp");
	            os.write(b, 0, b.length);
	            os.close();
	}*/
}
