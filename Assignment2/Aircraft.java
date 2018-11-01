
/**
 * Write a description of class Aircraft here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aircraft
{
    // instance variables - replace the example below with your own
    private int modelYear = 2018;
    private String manufacturer;
    private String modelName;
    private int numberOfEngines = 1;
    private boolean jet = false;
    private String specificationsPage;

    /**
     * Constructor for objects of class Aircraft
     */
    public Aircraft(String manufacturer, String modelName, int modelYear, int numberOfEngines, boolean jet, String specificationsPage)
    {
        // initialise instance variables

    }

    /**
     * Constructor for objects of class Aircraft
     */
    public Aircraft(String manufacturer, String modelName, String specificationsPage)
    {
        // initialise instance variables

    }

    /**
     * Constructor for objects of class Aircraft
     */
    public Aircraft(String manufacturer, String modelName, int modelYear, String specificationsPage)
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getModelYear(int theModelYear)
    {
        // put your code here
        if((theModelYear>=1920) && (theModelYear<=2018)){
            return theModelYear;
        }
        else if (theModelYear<1920) {
            throw new IllegalArgumentException("Sorry, the model year " + theModelYear + " is too old.");
        }
        else {
            throw new IllegalArgumentException("Sorry, the model year " + theModelYear + " is in the future.");
        }

    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNumberOfEngines(int theNumberOfEngines)
    {
        // put your code here
        if((theNumberOfEngines>=1) && (theNumberOfEngines<=4)){
            return theNumberOfEngines;
        }
        else if (theNumberOfEngines<1) {
            throw new IllegalArgumentException("Sorry, 0 is too few engines for an aircraft");
        }
        else {
            throw new IllegalArgumentException("Sorry, " + theNumberOfEngines + " is too many engines for an aircraft.");
        }

    }
}
