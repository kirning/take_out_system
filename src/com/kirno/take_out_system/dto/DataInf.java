package com.kirno.take_out_system.dto;

import android.graphics.Bitmap;

/**
 * 菜式详细界面的数据
 * @author qq303_000
 *
 */
public class DataInf {
	private Bitmap img;
	private String infCai;
	private String infShop;
	private int price;
	private String[] talk;
	
	private static DataInf instance;
	
	private DataInf(){}
	
	public static DataInf getInstance(){
		if(instance == null){
			instance = new DataInf();
		}
		return instance;
	}

	public Bitmap getImg() {
		return img;
	}

	public void setImg(Bitmap img) {
		this.img = img;
	}

	public String getInfCai() {
		return infCai;
	}

	public void setInfCai(String infCai) {
		this.infCai = infCai;
	}

	public String getInfShop() {
		return infShop;
	}

	public void setInfShop(String infShop) {
		this.infShop = infShop;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void setInstance(DataInf instance) {
		DataInf.instance = instance;
	}

	public String[] getTalk() {
		return talk;
	}
	
	

	
	

	
}
