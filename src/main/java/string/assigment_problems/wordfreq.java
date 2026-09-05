import java.util.*;

class Main {
    static void printFilteredWordFrequency(String feedback) {
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");
        String[] words = feedback.split("\\s+");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            boolean stop = false;
            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    stop = true;
                }
            }

            if (!stop) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (map.get(list.get(i)) < map.get(list.get(j))) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (String word : list) {
            System.out.println(word + ": " + map.get(word));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter feedback:");
        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);
        sc.close();
    }
}