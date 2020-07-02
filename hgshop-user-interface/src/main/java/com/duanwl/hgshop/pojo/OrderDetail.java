package com.duanwl.hgshop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @ClassName: OrderDetail 
 * @Description: 订单明细
 * @author: 段文龙
 * @date: 2020年7月2日 下午4:54:31
 */
public class OrderDetail implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4735012220331706111L;
	private Integer id;
	private int skuid;
	private BigDecimal total;
	private int oid;
	private int pnum;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getSkuid() {
		return skuid;
	}
	public void setSkuid(int skuid) {
		this.skuid = skuid;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", skuid=" + skuid + ", total=" + total + ", oid=" + oid + ", pnum=" + pnum
				+ "]";
	}
	
	
   
}