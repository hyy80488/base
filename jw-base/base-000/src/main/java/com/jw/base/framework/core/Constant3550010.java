package com.jw.base.framework.core;

public class Constant3550010 {
	/**
	 * 渠道属性
	 * 1：直销渠道；2：分销渠道；3：HOTEL；4：CallCenter；5：商旅在线；S：switch
	 **/
	public static enum ENUM_CHANNEL_FLG {
		DIRECTSELL("1"),
		ALLOTSELL("2"),
		HOTEL("3"),
		CALLCENTER("4"),
		BUSINESSONLINE("5"),
		SWITCH("S");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_CHANNEL_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 接口标志
	 * 1：开通；2：未开通
	 */
	public static enum ENUM_IF_FLG {
		OPEN("1"),
		CLOSE("2"),
		DEFAULT("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_IF_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 *订单确认方式
	 * 1：自动确认，2：手工确认
	 */
	public static enum ENUM_CONFIRM_TYP {
		AUTO("1"),
		MANUAL("2"),
		DEFAULT("1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_CONFIRM_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 映射类型
	 * 	HOTEL 酒店绑定   PRODUCT 产品匹配
	 */
	public static enum ENUM_MAP_TYP {
		HOTEL("HOTEL"),
		PRODUCT("PRODUCT");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MAP_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * 映射类型
	 * 	roomTypeCode 产品匹配
	 */
	public static enum ENUM_MAP_ROOM_TYP {
		MAPPING("MAPPING"),
		UNMAPPING("UNMAPPING");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MAP_ROOM_TYP(String value) {
			this._value = value;
		}
	}
	/** 
	* 房态属性标志
	* 0.开房  1.关房 
	*/ 
	public static enum ENUM_ROOM_CLOSE_FLG{
		OPEN("0"), CLOSE("1");
		//值
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(String value){
			return this._value.equals(value);
		}
		private ENUM_ROOM_CLOSE_FLG(String value){
			this._value=value;
		}	
	}
	/**
	 * 渠道
	 * 	携程：CTRIP；艺龙：ELONG；去哪儿：QUNAR；赫程：EASYTRIP，同程：LY
	 */
	public static enum ENUM_CHANNEL {
		CTRIP("CTRIP"),
		ELONG("ELONG"),
		QUNAR("QUNAR"),
		EASYTRIP("EASYTRIP"),
		LY("LY");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_CHANNEL(String value) {
			this._value = value;
		}
	}
	/**
	 * 现预付类型
	 * 	501-预付、16-现付
	 */
	public static enum ENUM_BALANCE_TYP {
		TYP501("501"),
		TYP16("16");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_BALANCE_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 产品类型
	 * 0-正价，1-活动
	 */
	public static enum ENUM_PRODUCT_TYP {
		TYP1("1"),
		TYP0("0");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_PRODUCT_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 早餐数
	 * PoductType=0时，此字段参数及含义
	 *0=无早餐；1=单份早餐；
	 *2=双份早餐；3=三份早餐；
	 *4=四份早餐；5=五份早餐
	 *PoductType=1时，此字段参数及含义
	 *931910=无早餐；931775=单份早餐；
	 *931779=双份早餐；931781=三份早餐；
	 *931783=四份早餐；931784=五份早餐；
	 *931785=六份早餐；931788=七份早餐；
	 *931791=八份早餐；931792=九份早餐；
	 */
	public static enum ENUM_BREAKFAST_QUANT {
		QUANT0("0", 0, 0),
		QUANT1("1", 0, 1),
		QUANT2("2", 0, 2),
		QUANT3("3", 0, 3),
		QUANT4("4", 0, 4),
		QUANT5("5", 0, 5),
		QUANT931910("931910", 1, 0),
		QUANT931775("931775", 1, 1),
		QUANT931779("931779", 1, 2),
		QUANT931781("931781", 1, 3),
		QUANT931783("931783", 1, 4),
		QUANT931784("931784", 1, 5),
		QUANT931785("931785", 1, 6),
		QUANT931788("931788", 1, 7),
		QUANT931791("931791", 1, 8),
		QUANT931792("931792", 1, 9);
		private String _value;
		private int _pvalue; //PoductType
		private int _rvalue; //早餐份数
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_BREAKFAST_QUANT(String value) {
			this._value = value;
		}
		private ENUM_BREAKFAST_QUANT(String value, int _pvalue, int _rvalue) {
			this._value = value;
		}
		/** 
		 * ## 方法说明：
		 * 	根据PoductType和早餐数量返回编号
		 * @param p
		 * @param r
		 * @return
		*/
		public String getValueByQuant(int p, int r) {
			ENUM_BREAKFAST_QUANT[] qvalues = ENUM_BREAKFAST_QUANT.values();
			for (int i = 0; i < qvalues.length; i++) {
				if (qvalues[i]._pvalue == p && qvalues[i]._rvalue == r) {
					return qvalues[i]._value;
				}
			}
			return "1";
		}
		/** 
		 * ## 方法说明：
		 * 	根据PoductType = 1和早餐数量返回编号
		 * @param r
		 * @return
		*/
		public String getValueByQuant(int r) {
			return getValueByQuant(0, r);
		}
	}
	
	/**
	 * 赫程2.0版本  系统渠道Id
	 */
	public static final Integer SYSCHANNELID_2 = 310002;
	/**
     * 赫程1.0版本  系统渠道Id
     */
    public static final Integer SYSCHANNELID_1 = 310001;
    
    /**
     * 直销渠道  系统渠道Id
     */
    public static final Integer SYSCHANNELID_5 = 310005;
	
	/**
	 * 赫程2.0版本  接口Id
	 */
	public static final Integer IFSVCVERID_2 = 800021;
	
	/**
     * 0新建  
     * 酒店1=已提交，待运营审核 ，2=运营审核成功,待ota审核，3=运营审核拒绝，4=OTA审核拒绝，5=OTA审核成功，-1表示异常
     * 产品1审核中,2审核通过
     */
    public static final String IF_FLG_US = "1";
    
    public static enum ENUM_MAP_CHNL_STUS {
    	INVALID("0"),
    	UNMAPPING("1"),
    	MAPPING("2"),
//    	SUBMIT("1"),
//    	OPERAUDITSUCCESS("2"),
//    	OPERAUDITREJECT("3"),
//    	OTAAUDITREJECT("4"),
		OTAAUDITSUCCESS("5"),
    	EXCEPTION("-1");
		private String _value;
		public String getValue() {
			return _value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		private ENUM_MAP_CHNL_STUS(String value) {
			this._value = value;
		}
	}
    /**1 正常；2  取消；0  临时（用于预付、担保未完成时）**/
    public static enum ENUM_CRSORDER_STUS {
    	NML("1"),
    	CXL("2"),
    	TEMP("0");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_CRSORDER_STUS(String value) {
    		this._value = value;
    	}
    }
    public static enum ENUM_PAY_STUS {
    	NO_NEED("0"),// 不需支付
    	NO_PAY("1"),//未支付
    	SUCCESS_PAY("2");//支付成功
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_PAY_STUS(String value) {
    		this._value = value;
    	}
    } 
    public static enum ENUM_IG_FLG {
    	I("0"),//散客
    	G("1");//团队
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_IG_FLG(String value) {
    		this._value = value;
    	}
    }
    
    /**GRP：集团会员，OTA：外部会员，NAN：非会员**/
    public static enum ENUM_MEMBER_FLG {
    	/**集团会员*/
    	GRP("GRP"),
    	/**外部会员*/
    	OTA("OTA"),
    	/**非会员*/
    	NAN("NAN");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_MEMBER_FLG(String value) {
    		this._value = value;
    	}
    }
    /** ‘0’：本地预定 ‘1’:集团中央预定  ‘2’:有房号集团中央预订 ‘3’：switch预定**/
    public static enum ENUM_RESVSRC_TYP {
    	LOCAL("0"),//本地预定
    	CRS("1"),//集团中央预定
    	ROOM_CRS("2"),//有房号集团中央预订
    	SWITCH("3");//switch预定
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_RESVSRC_TYP(String value) {
    		this._value = value;
    	}
    }
    
    /**1：现付；2：预付；**/
    public static enum ENUM_ONLINEPAYMENT_TYP {
    	/**现付*/
    	ADVANCE("1"),
    	/**预付*/
    	PAYMENT("2");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_ONLINEPAYMENT_TYP(String value) {
    		this._value = value;
    	}
    }
    
    /**0 未发送，1  已发送**/
    public static enum ENUM_SEND_STUS {
    	/**0 未发送*/
    	NO_SEND("0"),
    	/**1  已发送*/
    	SEND("1");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_SEND_STUS(String value) {
    		this._value = value;
    	}
    }
    
    /**0：未提交；1：完成；2：争议；3：手工完成**/
    public static enum ENUM_CHECK_STUS {
    	/**0：未提交*/
    	NO_SUBMIT("0"),
    	/**1：完成*/
    	COMPLETE("1"),
    	/**2：争议*/
    	DISPUTE("2"),
    	/**3：手工完成*/
    	MANUAL_COMPLETION("3");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_CHECK_STUS(String value) {
    		this._value = value;
    	}
    }
    /**0：无担保，1：有担保，9：无需担保**/
    public static enum ENUM_GUARANTEE_FLG {
    	/**0：无担保*/
    	NO_GUARANTEE("0"),
    	/**1：有担保*/
    	GUARANTEE("1"),
    	/**9：无需担保*/
    	NO_NEED_GUARANTEE("9");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_GUARANTEE_FLG(String value) {
    		this._value = value;
    	}
    }
    
    /**0 未确认，1  已确认（对OTA确认或取消时），2 需再次确认，9：拒绝**/
    public static enum ENUM_CONFIRM_STUS{
    	/**0 未确认*/
    	NO_CONFIRM("0"),
    	/**1  已确认（对OTA确认或取消时）*/
    	CONFIRM("1"),
    	/**2 需再次确认*/
    	NEED_RECONFIRMATION("2"),
    	/**9：拒绝*/
    	REFUSE("9");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_CONFIRM_STUS(String value) {
    		this._value = value;
    	}
    }
	
    /**
     * 授信机构Id 闪住标识
     */
    public static final Integer CREDITINSTID = 334001;
    
    /**房态同步标识 0：未同步；1：同步中；2：同步成功；9：同步失败**/
    public static enum ENUM_SYNC_STUS{
    	/**0：未同步*/
    	UNSYNC("0"),
    	/**1：同步中*/
    	SYNCING("1"),
    	/**2：同步成功*/
    	SYNCSUCCESS("2"),
    	/**9：同步失败*/
    	SYNCFAILED("9");
    	private String _value;
    	public String getValue() {
    		return _value;
    	}
    	private ENUM_SYNC_STUS(String value) {
    		this._value = value;
    	}
    }
    
    /**
     * ## 类说明：
     * 取消预订规则 0：随便取消，1：不可取消，2：按规则取消
     * @author    [yingw]   
     * @version   [V1.0, 2018年9月21日]
     * @package com.jw.base.framework.core
     * @since
    日期|作者|类型|内容
    :----|:-----|:-----|:-----
    2018年9月21日|yingw|新增|Constant3550010.java新增
     */
    public static enum ENUM_CANCEL_TYP {
        CANCEL("0"),//随便取消
        NO_CANCEL("1"),// 不可取消
        REGU_CANCEL("2");//按规则取消
        private String _value;
        public String getValue() {
            return _value;
        }
        private ENUM_CANCEL_TYP(String value) {
            this._value = value;
        }
    } 
    /**
     * ## 类说明：
     * 直销渠道取消预订，扣款类型 0不收费、11：总房费占百分比 13：第一晚房费
     * @author    [yingw]   
     * @version   [V1.0, 2018年9月21日]
     * @package com.jw.base.framework.core
     * @since
    日期|作者|类型|内容
    :----|:-----|:-----|:-----
    2018年9月21日|yingw|新增|Constant3550010.java新增
     */
    public static enum ENUM_CALC_TYP {
        NOT("0"),//不收费
        PERCENT("11"),// 总房费占百分比
        FIRST_DAY_RATE("13");//第一晚房费
        private String _value;
        public String getValue() {
            return _value;
        }
        private ENUM_CALC_TYP(String value) {
            this._value = value;
        }
    } 
}
