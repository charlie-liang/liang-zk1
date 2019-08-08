package com.liangjunwei.domain;
/***
 * 
    * @ClassName: Typee
    * @Description: 实体类   一
    * @author 梁钧玮
    * @date 2019年8月6日
    *
 */
public class Typee {
   private Integer cid;
   private String cname;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Typee [cid=" + cid + ", cname=" + cname + "]";
}
public Typee() {
	super();
	// TODO Auto-generated constructor stub
}
public Typee(Integer cid, String cname) {
	super();
	this.cid = cid;
	this.cname = cname;
}
   
   
}
