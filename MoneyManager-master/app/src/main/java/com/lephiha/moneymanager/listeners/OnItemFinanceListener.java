package com.lephiha.moneymanager.listeners;

import com.lephiha.moneymanager.room.entities.Category;
import com.lephiha.moneymanager.room.entities.Finance;

public interface OnItemFinanceListener {
    void onFinanceClick(Finance finance, Category category);
}
