package com.kirno.take_out_system.ctrl;

import android.app.Fragment;
import android.app.FragmentManager;

import com.kirno.take_out_system.service.ServiceButton;

public class CtrlButton {

	private ServiceButton mServiceButton;

	public CtrlButton() {
		mServiceButton = new ServiceButton();
	}


	/**
	 * ����Fragment
	 * 
	 * @param tran
	 *            ��Ҫ����Fragment��Activity�л�ȡ��FragmentTransaction����
	 * @param fragmentRecours
	 *            ��Ҫ��������Fragment��ID
	 * @param fragment
	 *            ��Fragment����
	 */
	public void changeFragment(FragmentManager fm, int fragmentRecours,
			Fragment fragment) {
		mServiceButton.changeFragment(fm, fragmentRecours, fragment);
	}

}
