package com.capgemini.takehome.beans;

public class Product
{
int productid;
String productname;
String productcategory;
int productprice;
public Product(int productid, String productname, String productcategory, int productprice) {
	this.productid = productid;
	this.productname = productname;
	this.productcategory = productcategory;
	this.productprice = productprice;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProductcategory() {
	return productcategory;
}
public void setProductcategory(String productcategory) {
	this.productcategory = productcategory;
}
public int getProductprice() {
	return productprice;
}
public void setProductprice(int productprice) {
	this.productprice = productprice;
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productname=" + productname + ", productcategory=" + productcategory
			+ ", productprice=" + productprice + "]";
}


}
