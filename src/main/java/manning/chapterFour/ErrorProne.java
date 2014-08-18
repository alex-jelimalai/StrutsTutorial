package manning.chapterFour;


/*
 * This action does nothing but throw an exception.  Every time.
 */

public class ErrorProne  
{
	public String execute() throws Exception{
		
		/*
		 * Encounter unforeseen problem in processing.
		 */
		
		throw new Exception ( "Routine Code Explosion");
		
	}

}
