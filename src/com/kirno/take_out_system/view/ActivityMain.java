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
 * 主界面
 * 
 * @author qq303_000
 * 
 */
public class ActivityMain extends Activity {
	/**
	 * 主页按钮
	 */
	private ImageButton mBtnHome;
	/**
	 * 购物车
	 */
	private ImageButton mBtnShoppringCar;
	/**
	 * 我的按钮
	 */
	private ImageButton mBtnMy;
	/**
	 * 搜索按钮
	 */
	private ImageButton mBtnSreach;
	/**
	 * 更多按钮
	 */
	private ImageButton mBtnMore;
	/**
	 * 按钮控制对象
	 */
	private CtrlButton mCtrlButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 设置主布局文件
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

		// 添加按钮事件
		buttonEvent();

	}

	/**
	 * 为按钮添加事件的方法
	 */
	private void buttonEvent() {
		// 主页
		mBtnHome.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentHome)) {
					// 替换fragment
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentHome());
				}
			}
		});
		// 购物车
		mBtnShoppringCar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentShoppingCar)) {
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentShoppingCar());
				}
				
			}
		});
		// 我的
		mBtnMy.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentMy)) {
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentMy());
				}

			}
		});
		// 搜索
		mBtnSreach.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!(getFragmentManager().findFragmentById(R.id.main_container) instanceof FragmentSreach)) {
					mCtrlButton.changeFragment(getFragmentManager(),
							R.id.main_container, new FragmentSreach());
				}
			}

		});
		// // 更多
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
		// 创建设置菜单
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// 这个是设置菜单被点到后的事件
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
