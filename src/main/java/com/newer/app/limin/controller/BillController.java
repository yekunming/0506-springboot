package com.newer.app.limin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.app.limin.pojo.Bill;

@RestController
@RequestMapping("/api")
@CrossOrigin  //允许跨域访问
public class BillController {

	
	@PostMapping("/bill")
	//页面传递的是json的字符串的数据，不能够直接封装成对象，需要加上@RequestBody讲json的字符串转换成为对象
	//和@ResponseBody相反。讲对象转换成为json的对象
	public int addBill(@RequestBody Bill bill) {
		System.out.println(bill);
		return 1;
	}
	
	
	//查看订单
	@GetMapping("/bill/{id}")
	public List<Bill> selectBill(@PathVariable("id") int status) {
		List<Bill> list = new ArrayList<>();
		System.out.println("测试--------");
		if(status==0) {
			for(int i = 0;i<=5;i++) {
				Bill bill = new Bill();
				bill.setId(i+1);
				bill.setAddress("湖南长沙市岳麓区");
				bill.setPhone("13345600987");
				bill.setName("发货人姓名");
				bill.setSender("收货人姓名");
				bill.setSname("14356780934");
				bill.setStatus(0);
				list.add(bill);
			}
		}else {
			for(int i = 0;i<=5;i++) {
				Bill bill = new Bill();
				bill.setId(i+1);
				bill.setAddress("湖南长沙市岳麓区");
				bill.setPhone("13345600987");
				bill.setName("发货人姓名");
				bill.setSender("收货人姓名");
				bill.setSname("14356780934");
				bill.setStatus(1);
				list.add(bill);
			}
		}
		return list;
	}
	
	//多个参数在路径中  修改状态
	@PutMapping("/bill/{id}/{status}")
	public int setStatusBill(@PathVariable("id") int id,@PathVariable("status") int status) {
		System.out.println(id+"-----"+status);
		return 1;
	}
}
