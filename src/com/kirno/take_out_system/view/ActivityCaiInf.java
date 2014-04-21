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
 * ��ʽ��ϸ����
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
		 * ��ȡͼƬ�ؼ�
		 */
		private ImageView imgView;
		/**
		 * ��ȡ���ܿؼ�
		 */
		private TextView txtIntroduce;
		/**
		 * ��ȡ�̵�ؼ�
		 */
		private TextView txtShop;
		/**
		 * ��ȡ���ۿؼ�
		 */
		private ListView listView;
		/**
		 * ��ϸ������ʾ������
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
			//��ȡ�ؼ�
			imgView = (ImageView) rootView.findViewById(R.id.img);
			txtIntroduce = (TextView) rootView.findViewById(R.id.inf_introduce);
			txtShop = (TextView) rootView.findViewById(R.id.inf_infShop);
			listView = (ListView) rootView.findViewById(R.id.inf_talk);
			
			init();
			return rootView;
		}

		/**
		 * ��ȡֵ
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
