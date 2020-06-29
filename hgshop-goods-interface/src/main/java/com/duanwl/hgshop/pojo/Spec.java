package com.duanwl.hgshop.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @ClassName: Spec 
 * @Description: 规格实体
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:39:31
 */
public class Spec implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8002048533959653934L;
	
	Integer id;
	String specName;
	
	List<SpecOption> options;
	
	
	
	
	public Spec() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Spec(String specName) {
		super();
		this.specName = specName;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSpecName() {
		return specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	
	public List<SpecOption> getOptions() {
		return options;
	}
	public void setOptions(List<SpecOption> options) {
		this.options = options;
	}
	
	@Override
	public String toString() {
		return "Spec [id=" + id + ", specName=" + specName + ", options=" + options + "]";
	}
	


}
