import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JuniorSeniorInteraction {
    public static void main(String[] args) {
        Map<String, String> seniorResponses = new HashMap<>();

        seniorResponses.put("How to prepare for exams?", "Creating a study schedule and staying consistent is essential.");
        seniorResponses.put("Any tips for time management?", "Prioritize tasks and use tools like calendars and to-do lists.");
        seniorResponses.put("How to choose a major?", "Consider your interests, career goals, and strengths.");
        seniorResponses.put("What's the best way to get internships?", "Networking and building a strong resume is key.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Junior-Senior Interaction Program!");
        System.out.println("Seniors, you can provide answers to junior's questions.");

        while (true) {
            System.out.print("\nJunior, please ask your question (or type 'exit' to end): ");
            String question = scanner.nextLine().trim();

            if (question.equalsIgnoreCase("exit")) {
                System.out.println("Interaction ended. Goodbye!");
                break;
            }

            if (seniorResponses.containsKey(question)) {
                String answer = seniorResponses.get(question);
                System.out.println("Senior's answer: " + answer);
            } else {
                System.out.println("No senior response available for this question. Please ask another question.");
            }
        }

        scanner.close();
    }
}
