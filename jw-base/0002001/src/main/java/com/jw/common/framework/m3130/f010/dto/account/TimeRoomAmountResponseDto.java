package com.jw.common.framework.m3130.f010.dto.account;

import java.io.Serializable;
import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.breakdown.BreakDownDto;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;
/**
 * ## 类说明：
 * 	TimeRoomAmountResponseDto 钟点房价格计算响应
 * @author    [mdz]   
 * @version   [V1.0, 2017-05-18]
 * @package com.jw.hms.cmm.m3130.f010.dto.account
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-05-18|mdz|新增|TimeRoomAmountResponseDto新增
 */
@DrptDto(dtonm = "TimeRoomAmountResponseDto",dtodrpt="钟点房价格计算响应")
public class TimeRoomAmountResponseDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2330227283766111812L;
	
	@DrptField(fieldnm="c2nrateId",fielddrpt="钟点房转正常房价格")
	private Integer c2nrateId;
	@DrptField(fieldnm = "cycleTyp", fielddrpt = "分段类型")
	private String cycleTyp;
	@DrptField(fieldnm = "cycleDays", fielddrpt = "自定周期天数")
	private Integer cycleDays;
	
	@DrptField(fieldnm="toleranceTmlen",fielddrpt="宽容时间")
	private Integer toleranceTmlen;
	@DrptField(fieldnm="startingTmlen",fielddrpt="起步时间（分钟）")
	private Integer startingTmlen;
	@DrptField(fieldnm="startingAmt",fielddrpt="起步收费价格")
	private BigDecimal startingAmt;
	@DrptField(fieldnm="timingcellTmlen",fielddrpt="标准计费时长（分钟）")
	private Integer timingcellTmlen;
	@DrptField(fieldnm="timingAmt",fielddrpt="标准计费价格")
	private BigDecimal timingAmt;
	@DrptField(fieldnm="timingminTmlen",fielddrpt="最小计费时长")
	private Integer timingminTmlen;
	@DrptField(fieldnm="timingminAmt",fielddrpt="最小计费价格")
	private BigDecimal timingminAmt;
	@DrptField(fieldnm="timingfreeTmlen",fielddrpt="计费缓冲时长（分钟）")
	private Integer timingfreeTmlen;
	@DrptField(fieldnm="clk2nmlTyp",fielddrpt="钟点房转正常方式")
	private String clk2nmlTyp;
	@DrptField(fieldnm="clk2nmlSettm",fielddrpt="转正常——指定时间")
	private String clk2nmlSettm;
	@DrptField(fieldnm="clk2nmlLimitlen",fielddrpt="转正常——限定时长")
	private Integer clk2nmlLimitlen;
	@DrptField(fieldnm="clockrmnightsTyp",fielddrpt="小时房房晚计算方式")
	private String clockrmnightsTyp;
	@DrptField(fieldnm="clockrmNights",fielddrpt="小时房设定房晚")
	private BigDecimal clockrmNights;
	
	@DrptField(fieldnm="amount",fielddrpt="钟点房价格")
	private BigDecimal amount;
	@DrptField(fieldnm="refreshAmount",fielddrpt="刷新价格")
	private BigDecimal refreshAmount;
	@DrptField(fieldnm="refreshTime",fielddrpt="刷新时间")
	private Integer refreshTime;
	@DrptField(fieldnm="diffTime",fielddrpt="钟点房时间差")
	private Integer diffTime;
	@DrptField(fieldnm="diffVlu",fielddrpt="转正价时间")
	private Integer diffVlu;
	
	@DrptField(fieldnm="overtimeFlg",fielddrpt="超时flg")
	private Boolean overtimeFlg;
	@DrptField(fieldnm="breakDownDto",fielddrpt="计算金额")
	private BreakDownDto breakDownDto;
	@DrptField(fieldnm="refreshBreakDownDto",fielddrpt="计算刷新金额")
	private BreakDownDto refreshBreakDownDto;
	
	
	public Integer getDiffVlu() {
		return diffVlu;
	}
	public void setDiffVlu(Integer diffVlu) {
		this.diffVlu = diffVlu;
	}
	public Integer getC2nrateId() {
		return c2nrateId;
	}
	public void setC2nrateId(Integer c2nrateId) {
		this.c2nrateId = c2nrateId;
	}
	public String getCycleTyp() {
		return cycleTyp;
	}
	public void setCycleTyp(String cycleTyp) {
		this.cycleTyp = cycleTyp;
	}
	public Integer getCycleDays() {
		return cycleDays;
	}
	public void setCycleDays(Integer cycleDays) {
		this.cycleDays = cycleDays;
	}
	public Integer getToleranceTmlen() {
		return toleranceTmlen;
	}
	public void setToleranceTmlen(Integer toleranceTmlen) {
		this.toleranceTmlen = toleranceTmlen;
	}
	public Integer getStartingTmlen() {
		return startingTmlen;
	}
	public void setStartingTmlen(Integer startingTmlen) {
		this.startingTmlen = startingTmlen;
	}
	public BigDecimal getStartingAmt() {
		return startingAmt;
	}
	public void setStartingAmt(BigDecimal startingAmt) {
		this.startingAmt = startingAmt;
	}
	public Integer getTimingcellTmlen() {
		return timingcellTmlen;
	}
	public void setTimingcellTmlen(Integer timingcellTmlen) {
		this.timingcellTmlen = timingcellTmlen;
	}
	public BigDecimal getTimingAmt() {
		return timingAmt;
	}
	public void setTimingAmt(BigDecimal timingAmt) {
		this.timingAmt = timingAmt;
	}
	public Integer getTimingminTmlen() {
		return timingminTmlen;
	}
	public void setTimingminTmlen(Integer timingminTmlen) {
		this.timingminTmlen = timingminTmlen;
	}
	public BigDecimal getTimingminAmt() {
		return timingminAmt;
	}
	public void setTimingminAmt(BigDecimal timingminAmt) {
		this.timingminAmt = timingminAmt;
	}
	public Integer getTimingfreeTmlen() {
		return timingfreeTmlen;
	}
	public void setTimingfreeTmlen(Integer timingfreeTmlen) {
		this.timingfreeTmlen = timingfreeTmlen;
	}
	public String getClk2nmlTyp() {
		return clk2nmlTyp;
	}
	public void setClk2nmlTyp(String clk2nmlTyp) {
		this.clk2nmlTyp = clk2nmlTyp;
	}
	public String getClk2nmlSettm() {
		return clk2nmlSettm;
	}
	public void setClk2nmlSettm(String clk2nmlSettm) {
		this.clk2nmlSettm = clk2nmlSettm;
	}
	public Integer getClk2nmlLimitlen() {
		return clk2nmlLimitlen;
	}
	public void setClk2nmlLimitlen(Integer clk2nmlLimitlen) {
		this.clk2nmlLimitlen = clk2nmlLimitlen;
	}
	public String getClockrmnightsTyp() {
		return clockrmnightsTyp;
	}
	public void setClockrmnightsTyp(String clockrmnightsTyp) {
		this.clockrmnightsTyp = clockrmnightsTyp;
	}
	public BigDecimal getClockrmNights() {
		return clockrmNights;
	}
	public void setClockrmNights(BigDecimal clockrmNights) {
		this.clockrmNights = clockrmNights;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getRefreshAmount() {
		return refreshAmount;
	}
	public void setRefreshAmount(BigDecimal refreshAmount) {
		this.refreshAmount = refreshAmount;
	}
	public Integer getRefreshTime() {
		return refreshTime;
	}
	public void setRefreshTime(Integer refreshTime) {
		this.refreshTime = refreshTime;
	}
	public Boolean getOvertimeFlg() {
		return overtimeFlg;
	}
	public void setOvertimeFlg(Boolean overtimeFlg) {
		this.overtimeFlg = overtimeFlg;
	}
	public BreakDownDto getBreakDownDto() {
		return breakDownDto;
	}
	public void setBreakDownDto(BreakDownDto breakDownDto) {
		this.breakDownDto = breakDownDto;
	}
	public BreakDownDto getRefreshBreakDownDto() {
		return refreshBreakDownDto;
	}
	public void setRefreshBreakDownDto(BreakDownDto refreshBreakDownDto) {
		this.refreshBreakDownDto = refreshBreakDownDto;
	}
	public Integer getDiffTime() {
		return diffTime;
	}
	public void setDiffTime(Integer diffTime) {
		this.diffTime = diffTime;
	}
	
}
