package service;

import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import config.CsvPaths;
import model.Bill;
import model.Turn;
import repository.cache.SuperCache;
import repository.csv.BillCsvDao;

public class InternalProcesses {

	// Miembros tipo método constructor.

	public InternalProcesses() {
		super();
	}


	// Miembros tipo método.

	/**
	 * Examina todas las facturas guardadas en caché, define las que
	 * ameritan premio y crea los turnos de premios con la información
	 * correspondiente del cliente.
	 */
	public PriorityQueue<Turn> enqueueAwards() {
		// Se consultan las rutas de los archivos csv.
		Map<String, String> paths = CsvPaths.getAllCsvPaths();

		// Se extraen todos los datos y se suben a caché.
		SuperCache superCache = loadCache(paths.get("bill"));

		// TODO: Escribir el código para generar los turnos y retornarlos.

		List<Bill> bills = superCache.getBillCacheDao().getAll();

		for(Bill bill: bills) {
			bill.getTotal();
		}
		return null;
	}

	/**
	 * Consulta todas las facturas en el archivo de facturas, y extrae
	 * los datos correspondientes a la factura, el vendedor, el cliente,
	 * los detalles de la factura y demás datos necesarios.
	 * 
	 * @param billsCsvPath un String con la ruta donde se encuentra alojado
	 * el archivo csv con toda la información de las facturas.
	 * @return La caché llena de todos los datos encontrados.
	 */
	public SuperCache loadCache(String billsCsvPath) {
		// Se consultan todas las facturas alojadas en el achivo csv general.
		BillCsvDao billCsvDao = new BillCsvDao(billsCsvPath);
		List<Bill> bills = billCsvDao.getAll();
		SuperCache superCache = new SuperCache();

		for(Bill bill: bills) {

			// Se extrae el cliente para guardarlo en caché.
			superCache.insertCustomer(bill.getCustomer());

			// TODO Extraer los demás datos para guardarlos en caché.
		}

		return superCache;
	}

	/**
	 * Explora todos los datos almacenados en la super caché a fin de
	 * guardarlos en los archivos csv correspondientes para Clientes,
	 * Empleados, Productos y todos los que sean necesarios.
	 * 
	 * @param superC La super caché que tiene los datos en memoria.
	 */
	public void saveInCsv(SuperCache superC) {
		// Todo ... Implementar método
	}

	/**
	 * Realiza toda la transformación general siguiendo los pasos
	 * descritos a continuación:
	 * 
	 * 1. Consulta las rutas de los archivos csv.
	 * 2. Cargar los datos en caché.
	 * 4. Guarda los datos en los archivos csv individuales.
	 */
	public void transformData() {

		// Se consultan las rutas de los archivos csv.
		Map<String, String> paths = CsvPaths.getAllCsvPaths();

		// Se extraen todos los datos y se suben a caché.
		SuperCache superC = loadCache(paths.get("bill"));

		// Se guardan los datos en archivos csv.
		saveInCsv(superC);
	}
}