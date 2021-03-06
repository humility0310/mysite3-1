package com.bit2016.mysite.action.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2016.web.Action;
import com.bit2016.web.util.WebUtil;

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebUtil.forward(
			request, 
			response, 
			"/WEB-INF/views/main/index.jsp" );
	}
}
