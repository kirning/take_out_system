package com.kirno.take_out_system.service;

import android.app.Fragment;
import android.app.FragmentManager;

public class ServiceButton {

	public ServiceButton() {
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
	public void changeFragment(FragmentManager fm, int fragmentRecours, Fragment fragment) {
		
			fm.beginTransaction()
				//�����滻��Fragment
				.replace(fragmentRecours, fragment)
				//�������ջ
				.addToBackStack(null)
				//�ύ
				.commit();
		
	}

}
