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


import com.dao.ZhuanlixinxiDao;
import com.entity.ZhuanlixinxiEntity;
import com.service.ZhuanlixinxiService;
import com.entity.vo.ZhuanlixinxiVO;
import com.entity.view.ZhuanlixinxiView;

@Service("zhuanlixinxiService")
public class ZhuanlixinxiServiceImpl extends ServiceImpl<ZhuanlixinxiDao, ZhuanlixinxiEntity> implements ZhuanlixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanlixinxiEntity> page = this.selectPage(
                new Query<ZhuanlixinxiEntity>(params).getPage(),
                new EntityWrapper<ZhuanlixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanlixinxiEntity> wrapper) {
		  Page<ZhuanlixinxiView> page =new Query<ZhuanlixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanlixinxiVO> selectListVO(Wrapper<ZhuanlixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanlixinxiVO selectVO(Wrapper<ZhuanlixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanlixinxiView> selectListView(Wrapper<ZhuanlixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanlixinxiView selectView(Wrapper<ZhuanlixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhuanlixinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhuanlixinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhuanlixinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
