package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

@DrptDto(dtonm = "RoommoveReqDto",dtodrpt="房间变动DTO")
public class RoommoveReqDto extends RequestBaseDto implements Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 6820563606835085526L;
	@DrptField(fieldnm = "roommoveDtos",fielddrpt = "房间变动信息")
	private List<RoommoveDto> roommoveDtos;
	@DrptField(fieldnm = "moveTyp",fielddrpt = "变动类型")
	private String moveTyp;
	@DrptField(fieldnm = "moveRsnId",fielddrpt = "换房原因")
	private Integer moveRsnId;
	@DrptField(fieldnm = "moveRsnTxt",fielddrpt = "换房原因内容")
	private String moveRsnTxt;
	public List<RoommoveDto> getRoommoveDtos() {
		return roommoveDtos;
	}
	public void setRoommoveDtos(List<RoommoveDto> roommoveDtos) {
		this.roommoveDtos = roommoveDtos;
	}
	public String getMoveTyp() {
		return moveTyp;
	}
	public void setMoveTyp(String moveTyp) {
		this.moveTyp = moveTyp;
	}
	public Integer getMoveRsnId() {
		return moveRsnId;
	}
	public void setMoveRsnId(Integer moveRsnId) {
		this.moveRsnId = moveRsnId;
	}
	public String getMoveRsnTxt() {
		return moveRsnTxt;
	}
	public void setMoveRsnTxt(String moveRsnTxt) {
		this.moveRsnTxt = moveRsnTxt;
	}
	
}
