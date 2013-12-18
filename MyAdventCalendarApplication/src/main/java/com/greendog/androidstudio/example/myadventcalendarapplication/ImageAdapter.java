package com.greendog.androidstudio.example.myadventcalendarapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	
	// Images Array for GridView
	public Integer[] mThumbIds = {
			R.drawable.p1, R.drawable.p2,
			R.drawable.p3, R.drawable.p4,
			R.drawable.p5, R.drawable.p6,
			R.drawable.p7, R.drawable.p8,
			R.drawable.p9, R.drawable.p10,
            R.drawable.p11, R.drawable.p12,
            R.drawable.p13, R.drawable.p14,
            R.drawable.p15, R.drawable.p16,
            R.drawable.p17, R.drawable.p18,
            R.drawable.p19, R.drawable.p20,
            R.drawable.p21, R.drawable.p22,
            R.drawable.p23, R.drawable.p24

	};

    // Images Array for FullImageActivity
    public Integer[] mFullImageIds = {
            R.drawable.door_1, R.drawable.door_2,
            R.drawable.door_3, R.drawable.door_4,
            R.drawable.door_5, R.drawable.door_6,
            R.drawable.door_7, R.drawable.door_8,
            R.drawable.door_9, R.drawable.door_10,
            R.drawable.door_11, R.drawable.door_12,
            R.drawable.door_13, R.drawable.door_14,
            R.drawable.door_15, R.drawable.door_16,
            R.drawable.door_17, R.drawable.door_18,
            R.drawable.door_19, R.drawable.door_20,
            R.drawable.door_21, R.drawable.door_22,
            R.drawable.door_23, R.drawable.door_24,

    };


    // Constructor
	public ImageAdapter(Context c){
		mContext = c;
	}

	@Override
	public int getCount() {
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		return mThumbIds[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {			
		ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
        return imageView;
	}

}
