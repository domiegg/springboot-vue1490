package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KeyanketixiaoshenDao;
import com.entity.KeyanketixiaoshenEntity;
import com.service.KeyanketixiaoshenService;
import com.entity.vo.KeyanketixiaoshenVO;
import com.entity.view.KeyanketixiaoshenView;

@Service("keyanketixiaoshenService")
public class KeyanketixiaoshenServiceImpl extends ServiceImpl<KeyanketixiaoshenDao, KeyanketixiaoshenEntity> implements KeyanketixiaoshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyanketixiaoshenEntity> page = this.selectPage(
                new Query<KeyanketixiaoshenEntity>(params).getPage(),
                new EntityWrapper<KeyanketixiaoshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyanketixiaoshenEntity> wrapper) {
		  Page<KeyanketixiaoshenView> page =new Query<KeyanketixiaoshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeyanketixiaoshenVO> selectListVO(Wrapper<KeyanketixiaoshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyanketixiaoshenVO selectVO(Wrapper<KeyanketixiaoshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyanketixiaoshenView> selectListView(Wrapper<KeyanketixiaoshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyanketixiaoshenView selectView(Wrapper<KeyanketixiaoshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KeyanketixiaoshenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KeyanketixiaoshenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KeyanketixiaoshenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
