package com.kirno.take_out_system.dto;

import java.util.ArrayList;
import java.util.List;

import com.kirno.take_out_system.R.drawable;
import com.kirno.take_out_system.entity.Commodity;

/**
 * 主界面的数据
 * 
 * @author qq303_000
 * 
 */
public class DataCommodity {
	private static DataCommodity instance;
	private List<Commodity> data;

	private DataCommodity() {
		data = new ArrayList<>();
		test();
	}

	public static DataCommodity getInstance() {
		if (instance == null) {
			instance = new DataCommodity();
		}
		return instance;
	}

	public List<Commodity> getData() {
		return data;
	}
	
	public void test(){
		//TODO 这是测试来的
		data.add(new Commodity(drawable.sc_dd, "tom", "sd", 1));
		data.add(new Commodity(drawable.sc_dd, "fuck", "xxx", 1));
		data.add(new Commodity(drawable.sc_more, "fuck", "we", 2));
		
	}

}
