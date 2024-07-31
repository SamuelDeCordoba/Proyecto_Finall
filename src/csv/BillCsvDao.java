package repository.csv;

import java.util.LinkedList;
import java.util.List;
import model.Bill;

/**
 * Representa un objeto de acceso a datos, gestiona los datos
 * de la clase Bill la cual se puede ver como una factura.
 */
public class BillCsvDao extends AbstractCsvDao<Bill, Long> {

	public BillCsvDao() {
		super();
	}

	public BillCsvDao(String csvFilePath) {
		super();
		this.csvFilePath = csvFilePath;
	}

	@Override
	public List<Bill> getAll() {
		List<Bill> bills = new LinkedList<Bill>();

		// TODO Sección en que debe leerse el archivo csv y extraer los datos.

		return bills;
	}

	@Override
	public void insert(Bill element) {
		// TODO Sección en que debe guardarse los datos en el archivo csv.
	}

	@Override
	public Bill getByKey(Long id) {
		Bill bill = new Bill();
		// TODO Sección en que debe buscarse el elemento por su id.
		return bill;
	}
}