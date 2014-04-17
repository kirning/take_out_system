package com.kirno.take_out_system.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.dto.CardData;
import com.kirno.take_out_system.entity.MyCard;

/**
 * 主界面
 * @author qq303_000
 *
 */
public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
		 * 数据
		 */
		private List<Map<String,Object>> listItems;
		private CardData cardData;



		public PlaceholderFragment() {
			cardData = CardData.getInstance();
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			RelativeLayout rootView = (RelativeLayout)inflater.inflate(R.layout.fragment_main, container,
					false);
			ListView lin = (ListView)rootView.findViewById(R.id.cards);
			listItems = new ArrayList<>();

			MyCard simp = new MyCard(
					getActivity(), 
					listItems, 
					R.layout.card, 
					new String[]{"img","title","level","price"}, 
					new int[]{R.id.img,R.id.txtTitle,R.id.star,R.id.text});
			
			lin.setAdapter(simp);
			//点击事件
			lin.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					System.out.println("clicked le el e");			
				}
			});
			
			
			
			return rootView;
		}

	}


}
