package com.kirno.take_out_system.entity;

/**
 * ��Ʒ��
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
	 * һ����ʽ����Ϣ
	 * 
	 * @param imageId
	 *            ͼƬ
	 * @param name
	 *            ����
	 * @param price
	 *            �۸�
	 * @param level
	 *            ����
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
