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


import com.dao.KeyanketiDao;
import com.entity.KeyanketiEntity;
import com.service.KeyanketiService;
import com.entity.vo.KeyanketiVO;
import com.entity.view.KeyanketiView;

@Service("keyanketiService")
public class KeyanketiServiceImpl extends ServiceImpl<KeyanketiDao, KeyanketiEntity> implements KeyanketiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyanketiEntity> page = this.selectPage(
                new Query<KeyanketiEntity>(params).getPage(),
                new EntityWrapper<KeyanketiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyanketiEntity> wrapper) {
		  Page<KeyanketiView> page =new Query<KeyanketiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeyanketiVO> selectListVO(Wrapper<KeyanketiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyanketiVO selectVO(Wrapper<KeyanketiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyanketiView> selectListView(Wrapper<KeyanketiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyanketiView selectView(Wrapper<KeyanketiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KeyanketiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KeyanketiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KeyanketiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
