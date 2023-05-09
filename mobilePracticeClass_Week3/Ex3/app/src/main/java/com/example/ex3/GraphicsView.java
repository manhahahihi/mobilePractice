package com.example.ex3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Canvas;



public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[15];

    int i = 0;
    long last_tick=0;
    long period=200;
    Context ctext;
    MediaPlayer mPlayer;
    public GraphicsView(Context context) {
        super(context);

        ctext = context;
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh0);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh1);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh2);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh3);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh4);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh5);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh6);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh7);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh8);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh9);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh10);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh11);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh12);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh13);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh14);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 16){
            canvas.scale(0.75f, 0.8f);
            canvas.drawBitmap(frames[i],40,40, new Paint());
        }
        else {
            i = 0;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}

