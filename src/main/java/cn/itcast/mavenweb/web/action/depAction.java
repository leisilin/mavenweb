package cn.itcast.mavenweb.web.action;

import cn.itcast.mavenweb.depService.DepService;
import cn.itcast.mavenweb.domain.Dep;
import org.apache.struts2.ServletActionContext;

import java.util.List;

/**
 * Created by Administrator on 2017/7/23.
 */
public class depAction {

    private DepService depService;

    public void setDepService(DepService depService) {
        this.depService = depService;
    }

    public String list(){

       List<Dep>  list = depService.getList();
        ServletActionContext.getRequest().setAttribute("list",list);
        return "list";
    }
}
