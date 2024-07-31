package repository.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Bill;

public class BillCacheDao extends AbstractCacheDao<Bill, Long> {

	public BillCacheDao() {
		super();
		this.cache = new HashMap<Long, Bill>();
	}

	public BillCacheDao(Map<Long, Bill> cache) {
		super(cache);
	}

	@Override
	public List<Bill> getAll() {
		return new ArrayList<Bill>(this.cache.values());
	}

	@Override
	public void insert(Bill element) {
		this.cache.put(element.getId(), element);
	}

	@Override
	public Bill getByKey(Long id) {
		return this.cache.get(id);
	}
}
