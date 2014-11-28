package com.squeezer.sdf.listviewsample;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<ListItemWrapper> mObjectsList = new ArrayList<ListItemWrapper>();
    LayoutInflater mInflater;

    public CustomAdapter(Context context, ArrayList<ListItemWrapper> itemsList) {

        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mObjectsList = itemsList;
    }

    @Override
    public int getCount() {

        return mObjectsList.size();
    }

    @Override
    public Object getItem(int position) {

        return mObjectsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ItemViewHolder itemViewHolder;

        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.list_item_layout, parent,
                    false);

            itemViewHolder = new ItemViewHolder();
            itemViewHolder.mItemLabel = (TextView) convertView
                    .findViewById(R.id.title);
            itemViewHolder.mItemInfo = (TextView) convertView
                    .findViewById(R.id.info);
            itemViewHolder.mItemIcon = (ImageView) convertView
                    .findViewById(R.id.image);
            convertView.setTag(itemViewHolder);
        } else {
            itemViewHolder = (ItemViewHolder) convertView.getTag();
        }

        itemViewHolder.mItemLabel
                .setText(mObjectsList.get(position).getTitle());
        itemViewHolder.mItemInfo.setText(mObjectsList.get(position).getInfo());
        itemViewHolder.mItemIcon.setImageResource(mObjectsList.get(position)
                .getDrawableResId());

        return convertView;
    }

    private static class ItemViewHolder {

        TextView mItemLabel;
        TextView mItemInfo;
        ImageView mItemIcon;

    }

}
