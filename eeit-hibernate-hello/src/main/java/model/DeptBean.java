package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "dept")
public class DeptBean {
	@Id // 必要
	@Column(name="DEPTID") // 非必要 名稱盡量不要加底線
	private Integer deptid;
	@Column(name="DEPTNAME") // 非必要
	private String deptname;
	
	@Override
	public String toString() {
		return "DeptBean [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
}
