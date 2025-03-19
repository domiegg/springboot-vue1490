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


import com.dao.ZhuzuoquanxiaoshenDao;
import com.entity.ZhuzuoquanxiaoshenEntity;
import com.service.ZhuzuoquanxiaoshenService;
import com.entity.vo.ZhuzuoquanxiaoshenVO;
import com.entity.view.ZhuzuoquanxiaoshenView;

@Service("zhuzuoquanxiaoshenService")
public class ZhuzuoquanxiaoshenServiceImpl extends ServiceImpl<ZhuzuoquanxiaoshenDao, ZhuzuoquanxiaoshenEntity> implements ZhuzuoquanxiaoshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuzuoquanxiaoshenEntity> page = this.selectPage(
                new Query<ZhuzuoquanxiaoshenEntity>(params).getPage(),
                new EntityWrapper<ZhuzuoquanxiaoshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
		  Page<ZhuzuoquanxiaoshenView> page =new Query<ZhuzuoquanxiaoshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuzuoquanxiaoshenVO> selectListVO(Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuzuoquanxiaoshenVO selectVO(Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuzuoquanxiaoshenView> selectListView(Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuzuoquanxiaoshenView selectView(Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhuzuoquanxiaoshenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
