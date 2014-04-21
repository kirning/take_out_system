package com.kirno.take_out_system.view;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.dto.DataInf;

/**
 * 菜式详细界面
 * @author qq303_000
 *
 */
public class ActivityCaiInf extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caiinf);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.caiinf, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * 获取图片控件
		 */
		private ImageView imgView;
		/**
		 * 获取介绍控件
		 */
		private TextView txtIntroduce;
		/**
		 * 获取商店控件
		 */
		private TextView txtShop;
		/**
		 * 获取评论控件
		 */
		private ListView listView;
		/**
		 * 详细界面显示的数据
		 */
		private DataInf infData;

		public PlaceholderFragment() {
			infData = DataInf.getInstance();
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_caiinf,
					container, false);
			//获取控件
			imgView = (ImageView) rootView.findViewById(R.id.img);
			txtIntroduce = (TextView) rootView.findViewById(R.id.inf_introduce);
			txtShop = (TextView) rootView.findViewById(R.id.inf_infShop);
			listView = (ListView) rootView.findViewById(R.id.inf_talk);
			
			init();
			return rootView;
		}

		/**
		 * 获取值
		 */
		private void init() {
			imgView.setImageBitmap(infData.getImg());
			txtIntroduce.setText(infData.getInfCai());
			txtShop.setText(infData.getInfShop());
			ArrayAdapter<String> listAdapter = new ArrayAdapter<>(getActivity(), R.id.inf_talk,infData.getTalk());
			listView.setAdapter(listAdapter);
		}
	}

}
