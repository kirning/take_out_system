package com.kirno.take_out_system.entity;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.SimpleAdapter.ViewBinder;

public abstract class AdapterMy {

	private SimpleAdapter adapter;
	private ViewBinder binder;
	private Context mContext;
	private int mResource;
	private String[] mFrom;
	private int[] mTo;

	/**
	 * �Զ������ݰ�
	 * 
	 * @param context
	 * @param resource
	 *            ���󶨵������ListView
	 * @param cardData
	 *            ����
	 */
	public AdapterMy(Context context, int resource, String[] from, int[] to) {
		mContext = context;
		mResource = resource;
		mFrom = from;
		mTo = to;
		binder = new ViewBinder() {

			@Override
			public boolean setViewValue(View view, Object data,
					String textRepresentation) {
				binderData(view, data);
				return true;
			}

		};
	}

	public SimpleAdapter getAdapter() {

		adapter = new SimpleAdapter(mContext, jointData(), mResource, mFrom, mTo);
		// �������ݰ���ʽ
		adapter.setViewBinder(binder);
		return adapter;
	}

	/**
	 * ��װ����
	 */
	abstract public List<Map<String, Object>> jointData();

	/**
	 * �Զ������ݰ�
	 * 
	 * @param view
	 * @param data
	 */
	abstract public void binderData(View view, Object data);

}
