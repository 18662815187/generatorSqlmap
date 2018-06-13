package com.lwyykj.core.dao.order;

import com.lwyykj.core.bean.order.Refund;
import com.lwyykj.core.bean.order.RefundQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundDao {
    int countByExample(RefundQuery example);

    int deleteByExample(RefundQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExample(RefundQuery example);

    Refund selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundQuery example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundQuery example);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKey(Refund record);
}