
/**
 * Write a description of class Aircraft here.
 *
 * @author Monika Szucs
 * @version Novemeber 1, 2018
 */
public class Aircraft
{
    public static  final int   EARLIEST_YEAR = 1920;
    public static  final int   LATEST_YEAR = 2018;
    public static  final int   MIN_ENGINES = 1;
    public static  final int   MAX_ENGINES = 4;
    
    // instance variables - replace the example below with your own
    private int     modelYear           =   2018;
    private String  manufacturer;
    private String  modelName;
    private int     numEngines          =   1;
    private boolean jet                 =   false;
    private String  specsPage;

    /**
     * Constructor for objects of class Aircraft
     * 
     * @param manufacturer is the company name who manufactured the product
     * @param modelName consists of the model name
     * @param modelYear is the year when the product was created
     * @param numberOfEngines is the number of engines the Aircraft will have
     * @param jet is checking to see if the Aircraft is a jet or not
     * @param specificationsPage is a link to the Aircraft specifications
     * 
     */
    public Aircraft(String manufacturer, String modelName, int modelYear, int numOfEngines, boolean jet, String specsPage)
    {
        // initialise instance variables
        setManufacturer(manufacturer);
        setModelName(modelName);
        setModelYear(modelYear);
        setNumEngines(numEngines);
        setJet(jet);
        setSpecsPage(specsPage);
    }

    /**
     * Constructor for objects of class Aircraft
     * @param manufacturer is the company name who manufactured the product
     * @param modelName consists of the model name
     * @param specificationsPage is a link to the Aircraft specifications
     * 
     */
    public Aircraft(String manufacturer, String modelName, String specsPage)
    {
        // initialise instance variables
        setManufacturer(manufacturer);
        setModelName(modelName);
        setSpecsPage(specsPage);
    }

    /**
     * Constructor for objects of class Aircraft
     * @param manufacturer is the company name who manufactured the product
     * @param modelName consists of the model name
     * @param modelYear is the year when the product was created
     * @param specificationsPage is a link to the Aircraft specifications
     * 
     */
    public Aircraft(String manufacturer, String modelName, int modelYear, String specsPage)
    {
        // initialise instance variables
        setManufacturer(manufacturer);
        setModelName(modelName);
        setModelYear(modelYear);
        setSpecsPage(specsPage);
    }

    /**
     * Accessor
     * 
     * @return the manufacturer name
     * 
     */

    public String getManufacturer(){
        return this.manufacturer;
    }

    /**
     * Mutator
     *
     * @param  theManufacturer sets the manufacturers name
     */
    public void setManufacturer(String theManufacturer)
    {
        // put your code here
        if(theManufacturer != null && theManufacturer.equals("")){
            manufacturer = theManufacturer;
        } if(theManufacturer == null){
            throw new IllegalArgumentException("The Manufacturer is not valid.");
        }
        else {
            throw new IllegalArgumentException("The Manufacturer is not set.");
        }

    }

    /**
     * Accessor
     * 
     * @return the model name of the Aircraft
     * 
     */

    public String getModelName(){
        return this.modelName;
    }

    /**
     * Mutator
     *
     * @param  theModelName is the model name of the Aircraft
     */
    public void setModelName(String theModelName)
    {
        // put your code here
        if(theModelName != null && theModelName != ""){
            modelName = theModelName;
        }
        else {
            throw new IllegalArgumentException("The " + theModelName + " is not valid.");
        }

    }

    /**
     * Accessor
     * 
     * @return the model year of the Aircraft
     * 
     */

    public int getModelYear(){
        return this.modelYear;
    }

    /**
     * Mutator
     *
     * @param  theModelYear is the year of the model
     * 
     */
    public void setModelYear(int theModelYear)
    {
        // put your code here
        if((theModelYear>=EARLIEST_YEAR) && (theModelYear<=LATEST_YEAR)){
            modelYear = theModelYear;
        }
        else if (theModelYear<EARLIEST_YEAR) {
            throw new IllegalArgumentException("Sorry, the model year " + theModelYear + " is too old.");
        }
        else {
            throw new IllegalArgumentException("Sorry, the model year " + theModelYear + " is in the future.");
        }

    }

    /**
     * Accessor
     * 
     * @return the number of engines in the Aircraft
     * 
     */

    public int getNumEngines(){
        return this.numEngines;
    }

    /**
     * Mutator
     *
     * @param  theNumberOfEngines is the number of engines in the Aircraft
     * 
     */
    public void setNumEngines(int theNumEngines)
    {
        // put your code here
        if((theNumEngines>=MIN_ENGINES) && (theNumEngines<=MAX_ENGINES)){
            numEngines = theNumEngines;
        }
        else if (theNumEngines<MIN_ENGINES) {
            throw new IllegalArgumentException("Sorry, " + theNumEngines + " is too few engines for an aircraft.");
        }
        else if (theNumEngines>MAX_ENGINES){
            throw new IllegalArgumentException("Sorry, " + theNumEngines + " is too many engines for an aircraft.");
        }
        else {
            throw new IllegalArgumentException("Sorry, " + theNumEngines + " is too many engines for an aircraft.");
        }

    }

    /**
     * Accessor
     * 
     * @return the number of engines in the Aircraft
     * 
     */

    public Boolean isJet(){
        return this.jet;
    }

    /**
     * Mutator
     *
     * @param  theJet checks to see if the Aircraft is a jet or not
     * 
     */
    public void setJet(boolean theJet)
    {
        // put your code here
        if(theJet){
            jet = theJet;
        }
    }

    /**
     * Accessor
     * 
     * @return the number of engines in the Aircraft
     * 
     */

    public String getSpecsPage(){
        return this.specsPage;
    }

    /**
     * Mutator
     *
     * @param theSpecificationsPage is a link to the specifications of the Aircraft
     * 
     */
    public void setSpecsPage(String theSpecsPage)
    {
        // put your code here
        if(theSpecsPage != null && !theSpecsPage.equals("")){
            specsPage = theSpecsPage;
        } 
        else {
            throw new IllegalArgumentException("The Specifications Page is not valid.");
        }
    }
    
    public String getAircraftDetails()
    {
       if(jet){
           if(numEngines>1){
            return(modelYear + " " + modelName + " manufactured by " + manufacturer + " with " + numEngines + " engine. Specifications are available at " + specsPage);
           }
           else {
            return(modelYear + " " + modelName + " manufactured by " + manufacturer + " with " + numEngines + " engines. Specifications are available at " + specsPage);
           }
           
       }
       else {
           return(modelYear + " " + modelName + " manufactured by " + manufacturer + " with " + numEngines + " engine. Specifications are available at " + specsPage);
       }
    }

}
