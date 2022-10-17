@regression @smoke @us-246
Feature: Ebay CountryOutline

Description: User should able to find items by country

	Background: 
		Given Open Ebay Homepage
		
	Scenario Outline: Filter items by Country
		Given Search for "<Items>"
		When Region of Manufacture "<Country>"
		Then Item list should from "<Country>"
	
	Examples:
		|Items		|Country		|
		|Shoes		|China			|
		|Shirts		|Bangladesh		|
		|Pants		|United States	|