package recipes;

import java.util.HashSet;

public class Recipe {
	
	public HashSet<String> liquidIngredientsList = new HashSet<String>();
	public HashSet<String> liquidQuantitiesList = new HashSet<String>();
	public HashSet<String> solidIngredientsList = new HashSet<String>();
	public HashSet<String> solidQuantitiesList = new HashSet<String>();
	
	public Recipe (HashSet<String> providedLiquidIngredientsList, HashSet<String> providedLiquidQuantitiesList,
			HashSet<String> providedSolidIngredientsList, HashSet<String> providedSolidQuantitiesList) {
		this.liquidIngredientsList = providedLiquidIngredientsList;
		this.liquidQuantitiesList = providedLiquidQuantitiesList;
		this.solidIngredientsList = providedSolidIngredientsList;
		this.solidQuantitiesList = providedSolidQuantitiesList;
	}

}
