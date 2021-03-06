/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kms;
import java.sql.*;
import java.util.Calendar;

/**
 *
 * @author Gault
 */
public class IngredientDB 
{
    // TODO: Add URL and Driver strings when DB is created.
    String dbURL = "jdbc:mysql://db_ip:3306/2EeZsvHRYv";
    String dbDriver = "com.mysql.jdbc.Driver";
    String un = "2EeZsvHRYv";
    String p = "Uk6UUrlbAy";
    
    public boolean addIngredientToDB( Ingredient ingredient, 
                                        double startingNumUnits )
    {
        try
        {
            // Connect to the mysql database.
            Class.forName( dbDriver );
            Connection conn = DriverManager.getConnection( dbURL, un, p );

            // Create an SQL "Date" object to record the date in which
            // the insert occurs.
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date( calendar.getTime().getTime() );

            // Create the structure of the insert query.
            String query = "INSERT into INGREDIENTS "
                    
                    // Refer here for column names.
                    // More columns may be required for predictive calculations.
                    
                    // For now, usage_delta and date_since_delta may be used
                    // for snapshot predictive calculation. (1 week?)
                    + "(item_name, price, units, num_units, usage_delta, "
                    + "date_since_delta, last_update, date_created) "
                    + "values (?, ?, ?, ?, ?, ?)";

            // Pull data from passed-in Ingredient object.
            String ingName = ingredient.getName();
            double ingPrice = ingredient.getPrice();
            String ingUnits = ingredient.getUnits();

            // Create the MySQL PreparedStatement object to perform
            // the INSERT statement.
            PreparedStatement ps = conn.prepareStatement( query );
            // name
            ps.setString ( 1, ingName );
            // price
            ps.setDouble ( 2, ingPrice );
            // units
            ps.setString ( 3, ingUnits );
            // num_units
            ps.setDouble ( 4, startingNumUnits );
            // usage_delta
            ps.setDouble ( 5, 0 );
            // date_since_delta
            ps.setDate   ( 6, startDate );
            // last_update
            ps.setDate   ( 7, startDate );
            // date_created
            ps.setDate   ( 8, startDate );

            // Execute the prepared statement.
            ps.execute();

            // Finally, close the connection.
            conn.close();
        }
        
        catch ( Exception e )
        {
            // If an Exception occurs, output the info.
            System.out.println( e.getCause() );
            System.out.println( e.getMessage() );
            
            // Return false to indicate failure.
            return false;
        }
        
        // true is returned if the ingredient was successfully added.
        return true;
    }
    
    public boolean updateIngredient( Ingredient ingredient, double change )
    {
        try
        {
            // Connect to the mysql database.
            Class.forName( dbDriver );
            Connection conn = DriverManager.getConnection( dbURL, un, p );

            // the update occurs.
            Calendar calendar = Calendar.getInstance();
            java.sql.Date updateDate = new java.sql.Date( calendar.getTime().getTime() );

            // Create the structure of the update query.       
            String query = "UPDATE ingredients SET num_units = num_units + ?, "
                         + "last_update = ? WHERE item_name = ?";
            
            PreparedStatement ps = conn.prepareStatement( query );
            
            // Fill in the question marks.
            ps.setDouble ( 1, change );
            ps.setDate   ( 2, updateDate );
            ps.setString ( 3, ingredient.getName() );

            // Execute the prepared statement.
            ps.execute();

            // Finally, close the connection.
            conn.close();
        }
        
        catch ( Exception e )
        {
            // If an Exception occurs, output the info.
            System.out.println( e.getMessage() );
            
            // Return false to indicate failure.
            return false;
        }
        
        // true is returned if the ingredient was successfully added.
        return true;
    }
    
    
}
