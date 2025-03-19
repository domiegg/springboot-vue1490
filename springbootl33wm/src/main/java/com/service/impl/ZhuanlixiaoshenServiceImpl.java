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


import com.dao.ZhuanlixiaoshenDao;
import com.entity.ZhuanlixiaoshenEntity;
import com.service.ZhuanlixiaoshenService;
import com.entity.vo.ZhuanlixiaoshenVO;
import com.entity.view.ZhuanlixiaoshenView;

@Service("zhuanlixiaoshenService")
public class ZhuanlixiaoshenServiceImpl extends ServiceImpl<ZhuanlixiaoshenDao, ZhuanlixiaoshenEntity> implements ZhuanlixiaoshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanlixiaoshenEntity> page = this.selectPage(
                new Query<ZhuanlixiaoshenEntity>(params).getPage(),
                new EntityWrapper<ZhuanlixiaoshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanlixiaoshenEntity> wrapper) {
		  Page<ZhuanlixiaoshenView> page =new Query<ZhuanlixiaoshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanlixiaoshenVO> selectListVO(Wrapper<ZhuanlixiaoshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanlixiaoshenVO selectVO(Wrapper<ZhuanlixiaoshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanlixiaoshenView> selectListView(Wrapper<ZhuanlixiaoshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanlixiaoshenView selectView(Wrapper<ZhuanlixiaoshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhuanlixiaoshenEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhuanlixiaoshenEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhuanlixiaoshenEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
