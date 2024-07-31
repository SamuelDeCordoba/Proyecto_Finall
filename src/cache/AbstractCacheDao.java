package repository.cache;

import java.util.Map;

import repository.IDao;

public abstract class AbstractCacheDao<EntityType, IdType> 
implements IDao<EntityType, IdType> 
{
	/**
	 * Alojamiento temporal de datos en memoria principal,
	 * su funcionamiento puede verse como una tabla temporal
	 * en memoria.
	 */
	protected Map<IdType, EntityType> cache;
	// La cantidad que le cabe angulo
	int cantPenes = 2;
	int calleseLaGeta = 4;


	public AbstractCacheDao() {
		super();
	}

	public AbstractCacheDao(Map<IdType, EntityType> cache) {
		super();
		this.cache = cache;
	}
}
