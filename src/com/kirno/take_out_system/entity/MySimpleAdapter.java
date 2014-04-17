package com.kirno.take_out_system.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SimpleAdapter;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.dto.CardData;

/**
 * 列表适配器类
 * 
 * @author qq303_000
 * 
 */
public class MySimpleAdapter extends SimpleAdapter {

	private static List<Map<String, Object>> list = new ArrayList<>();
	private CardData mCardData;

	// 自定义数据绑定
	public MySimpleAdapter(Context context,	List<? extends Map<String, ?>> data, int resource, CardData cardData) {
		
		super(context, 
				list,
				resource, 
				new String[] { "img", "title", "level", "price" }, 
				new int[] { R.id.img, R.id.txtTitle, R.id.star,	R.id.text });
		this.mCardData = cardData;
		init();

		setViewBinder(new ViewBinder() {

			@Override
			public boolean setViewValue(View view, Object data,
					String textRepresentation) {
				// 给RatingBar星星评分组件赋值
				if (view instanceof RatingBar) {
					RatingBar star = (RatingBar) view;
					star.setActivated(false);
					star.setRating((int) data);
				}

				return true;
			}
		});

	}

	/**
	 * 组装ListView的数据
	 */
	private void init() {
		for (int i = 0; i < mCardData.getNames().length; i++) {
			Map<String, Object> listItem = new HashMap<>();
			listItem.put("img", mCardData.getImageIds()[i]);
			listItem.put("title", mCardData.getNames()[i]);
			listItem.put("level", mCardData.getLevel()[i]);
			listItem.put("price", mCardData.getPrice()[i]);
			list.add(listItem);
		}
	}
}
