package com.example.oo910;

import android.content.Context;
import android.util.*;
import android.graphics.*;
import android.view.SurfaceView;


public class NewSurfaceView extends SurfaceView {
    public NewSurfaceView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5.0f);
        canvas.drawRect(200, 200, 100, 100, paint);
        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.alert);
        canvas.drawBitmap(image, 150, 500, null);
        Log.i("NewSurfaceView.onDraw", "Who's that?!");
    }
}
