package javaLevel2.lesson7.server;

public class AuthenticationService {

    private final UserRepository repository;

    public AuthenticationService(UserRepository repository) {
        this.repository = repository;
    }

    public User findUser(String login, String password) {
        return repository.findByLoginAndPassword(login, password).orElseThrow(
                () -> new RuntimeException("No user found with login " + login)
        );
    }


    /*private static final Set<Entry> entries = Set.of(
            new Entry("User1", "l1", "p1"),
            new Entry("User2", "l2", "p2"),
            new Entry("User3", "l3", "p3")
    );

    public Optional<Entry> findEntryByCredentials(String login, String password) {
        *//*
        Iterator<Entry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            if(next.getLogin().equals(login) && next.getPassword().equals(password)) {
                return Optional.of(next);
            }
        }
        return Optional.empty();
        *//*
        return entries.stream()
                .filter(entry -> entry.getLogin().equals(login) && entry.getPassword().equals(password))
                .findFirst();
    }*/

    /*public static class Entry{
        private String name;
        private String login;
        private String password;

        public Entry(String name, String login, String password) {
            this.name = name;
            this.login = login;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }
    }*/
}
