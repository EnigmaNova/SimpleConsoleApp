import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String UPPERCASE = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String LOWERCASE = "qwertyuiopasdfghjklzxcvbnm";
    private static final String DIGITS = "1234567890";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+<>?";

    private final SecureRandom random = new SecureRandom();

    public String generate(int length, boolean up, boolean low, boolean dig, boolean special){
        StringBuilder password = new StringBuilder();
        StringBuilder pool = new StringBuilder();

        if(up){pool.append(UPPERCASE);}
        if(low){pool.append(LOWERCASE);}
        if(dig){pool.append(DIGITS);}
        if(special){pool.append(SPECIAL_CHARS);}

        if(pool.length() == 0){
            throw new IllegalArgumentException("Необходимо выбрать хотя бы одну категорию символов!");
        }

        for(int i = 0; i < length; i++){
            int rand = random.nextInt(pool.length());
            password.append(pool.charAt(rand));
        }
        return password.toString();
    }
}
