/**   
* @Title: RSAUtil.java 
* @Package com.jw.base.framework.core.util.base64 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月30日 上午9:58:54 
* @version V1.0   
*/
package com.jw.base.framework.core.util.base64;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * ## 类说明：
 * 	非对称加密“RSA”
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月30日]
 * @package com.jw.base.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月30日|bwliu|新增|RSAUtil.java新增
*/
public class RSAUtil {
	public static final String KEY_ALGORITHM = "RSA";
	public static final String CIPHER_ALGORITHM = "RSA/ECB/PKCS1Padding";
	public static final String PUBLIC_KEY = "publicKey";
	public static final String PRIVATE_KEY = "privateKey";
	public static final int KEY_SIZE = 1024;

	/**
	  * 生成密钥对。注意这里是生成密钥对KeyMap，再由密钥对获取公私钥  方法每运行一次获得一对不同的公钥私钥。
	 */
	public static Map<String, byte[]> getKeyMap(String seeesionKey) {
		Map<String, byte[]> keyMap = new HashMap<String, byte[]>(2);
		try {
			//返回生成指定算法的 public/private 密钥对的 KeyPairGenerator 对象。 参数RSA算法
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
			//初始化RSA长度，RSA密钥长度必须是64的倍数，在512~65536之间。默认是1024
			keyPairGenerator.initialize(KEY_SIZE);
			//生成一个密钥对
			KeyPair keyPair = keyPairGenerator.generateKeyPair();
			//获得公钥
			RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
			//获得私钥
			RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

			//可以通过getEncoded()方法获取返回类型为byte[]的数组
			keyMap.put(PUBLIC_KEY+"_"+seeesionKey, publicKey.getEncoded());

			keyMap.put(PRIVATE_KEY+"_"+seeesionKey, privateKey.getEncoded());

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}

		return keyMap;
	}

	/**
	 * 私钥，PKCS8EncodedKeySpec 用于构建私钥的规范
	 * @param keyBytes
	 * @return
	 */
	public static PrivateKey restorePrivateKey(byte[] keyBytes) {
		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory factory;
		try {
			factory = KeyFactory.getInstance(KEY_ALGORITHM);
			PrivateKey privateKey = factory.generatePrivate(pkcs8EncodedKeySpec);
			return privateKey;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 公钥，X509EncodedKeySpec 用于构建公钥的规范
	 * 
	 * @param keyBytes
	 * @return
	 */
	public static PublicKey restorePublicKey(byte[] keyBytes) {
		X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyBytes);
		try {
			KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
			PublicKey publicKey = factory.generatePublic(x509EncodedKeySpec);
			return publicKey;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 加密
	 * @param key
	 * @param plainText
	 * @return
	 */
	public static byte[] RSAEncode(PublicKey key, byte[] plainText) {
		try {
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, key);
			return cipher.doFinal(plainText);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *解密
	 * 
	 * @param key
	 * @param encodedText
	 * @return
	 */
	public static String RSADecode(PrivateKey key, byte[] encodedText) {
		try {
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, key);
			return new String(cipher.doFinal(encodedText));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	将字节数组转换为String
	**/
	public static String encryptBASE64(byte[] key) throws Exception {
		return (new BASE64Encoder()).encodeBuffer(key);
	}

	/**
	将String转换为字节数组
	**/
	public static byte[] decryptBASE64(String key) throws Exception {
		return (new BASE64Decoder()).decodeBuffer(key);
	}

	// 将字节数组转换为十六进制字符串
	public static String byteArrayToHexString(byte[] bytearray) {
		String strDigest = "";
		for (int i = 0; i < bytearray.length; i++) {
			strDigest += byteToHexString(bytearray[i]);
		}
		return strDigest;
	}

	// 将字节转换为十六进制字符串
	public static String byteToHexString(byte ib) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] ob = new char[2];
		ob[0] = Digit[(ib >>> 4) & 0X0F];
		ob[1] = Digit[ib & 0X0F];
		String s = new String(ob);
		return s;
	}

	//16进制字符串转为字节数组
	public static byte[] hexStringToByte(String hex) {
		int len = (hex.length() / 2);
		byte[] result = new byte[len];
		char[] achar = hex.toCharArray();
		for (int i = 0; i < len; i++) {
			int pos = i * 2;
			result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
		}
		return result;
	}

	public static int toByte(char c) {
		byte b = (byte) "0123456789ABCDEF".indexOf(c);
		return b;
	}
	
	public static void main(String[] args) {
		try {
			String clientId = "private-cloud-01";
			//生成密钥对
			Map<String, byte[]> map = RSAUtil.getKeyMap(clientId);
//			System.out.println("PUBLIC_KEY======"+RSAUtil.encryptBASE64(map.get(PUBLIC_KEY+"_"+clientId)));
//			System.out.println("PRIVATE_KEY====="+RSAUtil.encryptBASE64(map.get(PRIVATE_KEY+"_"+clientId)));
			
			PrivateKey privateKey = RSAUtil.restorePrivateKey(map.get(PRIVATE_KEY+"_"+clientId));
			PublicKey publicKey = RSAUtil.restorePublicKey(map.get(PUBLIC_KEY+"_"+clientId));
			
			byte[] encode = RSAUtil.RSAEncode(publicKey, "test".getBytes());
			System.out.println(RSAUtil.encryptBASE64(encode));
			System.out.println(RSAUtil.RSADecode(privateKey, encode));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
