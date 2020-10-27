package com.example.helloworld.gridview;

import android.content.Context;
import android.view.HapticFeedbackConstants;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;


public class MyGridViewAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater mLayoutInflater;
    public MyGridViewAdapter(Context context){
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHoider{
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoider holder = null;
        if(convertView == null)
        {
            convertView = mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHoider();
            convertView.setTag(holder);
            holder.imageView = convertView.findViewById(R.id.iv_grid);
            holder.textView =  convertView.findViewById(R.id.tv_title);
        }else{
            holder = (ViewHoider) convertView.getTag();
        }
            holder.textView.setText("花");
        Glide.with(context).load("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2697878743,2046462095&fm=26&gp=0.jpg").into(holder.imageView);
        return convertView;
    }
}
