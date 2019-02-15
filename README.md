*************** Homework Week1 Day4 *********************
1.  On the main activity, create a UI with the following:
      a)  A edit text for first name
      b)  A edit text for last name
      c)  A edit text for address
      d)  A edit text for city
      e)  A edit text for state
      f)   A edit text for postal code
      g)  A button to send the data to the next activity
 2.  Create an Second activity with text views for the info requested from the user in #1
 3.  The button will start the second activity
         a) Create an explicit intent that will be used to start the second activity
         b) pass the information with the intent using the following example:
                
                Intent secondActIntent = new Intent(......);
                secondActIntent.putExtra("first_name", firstNameStringValue);
                .....
                //start the activity with the secondActIntent
           
               //IN SECOND ACTIVITY
               Intent intentFromMain = getIntent()
               String firstNameFromMain = intent.getStringExtra( "first_name");
               ..
4.  Use Constraint Layout
5.  Use at least 4 different attributes in each type of view.


First activity


Second Activity


