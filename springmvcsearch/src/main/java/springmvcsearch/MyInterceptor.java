package springmvcsearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In prehandlers");
		String query=(String) request.getParameter("querybox");
		System.out.println(query);
		if(query.startsWith("po")) {
			response.setContentType("text/html");
			response.getWriter().println("The search is abandode...");
			return false;
		}
		return true;
	}
}
