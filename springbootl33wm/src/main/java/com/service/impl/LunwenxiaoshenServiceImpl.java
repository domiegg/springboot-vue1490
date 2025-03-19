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


import com.dao.LunwenxiaoshenDao;
import com.entity.LunwenxiaoshenEntity;
import com.service.LunwenxiaoshenService;
import com.entity.vo.LunwenxiaoshenVO;
import com.entity.view.LunwenxiaoshenView;

@Service("lunwenxiaoshenService")
public class LunwenxiaoshenServiceImpl extends ServiceImpl<LunwenxiaoshenDao, LunwenxiaoshenEntity> implements LunwenxiaoshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwenxiaoshenEntity> page = this.selectPage(
                new Query<LunwenxiaoshenEntity>(params).getPage(),
                new EntityWrapper<LunwenxiaoshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwenxiaoshenEntity> wrapper) {
		  Page<LunwenxiaoshenView> page =new Query<LunwenxiaoshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LunwenxiaoshenVO> selectListVO(Wrapper<LunwenxiaoshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwenxiaoshenVO selectVO(Wrapper<LunwenxiaoshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwenxiaoshenView> selectListView(Wrapper<LunwenxiaoshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwenxiaoshenView selectView(Wrapper<LunwenxiaoshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<LunwenxiaoshenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<LunwenxiaoshenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<LunwenxiaoshenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
