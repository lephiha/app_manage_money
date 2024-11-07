package com.lephiha.moneymanager.room.daos;

import androidx.room.Dao;
import androidx.room.Insert;

import com.lephiha.moneymanager.room.entities.Type;

@Dao
public interface TypeDao {
    @Insert
    void insert(Type type);
}
