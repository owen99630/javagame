import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/*
 * Created on 2006/02/24
 */

public class MainPanel extends JPanel {
    // �p�l���T�C�Y
    private static final int WIDTH = 240;
    private static final int HEIGHT = 240;
    // ��ʂɕ\�����镶����
    private String str;

    public MainPanel() {
        // �p�l���̐����T�C�Y��ݒ�Apack()����Ƃ��ɕK�v
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // �ϐ��̏�����
        str = "Hello World";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // (20,50)�̈ʒu��Hello World��`�悷��
        g.drawString(str, 20, 50);
    }
}