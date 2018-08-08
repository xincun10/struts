package interceptors;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

	/**
	 * 拦截器的逻辑
	 * 判断用户是否登录，对登录用户放行
	 * 未登录用户返回到登录页面
	 */
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		Object obj = request.getSession().getAttribute("username");
		if(obj!=null)
		{
			return invocation.invoke();
		}
		return "login";
	}

}
