package repository;

import java.util.List;

/**
 * Interface que define las operaciones básicas de
 * un objeto de acceso a datos.
 * 
 * @param <EntityType> El tipo de dato que se manejará mediante
 * el objeto de acceso a datos.
 * @param <IdType> El tipo de dato que representa el identificador
 * único de una instancia o registro de la entidad manejada.
 */
public interface IDao<EntityType, IdType> {

	/**
	 * Consulta todos los elementos existentes en sistema
	 * de almacenamiento.
	 * 
	 * @return List con todos los elementos encontrados.
	 */
	public List<EntityType> getAll();

	/**
	 * Inserta en el sistema de almacenamiento un elemento
	 * del tipo manejado en el objeto de acceso a datos
	 * que está implementando esta interface.
	 * 
	 * @param element El elemento que se pretende insertar en
	 * el sistema de almacenamiento, el tipo de este dato será
	 * definido por la clase que implemente los métodos de esta
	 * interface.
	 */
	public void insert(EntityType element);

	/**
	 * Consulta el elemento cuyo identificador coincide con el
	 * parámetro id. La respuesta debería ser un único elemento.
	 * 
	 * @param id El identificador único del elemento que se busca.
	 * @return Una instancia del elemento encontrado.
	 */
	public EntityType getByKey(IdType id);
}
