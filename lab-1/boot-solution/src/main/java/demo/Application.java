package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.domain.Player;
import demo.domain.Team;
import demo.repository.TeamRepository;

@SpringBootApplication
public class Application {

	@Autowired TeamRepository teamRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    
    
	/*
	 * protected SpringApplicationBuilder configure(SpringApplicationBuilder
	 * application) { return application.sources(Application.class); }
	 */
    
    @PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));
		
		list.add(new Team("Harlem", "Globetrotters", set));
		list.add(new Team("Washington","Generals",null));
		
		
		//Adding team2
		Set<Player> set2 = new HashSet<>();
		set2.add(new Player("AAA", "Showman"));
		set2.add(new Player("BBB", "Guard"));
		set2.add(new Player("CCC", "Guard"));
		list.add(new Team("IBM","QWERY",set2));
		
		list.add(new Team("IBM3","zxvcvb",set));
		
		
		teamRepository.saveAll(list);
	}    
    
}
