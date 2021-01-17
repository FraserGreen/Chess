package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import model.ChessBoard;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame(ChessBoard board) {

		setBounds(192, 108, 1536, 864);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		add(new HeaderPanel(board), BorderLayout.NORTH);
		add(new ChessBoardPanel(board), BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
