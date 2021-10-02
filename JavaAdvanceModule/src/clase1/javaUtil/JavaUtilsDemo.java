package clase1.javaUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/**
 * Implementación de una agenda de 365 dias que guarda una lista de determinadas actividades, por fecha, por
 * 365 dias del year
 * 
 * @author Eduardo Rasgado Ruiz
 *
 */
public class JavaUtilsDemo {
	
	private static List<String> activities = Arrays.asList(
			new String[]
			{
				"Estudiar",
				"Programar",
				"Entrenar",
				"Socializar",
				"Nadar",
				"Viajar",
				"Trabajar",
				"Leer",
				"Hacer las compras",
				"Aprender a cocinar",
				"Dibujar"
			});
	private static Random generator;

	/**
	 * Tarea 1:
		Crear la clase demoUtil.java
		Investigar alguna clase del package java.util
		Implementar alguna clase y alguno de sus métodos
	 * @param args
	 */
	public static void main(String[] args) {
		short daysInAYear = 365;
		Map<Date, List<String>> agenda  = new HashMap<Date, List<String>>();
		
		Calendar calendarInstance = GregorianCalendar.getInstance();
		Calendar date = new GregorianCalendar(2021, 0, 1);
		
		System.out.println("---------------- INITIALIZING AGENDA DATES(" + daysInAYear +" days)-------------------");
		for(int i = 0; i < daysInAYear; i++) {
			date.add(
					Calendar.DAY_OF_YEAR, 
					1);
			
			agenda.put(
					date.getTime(), 
					new ArrayList<>());
			
			System.out.println(
					"Date: [" 
					+ date.getTime() 
					+ "] Added Automatically");
		}
		
		System.out.println("----------------------------------------------------------------------------\n");

		agenda.keySet().forEach(agendaDate -> {
			agenda
				.get(agendaDate)
				.addAll(getActivityList(agendaDate));
		});
		
		System.out.println("============ LISTING AGENDA ACTIVITIES ============\n");
		
		agenda.keySet().forEach(agendaDate -> {
			calendarInstance.setTime(agendaDate);
			
			System.out.println(
				"\n[Activity for " 
				+ calendarInstance.get(Calendar.DAY_OF_MONTH) 
				+ " of " 
				+ calendarInstance.getDisplayName(
					Calendar.MONTH, 
					Calendar.LONG, 
					Locale.ENGLISH)
				+ " of "
				+ calendarInstance.get(Calendar.YEAR));
			
			agenda.get(agendaDate)
				.forEach(activity -> 
					System.out.println(
							"	[*] " 
							+ activity));
		});
		
		System.out.println("End of agenda");
	}
	
	private static ArrayList<String> getActivityList(Date seed) {
		int activityLength = activities.size();
		ArrayList<String> activityList = new ArrayList<>();
		
		generator = new Random(seed.toInstant().getEpochSecond());
		int randomListSize = generator.nextInt(activityLength);
		
		for(int i = 0; i < randomListSize + 1; i++) {
			String activityToAdd = null;
			
			do {
				activityToAdd = activities.get(generator.nextInt(activityLength));
			} while(activityList.contains(activityToAdd));
			
			activityList.add(activityToAdd);
		}
		
		return activityList;
	}
}
