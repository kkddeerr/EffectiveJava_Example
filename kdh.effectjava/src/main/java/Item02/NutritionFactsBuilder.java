package Item02;

public class NutritionFactsBuilder {
	private int servingSize; // 필수
	private int servings; // 필수
	private int calories; //선택
	private int fat;
	private int sodium; 
	
	private NutritionFactsBuilder(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
	}
	
	public static class Builder {
		
		private int servingSize; // 필수
		private int servings; // 필수
		private int calories = 0; //선택
		private int fat = 0; //선택
		private int sodium = 0; //선택
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			calories = val; 
			return this;
		}
		
		public Builder fat(int val) {
			fat = val; 
			return this;
		}
		
		
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		
		public NutritionFactsBuilder build() {
			return new NutritionFactsBuilder(this);
		}
	}

	@Override
	public String toString() {
		return "NutritionFactsBuilder [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + "]";
	}
	
}
