package com.lephiha.moneymanager.listeners;

import com.lephiha.moneymanager.room.entities.Category;
import com.lephiha.moneymanager.room.entities.Finance;
import com.lephiha.moneymanager.room.entities.Transfer;

public interface OnItemSearchListener {

    void onFinanceClick(Finance finance, Category category);

    void onTransferClick(Transfer transfer);
}
