package config;

import java.util.HashMap;
import java.util.Map;

public class CsvPaths {

	public static Map<String, String> getAllCsvPaths() {
		HashMap<String, String> paths = new HashMap<>();

		/* Todas estas rutas deberían venir de un archivo de
		 * un archivo de configuraciones, sin embargo por ahora
		 * se definen las rutas quemadas o escritas en el código
		 * fuente debido a que el alcance del curso no contempla
		 * la enseñanza de archivos de configuración o también
		 * llamados archivos de properties.
		 */
		paths.put("bill", "C:/general.csv");
		paths.put("employee", "C:/employee.csv");
		paths.put("customer", "C:/customer.csv");

		return paths;
	}
}