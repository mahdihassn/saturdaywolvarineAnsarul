@regression @smoke @us-246
Feature: Ebay Brand Outline

Description:User should able to filtter items by brand

    Background:
    Given Open Ebay Homepage
    
    Scenario Outline:Filter item by Brand
    Given Search for "<Items>"
    When Filter by "<Brand>"
    Then Item list have products of "<Brand>"
    
    Examples:
    		|Items		  |Brand	|
            |shoes        |Nike   	|
            |shirts       |Adidas   |
            |pants        |Unbrand  |
            