package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description VIEW
*
* @author Tom
* @date 2024-12-16
**/
public class VHandoverprintbase{
	/** 关联主表主键 */
	private String handoverId;

	/** 关联分析项目  */
	private String analysisProject;

	/** setter、getter方法 */
	public void setHandoverId(String handoverId){
		this.handoverId=handoverId;
	}
	public String getHandoverId(){
		return this.handoverId;
	}
	public void setAnalysisProject(String analysisProject){
		this.analysisProject=analysisProject;
	}
	public String getAnalysisProject(){
		return this.analysisProject;
	}

}