package com.kirno.take_out_system.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.entity.AdapterCommodity;

/**
 * 主面板
 * 
 * @author qq303_000
 * 
 */
public class FragmentHome extends Fragment {

	private ListView lin;

	public FragmentHome() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		lin = (ListView) rootView.findViewById(R.id.cards);

		AdapterCommodity simp = new AdapterCommodity(getActivity(),
				R.layout.list_card);

		lin.setAdapter(simp.getAdapter());
		// 点击事件
		event();

		return rootView;
	}

	private void event() {
		lin.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				System.out.println("clicked le el e");
			}
		});
	}

}
