package com.kirno.take_out_system.entity;

/**
 * 商品类
 * 
 * @author qq303_000
 * 
 */
public class Commodity {

	private int ImageId;
	private String Name;
	private String Price;
	private int Level;

	/**
	 * 一个菜式的信息
	 * 
	 * @param imageId
	 *            图片
	 * @param name
	 *            名字
	 * @param price
	 *            价格
	 * @param level
	 *            评价
	 */
	public Commodity(int imageId, String name, String price, int level) {
		super();
		ImageId = imageId;
		Name = name;
		Price = price;
		Level = level;
	}

	public int getImageId() {
		return ImageId;
	}

	public String getName() {
		return Name;
	}

	public String getPrice() {
		return Price;
	}

	public int getLevel() {
		return Level;
	}

}
