package com.kirno.take_out_system.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.dto.DataCommodity;

/**
 * 菜式列表适配器类
 * 
 * @author qq303_000
 * 
 */
public class AdapterCommodity extends AdapterMy {

	public AdapterCommodity(Context context, int resource) {
		super(context, resource, new String[] { "img", "title", "level",
				"price" }, new int[] { R.id.img, R.id.txtTitle, R.id.star,
				R.id.text });
	}

	@Override
	public List<Map<String, Object>> jointData() {
		List<Map<String, Object>> list = new ArrayList<>();
		List<Commodity> commoditys = DataCommodity.getInstance().getData();
		for (Commodity commodity : commoditys) {
			Map<String, Object> listItem = new HashMap<>();
			listItem.put("img", commodity.getImageId());
			listItem.put("title", commodity.getName());
			listItem.put("level", commodity.getLevel());
			listItem.put("price", commodity.getPrice());
			list.add(listItem);
		}
		return list;
	}

	@Override
	public void binderData(View view, Object data) {
		if (view instanceof RatingBar) {
			RatingBar star = (RatingBar) view;
			star.setActivated(false);
			star.setRating((int) data);

		} else if (view.getId() == R.id.txtTitle) {
			((TextView) view).setText((String) data);
		} else if (view.getId() == R.id.text) {
			((TextView) view).setText((String) data);
		} else if (view.getId() == R.id.img) {
			((ImageView) view).setImageResource((int) data);
			;
		}
	}
}
