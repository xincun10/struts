package actions;

import com.opensymphony.xwork2.ActionSupport;

import models.User;

//表达式封装获取表单数据
public class ExAction extends ActionSupport{

	private User user;

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
	
	public String execute()
	{
		System.out.println(user);
		return NONE;
	}
}
