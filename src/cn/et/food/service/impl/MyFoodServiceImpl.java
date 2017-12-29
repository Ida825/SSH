package cn.et.food.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.food.dao.MyFoodDao;
import cn.et.food.service.MyFoodService;

@Service
public class MyFoodServiceImpl implements MyFoodService{
	
	@Autowired
	MyFoodDao dao;

	public List<Map<String, Object>> queryFood(String foodname) {
		if(foodname==null){
			foodname="";
		}
		return dao.queryFood(foodname);
	}

	public void saveFood(String foodname, Integer price) {
		dao.saveFood(foodname, price);
	}

	public void deleteFood(Integer foodid) {	
		dao.deleteFood(foodid);
	}

	public void updateFood(Integer foodid,String foodname, Integer price) {
		dao.updateFood(foodid,foodname, price);
	}

}
