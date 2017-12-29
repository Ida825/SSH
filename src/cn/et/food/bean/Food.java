package cn.et.food.bean;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */
public class Food extends AbstractFood implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = -438110593256520574L;

	/** default constructor */
	public Food() {
	}

	/** full constructor */
	public Food(String foodname, Integer price, String img) {
		super(foodname, price, img);
	}

}
