
package com.jw.common.framework.m3310.f010.dto;

import java.math.BigDecimal;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;


/**
 * ## 类说明：
 * 	PosFormatDetailClass打印格式类
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto.posprinter
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosFormatDetailClass新增
 */

public class PosFormatDetailClass {
	
	@DrptDto(dtonm = "PosFormatSourceMainDto",dtodrpt="打印主子项源数据")
	public static class PosFormatSourceMainDto implements java.io.Serializable{
		/** 
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
		*/ 
		private static final long serialVersionUID = 5489421673876764729L;
		/** ID  **/
		private Integer id;
		/** 任务标识  **/
		private Integer taskId;
		/** 集团标识  **/
		private String chainUid;
		/** 集团名称  **/
		private String chainNm;
		/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
		private String unitUidOu;
		/** 酒店名称  **/
		private String unitNm;
		/** 逻辑打印机标识  **/
		private Integer logicPrinterId;
		/** 打印任务类型 0-点菜单； 1-废菜单；红字标识 2-冲菜单；红字标识   3-更改单；红字标识  数量、做法修改 4-上菜信息； 5-催菜单； 6-厨房消息； 7.叫起？即起 **/
		private String taskTyp;
		/** 账单标识  **/
		private Integer billId;
		/** 账单号 手工填入的打印账单号,可为空 **/
		private String billNo;
		/** 账单交易号 系统根据交易号配置自动生成 默认规则:销售点(3位)+日期(8位)+流水号(5位) 后期系统可以控制生成规格对4种元素进行选择排序 销售点(3位),日期(8位),餐点(2位),流水号(5位) **/
		private String billTranNo;
		/** 销售点标识  **/
		private Integer salesId;
		/** 销售点名称  **/
		private String salesNm;
		/** 桌台标识  **/
		private Integer blockId;
		/** 桌台代码  **/
		private String blockCd;
		/** 桌台名称  **/
		private String blockNm;
		/** 桌位号  **/
		private String seatNo;
		/** 人数  **/
		private Integer psnNum;
		/** 开单营业日期  **/
		private java.util.Date openDate;
		/** 开单时间  **/
		private java.util.Date openTm;
		/** 上菜顺序  **/
		private Integer cookSeq;
		/** 套餐标识 0-菜品,1-套餐主项,2-套餐子项,3-临时套餐主项,4-临时套餐子项 固定套餐会在套餐组中定义折算单价,点入时将折算单价写入套餐子项的单价字段中,临时套餐会在套餐子项的单价中记录原始菜品单价,结账时通过折算单价进行服务费,折扣的拆分 **/
		private String pkgFlg;
		/** 套餐主项标识 记录关联的套餐主项 **/
		private Integer pkgRefId;
		/** 套餐主项名称  **/
		private String pkgRefNm;
		/** 套餐组标识 套餐内的菜品会分组 例如:主食、甜点、饮料 **/
		private Integer pkgGroupId;
		/** 套餐组名称  **/
		private String pkgGroupNm;
		/** 加收金额  **/
		private BigDecimal attachAmount;
		/** 项目/支付方式标识  **/
		private Integer itemId;
		/** 项目/支付方式代码  **/
		private String itemCd;
		/** 项目名称  **/
		private String itemNm;
		/** 座位号  **/
		private String aaNo;
		/** 项目数量  **/
		private BigDecimal itemQuant;
		/** 菜品规格标识  **/
		private Integer itemSpecId;
		/** 菜品规格名称  **/
		private String itemSpecNm;
		/** 项目单价  **/
		private BigDecimal itemPrice;
		/** 消费金额  **/
		private BigDecimal consumeAmount;
		/** 菜品类别标识 这里用于存储客人点餐时的类别 **/
		private Integer menuTypId;
		/** 菜品类别代码 这里用于存储客人点餐时的类别 **/
		private String menuTypCd;
		/** 菜品类别名称 这里用于存储客人点餐时的类别 **/
		private String menuTypNm;
		/** 菜品大类标识 这里用于存储客人点餐时的类别 **/
		private Integer menuBtypId;
		/** 菜品大类代码 这里用于存储客人点餐时的类别 **/
		private String menuBtypCd;
		/** 菜品大类名称 这里用于存储客人点餐时的类别 **/
		private String menuBtypNm;
		/** 整单需求  **/
		private String billDemand;
		/** 项目需求  **/
		private String itemDemand;
		/** 项目制法  **/
		private String itemMake;
		/** 操作名称  **/
		private String operationNm;
		/** 设备类型 点入的设备类型 01：PC 设备 02：PAD设备 03：触摸屏设备 04：点菜宝设备 **/
		private String deviceTyp;
		/** 设备号  **/
		private String deviceNo;
		/** 工作站号 发送打印任务的工作站 **/
		private String wsNo;
		/** 是否执行过 0-未执行,1-已经执行 **/
		private String doneFlg;
		/** 打印成功标识 0-未打印成功,1-已经打印成功 **/
		private String successFlg;
		/** 版本号  **/
		private Integer version;
		/** 备注  **/
		private String memo;
		/** 菜品备注  **/
		private String itemMemo;
		/** 制法金额  **/
		private BigDecimal makeAmount;
		/** 打印机名称  **/
		private String printerName;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getTaskId() {
			return taskId;
		}
		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}
		public String getChainUid() {
			return chainUid;
		}
		public void setChainUid(String chainUid) {
			this.chainUid = chainUid;
		}
		public String getChainNm() {
			return chainNm;
		}
		public void setChainNm(String chainNm) {
			this.chainNm = chainNm;
		}
		public String getUnitUidOu() {
			return unitUidOu;
		}
		public void setUnitUidOu(String unitUidOu) {
			this.unitUidOu = unitUidOu;
		}
		public String getUnitNm() {
			return unitNm;
		}
		public void setUnitNm(String unitNm) {
			this.unitNm = unitNm;
		}
		public Integer getLogicPrinterId() {
			return logicPrinterId;
		}
		public void setLogicPrinterId(Integer logicPrinterId) {
			this.logicPrinterId = logicPrinterId;
		}
		public String getTaskTyp() {
			return taskTyp;
		}
		public void setTaskTyp(String taskTyp) {
			this.taskTyp = taskTyp;
		}
		public Integer getBillId() {
			return billId;
		}
		public void setBillId(Integer billId) {
			this.billId = billId;
		}
		public String getBillNo() {
			return billNo;
		}
		public void setBillNo(String billNo) {
			this.billNo = billNo;
		}
		public String getBillTranNo() {
			return billTranNo;
		}
		public void setBillTranNo(String billTranNo) {
			this.billTranNo = billTranNo;
		}
		public Integer getSalesId() {
			return salesId;
		}
		public void setSalesId(Integer salesId) {
			this.salesId = salesId;
		}
		public String getSalesNm() {
			return salesNm;
		}
		public void setSalesNm(String salesNm) {
			this.salesNm = salesNm;
		}
		public Integer getBlockId() {
			return blockId;
		}
		public void setBlockId(Integer blockId) {
			this.blockId = blockId;
		}
		public String getBlockCd() {
			return blockCd;
		}
		public void setBlockCd(String blockCd) {
			this.blockCd = blockCd;
		}
		public String getBlockNm() {
			return blockNm;
		}
		public void setBlockNm(String blockNm) {
			this.blockNm = blockNm;
		}
		public String getSeatNo() {
			return seatNo;
		}
		public void setSeatNo(String seatNo) {
			this.seatNo = seatNo;
		}
		public Integer getPsnNum() {
			return psnNum;
		}
		public void setPsnNum(Integer psnNum) {
			this.psnNum = psnNum;
		}
		public java.util.Date getOpenDate() {
			return openDate;
		}
		public void setOpenDate(java.util.Date openDate) {
			this.openDate = openDate;
		}
		public java.util.Date getOpenTm() {
			return openTm;
		}
		public void setOpenTm(java.util.Date openTm) {
			this.openTm = openTm;
		}
		public Integer getCookSeq() {
			return cookSeq;
		}
		public void setCookSeq(Integer cookSeq) {
			this.cookSeq = cookSeq;
		}
		public String getPkgFlg() {
			return pkgFlg;
		}
		public void setPkgFlg(String pkgFlg) {
			this.pkgFlg = pkgFlg;
		}
		public Integer getPkgRefId() {
			return pkgRefId;
		}
		public void setPkgRefId(Integer pkgRefId) {
			this.pkgRefId = pkgRefId;
		}
		public String getPkgRefNm() {
			return pkgRefNm;
		}
		public void setPkgRefNm(String pkgRefNm) {
			this.pkgRefNm = pkgRefNm;
		}
		public Integer getPkgGroupId() {
			return pkgGroupId;
		}
		public void setPkgGroupId(Integer pkgGroupId) {
			this.pkgGroupId = pkgGroupId;
		}
		public String getPkgGroupNm() {
			return pkgGroupNm;
		}
		public void setPkgGroupNm(String pkgGroupNm) {
			this.pkgGroupNm = pkgGroupNm;
		}
		public BigDecimal getAttachAmount() {
			return attachAmount;
		}
		public void setAttachAmount(BigDecimal attachAmount) {
			this.attachAmount = attachAmount;
		}
		public Integer getItemId() {
			return itemId;
		}
		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		public String getItemCd() {
			return itemCd;
		}
		public void setItemCd(String itemCd) {
			this.itemCd = itemCd;
		}
		public String getItemNm() {
			return itemNm;
		}
		public void setItemNm(String itemNm) {
			this.itemNm = itemNm;
		}
		public String getAaNo() {
			return aaNo;
		}
		public void setAaNo(String aaNo) {
			this.aaNo = aaNo;
		}
		public BigDecimal getItemQuant() {
			return itemQuant;
		}
		public void setItemQuant(BigDecimal itemQuant) {
			this.itemQuant = itemQuant;
		}
		public Integer getItemSpecId() {
			return itemSpecId;
		}
		public void setItemSpecId(Integer itemSpecId) {
			this.itemSpecId = itemSpecId;
		}
		public String getItemSpecNm() {
			return itemSpecNm;
		}
		public void setItemSpecNm(String itemSpecNm) {
			this.itemSpecNm = itemSpecNm;
		}
		public BigDecimal getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(BigDecimal itemPrice) {
			this.itemPrice = itemPrice;
		}
		public BigDecimal getConsumeAmount() {
			return consumeAmount;
		}
		public void setConsumeAmount(BigDecimal consumeAmount) {
			this.consumeAmount = consumeAmount;
		}
		public Integer getMenuTypId() {
			return menuTypId;
		}
		public void setMenuTypId(Integer menuTypId) {
			this.menuTypId = menuTypId;
		}
		public String getMenuTypCd() {
			return menuTypCd;
		}
		public void setMenuTypCd(String menuTypCd) {
			this.menuTypCd = menuTypCd;
		}
		public String getMenuTypNm() {
			return menuTypNm;
		}
		public void setMenuTypNm(String menuTypNm) {
			this.menuTypNm = menuTypNm;
		}
		public Integer getMenuBtypId() {
			return menuBtypId;
		}
		public void setMenuBtypId(Integer menuBtypId) {
			this.menuBtypId = menuBtypId;
		}
		public String getMenuBtypCd() {
			return menuBtypCd;
		}
		public void setMenuBtypCd(String menuBtypCd) {
			this.menuBtypCd = menuBtypCd;
		}
		public String getMenuBtypNm() {
			return menuBtypNm;
		}
		public void setMenuBtypNm(String menuBtypNm) {
			this.menuBtypNm = menuBtypNm;
		}
		public String getBillDemand() {
			return billDemand;
		}
		public void setBillDemand(String billDemand) {
			this.billDemand = billDemand;
		}
		public String getItemDemand() {
			return itemDemand;
		}
		public void setItemDemand(String itemDemand) {
			this.itemDemand = itemDemand;
		}
		public String getItemMake() {
			return itemMake;
		}
		public void setItemMake(String itemMake) {
			this.itemMake = itemMake;
		}
		public String getOperationNm() {
			return operationNm;
		}
		public void setOperationNm(String operationNm) {
			this.operationNm = operationNm;
		}
		public String getDeviceTyp() {
			return deviceTyp;
		}
		public void setDeviceTyp(String deviceTyp) {
			this.deviceTyp = deviceTyp;
		}
		public String getDeviceNo() {
			return deviceNo;
		}
		public void setDeviceNo(String deviceNo) {
			this.deviceNo = deviceNo;
		}
		public String getWsNo() {
			return wsNo;
		}
		public void setWsNo(String wsNo) {
			this.wsNo = wsNo;
		}
		public String getDoneFlg() {
			return doneFlg;
		}
		public void setDoneFlg(String doneFlg) {
			this.doneFlg = doneFlg;
		}
		public String getSuccessFlg() {
			return successFlg;
		}
		public void setSuccessFlg(String successFlg) {
			this.successFlg = successFlg;
		}
		public Integer getVersion() {
			return version;
		}
		public void setVersion(Integer version) {
			this.version = version;
		}
		public String getMemo() {
			return memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getItemMemo() {
			return itemMemo;
		}
		public void setItemMemo(String itemMemo) {
			this.itemMemo = itemMemo;
		}
		public BigDecimal getMakeAmount() {
			return makeAmount;
		}
		public void setMakeAmount(BigDecimal makeAmount) {
			this.makeAmount = makeAmount;
		}
		public String getPrinterName() {
			return printerName;
		}
		public void setPrinterName(String printerName) {
			this.printerName = printerName;
		}
		
		
	}
	

	@DrptDto(dtonm = "PosFormatDetailMainDto",dtodrpt="打印主项")
	public static class PosFormatDetailMainDto implements java.io.Serializable{

		/** 
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
		*/ 
		private static final long serialVersionUID = -5853643912179195088L;

		/** 集团名称  **/
		private String chainNm;
		/** 酒店名称  **/
		private String unitNm;
		/** 账单标识  **/
		private Integer billId;
		/** 账单号 手工填入的打印账单号,可为空 **/
		private String billNo;
		/** 账单交易号 系统根据交易号配置自动生成 默认规则:销售点(3位)+日期(8位)+流水号(5位) 后期系统可以控制生成规格对4种元素进行选择排序 销售点(3位),日期(8位),餐点(2位),流水号(5位) **/
		private String billTranNo;
		/** 销售点标识  **/
		private Integer salesId;
		/** 销售点名称  **/
		private String salesNm;
		/** 销售点代码  **/
		private String salesCd;
		/** 销售点全名  **/
		private String salesFullNm;
		/** 桌台标识  **/
		private Integer blockId;
		/** 桌台名称  **/
		private String blockNm;
		/** 桌台代码  **/
		private String blockCd;
		/** 桌位号  **/
		private String seatNo;
		/** 人数  **/
		private Integer psnNum;
		/** 开单营业日期  **/
		private java.util.Date openDate;
		/** 开单时间  **/
		private java.util.Date openTm;
		/** 创建人代码  **/
		private String createByCd;
		/** 创建人  **/
		private String createBy;
		/** 创建日期  **/
		private java.util.Date createDate;
		/** 备注  **/
		private String memo;
		/** 打印机名称  **/
		private String printerName;
		/** 金额小计  **/
		private BigDecimal sumPrice;
		/** 合计数量  **/
		private BigDecimal sumQuant;
		/** 合计总数  **/
		private BigDecimal totalQuant;
		/** 账单需求 **/
		private String billDemand;
		/** 项目明细  **/
		private List<PosFormatDetailTranDto> trans;
		public String getChainNm() {
			return chainNm;
		}
		public void setChainNm(String chainNm) {
			this.chainNm = chainNm;
		}
		public String getUnitNm() {
			return unitNm;
		}
		public void setUnitNm(String unitNm) {
			this.unitNm = unitNm;
		}
		public Integer getBillId() {
			return billId;
		}
		public void setBillId(Integer billId) {
			this.billId = billId;
		}
		public String getBillNo() {
			return billNo;
		}
		public void setBillNo(String billNo) {
			this.billNo = billNo;
		}
		public String getBillTranNo() {
			return billTranNo;
		}
		public void setBillTranNo(String billTranNo) {
			this.billTranNo = billTranNo;
		}
		public Integer getSalesId() {
			return salesId;
		}
		public void setSalesId(Integer salesId) {
			this.salesId = salesId;
		}
		public String getSalesNm() {
			return salesNm;
		}
		public void setSalesNm(String salesNm) {
			this.salesNm = salesNm;
		}
		public String getSalesCd() {
			return salesCd;
		}
		public void setSalesCd(String salesCd) {
			this.salesCd = salesCd;
		}
		public String getSalesFullNm() {
			return salesFullNm;
		}
		public void setSalesFullNm(String salesFullNm) {
			this.salesFullNm = salesFullNm;
		}
		public Integer getBlockId() {
			return blockId;
		}
		public void setBlockId(Integer blockId) {
			this.blockId = blockId;
		}
		public String getBlockNm() {
			return blockNm;
		}
		public void setBlockNm(String blockNm) {
			this.blockNm = blockNm;
		}
		public String getBlockCd() {
			return blockCd;
		}
		public void setBlockCd(String blockCd) {
			this.blockCd = blockCd;
		}
		public String getSeatNo() {
			return seatNo;
		}
		public void setSeatNo(String seatNo) {
			this.seatNo = seatNo;
		}
		public Integer getPsnNum() {
			return psnNum;
		}
		public void setPsnNum(Integer psnNum) {
			this.psnNum = psnNum;
		}
		public java.util.Date getOpenDate() {
			return openDate;
		}
		public void setOpenDate(java.util.Date openDate) {
			this.openDate = openDate;
		}
		public java.util.Date getOpenTm() {
			return openTm;
		}
		public void setOpenTm(java.util.Date openTm) {
			this.openTm = openTm;
		}
		public String getCreateByCd() {
			return createByCd;
		}
		public void setCreateByCd(String createByCd) {
			this.createByCd = createByCd;
		}
		public String getCreateBy() {
			return createBy;
		}
		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}
		public java.util.Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(java.util.Date createDate) {
			this.createDate = createDate;
		}
		public String getMemo() {
			return memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getPrinterName() {
			return printerName;
		}
		public void setPrinterName(String printerName) {
			this.printerName = printerName;
		}
		public BigDecimal getSumPrice() {
			return sumPrice;
		}
		public void setSumPrice(BigDecimal sumPrice) {
			this.sumPrice = sumPrice;
		}
		public BigDecimal getSumQuant() {
			return sumQuant;
		}
		public void setSumQuant(BigDecimal sumQuant) {
			this.sumQuant = sumQuant;
		}
		public BigDecimal getTotalQuant() {
			return totalQuant;
		}
		public void setTotalQuant(BigDecimal totalQuant) {
			this.totalQuant = totalQuant;
		}
		public String getBillDemand() {
			return billDemand;
		}
		public void setBillDemand(String billDemand) {
			this.billDemand = billDemand;
		}
		public List<PosFormatDetailTranDto> getTrans() {
			return trans;
		}
		public void setTrans(List<PosFormatDetailTranDto> trans) {
			this.trans = trans;
		}
		
	}
	
	@DrptDto(dtonm = "PosFormatDetailTranDto",dtodrpt="打印项目明细")
	public static class PosFormatDetailTranDto implements java.io.Serializable{
		 
		/** 
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
		*/ 
		private static final long serialVersionUID = -3673291444939038355L;
		
		/** 项目/支付方式标识  **/
		private Integer itemId;
		/** 项目/支付方式代码  **/
		private String itemCd;
		/** 项目名称  **/
		private String itemNm;
		/** 项目数量  **/
		private BigDecimal itemQuant;
		/** 菜品规格标识  **/
		private Integer itemSpecId;
		/** 菜品规格名称  **/
		private String itemSpecNm;
		/** 项目单价  **/
		private BigDecimal itemPrice;
		/** 菜品大类代码 这里用于存储客人点餐时的类别 **/
		private String menuBigtypCd;
		/** 菜品大类名称 这里用于存储客人点餐时的类别 **/
		private String menuBigtypNm;
		/** 菜品类别代码 这里用于存储客人点餐时的类别 **/
		private String menuTypCd;
		/** 菜品类别名称 这里用于存储客人点餐时的类别 **/
		private String menuTypNm;
		/** 套餐标识 0-菜品,1-套餐主项,2-套餐子项,3-临时套餐主项,4-临时套餐子项 固定套餐会在套餐组中定义折算单价,点入时将折算单价写入套餐子项的单价字段中,临时套餐会在套餐子项的单价中记录原始菜品单价,结账时通过折算单价进行服务费,折扣的拆分 **/
		private String pkgFlg;
		/** 套餐主项标识 记录关联的套餐主项 **/
		private Integer pkgRefId;
		/** 套餐组标识 套餐内的菜品会分组 例如:主食、甜点、饮料 **/
		private Integer pkgGroupId;
		/** 套餐组名称  **/
		private String pkgGroupNm;
		/** 加收金额  **/
		private BigDecimal attachAmount;
		/** 制法金额  **/
		private BigDecimal makeAmount;
		/** 消费金额  **/
		private BigDecimal consumeAmount;
		/** 项目需求  **/
		private String itemDemand;
		/** 项目制法  **/
		private String itemMake;
		/** 项目制法  **/
		private String itemMemo;
		
		public Integer getItemId() {
			return itemId;
		}
		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		public String getItemCd() {
			return itemCd;
		}
		public void setItemCd(String itemCd) {
			this.itemCd = itemCd;
		}
		public String getItemNm() {
			return itemNm;
		}
		public void setItemNm(String itemNm) {
			this.itemNm = itemNm;
		}
		public BigDecimal getItemQuant() {
			return itemQuant;
		}
		public void setItemQuant(BigDecimal itemQuant) {
			this.itemQuant = itemQuant;
		}
		public Integer getItemSpecId() {
			return itemSpecId;
		}
		public void setItemSpecId(Integer itemSpecId) {
			this.itemSpecId = itemSpecId;
		}
		public String getItemSpecNm() {
			return itemSpecNm;
		}
		public void setItemSpecNm(String itemSpecNm) {
			this.itemSpecNm = itemSpecNm;
		}
		public BigDecimal getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(BigDecimal itemPrice) {
			this.itemPrice = itemPrice;
		}
		public String getMenuBigtypCd() {
			return menuBigtypCd;
		}
		public void setMenuBigtypCd(String menuBigtypCd) {
			this.menuBigtypCd = menuBigtypCd;
		}
		public String getMenuBigtypNm() {
			return menuBigtypNm;
		}
		public void setMenuBigtypNm(String menuBigtypNm) {
			this.menuBigtypNm = menuBigtypNm;
		}
		public String getMenuTypCd() {
			return menuTypCd;
		}
		public void setMenuTypCd(String menuTypCd) {
			this.menuTypCd = menuTypCd;
		}
		public String getMenuTypNm() {
			return menuTypNm;
		}
		public void setMenuTypNm(String menuTypNm) {
			this.menuTypNm = menuTypNm;
		}
		public String getPkgFlg() {
			return pkgFlg;
		}
		public void setPkgFlg(String pkgFlg) {
			this.pkgFlg = pkgFlg;
		}
		public Integer getPkgRefId() {
			return pkgRefId;
		}
		public void setPkgRefId(Integer pkgRefId) {
			this.pkgRefId = pkgRefId;
		}
		public Integer getPkgGroupId() {
			return pkgGroupId;
		}
		public void setPkgGroupId(Integer pkgGroupId) {
			this.pkgGroupId = pkgGroupId;
		}
		public String getPkgGroupNm() {
			return pkgGroupNm;
		}
		public void setPkgGroupNm(String pkgGroupNm) {
			this.pkgGroupNm = pkgGroupNm;
		}
		public BigDecimal getAttachAmount() {
			return attachAmount;
		}
		public void setAttachAmount(BigDecimal attachAmount) {
			this.attachAmount = attachAmount;
		}
		public BigDecimal getMakeAmount() {
			return makeAmount;
		}
		public void setMakeAmount(BigDecimal makeAmount) {
			this.makeAmount = makeAmount;
		}
		public BigDecimal getConsumeAmount() {
			return consumeAmount;
		}
		public void setConsumeAmount(BigDecimal consumeAmount) {
			this.consumeAmount = consumeAmount;
		}
		public String getItemDemand() {
			return itemDemand;
		}
		public void setItemDemand(String itemDemand) {
			this.itemDemand = itemDemand;
		}
		public String getItemMake() {
			return itemMake;
		}
		public void setItemMake(String itemMake) {
			this.itemMake = itemMake;
		}
		public String getItemMemo() {
			return itemMemo;
		}
		public void setItemMemo(String itemMemo) {
			this.itemMemo = itemMemo;
		}
		
		
	}
	
	
	@DrptDto(dtonm = "PosFormatMQDto",dtodrpt="打印MQ内容")
	public static class PosFormatMQDto implements java.io.Serializable{
		 
		/** 
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
		*/ 
		private static final long serialVersionUID = -5137509411175237797L;
		/** 任务标识  **/
		private Integer taskId;
		/** 集团标识  **/
		private String chainUid;
		/** 集团名称  **/
		private String chainNm;
		/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
		private String unitUid;
		/** 酒店名称  **/
		private String unitNm;
		/** 首选打印机地址  **/
		private String firstPrinterAddress;
		/** 备用打印机地址  **/
		private String secondPrinterAddress;
		/** 打印指令  **/
		private PosFormatMQTemplateDto PrintOrder;
		
		public Integer getTaskId() {
			return taskId;
		}
		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}
		public String getChainUid() {
			return chainUid;
		}
		public void setChainUid(String chainUid) {
			this.chainUid = chainUid;
		}
		public String getChainNm() {
			return chainNm;
		}
		public void setChainNm(String chainNm) {
			this.chainNm = chainNm;
		}
		public String getUnitUid() {
			return unitUid;
		}
		public void setUnitUid(String unitUid) {
			this.unitUid = unitUid;
		}
		public String getUnitNm() {
			return unitNm;
		}
		public void setUnitNm(String unitNm) {
			this.unitNm = unitNm;
		}
		public String getFirstPrinterAddress() {
			return firstPrinterAddress;
		}
		public void setFirstPrinterAddress(String firstPrinterAddress) {
			this.firstPrinterAddress = firstPrinterAddress;
		}
		public String getSecondPrinterAddress() {
			return secondPrinterAddress;
		}
		public void setSecondPrinterAddress(String secondPrinterAddress) {
			this.secondPrinterAddress = secondPrinterAddress;
		}
		public PosFormatMQTemplateDto getPrintOrder() {
			return PrintOrder;
		}
		public void setPrintOrder(PosFormatMQTemplateDto printOrder) {
			PrintOrder = printOrder;
		}

		
		
		
		
	}
	
	
	@DrptDto(dtonm = "PosFormatMQTemplateDto",dtodrpt="打印格式模板项")
	public static class PosFormatMQTemplateDto implements java.io.Serializable{

		/** 
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
		*/ 
		private static final long serialVersionUID = -1083830228765638811L;
		/** 模板标识  **/
		private Integer templateId;
		/** 模板名称  **/
		private String templateName;
		/** 模板属性  **/
		private String templateFlg;
		/** 左边距字符数  **/
		private Integer marginLeft;
		/** 上边距字符数  **/
		private Integer marginTop;
		/** 右边距字符数  **/
		private Integer marginRight;
		/** 下边距字符数  **/
		private Integer marginBottom;
		/** 页宽字符数  **/
		private Integer width;
		/** 打印行  **/
		private List<PosFormatMQLineDto> lines;
		
		
		public Integer getTemplateId() {
			return templateId;
		}
		public void setTemplateId(Integer templateId) {
			this.templateId = templateId;
		}
		public String getTemplateName() {
			return templateName;
		}
		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}
		public String getTemplateFlg() {
			return templateFlg;
		}
		public void setTemplateFlg(String templateFlg) {
			this.templateFlg = templateFlg;
		}
		public Integer getMarginLeft() {
			return marginLeft;
		}
		public void setMarginLeft(Integer marginLeft) {
			this.marginLeft = marginLeft;
		}
		public Integer getMarginTop() {
			return marginTop;
		}
		public void setMarginTop(Integer marginTop) {
			this.marginTop = marginTop;
		}
		public Integer getMarginRight() {
			return marginRight;
		}
		public void setMarginRight(Integer marginRight) {
			this.marginRight = marginRight;
		}
		public Integer getMarginBottom() {
			return marginBottom;
		}
		public void setMarginBottom(Integer marginBottom) {
			this.marginBottom = marginBottom;
		}
		public Integer getWidth() {
			return width;
		}
		public void setWidth(Integer width) {
			this.width = width;
		}
		public List<PosFormatMQLineDto> getLines() {
			return lines;
		}
		public void setLines(List<PosFormatMQLineDto> lines) {
			this.lines = lines;
		}
		
	}
	
	@DrptDto(dtonm = "PosFormatMQLineDto",dtodrpt="打印格式行")
	public static class PosFormatMQLineDto implements java.io.Serializable{

		/** 
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
		*/ 
		private static final long serialVersionUID = -67414633534727561L;
		/** 格式行元素标识  **/
		private Integer formatLineId;
		/** 行元素标识  **/
		private String lineFlg;
		/** 换行方式  **/
		private String warpFlg;
		/** 对齐方式  **/
		private String alignFlg;
		/** 字体属性  **/
		private String fontFlg;
		/** 下划线标识  **/
		private String underLineFlg;
		/** 粗体标识  **/
		private String blodFlg;
		/** 文本内容  **/
		private String lineText;
		/** 格式化文本  **/
		private String format;
		/** 条码宽度  **/
		private Integer qrWidth;
		/** 排序号  **/
		private Integer lineSeq;
		/** 打印行  **/
		private List<PosFormatMQElementDto> elements;
		
		public Integer getFormatLineId() {
			return formatLineId;
		}
		public void setFormatLineId(Integer formatLineId) {
			this.formatLineId = formatLineId;
		}
		public String getLineFlg() {
			return lineFlg;
		}
		public void setLineFlg(String lineFlg) {
			this.lineFlg = lineFlg;
		}
		public String getWarpFlg() {
			return warpFlg;
		}
		public void setWarpFlg(String warpFlg) {
			this.warpFlg = warpFlg;
		}
		public String getAlignFlg() {
			return alignFlg;
		}
		public void setAlignFlg(String alignFlg) {
			this.alignFlg = alignFlg;
		}
		public String getFontFlg() {
			return fontFlg;
		}
		public void setFontFlg(String fontFlg) {
			this.fontFlg = fontFlg;
		}
		public String getUnderLineFlg() {
			return underLineFlg;
		}
		public void setUnderLineFlg(String underLineFlg) {
			this.underLineFlg = underLineFlg;
		}
		public String getBlodFlg() {
			return blodFlg;
		}
		public void setBlodFlg(String blodFlg) {
			this.blodFlg = blodFlg;
		}
		public String getLineText() {
			return lineText;
		}
		public void setLineText(String lineText) {
			this.lineText = lineText;
		}
		public String getFormat() {
			return format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public Integer getQrWidth() {
			return qrWidth;
		}
		public void setQrWidth(Integer qrWidth) {
			this.qrWidth = qrWidth;
		}
		public Integer getLineSeq() {
			return lineSeq;
		}
		public void setLineSeq(Integer lineSeq) {
			this.lineSeq = lineSeq;
		}
		public List<PosFormatMQElementDto> getElements() {
			return elements;
		}
		public void setElements(List<PosFormatMQElementDto> elements) {
			this.elements = elements;
		}
		
	}
	
	
	@DrptDto(dtonm = "PosFormatMQElementDto",dtodrpt="打印格式分组")
	public static class PosFormatMQElementDto implements java.io.Serializable{

		/** 
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
		*/ 
		private static final long serialVersionUID = 745045597008497829L;
		/** 格式行元素标识  **/
		private Integer formatPackageId;
		/** 组标识  **/
		private String packageFlg;
		/** 换行方式  **/
		private String warpFlg;
		/** 对齐方式  **/
		private String alignFlg;
		/** 字体属性  **/
		private String fontFlg;
		/** 下划线标识  **/
		private String underLineFlg;
		/** 粗体标识  **/
		private String blodFlg;
		/** 文本内容  **/
		private String packageText;
		/** 格式化文本  **/
		private String format;
		/** 制表宽度  **/
		private Integer tableWidth;
		/** 制表起始位置  **/
		private Integer tableLeft;
		/** 排序号  **/
		private Integer packageSeq;
		
		/** 打印行  **/
		private List<PosFormatDetailTranDto> elements;
		public Integer getFormatPackageId() {
			return formatPackageId;
		}
		public void setFormatPackageId(Integer formatPackageId) {
			this.formatPackageId = formatPackageId;
		}
		public String getPackageFlg() {
			return packageFlg;
		}
		public void setPackageFlg(String packageFlg) {
			this.packageFlg = packageFlg;
		}
		public String getWarpFlg() {
			return warpFlg;
		}
		public void setWarpFlg(String warpFlg) {
			this.warpFlg = warpFlg;
		}
		public String getAlignFlg() {
			return alignFlg;
		}
		public void setAlignFlg(String alignFlg) {
			this.alignFlg = alignFlg;
		}
		public String getFontFlg() {
			return fontFlg;
		}
		public void setFontFlg(String fontFlg) {
			this.fontFlg = fontFlg;
		}
		public String getUnderLineFlg() {
			return underLineFlg;
		}
		public void setUnderLineFlg(String underLineFlg) {
			this.underLineFlg = underLineFlg;
		}
		public String getBlodFlg() {
			return blodFlg;
		}
		public void setBlodFlg(String blodFlg) {
			this.blodFlg = blodFlg;
		}
		public String getPackageText() {
			return packageText;
		}
		public void setPackageText(String packageText) {
			this.packageText = packageText;
		}
		public String getFormat() {
			return format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public Integer getTableWidth() {
			return tableWidth;
		}
		public void setTableWidth(Integer tableWidth) {
			this.tableWidth = tableWidth;
		}
		public Integer getTableLeft() {
			return tableLeft;
		}
		public void setTableLeft(Integer tableLeft) {
			this.tableLeft = tableLeft;
		}
		public List<PosFormatDetailTranDto> getElements() {
			return elements;
		}
		public void setElements(List<PosFormatDetailTranDto> elements) {
			this.elements = elements;
		}
		public Integer getPackageSeq() {
			return packageSeq;
		}
		public void setPackageSeq(Integer packageSeq) {
			this.packageSeq = packageSeq;
		}
		
		
	}


	
}