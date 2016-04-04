package assets;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssetRepository {

    @Id
    private int id;
    private String name;

    protected AssetRepository() {}

    public AssetRepository(String name) {
    	this.name = name;
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
    
    
}

