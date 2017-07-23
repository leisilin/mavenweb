package cn.itcast.mavenweb.depService.depServiceImpl;

import cn.itcast.mavenweb.depDao.DepDao;
import cn.itcast.mavenweb.domain.Dep;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2017/7/23.
 */
public class DepDaoImpl extends HibernateDaoSupport implements DepDao {
    public List<Dep> getList() {
        return (List<Dep>) getHibernateTemplate().find("find Dep");
    }
}
