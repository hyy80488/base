package com.jw.base.framework.core.util.base64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.FastJsonUtil;


/**
 * ## 类说明：
 * 	对称加密
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2017年11月28日]
 * @package com.jw.base.framework.core.util.base64
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2017年11月28日|MiaoDaZhuang|新增|SymmetricUtil.java新增
*/
public class SymmetricUtil {
	
	public static String getInitSecBook(String seckey) throws Exception{
		String secBook = "";
		String[] strings = new String[256];
		for (Integer i = 0; i < 256; i++) {
			strings[i] = StringUtils.leftPad(Integer.toHexString(i), 2, "0");
		}
		Random random = new Random();
		for (Integer i = 0; i < 256; i++) {
			int s = random.nextInt(strings.length - 1);
			int s1 = random.nextInt(strings.length - 1);
			String str = strings[s];
			strings[s] = strings[s1];
			strings[s1] = str;
		}
		secBook = AESUtil.Encrypt(FastJsonUtil.toJSONStringSerializer(strings), seckey);
		secBook = secBook.replaceAll("\n","");
		return secBook;
	}
	
	/**
	 * ## 方法说明：
	 * 	加密
	 * @param sSrc 需要加密的字串
	 * @param sKey 加密用的Key
	 */
	public static String Encrypt(String sSrc, Map<String,String> hexMap) throws Exception {
		//数据为空  || 数据都为空格
		if(StringUtils.isEmpty(sSrc) || StringUtils.isWhitespace(sSrc)){
			return sSrc;
		}
		//不存在加密队列 || 加密队列不为256 直接抛出错误
		if(MapUtils.isEmpty(hexMap) || hexMap.size() != 256){
			throw new BusinessException("","","",BsProcessErrorCode.ERROR_LEVEL_5);
		}
		//转换成16进制数据
		List<String> hexs = convertStringToHex(sSrc);
		StringBuilder sb = new StringBuilder();
		for (String str : hexs) {
			//对照表获取对应数据
			String tmp = MapUtils.getString(hexMap, str);
			if(StringUtils.isEmpty(tmp)){
				throw new BusinessException("","","",BsProcessErrorCode.ERROR_LEVEL_5);
			}
			sb.append(tmp);
		}
		//转换对应数据
		return sb.toString();
	}
	
   
	
	/**
	 * ## 方法说明：
	 * 	解密
	 * @param sSrc 需要解密的字串
	 * @param sKey 解密用的Key
	 */
	public static String Decrypt(String sSrc, Map<String,String> hexMap) throws Exception {
		//数据为空  || 数据都为空格
		if(StringUtils.isEmpty(sSrc) || StringUtils.isWhitespace(sSrc)){
			return sSrc;
		}
		//不存在加密队列 || 加密队列不为256 直接抛出错误
		if(MapUtils.isEmpty(hexMap) || hexMap.size() != 256){
			throw new BusinessException("","","",BsProcessErrorCode.ERROR_LEVEL_5);
		}
		//反转map 获取加密后对应值
		BidiMap<String, String> map = new DualHashBidiMap<>(hexMap);
		map = map.inverseBidiMap();
		//解密处理
		StringBuilder sb = new StringBuilder();
		//每两位获取响应的数据
		for (int i = 0; i < sSrc.length() - 1; i += 2) {
			String str = sSrc.substring(i, (i + 2));
			//对照表获取对应数据
			String tmp = MapUtils.getString(map, str);
			if(StringUtils.isEmpty(tmp)){
				throw new BusinessException("","","",BsProcessErrorCode.ERROR_LEVEL_5);
			}
			sb.append(tmp);
		}
		//转换对应数据
		return convertHexToString(sb.toString());
	}
	
	 /** 
     * ## 方法说明：
     * 	转换成字符串
     * @param hex
     * @return
    */
    private static String convertHexToString(String hex) {  
        StringBuilder sb = new StringBuilder();  
        //按照4位字符截取数据
        for (int i = 0; i < hex.length() - 1; i += 4) {  
            String output = hex.substring(i, (i + 4));  
            //将hex 转换成decimal
            int decimal = Integer.parseInt(output, 16);  
            //转换成char
            sb.append((char) decimal);  
        }  
        return sb.toString();  
    }  
	
	/** 
	 * ## 方法说明：
	 * 	字符数据转换 
	 * @param str
	 * @return
	*/
	private static List<String> convertStringToHex(String str) {  
		char[] chars = str.toCharArray();  
		//返回数据
		List<String> hexs = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {  
        	//字节转换成 hex
        	String hex = Integer.toHexString((int) chars[i]); 
        	//不足4位补 00
        	hex = StringUtils.leftPad(hex, 4, "00");
        	for (int ii = 0; ii < hex.length() - 1; ii += 2) {
        		hexs.add(hex.substring(ii, (ii + 2)));
			}
        }  
        return hexs;  
	}
	
	public static void main(String[] args) throws Exception {
//		String[] strings = new String[256];
//		for (Integer i = 0; i < 256; i++) {
//			strings[i] = StringUtils.leftPad(Integer.toHexString(i), 2, "0");
//		}
//		Map<String, String> map = new HashMap<>();
//		Random random = new Random();
//		for (Integer i = 0; i < 256; i++) {
//			int s = random.nextInt(strings.length - 1);
//			int s1 = random.nextInt(strings.length - 1);
//			String str = strings[s];
//			strings[s] = strings[s1];
//			strings[s1] = str;
//		}
//		System.out.println(FastJsonUtil.toJSONString(strings));
//		for (Integer i = 0; i < 256; i++) {
//			map.put(StringUtils.leftPad(Integer.toHexString(i), 2, "0"), strings[i]);
//		}
//		
//		System.out.println(FastJsonUtil.toJSONString(map));
		
		StringBuffer secBook1 = new StringBuffer();
		secBook1.append("jndrdOKe1ItHf2teiPVNU3wAl76dtN9AQKwBDZZZ/hqVImlQXMUrSgEZs+ufrlodHakiTlnqswJP");
		secBook1.append("rN21lUn3tNzLVxIGaiVZ+PnPlFZ8Smot1s7aO7Ohpd1xivsRBKlJIPkW//8wUz0MSymPOrOP+2nw");
		secBook1.append("/gvnnKp9Uvi+OaZd2DJdAr09U4+n536GY1S8DuJ54kWCkHdxTtqf4CGXYiyKzPv+Kbgd5MVMLd2H");
		secBook1.append("niSt4cQztAfyq0OYdkyaJ+qPduVC1QDcbtjFbRT8xckYVVSaL4LWb2P6+erkwZy352qDCOftSZHC");
		secBook1.append("kYwt4FXoAg76KZ24DhQ88VqWr/Wp6K285bINsGKV6YsaekUSf0wKrLC3Aver1t+iul2zyaYVdegb");
		secBook1.append("JtCR9ArJHD+bhZtiY5lAB6/cjqreoIyKQpPsONJyRMWuS/o5biBGakuRl72n6CVk7WtQblIYXExY");
		secBook1.append("MlbnZvsqjlDrVl9l1iUe7EuRfcQ9ig0Jao6Op3cWa7E3h65AeZrzr9M01CHRgSIAkGKYNXeKjfjf");
		secBook1.append("atJ7SPktGX+7O+itG8C5DEngWuI/pqSK8SlDSst3tTR/bRY6O8QjNwbTZdYBPIMQsO80fKD2g0i3");
		secBook1.append("aEMdDKQ7An59rBwYJaEgIje2pV5Zx/8UFvdL3G2oUyRHJ8HFiC8sD80ecZPCLZJoSbxnr8WMb8rX");
		secBook1.append("rP8SMgCH9u0/S95igJ1B2uPUV0yvMSWRy/8ger8ZjTwdMQ49BJuEkU21xC4DJqIJI415iSwShtAI");
		secBook1.append("5R1bW3Pt90tKn2rm7lKp8itVLVxQhyL1icsfko1/JtxptpnNa6psWhbm8ZnJzfdT9hsojMGT30Ko");
		secBook1.append("INGc80It/P4c00H909TBBl1h+D2qnO4RjpWw6jKhwxkdX13EGJslSSPPy5gwn5u3aeC2ERhRC57e");
		secBook1.append("VEFC02nV+3JX9bRHODgcNUGwv2DMUVXWg82Ad3966thUaGImwHvUk/kyINnoSkgNj/96OqF0xVwb");
		secBook1.append("y2doLXsG4/6jaTiBCmvOhm08B6Y6LK9+ZTcB6u++Zd18nebgQKyubzd0sjoyUftFQ5ZIyxiIo2+p");
		secBook1.append("67of9ATU5PK0yGyqAGl9sfniZD2Ish1Im+TseXaQTjU3UHb8zsaR9wq7Wx8yIIr+mVUKSxihPN9B");
		secBook1.append("lPOz3ybFwBpQUT0r1+14/8S0NHwL7XUDQ1ma7ZpiBRUQMDyAVTOJNqD+mqL9K9EqFEw1B8VTqlPl");
		secBook1.append("M9TCvMG0Zv8Qi7uYrhpLlIZrU/H9WxhjxAtz1rpTHR7DJD+qB3yP6YM+UlVUR25GcOCawCkMAJQg");
		secBook1.append("hsn1EI1aYN0eRBB3WhCe5O4mpo5jqVbUoSuK+t93mQlROI/ldvjpJbatz8JzD0cdxdD0Eh7pT4Iw");
		secBook1.append("gHATJlSC1PpbyF+iZh2Ub3SLedBih9ufF7ImQ3L3+Wx7eOR6TcLqe3nVmdlt4BcdBD8PztGV4hyJ");
		secBook1.append("FhXQ3nGYDmWvUWFbYRcU0xBm/MC/XptR4Xg6MsT6IzTQ2BdarVcn8B17EC3VLLp/Ti9BU3vt1SIP");
		secBook1.append("hqCgkXipOHgERN56/7n3o+KM2MvwM8wRKFURmExZoRHAxUM2ijFm7b10bh15xNeE5j//X/HZ9/Wk");
		secBook1.append("rD1hhCxrGNI1p0iOBg2ByPP1BVKnQvTE9+Zfq2XwFkfobmJPeU8NfHHG4YJGEDBBi0qCcyhqT1PP");
		secBook1.append("ijmz3GnG2wAk8OWspeMMMSMiHQR2hVYWIrAf2V6avFlbYi2m3rZC/d40");
		
		String secKey1 = "g++yh8r9Ow9cp+Gpti20RbCJTxgtnJ8C5YlIh6zvugM=";
		String DeString1 = AESUtil.Decrypt(secKey1, Constant.CHAIN_SECKEY);
		System.out.println("sec_key：" + DeString1);
		
		String jsonString1 = AESUtil.Decrypt(secBook1.toString(), DeString1);
		System.out.println("jsonString：" + jsonString1);
		List<String> strings1 = FastJsonUtil.toBean(jsonString1, List.class);
		
		Map<String, String> map1 = new HashMap<String, String>();
		for (Integer i = 0; i < 256; i++) {
			map1.put(StringUtils.leftPad(Integer.toHexString(i), 2, "0"), strings1.get(i));
		}
		System.out.println(StringUtils.join(convertStringToHex("18602296543")));
		String str1 = Encrypt("18602296543",map1);
		System.out.println(str1);
		System.out.println(Decrypt(str1,map1));
		
		System.out.println("=========================================================================");
		
		StringBuffer secBook2 = new StringBuffer();
		secBook2.append("wtLohdXc1GgN9Wewd3tdrUtce6rsN48KLk04FEwwy5P7D0r3KExT1uAy/TH8aLxyZ5xh3D1+lib3");
		secBook2.append("yc/NAB166ZmWKYx+6ZQ8CbKCoBl9IS5QwuXa+AiAgeI8gMJ7f6PDBYgq6qcmhpkN/qjkLb8BN9b3");
		secBook2.append("Mv4P2gripI2ZrSzwxN4sqYHKEZhN2/HDXKoiYJcadnts+673dlS0mskZcC3G2z5xwa0lYywieVaY");
		secBook2.append("ntz/oprIvRi6qs/tzsCQix5O1UmeGTl/iX9p9DSGAOrOOzChOynWijibiXdSirGhQVKPKmTa7U/v");
		secBook2.append("P9lFeIKeEAz1cgI4Jq3x4cQUgRbxid1cqhX7aNny0hQdvYRQbZGvDedZKN7oZ4Ty1dsERAiCSqfM");
		secBook2.append("pnM/vH11CcmjZxdkORUjBcj2hcZAI0PLtI2px8aMAZjQfJjc3nLbdi2G1Fo4J4QeG1YlFPsTPTIo");
		secBook2.append("6yyUAylPPolS9hycWLAytrV6iSAk2VVRXGyo3IUP8uGA/V8mvvNW56WIHGN7zarU6sOxqRnqlB4J");
		secBook2.append("q7AogKuB2MasMXURN/C89k89sZcA0jdABGU6bFo0OelEtl1RSoYqHYaPqUcImD0P7iOg3amWyT7X");
		secBook2.append("XjtnZyWNBz13OmvchzOTFdFoVnLCr9yuzXXowjqZpsBz328yXnPCft0Bx0xsjEdG8Z9b9HgFLCkb");
		secBook2.append("b4eUeAx2gmYXRqgMw5BENPEx5avHXyfeQ+ejYmmHrahytartjj6Tt81QN82M9V3Kw/noBZfklShl");
		secBook2.append("W2N6fPzWo5QzHPoGwNHnKIvs3yN/vCUJgTp00oH2+WEjcNJZq0Td1WuPfzkLf6BkJrVGieU08Iwl");
		secBook2.append("FZXS+SGaG/tQ96G+lAxBJQDYsaLb77d5/5Q6GwR6eEjyXRdOBGIVari2c9Ak9MCqQ3nT3oOow5mg");
		secBook2.append("72FJfw07lAxUL0VvGoeEeLihrDBOCSvQslN77CjJEYHqvuk25FwXlgyI1CSLqbYPKsZDw2cshrGN");
		secBook2.append("jt8Lai/vPxQXOJWoz6ZX/V/RilZ4wE4ue6bhWHA1HuxbeO+8Yb1vA6+Vaph0elhishn4bBJn/+jG");
		secBook2.append("LZ3Wf6xNgfxxu2dA1Zg2jOFjGURzT9B7VXFpYp02qiI9jU4aimxHqJafgVhcwcq4hwQ802Ag38qS");
		secBook2.append("lnjvfTHSme5vRH9UnGEfxKv+1m8lptkd+jGMbWXuWc6eCs0E81U8DBxk7nIFBZZvbGfDYC5y5s7K");
		secBook2.append("Q6wIAaefuQr8xKU5Gu/9j1QUA4M3Oicx3xlYQEqPG8pO8v/rI8XvIBXo2HyAXLa6NCqK+364clLB");
		secBook2.append("SKoQWawatgG26I49G74pitmpxPWISbqzVjQnHPS+0vV0GkS2aGac5B0h4CuCHOGk3PIRvrQPywHI");
		secBook2.append("vhooGJyCcdLLgDycX7W//6pptxVeW8u1l+zK1Eid1WMiiAq3e9ogqdhgC1jbbHimOTdLrJM4YTo0");
		secBook2.append("qPfToSNOEADQNS1Dft8V/GUz6I9SEULMU+5UKGgp54aCEkG3ugU42R2J6QYEdfAiNqyNHKmKeL9o");
		secBook2.append("MJlSr9civN3dJqDOF3qNW5USzp+Zs/6JSizbhEX0Td9Fd5ytXPHlvQoMU/qUrXFZNsogfHy9N9Uu");
		secBook2.append("sjr/XGDRI+WGiIDHbuw/q7y7dS+uP1PidhSuHx9IZ+nj2+Nnj8wgcdqY3INnv+zktAHzg8ZehSEu");
		secBook2.append("EEVS6oYE500Yg9HIDFLwhE8wB24TKvQYW/1TlzjzBL014baLQUz7iQf7");
		
		String secKey2 = "deV7olUzQ0Lwyaeh49HGqbCJTxgtnJ8C5YlIh6zvugM=";
		String DeString2 = AESUtil.Decrypt(secKey2, Constant.CHAIN_SECKEY);
		System.out.println("sec_key：" + DeString2);
		
		String jsonString2 = AESUtil.Decrypt(secBook2.toString(), DeString2);
		System.out.println("jsonString：" + jsonString2);
		List<String> strings2 = FastJsonUtil.toBean(jsonString2, List.class);
		
		Map<String, String> map2 = new HashMap<String, String>();
		for (Integer i = 0; i < 256; i++) {
			map2.put(StringUtils.leftPad(Integer.toHexString(i), 2, "0"), strings2.get(i));
		}
		String str2 = Encrypt("13651301931",map2);
		System.out.println(str2);
		System.out.println(Decrypt(str2,map2));
		
		System.out.println("=========================================================================");
		
		StringBuffer secBook3 = new StringBuffer();
		secBook3.append("Fo5upa4AJQ593y/d4MxSl0g4OnjqKVAtL4W8CrXHo5ysuYju+iJywWC3iBMgdDslOjj+6ibUjvUz");
		secBook3.append("HMM4I+RPXh4fRRMae8EXr7zUB/7mGZvSGfEi9+hiquXxXmKK9qzHqQ4al9NwaLut/n5Dt3IlU2aD");
		secBook3.append("3+6pL7KiSOrd54hBs7N/BoyOvlq5v44H9c/F27O9M+IseNHcmudSAKqinZb1j6oriWx0Mobklz9o");
		secBook3.append("as7qvlyOlJNFZRGx8+mBWKX3WrVnRi5RagUQGs4V7Uq/uAt+KDMuXCpZT5IN+6xNWIVQpLbqkePu");
		secBook3.append("bgUFqQT3ssVyb5B5faKYimTLa1rAmj2EKFp10KbKZBg3uDuKzOxtZa+bRmx+mssbC596RueFFGZn");
		secBook3.append("dg0+WRft5XGbbAl8BX/SjrlkREEuVcdoB8MzhKauM6NSrdd9Tu4g21nDEGF+XKxB5nPJLsPd7ZuE");
		secBook3.append("WVYS2y67A/P7taHb7CR3u6alPQ6RtJZ+8UsBxShMowe2qwwtkiVBbFA9PUDNxdrQ0dm7dYWS1R+N");
		secBook3.append("2p7MBksgXO1rqdMOL0Ahg+H83Kb4sf2VYDh2LXBwiZ5+mOpqReUaIDPYR8HQsfedtWqaFRO5YCpq");
		secBook3.append("mrP8ZAOyCohg4jZoLP6Q9hf/Cnxb37HLL1kdg0keUIzsXbxBK9zDip20z68RmHxdm40TNbLkJiMQ");
		secBook3.append("aoJrZBzmUx1ManrcpV0XDu6cfJ8x+044VaIrwWtF9zyWCoT1wJTHbIbb9T5n98htg1H0dP5gYjtw");
		secBook3.append("sEIsMk9NfTYqAv+RDg5YBQDJf3bXTfdSiegeCLGdwfDBCoOaoBsDNl3STyl8E/MoqXfcPagD6YUn");
		secBook3.append("CRi83RlKA+irTAN3kTLn3ejV39Gc1yqHs3j/YKNerkpbT1hwAolrAma/J/QDBnOe1WJjdpTVuf0M");
		secBook3.append("+IFUfJQIY2slWWvQzNtz4SbSrD3/5QyfBW3ASTC2hFoNaycS6/vHVtAMb+3FWeq0e3wLINWjpyVL");
		secBook3.append("uXoAWzpcY5aDHOWze7gtmVCPezLf/PdrfSjb+Q/dAIb6NTp7mBfiJQDc3NGK6+oDnpHa2IMK2SYN");
		secBook3.append("2HK44r1MssHEKUppvSvBgQfnGS7Tl++LBBgYFmsV4HKD6OwjHfIYEX+PAFvqxkzmDplKvs2+PMrc");
		secBook3.append("WM0KUtIqqT3/ogsUG3+vsJBnBAq5hM49UK4vSwAECeR6iheHWSXO7Z0UaISH+khRYGkkMGCv1V5M");
		secBook3.append("6j9JYzjb1J+yTO86hfD77xmQm1AWPkZ0nGWt9uFra5ZxHPoXMNFtODaxUEjLEqYTS8Dh9+TR2awJ");
		secBook3.append("sCavEBjUAfcR1wLxi5fH7xPU+tWeH7BjnYhqQVHHJ5+ff6RhZ0kQpOkDxYjDeobsW8LrO12PvEoN");
		secBook3.append("nM82h1ckwKmhBuFq50FlFIwMFXYb0co+zDOhHDNU2i78LBbSmXaUCeJYOVdpM2FG0wm9795CvzqA");
		secBook3.append("45dIYTIUtuioG+17kIV7CK8wcZr6ZNHLdYxYCQ6JcbIpfHJVx3yoZJZZJu33WTe5Z957W0He8QHh");
		secBook3.append("WrfSAz0U7DNs+RYpln1pNXRgplo/+Hi8TCk4YSHDHZJHCasTXffYuAmAiMoMImXmjcM3k1MMq8cg");
		secBook3.append("DyWdPu8C8KQxDChslpQw74JIOB9DbVvX+oJOhuAwEPhTdVad9CjEnS+1j/i7mVgHg54dVUbZxENg");
		secBook3.append("IoOumpQGClYbQOwn1vcx/yP5o2MB4H1Gj27JCHr5V8GWEQRB84qu5B7B");
		
		String secKey3 = "18An4jSRVaFMPUTG60EbMLCJTxgtnJ8C5YlIh6zvugM=";
		String DeString3 = AESUtil.Decrypt(secKey3, Constant.CHAIN_SECKEY);
		System.out.println("sec_key：" + DeString3);
		
		String jsonString3 = AESUtil.Decrypt(secBook3.toString(), DeString3);
		System.out.println("jsonString：" + jsonString3);
		List<String> strings3 = FastJsonUtil.toBean(jsonString3, List.class);
		
		Map<String, String> map3 = new HashMap<String, String>();
		for (Integer i = 0; i < 256; i++) {
			map3.put(StringUtils.leftPad(Integer.toHexString(i), 2, "0"), strings3.get(i));
		}
		String str3 = Encrypt("15010066651",map3);
		System.out.println(str3);
		System.out.println(Decrypt(str3,map3));
		
		System.out.println("=========================================================================");
		String text = "['6e','63','7b','7d','a2','03','3c','4a','d0','09','cc','66','31','e2','4e','1c','0d','60','ec','f2','14','c5','54','23','6f','62','ca','af','c8','19','9e','06','92','74','e7','4b','2e','15','26','27','eb','bd','e4','7e','7a','97','49','37','f0','2a','a9','5a','1d','8e','e3','91','fb','39','71','f8','35','fa','88','d5','33','67','5b','8f','44','fe','46','c0','3f','40','3b','e8','4c','9a','ef','ad','59','1b','32','53','f5','f3','70','e1','24','83','55','da','07','5d','2d','0a','16','ab','b2','b6','f7','29','42','c1','68','9c','b5','0e','ce','6d','41','10','43','d2','02','25','30','75','d9','e9','c9','79','b4','65','12','f9','58','de','05','81','95','78','84','6a','86','87','3e','52','13','47','90','be','2c','04','8d','8a','bb','1e','d6','72','df','5e','ed','89','6c','9b','ac','34','7f','50','98','a1','fd','3a','99','a5','0c','cb','1f','28','aa','9f','a7','4f','ae','51','7c','b1','57','73','d8','2b','c7','b7','08','b9','00','cf','8c','a8','dc','18','11','dd','b3','c3','48','c6','d4','56','01','b8','e5','a3','cd','17','76','d7','82','5c','61','e6','64','c4','d1','a0','77','b0','8b','db','6b','a4','ba','bf','e0','3d','96','f6','93','38','d3','5f','4d','22','ea','f1','0f','f4','ee','0b','21','1a','94','85','20','2f','69','45','c2','9d','36','80','fc','bc','a6','ff']";
		System.out.println(AESUtil.Encrypt(text, Constant.CHAIN_SECKEY));
	}
}
