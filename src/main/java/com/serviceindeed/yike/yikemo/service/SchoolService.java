package com.serviceindeed.yike.yikemo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.serviceindeed.yike.yikemo.domain.School;
import com.serviceindeed.yike.yikemo.domain.helper.HttpPages;
import com.serviceindeed.yike.yikemo.mapper.SchoolMapper;
import com.serviceindeed.yike.yikemo.util.YiKeMoHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SchoolService {
    @Autowired
    SchoolMapper schoolMapper;

    /**
     * 查询学校信息
     *
     * @param school
     * @return
     */
    public Map<String, Object> querySchoolList(School school, HttpPages httpPages) {

        if (YiKeMoHelper.getInstance().isPaging(httpPages)) //分页
        {
            Page<School> page = PageHelper.offsetPage(httpPages.getStart(), httpPages.getLength()).doSelectPage(() -> schoolMapper.queryPageSchoolList(school));
            return YiKeMoHelper.getInstance().getSuccessPageQueryJson(httpPages.getDraw() + 1, page);
        } else {        //不分页
            List<School> schoolLis = schoolMapper.queryPageSchoolList(school);
            return YiKeMoHelper.getInstance().notPagingResult(schoolLis, schoolLis.size());
        }

    }

    /**
     * 根据学校ID查询学校信息
     *
     * @param schoolId
     * @return
     */
    public School querySchoolById(Long schoolId) {
        return schoolMapper.selectByPrimaryKey(schoolId);
    }

    /**
     * 新增学校信息
     *
     * @param school
     */
    public void saveSchool(School school) {
        schoolMapper.insert(school);
    }

    /**
     * 更新学校信息
     *
     * @param school
     */
    public void updateSchool(School school) {
        School schoolEdit = this.querySchoolById(school.getSchoolId());
        BeanUtils.copyProperties(school, schoolEdit);
        schoolMapper.updateByPrimaryKeySelective(school);
    }

    /**
     * 校验学校名称是否存在
     *
     * @param school
     * @return
     */
    public Integer checkSchoolIsExist(School school) {
        return schoolMapper.checkSchoolIsExist(school);
    }
}
