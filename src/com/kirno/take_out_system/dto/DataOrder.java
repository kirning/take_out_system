package com.kirno.take_out_system.dto;

import java.util.ArrayList;
import java.util.List;

import com.kirno.take_out_system.R.drawable;
import com.kirno.take_out_system.entity.Order;

public class DataOrder {

	private static DataOrder instance;
	private List<Order> data;

	private DataOrder() {
		data = new ArrayList<>();
		//TODO ������
		test();
	}

	public static DataOrder getInstance() {
		if (instance == null) {
			instance = new DataOrder();
		}
		return instance;
	}

	/**
	 * ��ȡ����Դ
	 * @return
	 */
	public List<Order> getData() {
		return data;
	}

	public void test() {
		// TODO ���ǲ�������
		data.add(new Order(drawable.sc_home, "fuck", 12, 1));
		data.add(new Order(drawable.sc_home, "tom", 10, 2));
		data.add(new Order(drawable.sc_home, "fuck", 12, 1));

	}

}
