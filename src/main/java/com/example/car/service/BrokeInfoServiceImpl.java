package com.example.car.service;

import com.example.car.common.PageResult;
import com.example.car.entity.BrokeInfoEntity;
import com.example.car.mapper.BrokeInfoMapper;
import com.example.car.mapper.CarMapper;
import com.example.car.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrokeInfoServiceImpl {
    @Resource
    private BrokeInfoMapper brokeInfoMapper;
    @Resource
    private UserMapper userMapper;


    public PageResult<BrokeInfoEntity> getList(BrokeInfoEntity brokeInfoEntity) {
        int rowCount = brokeInfoMapper.getListCount(brokeInfoEntity);
        PageResult<BrokeInfoEntity> pageResult = new PageResult<>(brokeInfoEntity.getCurrent(), brokeInfoEntity.getSize(), rowCount);
        if (pageResult.willCauseEmptyList()) {
            return pageResult;
        }
        List<BrokeInfoEntity> list = brokeInfoMapper.getList(pageResult,brokeInfoEntity);
        for (BrokeInfoEntity b: list) {
            b.setImgList(brokeInfoMapper.getBrokeImgList(b.getId()));
            b.setUserEntity(userMapper.selectByPrimaryKey(b.getUserId()));
        }
        pageResult.setPageData(list);
        return pageResult;
    }
}
