package com.lephiha.moneymanager.listeners;

import com.lephiha.moneymanager.room.entities.Category;

public interface OnItemCategoryListener {

    void onCategoryClick(Category category, int position);

    void onCategoryLongClick(Category category, int position);

    void onCategoryAdd();
}
