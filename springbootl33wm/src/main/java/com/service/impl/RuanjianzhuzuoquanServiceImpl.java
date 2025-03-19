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


import com.dao.RuanjianzhuzuoquanDao;
import com.entity.RuanjianzhuzuoquanEntity;
import com.service.RuanjianzhuzuoquanService;
import com.entity.vo.RuanjianzhuzuoquanVO;
import com.entity.view.RuanjianzhuzuoquanView;

@Service("ruanjianzhuzuoquanService")
public class RuanjianzhuzuoquanServiceImpl extends ServiceImpl<RuanjianzhuzuoquanDao, RuanjianzhuzuoquanEntity> implements RuanjianzhuzuoquanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuanjianzhuzuoquanEntity> page = this.selectPage(
                new Query<RuanjianzhuzuoquanEntity>(params).getPage(),
                new EntityWrapper<RuanjianzhuzuoquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
		  Page<RuanjianzhuzuoquanView> page =new Query<RuanjianzhuzuoquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuanjianzhuzuoquanVO> selectListVO(Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuanjianzhuzuoquanVO selectVO(Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuanjianzhuzuoquanView> selectListView(Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuanjianzhuzuoquanView selectView(Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<RuanjianzhuzuoquanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
