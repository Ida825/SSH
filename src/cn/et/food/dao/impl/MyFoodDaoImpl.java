package cn.et.food.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import cn.HibernateSessionFactory;
import cn.et.food.bean.Food;
import cn.et.food.dao.MyFoodDao;

@Service
public class MyFoodDaoImpl implements MyFoodDao{
	
	private Session session = HibernateSessionFactory.getSession();
	

	public List<Map<String, Object>> queryFood(String foodname) {
		
		if(foodname==null){
			foodname="";
		}
		
		
		Query query = session.createQuery("from food where foodname like '"+foodname+"'");
		session.getTransaction().begin();
		List<Map<String, Object>> list = query.list();
		session.getTransaction().commit();
		return list;
	}

	public void saveFood(String foodname, Integer price) {
		Food food = new Food();
		food.setFoodname(foodname);
		food.setPrice(price);
		session.getTransaction().begin();
		session.save(food);
		session.getTransaction().commit();
	}

	public void deleteFood(Integer foodid) {
		Food food = new Food();
		food.setFoodid(foodid);
		session.getTransaction().begin();
		session.delete(food);
		session.getTransaction().commit();	
	}

	public void updateFood(Integer foodid,String foodname, Integer price) {
		Food food = (Food)session.load(Food.class,foodid);
		food.setFoodname(foodname);
		food.setPrice(price);
		session.getTransaction().begin();
		session.save(food);
		session.getTransaction().commit();
	}

}
