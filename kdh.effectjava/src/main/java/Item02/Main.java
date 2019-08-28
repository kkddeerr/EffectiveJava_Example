package Item02;

public class Main {

	public static void main(String[] args) {
		
		//첫번째 방안 (( 점층적 생성자 패턴 ))
		NutritionFacts nutritionFacts = new NutritionFacts(100,200);
		System.out.println(nutritionFacts.toString());
		
		//두번째 방안 (( 자바빈즈 패턴 ))
		nutritionFacts.setServingSize(200);
		nutritionFacts.setFat(300);
		
		System.out.println(nutritionFacts.toString());
		
		//세번째 방안 (( 빌더 패턴 ))
		NutritionFactsBuilder nutritionFactsBuilder = new NutritionFactsBuilder.Builder(200, 100).calories(30).fat(40).sodium(50).build();
		System.out.println(nutritionFactsBuilder.toString());

	}

}
