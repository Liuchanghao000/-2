package com.lch.goods.bean;

public class Good {

	private int gid;
	private String gname;
	private String gename;
	private int size;
	private float price;
	private int num;
	private String label;
	private String img;
	private Brand brand;
	private Kind kind;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGename() {
		return gename;
	}
	public void setGename(String gename) {
		this.gename = gename;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Good [gid=" + gid + ", gname=" + gname + ", gename=" + gename + ", size=" + size + ", price=" + price
				+ ", num=" + num + ", label=" + label + ", img=" + img + ", brand=" + brand + ", kind=" + kind + "]";
	}
	
	
}
