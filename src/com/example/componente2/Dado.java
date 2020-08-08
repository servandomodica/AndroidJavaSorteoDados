package com.example.componente2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Dado extends View implements OnTouchListener {
	private int valor = 6;

	public Dado(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		setOnTouchListener(this);
	}


	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		int ancho = getWidth();
		int alto = getHeight();
		
		canvas.drawRGB(0, 0, 0);
		
		Paint pincel1 = new Paint();
		pincel1.setARGB(255, 255, 255, 0);
		
		if (valor == 1 || valor == 3 || valor == 5) {
			canvas.drawCircle(ancho * 0.5f, alto * 0.5f, 5, pincel1);
		}
		
		if (valor == 2 || valor == 3 || valor == 4 || valor == 5 || valor == 6) {
			canvas.drawCircle(ancho * 0.25f, alto * 0.25f, 5, pincel1);
			canvas.drawCircle(ancho * 0.75f, alto * 0.75f, 5, pincel1);
		}
		
		if (valor == 4 || valor == 5 || valor == 6) {
			canvas.drawCircle(ancho * 0.75f, alto * 0.25f, 5, pincel1);
			canvas.drawCircle(ancho * 0.25f, alto * 0.75f, 5, pincel1);
		}
		
		if (valor == 6) {
			canvas.drawCircle(ancho * 0.25f, alto * 0.50f, 5, pincel1);
			canvas.drawCircle(ancho * 0.75f, alto * 0.50f, 5, pincel1);
		}
	}

	
	public void tirar() {
		valor = 1 + (int) (Math.random() * 6);
		invalidate();
	}

	
	public int retornarValor() {
		return valor;
	}
	
	
	public boolean onTouch(View arg0, MotionEvent arg1) {
		tirar();
		
		return false;
	}

}
