package com.wayn.mall.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wayn.mall.dao.CarouselsDao;
import com.wayn.mall.entity.Carousels;
import com.wayn.mall.service.CarouselsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarouselsServiceImpl extends ServiceImpl<CarouselsDao, Carousels> implements CarouselsService {

    @Autowired
    private CarouselsDao carouselsDao;

    @Override
    public IPage selectPage(Page<Carousels> page, Carousels carousels) {
        return carouselsDao.selectListPage(page, carousels);
    }
}
