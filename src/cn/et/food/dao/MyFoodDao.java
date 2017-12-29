package cn.et.food.dao;

import java.util.List;
import java.util.Map;

public interface MyFoodDao {

	public abstract List<Map<String, Object>> queryFood(String foodname);

	public abstract void saveFood(String foodname, Integer price);

	public abstract void deleteFood(Integer foodid);

	public abstract void updateFood(Integer foodid, String foodname, Integer price);

}