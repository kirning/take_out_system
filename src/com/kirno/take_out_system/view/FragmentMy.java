package com.kirno.take_out_system.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kirno.take_out_system.R;

/**
 * ÎÒµÄÃæ°å
 * 
 * @author qq303_000
 * 
 */
public class FragmentMy extends Fragment {
	public FragmentMy() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater
				.inflate(R.layout.fragment_my, container, false);

		return rootView;
	}

}
