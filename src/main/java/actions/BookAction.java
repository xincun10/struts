package actions;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{

	//添加方法
	public String add()
	{
		System.out.println("add.....");
		return NONE;
	}
	//修改方法
	public String update()
	{
		System.out.println("update...");
		return NONE;
	}
}
