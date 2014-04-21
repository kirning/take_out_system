package com.kirno.take_out_system.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.dto.DataOrder;

/**
 * 订单列表适配器
 * 
 * @author qq303_000
 * 
 */
public class AdapterOrder extends AdapterMy {

	public AdapterOrder(Context context, int resource) {
		super(context, resource, 
				new String[] { "img", 				"name", 			"price", 			"num", 				"sum" }, 
				new int[] 	 { R.id.list_car_img, 	R.id.list_car_name,	R.id.list_car_price, R.id.list_car_num, R.id.list_car_sum });
	}

	@Override
	public List<Map<String, Object>> jointData() {
		List<Map<String, Object>> lists = new ArrayList<>();
		// 获取数据
		List<Order> orders = DataOrder.getInstance().getData();
		for (Order order : orders) {
			Map<String, Object> temp = new HashMap<>();
			temp.put("img", order.getImageID());
			temp.put("name", order.getName());
			temp.put("price", order.getPrice());
			temp.put("num", order.getNum());
			temp.put("sum", order.getSum());
			lists.add(temp);
		}

		return lists;
	}

	@Override
	public void binderData(View view, Object data) {
		switch (view.getId()) {
		case R.id.list_car_img:
			((ImageView) view).setImageResource((int) data);
			break;
		case R.id.list_car_name:
			((TextView) view).setText((String) data);
			break;
		case R.id.list_car_price:
			((TextView) view).setText(String.valueOf(data));
			break;
		case R.id.list_car_num:
			((TextView) view).setText(String.valueOf(data));
			break;
		case R.id.list_car_sum:
			((TextView) view).setText(String.valueOf(data));
			break;
		}

	}

}
