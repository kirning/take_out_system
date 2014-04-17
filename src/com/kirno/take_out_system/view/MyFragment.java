package com.kirno.take_out_system.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.kirno.take_out_system.R;

public class MyFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		RelativeLayout rootView = (RelativeLayout) inflater.inflate(
				R.layout.fragment_main, container, false);

		ListView list = (ListView) rootView.findViewById(R.id.my_list);
		String[] data = new String[] { "ȫ������", "������Ϣ", "��ϵ����", "�汾��Ϣ", "������" };
		ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
				R.id.my_list, data);
		list.setAdapter(adapter);
		return rootView;
	}

}
