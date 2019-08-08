package com.liangjunwei.domain;
/***
 * 
    * @ClassName: Hua
    * @Description:实体类   多
    * @author 梁钧玮
    * @date 2019年8月6日
    *
 */
public class Hua {
    private Integer id;
    private String name;
    private String miao;
    private Integer cid;
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
	public String getMiao() {
		return miao;
	}
	public void setMiao(String miao) {
		this.miao = miao;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Hua [id=" + id + ", name=" + name + ", miao=" + miao + ", cid=" + cid + "]";
	}
	public Hua(Integer id, String name, String miao, Integer cid) {
		super();
		this.id = id;
		this.name = name;
		this.miao = miao;
		this.cid = cid;
	}
	public Hua() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
} 
