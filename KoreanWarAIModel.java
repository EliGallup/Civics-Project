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
                    System.out.println("The Korean region contains roughly 70% mountains that provide natural defense.");
                    System.out.println("South Korea has heavy economic and industrial power, whereas North Korea has immense Nuclear Technology.");
                    System.out.println("Both North and South Korea serve as important buffer zones between the United State’s influence in asia and China’s influence. North Korea cooperates with China, whereas South Korea is influenced by the United States (similar to Japan).");
                    break;
                case "economy":
                    System.out.println("South Korea has more at stake if they enter a war, as they have a powerful economy and thriving social system. North Korea’s economy is lower, and life conditions are worse, meaning they don’t stand to lose as much if they're-engaged in military combat.");
                    System.out.println("North Korea is isolated and economically poor, whereas South Korea’s economy is booming. However, South Korea has an extremely low fertility rate, which will lead to a major decrease in the economy and population size.");
                    break;
                case "politics":
                    System.out.println("In North Korea, the current dictator Kim Jong-Un alone can make the decision to go to war. However, in South Korea, the democratic government would have to reach a common consensus. War would harm both countries and their political influence.");
                    System.out.println("People are more focused on defending their own country, rather than trying to retake land for glory. Since both countries believe the other is at fault for attacking first, both maintain defensive standpoints. Furthermore, since tensions have been ongoing for so long, there is more focus on daily life than political tensions between the two nations.");
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