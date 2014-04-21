package com.kirno.take_out_system.entity;

public class Order {

	/**
	 * 图片
	 */
	private int imageID;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 单价
	 */
	private int price;
	/**
	 * 数量
	 */
	private int num;

	/**
	 * @param imageID 图片
	 * @param name	名字
	 * @param price	单价
	 * @param num	数量
	 */
	public Order(int imageID, String name, int price, int num) {
		super();
		this.imageID = imageID;
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public int getImageID() {
		return imageID;
	}

	/**
	 * 获取名字
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 获取价格
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 获取数量
	 * @return
	 */
	public int getNum() {
		return num;
	}

	/**
	 * 获取总价
	 * @return
	 */
	public int getSum() {
		return num*price;
	}

	/**
	 * 设置数量
	 * @param num
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
