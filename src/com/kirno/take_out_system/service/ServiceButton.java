package com.kirno.take_out_system.service;

import android.app.Fragment;
import android.app.FragmentManager;

public class ServiceButton {

	public ServiceButton() {
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
	public void changeFragment(FragmentManager fm, int fragmentRecours, Fragment fragment) {
		
			fm.beginTransaction()
				//设置替换的Fragment
				.replace(fragmentRecours, fragment)
				//放入后退栈
				.addToBackStack(null)
				//提交
				.commit();
		
	}

}
