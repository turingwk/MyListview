package com.wk.mylistview;

import android.widget.TextView;

import java.util.List;

/**
 * Created by apple on 2017/11/3.
 */

public class SimpleBaseAdapter extends BaseAppAdapter<String> {

    public SimpleBaseAdapter(List<String> datas) {
        super(datas);
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_listview_sample;
    }

    @Override
    protected void bindData(BaseViewHolder vHolder, String data) {

        ((TextView) vHolder.getView(R.id.listview_sample_tv)).setText(data);

    }


}
