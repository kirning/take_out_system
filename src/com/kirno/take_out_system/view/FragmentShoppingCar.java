package com.kirno.take_out_system.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.entity.AdapterOrder;

public class FragmentShoppingCar extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_shopping_car,
				container, false);

		ListView lin = (ListView) rootView.findViewById(R.id.list_car);
		AdapterOrder order = new AdapterOrder(getActivity(), R.layout.list_car);
		lin.setAdapter(order.getAdapter());

		return rootView;
	}

}
