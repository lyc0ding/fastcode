package org.lycoding.entity.po;

import java.sql.Date;

/**
* @description 同步机制的行锁表
*
* @author Tom
* @date 2024-12-16
**/
public class QrtzSimpropTriggers{
	/** 调度名称 */
	private String schedName;

	/** qrtz_triggers表trigger_name的外键 */
	private String triggerName;

	/** qrtz_triggers表trigger_group的外键 */
	private String triggerGroup;

	/** String类型的trigger的第一个参数 */
	private String strProp1;

	/** String类型的trigger的第二个参数 */
	private String strProp2;

	/** String类型的trigger的第三个参数 */
	private String strProp3;

	/** int类型的trigger的第一个参数 */
	private String intProp1;

	/** int类型的trigger的第二个参数 */
	private String intProp2;

	/** long类型的trigger的第一个参数 */
	private String longProp1;

	/** long类型的trigger的第二个参数 */
	private String longProp2;

	/** decimal类型的trigger的第一个参数 */
	private String decProp1;

	/** decimal类型的trigger的第二个参数 */
	private String decProp2;

	/** Boolean类型的trigger的第一个参数 */
	private String boolProp1;

	/** Boolean类型的trigger的第二个参数 */
	private String boolProp2;

	/** setter、getter方法 */
	public void setSchedName(String schedName){
		this.schedName=schedName;
	}
	public String getSchedName(){
		return this.schedName;
	}
	public void setTriggerName(String triggerName){
		this.triggerName=triggerName;
	}
	public String getTriggerName(){
		return this.triggerName;
	}
	public void setTriggerGroup(String triggerGroup){
		this.triggerGroup=triggerGroup;
	}
	public String getTriggerGroup(){
		return this.triggerGroup;
	}
	public void setStrProp1(String strProp1){
		this.strProp1=strProp1;
	}
	public String getStrProp1(){
		return this.strProp1;
	}
	public void setStrProp2(String strProp2){
		this.strProp2=strProp2;
	}
	public String getStrProp2(){
		return this.strProp2;
	}
	public void setStrProp3(String strProp3){
		this.strProp3=strProp3;
	}
	public String getStrProp3(){
		return this.strProp3;
	}
	public void setIntProp1(String intProp1){
		this.intProp1=intProp1;
	}
	public String getIntProp1(){
		return this.intProp1;
	}
	public void setIntProp2(String intProp2){
		this.intProp2=intProp2;
	}
	public String getIntProp2(){
		return this.intProp2;
	}
	public void setLongProp1(String longProp1){
		this.longProp1=longProp1;
	}
	public String getLongProp1(){
		return this.longProp1;
	}
	public void setLongProp2(String longProp2){
		this.longProp2=longProp2;
	}
	public String getLongProp2(){
		return this.longProp2;
	}
	public void setDecProp1(String decProp1){
		this.decProp1=decProp1;
	}
	public String getDecProp1(){
		return this.decProp1;
	}
	public void setDecProp2(String decProp2){
		this.decProp2=decProp2;
	}
	public String getDecProp2(){
		return this.decProp2;
	}
	public void setBoolProp1(String boolProp1){
		this.boolProp1=boolProp1;
	}
	public String getBoolProp1(){
		return this.boolProp1;
	}
	public void setBoolProp2(String boolProp2){
		this.boolProp2=boolProp2;
	}
	public String getBoolProp2(){
		return this.boolProp2;
	}

}