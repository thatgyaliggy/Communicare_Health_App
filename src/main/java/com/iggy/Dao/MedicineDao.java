package com.iggy.Dao;

import com.iggy.entity.Medicine;

public interface MedicineDao {

    public String mAdd(Medicine medi);

    public String mDelete(int mid);

    public Medicine mSearch(int mid);

}
