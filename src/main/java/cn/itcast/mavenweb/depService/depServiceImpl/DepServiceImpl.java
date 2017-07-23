package cn.itcast.mavenweb.depService.depServiceImpl;

import cn.itcast.mavenweb.depDao.DepDao;
import cn.itcast.mavenweb.depService.DepService;
import cn.itcast.mavenweb.domain.Dep;

import java.util.List;

/**
 * Created by Administrator on 2017/7/23.
 */
public class DepServiceImpl implements DepService {

    private DepDao depDao;

    public void setDepDao(DepDao depDao) {
        this.depDao = depDao;
    }

    public List<Dep> getList() {
        return depDao.getList();
    }
}
