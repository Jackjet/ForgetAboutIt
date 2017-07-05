package com.slb.group1.module.shopping.module.bean;

import java.util.List;

/**
 * date: 2017/6/29.
 * author: 王艺凯 (lenovo )
 * function:
 */

public class CarBean {
    /**
     * errCode : 0
     * errInfo : OK
     * pageEntity : [{"goods":[{"productID":"279457f3-4692-43bf-9676-fa9ab9155c38","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"魅族4 Pro"},{"productID":"95fbe11d-7303-4b9f-8ca4-537d06ce2f8a","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"魅蓝Note2"}],"merchantName":"魅族科技","merchantID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514"},{"goods":[{"productID":"8c6e52fb-d57c-45ee-8f05-50905138801b","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"红米Note2"},{"productID":"7d6e52fb-d57c-45ee-8f05-50905138801d","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"小米5"}],"merchantName":"小米科技","merchantID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514"},{"goods":[{"productID":"7d6e52fb-d57c-45ee-8f05-50905138801e","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"华为荣耀3C"},{"productID":"7d6e52fb-d57c-45ee-8f05-50905138801f","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"华为荣耀4X"}],"merchantName":"华为荣耀商城","merchantID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514"},{"goods":[{"productID":"7d6e52fb-d57c-45ee-8f05-50905138801g","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"iPhone 6s"},{"productID":"7d6e52fb-d57c-45ee-8f05-50905138801h","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"Macbook Pro"}],"merchantName":"美国苹果科技有限公司","merchantID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514"}]
     */
    private int errCode;
    private String errInfo;
    private List<PageEntityBean> pageEntity;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }

    public List<PageEntityBean> getPageEntity() {
        return pageEntity;
    }

    public void setPageEntity(List<PageEntityBean> pageEntity) {
        this.pageEntity = pageEntity;
    }

    public static class PageEntityBean {
        /**
         * goods : [{"productID":"279457f3-4692-43bf-9676-fa9ab9155c38","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"魅族4 Pro"},{"productID":"95fbe11d-7303-4b9f-8ca4-537d06ce2f8a","itemStat":"1","price":"11","pdtDesc":"1kg/袋","goodsLogo":"http://.../web_1427876141910914.jpg","mkPrice":"80","goodsID":"d10568c2-bb6a-4c6c-995b-477bb2fc0514","goodsName":"魅蓝Note2"}]
         * merchantName : 魅族科技
         * merchantID : d10568c2-bb6a-4c6c-995b-477bb2fc0514
         */

        private String merchantName;
        private String merchantID;
        private List<GoodsBean> goods;

        public String getMerchantName() {
            return merchantName;
        }

        public void setMerchantName(String merchantName) {
            this.merchantName = merchantName;
        }

        public String getMerchantID() {
            return merchantID;
        }

        public void setMerchantID(String merchantID) {
            this.merchantID = merchantID;
        }

        public List<GoodsBean> getGoods() {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods) {
            this.goods = goods;
        }

        public static class GoodsBean {
            /**
             * productID : 279457f3-4692-43bf-9676-fa9ab9155c38
             * itemStat : 1
             * price : 11
             * pdtDesc : 1kg/袋
             * goodsLogo : http://.../web_1427876141910914.jpg
             * mkPrice : 80
             * goodsID : d10568c2-bb6a-4c6c-995b-477bb2fc0514
             * goodsName : 魅族4 Pro
             */

            private String productID;
            private String itemStat;
            private String price;
            private String pdtDesc;
            private String goodsLogo;
            private String mkPrice;
            private String goodsID;
            private String goodsName;

            public String getProductID() {
                return productID;
            }

            public void setProductID(String productID) {
                this.productID = productID;
            }

            public String getItemStat() {
                return itemStat;
            }

            public void setItemStat(String itemStat) {
                this.itemStat = itemStat;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getPdtDesc() {
                return pdtDesc;
            }

            public void setPdtDesc(String pdtDesc) {
                this.pdtDesc = pdtDesc;
            }

            public String getGoodsLogo() {
                return goodsLogo;
            }

            public void setGoodsLogo(String goodsLogo) {
                this.goodsLogo = goodsLogo;
            }

            public String getMkPrice() {
                return mkPrice;
            }

            public void setMkPrice(String mkPrice) {
                this.mkPrice = mkPrice;
            }

            public String getGoodsID() {
                return goodsID;
            }

            public void setGoodsID(String goodsID) {
                this.goodsID = goodsID;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }
        }
    }
}
