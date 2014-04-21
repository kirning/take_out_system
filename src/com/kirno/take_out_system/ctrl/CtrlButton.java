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
	 * 更换Fragment
	 * 
	 * @param tran
	 *            需要更换Fragment的Activity中获取的FragmentTransaction对象
	 * @param fragmentRecours
	 *            需要跟换掉的Fragment的ID
	 * @param fragment
	 *            新Fragment对象
	 */
	public void changeFragment(FragmentManager fm, int fragmentRecours,
			Fragment fragment) {
		mServiceButton.changeFragment(fm, fragmentRecours, fragment);
	}

}
