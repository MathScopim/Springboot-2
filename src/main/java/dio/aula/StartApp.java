package dio.aula;

import dio.aula.repository.UserRepository;
import model.User;

@Component
public class StartApp implements CommandLineRunner{
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Matheus");
        user.setUsername("Math");
        user.setPassword("dio7");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
