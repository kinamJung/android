package com.hanains.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by bit-user on 2016-01-25.
 */
public class ImageAdapter extends BaseAdapter {

    int mGalleryItemBackground;
    private Context mContext;

    private Integer[] mImageIds = {
            R.drawable.background,  R.drawable.background2,
            R.drawable.background3, R.drawable.background4,
            R.drawable.background5, R.drawable.background6
    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setLayoutParams(new Gallery.LayoutParams(150,100));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        i.setBackgroundResource(mGalleryItemBackground);

        return i;
    }
}
