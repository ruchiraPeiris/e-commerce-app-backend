package com.imperia.ecommerce.common;

/**
 * All the webserivce paths
 * Created by Kithmal on 12/29/17.
 */
public interface WSPath {

    // Category Management
    String CATEGORY = "/category-mgt";

    // Save Category
    String CATEGORY_SAVE = "/save";

    //Get all categories
    String CATEGORY_GET_ALL = "/get-all";

    //Get by Category ID
    String CATEGORY_GET_BY_ID = "/category-id/get";

    //Item Management
    String ITEM = "/item-mgt";

    // Save Item
    String ITEM_SAVE = "/save";

    //Get all items
    String ITEM_GET_ALL = "/get-all";

    //Get by Item ID
    String ITEM_GET_BY_ID = "/item-id/get";

    //GET Items by Category
    String ITEM_BY_CATEGORY = "/by-category/get";


}
