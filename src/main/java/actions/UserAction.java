package actions;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//获取表单提交数据
public class UserAction extends ActionSupport{

	public String context1()
	{
		//ActionContext方式		
		ActionContext context = ActionContext.getContext();
		Map<String, Object> map = context.getParameters();
		
		Set<String> keys = map.keySet();
		for(String key:keys)
		{
			Object[] objs = (Object[]) map.get(key);
			System.out.println(Arrays.toString(objs));
		}
		return NONE;		
	}
	
	//ServletActionContext方式
	public String context2()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+":"+password);
		return NONE;
	}
}
