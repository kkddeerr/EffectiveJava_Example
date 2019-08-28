package Item02;

public class NutritionFacts {
	private int servingSize; // 필수
	private int servings; // 필수
	private int calories; //선택
	private int fat;
	private int sodium;
	
	public NutritionFacts() {}
	
	public NutritionFacts(int servingSize, int servings) {
		this(servingSize,servings,0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize,servings,calories,0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
		this(servingSize,servings,calories,fat,0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories,int fat, int sodium) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
	}
	// 하지만 만약 매개변수가 훨씬더 많아진다면??????? 만약 매개변수의 순서가 바뀌어서 건네주게 된다면?
	
	

	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + "]";
	}
	
	
}
