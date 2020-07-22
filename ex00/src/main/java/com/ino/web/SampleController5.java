package com.ino.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ino.model.ProductVO;

@Controller
public class SampleController5 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);

	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {

		ProductVO vo = new ProductVO("SampleProduct", 3000);

		return vo;
	}

}