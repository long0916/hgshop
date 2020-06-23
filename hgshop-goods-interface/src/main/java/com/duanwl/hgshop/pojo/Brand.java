package com.duanwl.hgshop.pojo;

import java.io.Serializable;
/**
 * 
 * @ClassName: Brand 
 * @Description: 品牌实体类
 * @author: 段文龙
 * @date: 2020年6月23日 下午6:58:35
 */
public class Brand implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 342712000219646087L;
	Integer id;
	String name;
	String firstChar;
	int deletedFlag;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstChar() {
		return firstChar;
	}
	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}
	public int getDeletedFlag() {
		return deletedFlag;
	}
	public void setDeletedFlag(int deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", firstChar=" + firstChar + ", deletedFlag=" + deletedFlag + "]";
	}
}
