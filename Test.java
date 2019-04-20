package kms;

public class Test
  {

  public Test() 
    {
    
    // Variables to change for testing purposes
    int numOfMenuItems = 9; 
    int numOfIngredients = 5;
    double menuTax = 0.1; 
    int index; 
    
    String[] menuItemNames = 
          { 
            "Cheeseburger", 
            "Ice Cream", 
            "Lemonade", 
            "Nachos", 
            "Cereal", 
            "Beer", 
            "Chicken Noodle Soup", 
            "House Salad", 
            "BLT Sandwich" 
          };
    
    double[] menuItemPrices = 
          {
              
          5.00,
          3.25,
          1.49, 
          6.00, 
          0.99, 
          2.00, 
          4.00, 
          5.20, 
          7.00
          };
    
    String[] ingredientNames =
          {
          "Cheese", 
          "Salt", 
          "Chicken",
          "Ground Beef", 
          "Chicken Broth"
             
          };
    
    double[] ingredientPrices = 
          {
              
          1.00,
          0.10,
          2.00,
          3.00,
          0.50
          };
    
    /* 
     * Create an array of ingredient objects to test
     */
    Ingredient[] ingredientList = new Ingredient[ numOfIngredients ];
    
    for( index = 0; index < numOfIngredients; index++ )
      {
      
      ingredientList[ index ] = new Ingredient( ingredientNames[ index ], ingredientPrices[ index ]);
      }
    
    /*
     * Create an array of menuItem objects to test 
     */
    MenuItem[] menuItems = new MenuItem[ numOfMenuItems ]; 
    
    for( index = 0; index < numOfMenuItems; index++ )
      {
      
      menuItems[ index ] = new MenuItem( menuItemNames[ index ], menuItemPrices[ index ], true );
      }
    
    /*
     * Tests 
     */
    System.out.println( "MenuItem Tests\n=====================" );
    
    for( index = 0; index < numOfMenuItems; index++ )
      {
      
      System.out.println( "Food name: " + menuItems[ index ].getName() );
      System.out.println( "Food price: " + menuItems[ index ].getPrice() );
      }
    
    System.out.println( "\nMenu Tests\n=======================" );
    
    Menu menu = new Menu( menuTax );
    
    // Add the menuItems to the menu
    for( index = 0; index < numOfMenuItems; index++ )
      {
      
      menu.addItem( menuItems[ index ] );
      }
    
    // Test the menuItems 
    for( index = 0; index < numOfMenuItems; index ++ )
      {
      
      MenuItem menuItem = menu.getMenuItem( menuItemNames[ index ] );
      
      System.out.println( "Food name: " + menuItem.getName() );
      System.out.println( "Food price: " + menuItem.getPrice() );
      System.out.println( "Food availability: " + menuItem.checkAvailability() ); 
      System.out.print( "Toggle availability: " );
        menuItem.toggleAvailability();
        System.out.println( menuItem.checkAvailability() );
      }
    
    // Test the ingredients
    System.out.println( "\nIngredient Tests\n=========================");
    
    for( index = 0; index < numOfIngredients; index++ )
      {
      
      Ingredient ingredient = ingredientList[ index ];
      
      System.out.println( "Ingredient Name: " + ingredient.getName() );
      System.out.println( "Ingredient Price: " + ingredient.getPrice() );  
      System.out.println( "Ingredient availability: " + ingredient.checkIfAvailable() );
      System.out.print( "Toggle availability: " );
        ingredient.toggleAvailable();
        System.out.println( ingredient.checkIfAvailable() );
      System.out.print( "Set units to ounces: " );
        ingredient.setUnits( "ounces" );
        System.out.println( ingredient.getUnits() );
      }
    
    
    
    } // End Method
  }// End Class
