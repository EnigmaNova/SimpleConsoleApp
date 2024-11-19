

public class App {
    private Dictoinary dictionary;
    private UserInput userInput;

    public App(){
        this.dictionary = new Dictoinary();
        this.userInput = new UserInput();
    }

    public void run(){
        boolean running = true;
        while(running){
            System.out.println("\n Dictionary menu");
            System.out.println("1. Add word");
            System.out.println("2. Find word");
            System.out.println("3. Update word");
            System.out.println("4. Delete word");
            System.out.println("5. Display all words");
            System.out.println("6. Exit");

            int choice = userInput.getInt();
            switch(choice){
                case 1 -> addWord();
                case 2 -> findWord();
                case 3 -> updateWord();
                case 4 -> deleteWord();
                case 5 -> dictionary.dispayAll();
                case 6 -> running = false;
                default -> System.out.println("invalid command");
            }
        }
    }

    private void addWord(){
        String key = userInput.getString();
        String value = userInput.getString();
        dictionary.addWord(key, value);
    }

    private void findWord(){
        String key = userInput.getString();
        dictionary.findWord(key);
    }

    private void updateWord(){
        String key = userInput.getString();
        String newValue = userInput.getString();
        dictionary.updateWord(key, newValue);
    }

    private void deleteWord(){
        String key = userInput.getString();
        dictionary.deleteWord(key);
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
