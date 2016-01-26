package com.hanains.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by bit-user on 2016-01-25.
 */
public class MyView extends View {

    Bitmap bitmap;

    public MyView(Context context) {
        super(context);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.background);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        canvas.drawBitmap(bitmap, 0, 0, paint);
        LightingColorFilter blurMaskFilter = new LightingColorFilter(0xff0080, 0xff0080 );
        paint.setColorFilter(blurMaskFilter);
        canvas.drawBitmap(bitmap, 0, 500, paint);
    }
}
