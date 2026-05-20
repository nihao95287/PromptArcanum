import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PromptManager manager = new PromptManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("🚀 欢迎使用 AI 提示词管理工作台");

        while (true) {
            System.out.println("请选择：1. 创作新提示词  2. 查看历史回溯  3. 退出");
            System.out.print("> ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("输入提示词 (例如: 赛博朋克风格的城市): ");
                String content = scanner.nextLine();
                System.out.print("输入高级参数 (例如: --v 5 --ar 16:9): ");
                String params = scanner.nextLine();
                manager.addPrompt(content, params);
            } else if (choice.equals("2")) {
                manager.showHistory();
            } else if (choice.equals("3")) {
                System.out.println("退出系统。");
                break;
            } else {
                System.out.println("无效输入。");
            }
        }
        scanner.close();
    }
}