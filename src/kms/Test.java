package kms;

public class Test
  {

  public Test() 
    {
    
    // Variables to change for testing purposes
    int numOfMenuItems = 9; 
    double menuTax = 0.1; 
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
    
 
    // Test the individual ingredients 
    MenuItem cheeseburger = new Food("Cheeseburger", 5.00, true);
    MenuItem iceCream = new Food("Ice Cream", 3.25, true);
    MenuItem lemonade = new Drink("Lemonade", 1.49, true);
    MenuItem nachos = new Food("Nachos", 6.00, true);
    MenuItem cereal = new Food("Cereal", 0.99, true);
    MenuItem beer = new Alcohol("Beer", 2.00, true);
    MenuItem chickenNoodleSoup = new Food("Chicken Noodle Soup", 4.00, true);
    MenuItem houseSalad = new Food("House Salad", 5.20, true);
    MenuItem bltSandwich = new Food("BLT Sandwich", 7.00, true);
    
    MenuItem[] menuItems = new MenuItem[ numOfMenuItems ]; 
    
    menuItems[ 0 ] = cheeseburger; 
    menuItems[ 1 ] = iceCream; 
    menuItems[ 2 ] = lemonade; 
    menuItems[ 3 ] = nachos; 
    menuItems[ 4 ] = cereal; 
    menuItems[ 5 ] = beer; 
    menuItems[ 6 ] = chickenNoodleSoup;
    menuItems[ 7 ] = houseSalad; 
    menuItems[ 8 ] = bltSandwich; 
    
    System.out.println( "MenuItem Tests\n=====================" );
    
    int index; 
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
    
    for( index = 0; index < numOfMenuItems; index ++ )
      {
      
      System.out.println( "Food name: " + 
                          menu.getMenuItem( menuItemNames[ index ] ).getName() );
      System.out.println( "Food price: " + 
                          menu.getMenuItem( menuItemNames[ index ] ).getPrice() );
      }
    
    
    
    
    
    } // End Method
  }// End Class
