import java.time.LocalDateTime;

public class Prompt {
    private String content;
    private String parameters;
    private LocalDateTime timestamp;

    public Prompt(String content, String parameters) {
        this.content = content;
        this.parameters = parameters;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] 提示词: " + content + " | 参数: " + parameters;
    }
}