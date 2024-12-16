package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 调查问卷农业投入品信息表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireProduct{
	/**  */
	private String id;

	/** 主表id */
	private String dataid;

	/** 作物类型 */
	private String croptype;

	/** 作物品种 */
	private String varietyname;

	/** 肥料品牌 */
	private String fertilizerbrand;

	/** 种植几季 */
	private String howmanyseason;

	/** 复合肥用量 */
	private String compoundfertilizercount;

	/** 尿素用量 */
	private String ureadosage;

	/** 有机肥用量 */
	private String organicfertilizercount;

	/**  */
	private String varietyImg;

	/** 种植范围 */
	private String plantArea;

	/** 农产品备注 */
	private String productremark;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setDataid(String dataid){
		this.dataid=dataid;
	}
	public String getDataid(){
		return this.dataid;
	}
	public void setCroptype(String croptype){
		this.croptype=croptype;
	}
	public String getCroptype(){
		return this.croptype;
	}
	public void setVarietyname(String varietyname){
		this.varietyname=varietyname;
	}
	public String getVarietyname(){
		return this.varietyname;
	}
	public void setFertilizerbrand(String fertilizerbrand){
		this.fertilizerbrand=fertilizerbrand;
	}
	public String getFertilizerbrand(){
		return this.fertilizerbrand;
	}
	public void setHowmanyseason(String howmanyseason){
		this.howmanyseason=howmanyseason;
	}
	public String getHowmanyseason(){
		return this.howmanyseason;
	}
	public void setCompoundfertilizercount(String compoundfertilizercount){
		this.compoundfertilizercount=compoundfertilizercount;
	}
	public String getCompoundfertilizercount(){
		return this.compoundfertilizercount;
	}
	public void setUreadosage(String ureadosage){
		this.ureadosage=ureadosage;
	}
	public String getUreadosage(){
		return this.ureadosage;
	}
	public void setOrganicfertilizercount(String organicfertilizercount){
		this.organicfertilizercount=organicfertilizercount;
	}
	public String getOrganicfertilizercount(){
		return this.organicfertilizercount;
	}
	public void setVarietyImg(String varietyImg){
		this.varietyImg=varietyImg;
	}
	public String getVarietyImg(){
		return this.varietyImg;
	}
	public void setPlantArea(String plantArea){
		this.plantArea=plantArea;
	}
	public String getPlantArea(){
		return this.plantArea;
	}
	public void setProductremark(String productremark){
		this.productremark=productremark;
	}
	public String getProductremark(){
		return this.productremark;
	}

}