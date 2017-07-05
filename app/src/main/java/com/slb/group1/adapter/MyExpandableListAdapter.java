package com.slb.group1.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.slb.group1.R;
import com.slb.group1.module.shopping.OnShoppingCartChangeListener;
import com.slb.group1.module.shopping.ShoppingCartBiz;
import com.slb.group1.module.shopping.UIAlertView;
import com.slb.group1.module.shopping.module.bean.CarBean;
import com.slb.group1.module.shopping.module.bean.ShoppingCartBean;
import com.slb.group1.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * date: 2017/7/5.
 * author: 王艺凯 (lenovo )
 * function:
 */

public class MyExpandableListAdapter extends BaseExpandableListAdapter {
    private Context mContext;
    private List<ShoppingCartBean> mListGoods = new ArrayList<ShoppingCartBean>();
    private OnShoppingCartChangeListener mChangeListener;
    private boolean isSelectAll = false;

    public MyExpandableListAdapter(Context context) {
        mContext = context;
    }

    public void setList(List<ShoppingCartBean> mListGoods) {
        this.mListGoods = mListGoods;
        setSettleInfo();
    }

    public void setOnShoppingCartChangeListener(OnShoppingCartChangeListener changeListener) {
        this.mChangeListener = changeListener;
    }

    //            监听
    public View.OnClickListener getAdapterListener() {
        return listener;
    }

    //获取条目数
    public int getGroupCount() {
        return mListGoods.size();
    }

    //        获取子条目数
    public int getChildrenCount(int groupPosition) {
        return mListGoods.get(groupPosition).getGoods().size();
    }

    //        获取组数
    public Object getGroup(int groupPosition) {
        return mListGoods.get(groupPosition);
    }


    public Object getChild(int groupPosition, int childPosition) {
        return mListGoods.get(groupPosition).getGoods().get(childPosition);
    }


    public long getGroupId(int groupPosition) {
        return groupPosition;
    }


    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    public boolean hasStableIds() {
        return false;
    }


    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        GroupViewHolder holder = null;
        if (convertView == null) {
            holder = new GroupViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.shopping_main_item1, parent, false);
            holder.shopTitle = (TextView) convertView.findViewById(R.id.tv_shopping_shop);
            holder.shopBianJi = (TextView) convertView.findViewById(R.id.tv_bianji);
            holder.shopXuan = (ImageView) convertView.findViewById(R.id.iv_shopping_item1_xuan);
            convertView.setTag(holder);
        } else {
            holder = (GroupViewHolder) convertView.getTag();
        }
        holder.shopTitle.setText(mListGoods.get(groupPosition).getMerchantName());
        ShoppingCartBiz.checkItem(mListGoods.get(groupPosition).isGroupSelected(), holder.shopXuan);
        boolean isEditing = mListGoods.get(groupPosition).isEditing();
        if (isEditing) {
            holder.shopBianJi.setText("完成");
        } else {
            holder.shopBianJi.setText("编辑");
        }
        holder.shopXuan.setTag(groupPosition);
        holder.shopXuan.setOnClickListener(listener);
        holder.shopBianJi.setTag(groupPosition);
        holder.shopBianJi.setOnClickListener(listener);
        holder.shopTitle.setOnClickListener(listener);
        return convertView;
    }

    /**
     * child view
     */

    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ChildViewHolder holder = null;
        if (convertView == null) {
            holder = new ChildViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item2, parent, false);
            holder.shopChildTitle = (TextView) convertView.findViewById(R.id.tv_item2_title);
            holder.shopChildTitle = (TextView) convertView.findViewById(R.id.tv_item2_title);
            holder.shopChildXuan = (ImageView) convertView.findViewById(R.id.iv_shopping_item2_xuan);
            holder.shopRl1 = (RelativeLayout) convertView.findViewById(R.id.item2_rl);
            holder.shopRl2 = (RelativeLayout) convertView.findViewById(R.id.shop_rl_bianji);
            holder.shopJia = (ImageView) convertView.findViewById(R.id.shop_jia);
            holder.shopJian = (ImageView) convertView.findViewById(R.id.shop_jian);
            holder.shopChildJHL = (TextView) convertView.findViewById(R.id.tv_item2_jhl);
            holder.shopPrice = (TextView) convertView.findViewById(R.id.shop_child_price);
            holder.shopCount = (TextView) convertView.findViewById(R.id.tv_item2_count);
            holder.shopNum = (TextView) convertView.findViewById(R.id.shop_num);
            convertView.setTag(holder);
        } else {
            holder = (ChildViewHolder) convertView.getTag();
        }
        ShoppingCartBean.Goods goods = mListGoods.get(groupPosition).getGoods().get(childPosition);
        boolean isChildSelected = mListGoods.get(groupPosition).getGoods().get(childPosition).isChildSelected();
        boolean isEditing = goods.isEditing();
        String priceNew = "¥" + goods.getPrice();
        String num = goods.getNumber();
        String pdtDesc = goods.getPdtDesc();
        String goodName = mListGoods.get(groupPosition).getGoods().get(childPosition).getGoodsName();

        holder.shopChildXuan.setTag(groupPosition + "," + childPosition);
        holder.shopChildTitle.setText(goodName);
        holder.shopPrice.setText(priceNew);
        holder.shopCount.setText("X " + num);
        holder.shopNum.setText(num);
        holder.shopChildJHL.setText(pdtDesc);

        holder.shopJia.setTag(goods);
        holder.shopJian.setTag(goods);
        ShoppingCartBiz.checkItem(isChildSelected, holder.shopChildXuan);
        if (isEditing) {
            holder.shopRl1.setVisibility(View.GONE);
            holder.shopRl2.setVisibility(View.VISIBLE);
        } else {
            holder.shopRl1.setVisibility(View.VISIBLE);
            holder.shopRl2.setVisibility(View.GONE);
        }

        holder.shopChildXuan.setOnClickListener(listener);
        holder.shopJia.setOnClickListener(listener);
        holder.shopJian.setOnClickListener(listener);
        holder.shopRl2.setOnClickListener(listener);
        return convertView;
    }


    public boolean isChildSelectable(int i, int i1) {
        return false;
    }

    View.OnClickListener listener = new View.OnClickListener() {

        public void onClick(View v) {
            switch (v.getId()) {
                //main
                case R.id.iv_xuan_shop_main:
                    isSelectAll = ShoppingCartBiz.selectAll(mListGoods, isSelectAll, (ImageView) v);
                    setSettleInfo();
                    notifyDataSetChanged();
                    break;
                case R.id.shop_jsuan:
                    if (ShoppingCartBiz.hasSelectedGoods(mListGoods)) {
                        ToastUtils.showToast("结算跳转");
                    } else {
                        ToastUtils.showToast("亲，先选择商品！");
                    }
                    //group
                    break;
                case R.id.tv_bianji://切换界面，属于特殊处理，假如没打算切换界面，则不需要这块代码
                    int groupPosition2 = Integer.parseInt(String.valueOf(v.getTag()));
                    boolean isEditing = !(mListGoods.get(groupPosition2).isEditing());
                    mListGoods.get(groupPosition2).setIsEditing(isEditing);
                    for (int i = 0; i < mListGoods.get(groupPosition2).getGoods().size(); i++) {
                        mListGoods.get(groupPosition2).getGoods().get(i).setIsEditing(isEditing);
                    }
                    notifyDataSetChanged();
                    break;
                case R.id.iv_shopping_item1_xuan:
                    int groupPosition3 = Integer.parseInt(String.valueOf(v.getTag()));
                    isSelectAll = ShoppingCartBiz.selectGroup(mListGoods, groupPosition3);
                    selectAll();
                    setSettleInfo();
                    notifyDataSetChanged();
                    break;
                //child
                case R.id.iv_shopping_item2_xuan:
                    String tag = String.valueOf(v.getTag());
                    if (tag.contains(",")) {
                        String s[] = tag.split(",");
                        int groupPosition = Integer.parseInt(s[0]);
                        int childPosition = Integer.parseInt(s[1]);
                        isSelectAll = ShoppingCartBiz.selectOne(mListGoods, groupPosition, childPosition);
                        selectAll();
                        setSettleInfo();
                        notifyDataSetChanged();
                    }
                    break;

                case R.id.shop_jia:
                    ShoppingCartBiz.addOrReduceGoodsNum(true, (ShoppingCartBean.Goods) v.getTag(), ((TextView) (((View) (v.getParent())).findViewById(R.id.shop_num))));
                    setSettleInfo();
                    break;
                case R.id.shop_jian:
                    ShoppingCartBiz.addOrReduceGoodsNum(false, (ShoppingCartBean.Goods) v.getTag(), ((TextView) (((View) (v.getParent())).findViewById(R.id.shop_num))));
                    setSettleInfo();
                    break;
                case R.id.item2_rl:
                    ToastUtils.showToast("商品详情，暂未实现");
                    break;
                case R.id.tv_shopping_shop:
                    ToastUtils.showToast("商铺详情，暂未实现");
                    break;
            }
        }
    };

    private void selectAll() {
        if (mChangeListener != null) {
            mChangeListener.onSelectItem(isSelectAll);
        }
    }

    private void setSettleInfo() {
        String[] infos = ShoppingCartBiz.getShoppingCount(mListGoods);
        //删除或者选择商品之后，需要通知结算按钮，更新自己的数据；
        if (mChangeListener != null && infos != null) {
            mChangeListener.onDataChange(infos[0], infos[1]);
        }
    }

    private void showDelDialog(final int groupPosition, final int childPosition) {
        final UIAlertView delDialog = new UIAlertView(mContext, "温馨提示", "确认删除该商品吗?",
                "取消", "确定");
        delDialog.show();

        delDialog.setClicklistener(new UIAlertView.ClickListenerInterface() {


                                       public void doLeft() {
                                           delDialog.dismiss();
                                       }


                                       public void doRight() {
                                           String productID = mListGoods.get(groupPosition).getGoods().get(childPosition).getProductID();
                                           ShoppingCartBiz.delGood(productID);
                                           delGoods(groupPosition, childPosition);
                                           setSettleInfo();
                                           notifyDataSetChanged();
                                           delDialog.dismiss();
                                       }
                                   }
        );
    }

    private void delGoods(int groupPosition, int childPosition) {
        mListGoods.get(groupPosition).getGoods().remove(childPosition);
        if (mListGoods.get(groupPosition).getGoods().size() == 0) {
            mListGoods.remove(groupPosition);
        }
        notifyDataSetChanged();
    }

    class GroupViewHolder {
        TextView shopTitle;
        TextView shopBianJi;
        ImageView shopXuan;
    }

    class ChildViewHolder {
        /**
         * 商品名称
         */
        TextView shopChildTitle;
        /**
         * 商品规格
         */
        TextView shopChildJHL;
        /**
         * 选中
         */
        ImageView shopChildXuan;
        /**
         * 非编辑状态
         */
        RelativeLayout shopRl1;
        /**
         * 编辑状态
         */
        RelativeLayout shopRl2;
        /**
         * +1
         */
        ImageView shopJia;
        /**
         * -1
         */
        ImageView shopJian;

        /**
         * 价格
         */
        TextView shopPrice;

        /**
         * 商品状态的数量
         */
        TextView shopCount;
        /**
         * 编辑状态的数量
         */
        TextView shopNum;
    }
}
