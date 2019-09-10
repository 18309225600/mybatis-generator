package com.ft.customer.dao.ose;

import com.ft.customer.ose.QmsOseUserCardRelation;

public interface QmsOseUserCardRelationMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(QmsOseUserCardRelation record);

    int insertSelective(QmsOseUserCardRelation record);

    QmsOseUserCardRelation selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(QmsOseUserCardRelation record);

    int updateByPrimaryKey(QmsOseUserCardRelation record);
}