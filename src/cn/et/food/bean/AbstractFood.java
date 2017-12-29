package cn.et.food.bean;

/**
 * AbstractFood entity provides the base persistence definition of the Food
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFood implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4748558196987162975L;
	private Integer foodid;
	private String foodname;
	private Integer price;
	private String img;

	// Constructors

	/** default constructor */
	public AbstractFood() {
	}

	/** full constructor */
	public AbstractFood(String foodname, Integer price, String img) {
		this.foodname = foodname;
		this.price = price;
		this.img = img;
	}

	// Property accessors

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}