import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {

	//R�cup�re la date sous le nom "date"
	Date date = new Date();
	
	/* Format de pr�sentation de la date */
	DateFormat formatDate = new SimpleDateFormat("yyyy/mm/dd");

	/* Obtention de la date */
	public String date()
	{
		String dateAct = formatDate.format(date);
		return dateAct;
	}

}
