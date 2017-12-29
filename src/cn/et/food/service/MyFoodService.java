package cn.et.food.service;

import java.util.List;
import java.util.Map;

public interface MyFoodService {

	public abstract List<Map<String, Object>> queryFood(String foodname);

	public abstract void saveFood(String foodname, Integer price);

	public abstract void deleteFood(Integer foodid);

	public abstract void updateFood(Integer foodid, String foodname, Integer price);

}