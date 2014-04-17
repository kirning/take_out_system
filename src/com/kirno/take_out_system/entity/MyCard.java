package com.kirno.take_out_system.entity;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SimpleAdapter;

public class MyCard extends SimpleAdapter {

	private ViewBinder bin = new ViewBinder() {

		@Override
		public boolean setViewValue(View view, Object data,
				String textRepresentation) {
			if (view instanceof RatingBar) {
				RatingBar star = (RatingBar) view;
				star.setActivated(false);
				star.setRating((int) data);
			}

			return true;
		}
	};


	public MyCard(Context context, List<? extends Map<String, ?>> data,
			int resource, String[] from, int[] to) {
		super(context, data, resource, from, to);
		setViewBinder(bin);
		

	}

}
