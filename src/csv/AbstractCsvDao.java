package repository.csv;

import repository.IDao;

public abstract class AbstractCsvDao<EntityType, IdType>
implements IDao<EntityType, IdType>
{
	/**
	 * Ruta y nombre del archivo en que se encuentran alojados
	 * los datos que se pretenden cosultar, actualizar, insertar
	 * o eliminar.
	 */
	protected String csvFilePath;

	public AbstractCsvDao() {
		super();
	}

	public AbstractCsvDao(String csvFilePath) {
		super();
		this.csvFilePath = csvFilePath;
	}
}