package assets;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryRepository
	extends CrudRepository<AssetRepository, Integer> {

	    List<AssetRepository> findByName(String name);
}
