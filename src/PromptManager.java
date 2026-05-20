import java.util.ArrayList;
import java.util.List;

public class PromptManager {
    private List<Prompt> history;

    public PromptManager() {
        this.history = new ArrayList<>();
    }

    public void addPrompt(String content, String parameters) {
        Prompt newPrompt = new Prompt(content, parameters);
        history.add(newPrompt);
        System.out.println("✅ 成功保存至工作台历史！");
    }

    public void showHistory() {
        System.out.println("\n--- 📜 历史记录回溯 ---");
        if (history.isEmpty()) {
            System.out.println("暂无历史记录。");
            return;
        }
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i).toString());
        }
        System.out.println("----------------------\n");
    }
}