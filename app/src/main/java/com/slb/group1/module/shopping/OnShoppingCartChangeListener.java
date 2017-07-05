package com.slb.group1.module.shopping;

public interface OnShoppingCartChangeListener {
    void onDataChange(String selectCount, String selectMoney);
    void onSelectItem(boolean isSelectedAll); 
}
