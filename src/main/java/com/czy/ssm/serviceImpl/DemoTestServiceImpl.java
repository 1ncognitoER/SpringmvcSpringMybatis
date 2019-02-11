package com.czy.ssm.serviceImpl;

import com.czy.ssm.dao.DemoTestDao;
import com.czy.ssm.model.Persons;
import com.czy.ssm.service.DemoTestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class DemoTestServiceImpl implements DemoTestService {
    /* 属性 */
    private DemoTestDao demoTestDao;

    @Autowired
    public void setDemoTestDao(DemoTestDao demoTestDao) {
        this.demoTestDao = demoTestDao;
    }

    public DemoTestDao getDemoTestDao() {

        return demoTestDao;
    }

    /**
     * 查询全部信息
     *
     * @return
     */
    public List<Persons> selectAll() {
        return demoTestDao.selectAll();
    }

}
