
import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
	Container contenedor;
	
	public Calculadora() {
		super("Calculadora");
		
		contenedor = this.getContentPane();
		contenedor.setLayout(new BorderLayout());
		
		
		//Panel para las dos primeras cosas
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(new JTextField("   0"), BorderLayout.CENTER);
		
		//Panel para el menú
		JPanel p0 = new JPanel();
		p0.setLayout(new FlowLayout());
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("Ver");
		JMenu m2 = new JMenu("Edición");
		JMenu m3 = new JMenu("Ayuda");
		JMenuItem jm1 = new JMenuItem("Estandar");
		JMenuItem jm2 = new JMenuItem("Científica");
		JMenuItem jm3 = new JMenuItem("Programador");
		m1.add(jm1);
		m1.add(jm2);
		m1.add(jm3);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		p0.add(mb);
		p1.add(p0, BorderLayout.WEST);
		
		//panel inferior del contenedor
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p1.add(p2, BorderLayout.SOUTH);
		
		//******panel a la izquierda del panel inferior
		JPanel p3 = new JPanel();
		p3.setLayout(new BorderLayout());
		p2.add(p3, BorderLayout.WEST);
		
		//para las tres opciones
		JPanel p4 = new JPanel();
		p4.setLayout(new BorderLayout());
		panel1 pp2 = new panel1();
		pp2.add(new JRadioButton("Sexages.", false)); 
		pp2.add(new JRadioButton("Radianes.", false));
		pp2.add(new JRadioButton("Cent.", false));
		p3.add(pp2, BorderLayout.NORTH);
		
		//para la parte izquierda debajo de las tres opciones
		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(5,5));
		JButton b1 = new JButton(" ");
		b1.setPreferredSize(new Dimension(60,1));
		p5.add(b1);
		JButton b2 = new JButton("Inv");
		b2.setPreferredSize(new Dimension(60,1));
		p5.add(b2);
		JButton b3 = new JButton("ln");
		b3.setPreferredSize(new Dimension(60,1));
		p5.add(b3);
		JButton b4 = new JButton("(");// U+0028
		b4.setPreferredSize(new Dimension(60,1));
		p5.add(b4);
		JButton b5 = new JButton(")"); // U+0029
		b5.setPreferredSize(new Dimension(60,1));
		p5.add(b5);
		JButton b6 = new JButton("Int");
		b6.setPreferredSize(new Dimension(60,1));
		p5.add(b6);
		JButton b7 = new JButton("sinh");
		b7.setPreferredSize(new Dimension(60,1));
		p5.add(b7);
		JButton b8 = new JButton("sin");
		b8.setPreferredSize(new Dimension(60,1));
		p5.add(b8);
		JButton b9 = new JButton("x^2");// x\\u00b2
		b9.setPreferredSize(new Dimension(60,1));
		p5.add(b9);
		JButton b10 = new JButton("n!");
		b10.setPreferredSize(new Dimension(60,1));
		p5.add(b10);
		JButton b11 = new JButton("dms");
		b11.setPreferredSize(new Dimension(60,1));
		p5.add(b11);
		JButton b12 = new JButton("cosh");
		b12.setPreferredSize(new Dimension(60,1));
		p5.add(b12);
		JButton b13 = new JButton("cos");
		b13.setPreferredSize(new Dimension(60,1));
		p5.add(b13);
		JButton b14 = new JButton("x^y");
		b14.setPreferredSize(new Dimension(60,1));
		p5.add(b14);
		JButton b15 = new JButton("x^(1/y)");
		b15.setPreferredSize(new Dimension(60,1));
		p5.add(b15);
		JButton b16 = new JButton("PI");//    U+03C0
		b16.setPreferredSize(new Dimension(60,1));
		p5.add(b16);
		JButton b17 = new JButton("tanh");
		b17.setPreferredSize(new Dimension(60,1));
		p5.add(b17);
		JButton b18 = new JButton("tan");
		b18.setPreferredSize(new Dimension(60,1));
		p5.add(b18);
		JButton b19 = new JButton("x^3");
		b19.setPreferredSize(new Dimension(60,1));
		p5.add(b19);
		JButton b20 = new JButton("x^(1/3)");
		b20.setPreferredSize(new Dimension(60,1));
		p5.add(b20);
		JButton b21 = new JButton("F-E");//    *
		b21.setPreferredSize(new Dimension(60,1));
		p5.add(b21);
		JButton b22 = new JButton("Exp");
		b22.setPreferredSize(new Dimension(60,1));
		p5.add(b22);
		JButton b23 = new JButton("Mod");
		b23.setPreferredSize(new Dimension(60,1));
		p5.add(b23);
		JButton b24 = new JButton("log");
		b24.setPreferredSize(new Dimension(60,1));
		p5.add(b24);
		JButton b25 = new JButton("10^x");
		b25.setPreferredSize(new Dimension(60,1));
		p5.add(b25);
		p3.add(p5, BorderLayout.CENTER);
		
		//******panel a la derecha del panel inferior
		JPanel p6 = new JPanel();
		p6.setLayout(new BorderLayout());
		p2.add(p6, BorderLayout.EAST);
		
		//panel arriba del panel de la derecha
		JPanel p7 = new JPanel();
		p7.setLayout(new GridLayout(4,5));
		JButton bb1 = new JButton("MC");
		bb1.setPreferredSize(new Dimension(57,1));
		p7.add(bb1);
		JButton bb2 = new JButton("MR");
		bb2.setPreferredSize(new Dimension(57,1));
		p7.add(bb2);
		JButton bb3 = new JButton("MS");
		bb3.setPreferredSize(new Dimension(57,1));
		p7.add(bb3);
		JButton bb4 = new JButton("M+");
		bb4.setPreferredSize(new Dimension(57,1));
		p7.add(bb4);
		JButton bb5 = new JButton("M-");
		bb5.setPreferredSize(new Dimension(57,1));
		p7.add(bb5);
		JButton bb6 = new JButton("BACK");
		bb6.setPreferredSize(new Dimension(57,1));
		p7.add(bb6);
		JButton bb7 = new JButton("CE");
		bb7.setPreferredSize(new Dimension(57,1));
		p7.add(bb7);
		JButton bb8 = new JButton("C");
		bb8.setPreferredSize(new Dimension(57,1));
		p7.add(bb8);
		JButton bb9 = new JButton("+/-");//U+00B1
		bb9.setPreferredSize(new Dimension(57,1));
		p7.add(bb9);
		JButton bb10 = new JButton("RAIZ");
		bb10.setPreferredSize(new Dimension(57,1));
		p7.add(bb10);
		JButton bb11 = new JButton("7");
		bb11.setPreferredSize(new Dimension(57,1));
		p7.add(bb11);
		JButton bb12 = new JButton("8");
		bb12.setPreferredSize(new Dimension(57,1));
		p7.add(bb12);
		JButton bb13 = new JButton("9");
		bb13.setPreferredSize(new Dimension(57,1));
		p7.add(bb13);
		JButton bb14 = new JButton("/");//   U+002F
		bb14.setPreferredSize(new Dimension(57,1));
		p7.add(bb14);
		JButton bb15 = new JButton("%");//  U+0025
		bb15.setPreferredSize(new Dimension(57,1));
		p7.add(bb15);
		JButton bb16 = new JButton("4");
		bb16.setPreferredSize(new Dimension(57,1));
		p7.add(bb16);
		JButton bb17 = new JButton("5");
		bb17.setPreferredSize(new Dimension(57,1));
		p7.add(bb17);
		JButton bb18 = new JButton("6");
		bb18.setPreferredSize(new Dimension(57,1));
		p7.add(bb18);
		JButton bb19 = new JButton("*");//    U+002A
		bb19.setPreferredSize(new Dimension(57,1));
		p7.add(bb19);
		JButton bb20 = new JButton("1/x");
		bb20.setPreferredSize(new Dimension(57,1));
		p7.add(bb20);
		p6.add(p7, BorderLayout.CENTER);
			
		//panel inferior del panel de la derecha
		JPanel p8 = new JPanel();
		p8.setLayout(new BorderLayout());
		p6.add(p8, BorderLayout.SOUTH);
		
		//panel de la izquierda del panel p8
		JPanel p9 = new JPanel();
		p9.setLayout(new BorderLayout());
		p8.add(p9, BorderLayout.WEST);
		
		//panel de la DERECHA del panel p8 donde está el =
		JPanel p10 = new JPanel();
		p10.setLayout(new BorderLayout());
		JButton bx = new JButton("=");
		bx.setPreferredSize(new Dimension(50,2));
		p10.add(bx);
		p8.add(p10, BorderLayout.CENTER);
		
		//panel superior del p9
		JPanel p11 = new JPanel();
		p11.setLayout(new GridLayout(1, 4));
		JButton bx2 = new JButton("1");
		//bx2.setPreferredSize(new Dimension(50,1));
		p11.add(bx2);
		JButton bx3 = new JButton("2");
		//bx3.setPreferredSize(new Dimension(50,1));
		p11.add(bx3);
		JButton bx4 = new JButton("3");
		//bx4.setPreferredSize(new Dimension(50,1));
		p11.add(bx4);
		JButton bx5 = new JButton("-");
		//bx5.setPreferredSize(new Dimension(50,1));
		p11.add(bx5);
		p9.add(p11, BorderLayout.CENTER);
		
		//Panel inferior de p9
		JPanel p12 = new JPanel();
		p12.setLayout(new BorderLayout());
		p9.add(p12, BorderLayout.SOUTH);
		
		//división de la izquierda del panel p12, donde está el 0
		JPanel p13 = new JPanel();
		p13.setLayout(new BorderLayout());
		JButton bx1 = new JButton("0");
		bx1.setPreferredSize(new Dimension(60,1));
		p13.add(bx1);
		p12.add(p13, BorderLayout.WEST);
		
		//divsión de la izquierda del panel p12
		JPanel p14 = new JPanel();
		p14.setLayout(new GridLayout(1, 2));
		JButton bx7 = new JButton(".");
		//bx7.setPreferredSize(new Dimension(50,1));
		p14.add(bx7);
		JButton bx8 = new JButton("+");
		//bx8.setPreferredSize(new Dimension(50,1));
		p14.add(bx8);
		p12.add(p14, BorderLayout.CENTER);
		
		contenedor.add(p1, BorderLayout.NORTH);
		contenedor.add(p2, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		c1.setTitle("CALCULADORA");
		c1.setSize(600,400);
		//para poner la ventana en el cetro de la pantalla
		c1.setLocationRelativeTo(null);  
		c1.setVisible(true);
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
//para dibujar un rectángulo
class panel1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(0, 0, 0, 0);
	}
}


