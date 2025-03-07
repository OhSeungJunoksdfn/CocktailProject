package com.sist.model;

import java.util.List;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.CocktailDAO;
import com.sist.dao.CocktailbarDAO;
import com.sist.vo.CocktailVO;
import com.sist.vo.CocktailbarVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CommunityModel {
	@RequestMapping("community/freeboard_list.do")
	public String freeboard_list(HttpServletRequest request, HttpServletResponse response)
	{	
		request.setAttribute("main_jsp", "../community/freeboard_list.jsp");
		return "../main/main.jsp";
	}
}
