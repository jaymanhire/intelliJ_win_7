public class App {

    public static void main(String[] args) {

      // User websiteUser = new User.Builder("bobMax","bobM@gmail.com").build();

        User websiteUser = new User.Builder("bobMax","bobM@gmail.com").firstName("bob").lastName("Max").build();

        System.out.println(websiteUser);
    }
}
