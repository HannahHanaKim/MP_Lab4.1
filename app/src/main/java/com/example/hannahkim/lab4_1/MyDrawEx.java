package com.example.hannahkim.lab4_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MyDrawEx extends View {

    Path path = new Path();
    Paint paint = new Paint();

    public MyDrawEx(Context c) {
        super(c);
    }
    public MyDrawEx(Context c, AttributeSet a) {
        super(c, a);
    }

    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_DOWN)
            path.moveTo(event.getX(), event.getY());

        if(event.getAction() == MotionEvent.ACTION_MOVE)
            path.lineTo(event.getX(), event.getY());

        if(event.getAction() == MotionEvent.ACTION_UP)
            ;

        invalidate();

        return true;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        paint.setStrokeWidth(15f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(Color.BLUE);

        canvas.drawPath(path, paint);
    }
}
