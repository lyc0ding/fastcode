package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 村委肥料调查表
*
* @author Tom
* @date 2024-12-16
**/
public class HbtQuestionnaireFertilizer{
	/**  */
	private String id;

	/** 农产品id */
	private String productId;

	/** 肥料名称 */
	private String fertilizer;

	/** 肥料品牌 */
	private String branch;

	/** 肥料用量 */
	private String amount;

	/** 肥料照片 */
	private String fertilizerId;

	/** 肥料备注 */
	private String fertilizerremark;

	/** setter、getter方法 */
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setProductId(String productId){
		this.productId=productId;
	}
	public String getProductId(){
		return this.productId;
	}
	public void setFertilizer(String fertilizer){
		this.fertilizer=fertilizer;
	}
	public String getFertilizer(){
		return this.fertilizer;
	}
	public void setBranch(String branch){
		this.branch=branch;
	}
	public String getBranch(){
		return this.branch;
	}
	public void setAmount(String amount){
		this.amount=amount;
	}
	public String getAmount(){
		return this.amount;
	}
	public void setFertilizerId(String fertilizerId){
		this.fertilizerId=fertilizerId;
	}
	public String getFertilizerId(){
		return this.fertilizerId;
	}
	public void setFertilizerremark(String fertilizerremark){
		this.fertilizerremark=fertilizerremark;
	}
	public String getFertilizerremark(){
		return this.fertilizerremark;
	}

}