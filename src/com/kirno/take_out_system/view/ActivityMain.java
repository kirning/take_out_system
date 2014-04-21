package com.kirno.take_out_system.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.ctrl.CtrlButton;

/**
 * ������
 * 
 * @author qq303_000
 * 
 */
public class ActivityMain extends Activity {
	/**
	 * ��ҳ��ť
	 */
	private ImageButton mBtnHome;
	/**
	 * ���ﳵ
	 */
	private ImageButton mBtnShoppringCar;
	/**
	 * �ҵİ�ť
	 */
	private ImageButton mBtnMy;
	/**
	 * ������ť
	 */
	private ImageButton mBtnSreach;
	/**
	 * ���ఴť
	 */
	private ImageButton mBtnMore;
	/**
	 * ��ť���ƶ���
	 */
	private CtrlButton mCtrlButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// �����������ļ�
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.main_container, new FragmentHome()).commit();
		}

		mBtnHome = (ImageButton) findViewById(R.id.btnHome);
		mBtnShoppringCar = (ImageButton) findViewById(R.id.btnMarket);
		mBtnMy = (ImageButton) findViewById(R.id.btnMy);
		mBtnSreach = (ImageButton) findViewById(R.id.btnSs);
		mBtnMore = (ImageButton) findViewById(R.id.btnMore);

		mCtrlButton = new CtrlButton();

		// ��Ӱ�ť�¼�
		buttonEvent();

	}

	/**
	 * Ϊ��ť����¼��ķ���
	 */
	private void buttonEvent() {
		// ��ҳ
		mBtnHome.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentHome)) {
					// �滻fragment
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentHome());
				}
			}
		});
		// ���ﳵ
		mBtnShoppringCar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentShoppingCar)) {
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentShoppingCar());
				}
				
			}
		});
		// �ҵ�
		mBtnMy.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentMy)) {
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentMy());
				}

			}
		});
		// ����
		mBtnSreach.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentSreach)) {
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentSreach());
				}
			}

		});
		// // ����
		mBtnMore.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentMore)) {
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentMore());
				}
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// �������ò˵�
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// ��������ò˵����㵽����¼�
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
