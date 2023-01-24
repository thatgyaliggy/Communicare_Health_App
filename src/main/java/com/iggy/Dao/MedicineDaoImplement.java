package com.iggy.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.iggy.entity.Medicine;

@Repository
public class MedicineDaoImplement implements MedicineDao {

    @Autowired
    JdbcTemplate JdbcTemplate;

    @Override
    public String mAdd(Medicine medi) {
        Medicine midi = mSearch(medi.getmID());
        if (midi == null) {
            int rowCount = JdbcTemplate.update("insert into ch_MedRecord values('" + medi.getmID() + "','"
                    + medi.getmName() + medi.getmDescription() + "')");
            if (rowCount == 1) {
                return "success";
            } else {
                return "existed";
            }
        } else {
            return "existed";
        }
    }

    @Override
    public String mDelete(int mid) {
        return null;
    }

    @Override
    public Medicine mSearch(int mid) {
        return null;
    }
}