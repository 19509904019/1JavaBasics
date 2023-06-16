import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedSeconds;

    public StopWatch() {
        super("Stopwatch");

        // 创建UI组件
        timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 36));
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        // 添加事件处理器
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        // 设置布局
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(timeLabel);
        add(topPanel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(startButton);
        bottomPanel.add(stopButton);
        bottomPanel.add(resetButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // 初始化计时器
        timer = new Timer(1000, this);

        // 设置窗口属性
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            timer.start();
        } else if (e.getSource() == stopButton) {
            timer.stop();
        } else if (e.getSource() == resetButton) {
            elapsedSeconds = 0;
            updateLabel();
        } else if (e.getSource() == timer) {
            elapsedSeconds++;
            updateLabel();
        }
    }

    private void updateLabel() {
        int hours = elapsedSeconds / 3600;
        int minutes = (elapsedSeconds % 3600) / 60;
        int seconds = elapsedSeconds % 60;
        timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    public static void main(String[] args) {
        new StopWatch().setVisible(true);
    }
}