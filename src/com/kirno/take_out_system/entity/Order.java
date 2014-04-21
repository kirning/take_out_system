package com.kirno.take_out_system.entity;

public class Order {

	/**
	 * ͼƬ
	 */
	private int imageID;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private int price;
	/**
	 * ����
	 */
	private int num;

	/**
	 * @param imageID ͼƬ
	 * @param name	����
	 * @param price	����
	 * @param num	����
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
	 * ��ȡ����
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * ��ȡ�۸�
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * ��ȡ����
	 * @return
	 */
	public int getNum() {
		return num;
	}

	/**
	 * ��ȡ�ܼ�
	 * @return
	 */
	public int getSum() {
		return num*price;
	}

	/**
	 * ��������
	 * @param num
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
