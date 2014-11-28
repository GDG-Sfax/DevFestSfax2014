package com.squeezer.sdf.listviewsample;

public class ListItemWrapper {

    private String mTitle;
    private String mInfo;
    private int mDrawableResId;

    public ListItemWrapper(String title, String info, int drawableResId) {
        mTitle = title;
        mInfo = info;
        mDrawableResId = drawableResId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getInfo() {
        return mInfo;
    }

    public void setInfo(String info) {
        this.mInfo = info;
    }

    public int getDrawableResId() {
        return mDrawableResId;
    }

    public void setDrawableResId(int mDrawableResId) {
        this.mDrawableResId = mDrawableResId;
    }

}
