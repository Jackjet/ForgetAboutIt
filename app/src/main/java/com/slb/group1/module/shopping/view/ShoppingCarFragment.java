package com.slb.group1.module.shopping.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.slb.group1.R;
import com.slb.group1.module.base.BaseFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * date: 2017/6/28.
 * author: 王艺凯 (lenovo )
 * function:
 */

public class ShoppingCarFragment extends BaseFragment {
    @BindView(R.id.shopping_ExpandableListView)
    ExpandableListView mShoppingExpandableListView;
    @BindView(R.id.iv_xuan_shop_main)
    ImageView mIvXuanShopMain;
    @BindView(R.id.shop_zj)
    TextView mShopZj;
    @BindView(R.id.shop_qxuan_price)
    TextView mShopQxuanPrice;
    @BindView(R.id.shop_qxuan_relativelayout)
    RelativeLayout mShopQxuanRelativelayout;
    @BindView(R.id.shoucang)
    Button mShoucang;
    @BindView(R.id.del)
    Button mDel;
    @BindView(R.id.shop_shoucangordelete)
    RelativeLayout mShopShoucangordelete;
    Unbinder unbinder;

    @Override
    protected int attachLayoutRes() {
        return R.layout.shopping_main_fragment;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.shopping_ExpandableListView, R.id.iv_xuan_shop_main, R.id.shop_zj, R.id.shop_qxuan_price, R.id.shop_qxuan_relativelayout, R.id.shoucang, R.id.del, R.id.shop_shoucangordelete})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.shopping_ExpandableListView:
                break;
            case R.id.iv_xuan_shop_main:
                break;
            case R.id.shop_zj:
                break;
            case R.id.shop_qxuan_price:
                break;
            case R.id.shop_qxuan_relativelayout:
                break;
            case R.id.shoucang:
                break;
            case R.id.del:
                break;
            case R.id.shop_shoucangordelete:
                break;
        }
    }
}
