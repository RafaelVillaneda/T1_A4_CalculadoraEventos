import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.math.*;
import java.util.Arrays;
class CalculadoraBuena extends JFrame implements ActionListener{
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
	JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
	JButton btnSuma,btnResta,btnMultplicacion,btnDivicion,btnCuadrado,btnunosobreX,btnRaiz,btnPorcentaje,btnIgual;
	JButton btnCe,btnC,btnBorrar,btnPunto;
	String operacion="",operacion2="",operacionRealizar;
	JLabel resultado;
	double totalA;
	JTextField res;
	public CalculadoraBuena() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad 4");
		//setSize(650,475);	
		setLocationRelativeTo(null);
		setVisible(true);
		btnSuma=new JButton("+");
		btnSuma.addActionListener(this);
		btnResta=new JButton("-");
		btnResta.addActionListener(this);
		btnMultplicacion=new JButton("*");
		btnMultplicacion.addActionListener(this);
		btnDivicion=new JButton("/");
		btnDivicion.addActionListener(this);
		btnCuadrado=new JButton("χ²");
		btnCuadrado.addActionListener(this);
		btnRaiz=new JButton("√");
		btnRaiz.addActionListener(this);
		btnIgual=new JButton("=");
		btnIgual.addActionListener(this);
		btnunosobreX=new JButton("1/x");
		btnunosobreX.addActionListener(this);
		btnPorcentaje=new JButton("%");
		btnPorcentaje.addActionListener(this);
		btnCe=new JButton("Ce");
		btnCe.addActionListener(this);
		btnC=new JButton("C");
		btnC.addActionListener(this);
		btnBorrar=new JButton("<-");
		btnBorrar.addActionListener(this);
		btnPunto=new JButton(".");
		btnPunto.addActionListener(this);
		
		num0=new JButton("0");
		num0.addActionListener(this);
		num1=new JButton("1");
		num1.addActionListener(this);
		num2=new JButton("2");
		num2.addActionListener(this);
		num3=new JButton("3");
		num3.addActionListener(this);
		num4=new JButton("4");
		num4.addActionListener(this);
		num5=new JButton("5");
		num5.addActionListener(this);
		num6=new JButton("6");
		num6.addActionListener(this);
		num7=new JButton("7");
		num7.addActionListener(this);
		num8=new JButton("8");
		num8.addActionListener(this);
		num9=new JButton("9");
		num9.addActionListener(this);
		res=new JTextField(10);
		res.addActionListener(this);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 0, 1, 4, res);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 1, 1, 1, btnPorcentaje);
		llenado(GridBagConstraints.HORIZONTAL, 1, 1, 1, 1, btnRaiz);
		llenado(GridBagConstraints.HORIZONTAL, 2, 1, 1, 1, btnCuadrado);
		llenado(GridBagConstraints.HORIZONTAL, 3, 1, 1, 1, btnunosobreX);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 2, 1, 1, btnCe);
		llenado(GridBagConstraints.HORIZONTAL, 1, 2, 1, 1, btnC);
		llenado(GridBagConstraints.HORIZONTAL, 2, 2, 1, 1, btnBorrar);
		llenado(GridBagConstraints.HORIZONTAL, 3, 2, 1, 1, btnDivicion);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 3, 1, 1, num7);
		llenado(GridBagConstraints.HORIZONTAL, 1, 3, 1, 1, num8);
		llenado(GridBagConstraints.HORIZONTAL, 2, 3, 1, 1, num9);
		llenado(GridBagConstraints.HORIZONTAL, 3, 3, 1, 1, btnMultplicacion);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 4, 1, 1, num4);
		llenado(GridBagConstraints.HORIZONTAL, 1, 4, 1, 1, num5);
		llenado(GridBagConstraints.HORIZONTAL, 2, 4, 1, 1, num6);
		llenado(GridBagConstraints.HORIZONTAL, 3, 4, 1, 1, btnResta);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 5, 1, 1, num1);
		llenado(GridBagConstraints.HORIZONTAL, 1, 5, 1, 1, num2);
		llenado(GridBagConstraints.HORIZONTAL, 2, 5, 1, 1, num3);
		llenado(GridBagConstraints.HORIZONTAL, 3, 5, 1, 1, btnSuma);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 6, 1, 2, num0);
		llenado(GridBagConstraints.HORIZONTAL, 2, 6, 1, 1, btnPunto);
		llenado(GridBagConstraints.HORIZONTAL, 3, 6, 1, 1, btnIgual);
		
		pack();
	}
	public void llenado(int rellenado,int x, int y,int altura,int largo,Component componente) {
		gbc.gridx= x;
		gbc.gridy=y;
		gbc.gridheight=altura;
		gbc.gridwidth=largo;
		gbc.fill=rellenado;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==num1) {
			operacion=operacion+"1";
			res.setText(operacion);
		}else if(e.getSource()==num2) {
			operacion=operacion+"2";
			res.setText(operacion);
		}else if(e.getSource()==num3) {
			operacion=operacion+"3";
			res.setText(operacion);
		}else if(e.getSource()==num4) {
			operacion=operacion+"4";
			res.setText(operacion);
		}else if(e.getSource()==num5) {
			operacion=operacion+"5";
			res.setText(operacion);
		}else if(e.getSource()==num6) {
			operacion=operacion+"6";
			res.setText(operacion);
		}else if(e.getSource()==num7) {
			operacion=operacion+"7";
			res.setText(operacion);
		}else if(e.getSource()==num8) {
			operacion=operacion+"8";
			res.setText(operacion);
		}else if(e.getSource()==num9) {
			operacion=operacion+"9";
			res.setText(operacion);
		}else if(e.getSource()==num0) {
			operacion=operacion+"0";
			res.setText(operacion);
		}else if(e.getSource()==num2) {
			operacion=operacion+"2";
			res.setText(operacion);
		}else if(e.getSource()==btnCuadrado) {
			double x=0.0;
			x=Double.parseDouble(operacion);
			x=Math.pow(x, 2);
			res.setText(String.valueOf(x));
			operacion=String.valueOf(x);
			operacionRealizar="X";
			operacion=String.valueOf(x);
		}else if(e.getSource()==btnRaiz) {
			double x=0.0;
			x=Double.parseDouble(operacion);
			x=Math.sqrt(x);
			res.setText(String.valueOf(x));
			operacion=String.valueOf(res);
			operacionRealizar="√";
			operacion=String.valueOf(x);
		}else if(e.getSource()==btnunosobreX) {
			double x=0.0;
			x=Double.parseDouble(operacion);
			x=1/x;
			res.setText(String.valueOf(x));
			operacionRealizar="1/x";
			operacion=String.valueOf(x);
		}else if(e.getSource()==btnPorcentaje) {
			if(operacion2.equalsIgnoreCase("")) {
			operacion2=operacion;
			operacion="";
			operacionRealizar="%";
			}else {
				double x=0.0;
				x=Double.parseDouble(operacion)% Double.parseDouble(operacion2);
				operacion2=String.valueOf(x);
				operacion="";
				res.setText(operacion);
			}
		}else if(e.getSource()==btnDivicion) {
			if(operacion2.equalsIgnoreCase("")) {
			operacion2=operacion;
			operacion="";
			operacionRealizar="/";
			}else {
				double x=0.0;
				x=Double.parseDouble(operacion) / Double.parseDouble(operacion2);
				operacion2=String.valueOf(x);
				operacion="/";
				res.setText(operacion);
			}
		}else if(e.getSource()==btnSuma) {
			if(operacion2.equalsIgnoreCase("")) {
			operacion2=operacion;
			operacion="";
			operacionRealizar="+";
			}else {
				double x=0.0;
				x=Double.parseDouble(operacion) + Double.parseDouble(operacion2);
				operacion2=String.valueOf(x);
				operacion="+";
				res.setText(operacion);
			}
		}else if(e.getSource()==btnResta) {
			if(operacion2.equalsIgnoreCase("")) {
			operacion2=operacion;
			operacion="";
			operacionRealizar="-";
			}else {
				double x=0.0;
				x=Double.parseDouble(operacion) - Double.parseDouble(operacion2);
				operacion2=String.valueOf(x);
				operacion="";
				res.setText(operacion);
			}
		}else if(e.getSource()==btnMultplicacion) {
			if(operacion2.equalsIgnoreCase("")) {
				operacion2=operacion;
				operacion="";
				operacionRealizar="*";
				}else {
					double x=0.0;
					x=Double.parseDouble(operacion) * Double.parseDouble(operacion2);
					operacion2=String.valueOf(x);
					operacion="";
					res.setText(operacion);
				}
		}else if(e.getSource()==btnIgual) {
			double num1,num2,res;
			if(operacion.length()>0 && operacion2.length()>0) {
			switch (operacionRealizar) {
			case "+":
				num1=Double.parseDouble(operacion);
				num2=Double.parseDouble(operacion2);
				res=num1+num2;
				operacion=String.valueOf(res);
				operacion2="";
				this.res.setText(operacion);
				break;
			case "-":
				num1=num2=0;
				num1=Double.parseDouble(operacion);
				num2=Double.parseDouble(operacion2);
				res=num2-num1;
				operacion=String.valueOf(res);
				operacion2="";
				this.res.setText(operacion);
				break;
			case "*":
				num1=num2=0;
				num1=Double.parseDouble(operacion);
				num2=Double.parseDouble(operacion2);
				res=num2*num1;
				operacion=String.valueOf(res);
				operacion2="";
				this.res.setText(operacion);
				break;
			case "/":
				num1=num2=0;
				num1=Double.parseDouble(operacion);
				num2=Double.parseDouble(operacion2);
				res=num2/num1;
				operacion=String.valueOf(res);
				operacion2="";
				this.res.setText(operacion);
				break;
			case "%":
				num1=num2=0;
				num1=Double.parseDouble(operacion);
				num2=Double.parseDouble(operacion2);
				res=num2%num1;
				operacion2="";
				operacion=String.valueOf(res);
				this.res.setText(operacion);
				break;
			case "√":
				num1=num2=0;
				num1=Double.parseDouble(operacion);
				res=Math.sqrt(num1);
				operacion=String.valueOf(res);
				this.res.setText(operacion);
				break;
			default:
				break;
			}
		}
		}else if(e.getSource()==btnCe) {
			operacion="";
			operacion2="";
			res.setText("");
		}else if(e.getSource()==btnC) {
			operacion="";
			res.setText(operacion);
		}else if(e.getSource()==btnBorrar) {
			int tam=operacion.length();
			if(tam>0) {
			operacion=operacion.substring(0, tam-1);
			}
			res.setText(operacion);
		}else if(e.getSource()==btnPunto) {
			operacion=operacion+".";
			res.setText(operacion);
		}
		
	}
	
}
public class PruebaCalcu {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CalculadoraBuena();
				
			}
		});

	}

}
