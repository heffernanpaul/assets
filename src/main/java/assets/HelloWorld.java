package assets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

	@Autowired
	private RepositoryRepository repository;
	

	@RequestMapping("/")
    String home() {
        return repository.findAll().iterator().next().getName();
    }

    @RequestMapping("/bob")
    String bob(@RequestParam Integer id) {
        return repository.findOne(id).getName();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }
}
