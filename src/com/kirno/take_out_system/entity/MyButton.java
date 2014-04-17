package com.kirno.take_out_system.entity;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.Button;

public class MyButton extends Button{
	Paint mP = new Paint();
	public MyButton(Context context) {
		super(context);
		setBackgroundColor(color.white);
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub

		mP.setColor(Color.BLUE);
		canvas.drawLine(0, 0, 10, 10, mP);
		super.draw(canvas);
	}
	
	

}
