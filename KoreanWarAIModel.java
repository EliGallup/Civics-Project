import java.util.Scanner;

public class KoreanWarAIModel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I am 38th Parallel, your AI assistant for learning about the Korean War!\nThrough which lens do you want to learn about the Korean War?");
        System.out.println("Options:");
        System.out.println("History, Geography, Economy, Politics");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("quit")) {
            switch (input.toLowerCase()) {
                case "history":
                    System.out.println("The Korean War was a conflict between North Korea and South Korea from 1950 to 1953.");
                    System.out.println("North and South Korea used to be united under one nation, Korea. However, Japan brutally took over Korea during World War II");
                    System.out.println("After the War, the allied powers liberated Korea, with Communist Russia influencing the North, and the United States influencing the South.");
                    System.out.println("Before the war, small threats of guerilla infiltration occured. Tension was always present");
                    System.out.println("North and South Korea disagree on the past. North Korea claims South Korea attacked first (false cover-up by Kim Il Sung to maintain popularity), whereas South Koreans rightfully believe North Korea attacked first.");
                    break;
                case "geography":
                    System.out.println("The Korean Region holds rich minerals and access to the ocean, providing immense maritime access.");
                    break;
                case "economy":
                    System.out.println("The Korean War had significant economic impacts on both Koreas, leading to reconstruction efforts and international aid.");
                    break;
                case "politics":
                    System.out.println("The Korean War was a proxy conflict between the United States and China, reflecting the broader Cold War tensions.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose from History, Geography, Economy, or Politics.");
            }
            System.out.println("Please choose another lens to learn about the Korean War or type 'quit' to exit.");
            input = scanner.nextLine();
        }
        System.out.println("Thank you for learning about the Korean War! Goodbye!");
        scanner.close();
    }
}