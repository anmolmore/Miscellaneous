package com.anmol;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrates;
	
	public String toString() {
		return (this.servingSize + " " +
				this.servings + " " +
				this.calories + " " +
				this.fat + " " +
				this.sodium + " " + 
				this.carbohydrates + " ");
	}
	
	public static class Builder {
		private int servingSize;
		private int servings;
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrates = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			this.calories = val;
			return this;
		}
		
		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}
		
		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}
		
		public Builder carbohydrates(int carbohydrates) {
			this.carbohydrates = carbohydrates;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrates = builder.carbohydrates;
	}
}
