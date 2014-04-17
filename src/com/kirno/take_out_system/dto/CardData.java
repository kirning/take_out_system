package com.kirno.take_out_system.dto;

import com.kirno.take_out_system.R;

/**
 * 主界面的数据
 * @author qq303_000
 *
 */
public class CardData {
	private static CardData instance;
	
	/**
	 * 数据源
	 */
	private int[] imageIds = new int[]{R.drawable.sc_my,R.drawable.sc_more,R.drawable.sc_dd,R.drawable.sc_login,R.drawable.sc_my,R.drawable.sc_ss};
	private String[] names = new String[]{"tom","fuck","apple","bear","cat","dog"};
	private int[] level = new int[]{1,2,3,4,5,6};
	private String[] price = new String[]{"12","13","14","15","16","17"};
	
	public static CardData getInstance(){
		if(instance == null){
			instance = new CardData();
		}
		return instance;
	}
	
	public int[] getImageIds() {
		return imageIds;
	}
	public void setImageIds(int[] imageIds) {
		this.imageIds = imageIds;
	}
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	public int[] getLevel() {
		return level;
	}
	public void setLevel(int[] level) {
		this.level = level;
	}
	public String[] getPrice() {
		return price;
	}
	public void setPrice(String[] price) {
		this.price = price;
	}
	
	
	

}
