package com.lch.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lch.goods.bean.Good;
import com.lch.goods.mapper.GoodMapper;
import com.lch.goods.service.GoodService;

@Service("goodService")
public class GoodServiceImpl implements GoodService {

	@Autowired
	private GoodMapper goodMapper;

	@Override
	public List<Good> list() {
		return goodMapper.list();
	}

}
