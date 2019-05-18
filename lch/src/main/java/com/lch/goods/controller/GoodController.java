package com.lch.goods.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lch.goods.bean.Good;
import com.lch.goods.service.GoodService;
import com.lch.goods.utils.PageHelpUtil;

@Controller
public class GoodController {

	@Autowired
	private GoodService goodServie;
	private int pageSize = 2;
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue="1") int page){
		PageHelper.startPage(page, pageSize);
		//查询满足条件的总记录
		List<Good> goodList = goodServie.list();
		
		PageInfo<Good> pageInfo = new PageInfo<>(goodList);
		
		String pageList = PageHelpUtil.page("list.do", pageInfo,"name");
	
		model.addAttribute("goodList", goodList);
		model.addAttribute("pageList", pageList);
		return "list";
	}
	
	
	
}
