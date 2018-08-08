package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import models.User;

public class ModelAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	//模型驱动获取表单数据
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String execute()
	{
		System.out.println(user);
		return NONE;
	}

}
