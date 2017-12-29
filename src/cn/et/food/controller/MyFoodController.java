package cn.et.food.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.food.service.MyFoodService;

@Controller
public class MyFoodController {

	/**
	 * 直接返回对象SpringMVC自动转换成json
	 * 要配置消息转换器
	 * @param foodname
	 * @return
	 * @throws IOException
	 */
	
	@Autowired
	MyFoodService ms;
	@ResponseBody
	@RequestMapping(value="/queryFoodList",method=RequestMethod.GET)
	public List<Map<String, Object>> queryFoodList(String foodname) throws IOException{
		List<Map<String, Object>> foodList =  ms.queryFood(foodname);	
		return foodList;
	}
	

	@RequestMapping(value="/food/{foodid}",method=RequestMethod.DELETE)
	public String deleteFood(@PathVariable Integer foodid,OutputStream os) throws IOException{
		try {
			ms.deleteFood(foodid);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));	
		}
		return null;
	}
	
	@RequestMapping(value="/food",method=RequestMethod.POST)
	public String addFood(String foodname,Integer price,OutputStream os) throws IOException{
		try {
			ms.saveFood(foodname,price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));	
		}
		return null;
	}
	
	@RequestMapping(value="/food/{foodid}",method=RequestMethod.PUT)
	public String updateFood(@PathVariable Integer foodid,String foodname,Integer price,OutputStream os) throws IOException{
		try {
			ms.updateFood(foodid,foodname,price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			os.write("0".getBytes("UTF-8"));
			e.printStackTrace();
		}
		return null;
	}
}
