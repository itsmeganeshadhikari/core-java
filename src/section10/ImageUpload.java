package section10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageUpload extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	File file;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageUpload frame = new ImageUpload();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ImageUpload() {
		setTitle("Image Upload Demo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(
				new TitledBorder(null, "Image Upload Demo", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel picLbl = new JLabel("  Upload Photo");
		picLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser imgChooser = new JFileChooser();
				if (imgChooser.showOpenDialog(picLbl) == JFileChooser.APPROVE_OPTION) {
					file = imgChooser.getSelectedFile();
					ImageIcon icon = new ImageIcon(imgChooser.getSelectedFile().getPath());
					Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					picLbl.setIcon(new ImageIcon(image));
				}
			}
		});
		picLbl.setForeground(Color.BLUE);
		picLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		picLbl.setBounds(153, 27, 140, 87);
		contentPane.add(picLbl);

		JButton btnNewButton = new JButton("Upload Photo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imageUploadPath = "C:/Users/user/Desktop/java/";
				try {
					BufferedImage bi = ImageIO.read(file);
					ImageIO.write(bi, "JPG", new File(imageUploadPath + file.getName()));
					JOptionPane.showMessageDialog(ImageUpload.this, "Image is uploaded!!!");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(153, 151, 140, 23);
		contentPane.add(btnNewButton);
	}
}
