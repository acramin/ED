/*
 * ALGED - Lista Ex - 1o Sem - Ex17
 *
 *	C�lculo do Delta e das Ra�zes de uma equa��o do 2o. grau - M�todos com passagem de par�metros
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex17
{	//Abre classe
	public static void main(String Args[])
	{	//Abre m�todo main
		//Declara��o das vari�veis locais
		String	sIO,sTitle;
		double	dA,dB,dC,dD,dR1,dR2;

		//Tela inicial
		sTitle="ALGED-Ex17";
		sIO="C�lculo do Delta e das Ra�zes de uma equa��o do 2o. grau - Passagem de Par�metros";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Digita a, b e c atrav�s das chamadas dos m�todos
		dA=Digita('a');
		dB=Digita('b');
		dC=Digita('c');
		
		//Calcula Delta atrav�s da chamada do m�todo
		dD=Delta(dA,dB,dC);
		
		//Apresenta resultado do c�lculo do Delta
		sTitle="Equa��o do 2o. Grau - Resultado";
		sIO="Delta="+dD;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
		
		//Apresenta resultado do c�lculo das Ra�zes
		if(dD<0)	sIO="N�o existem ra�zes reais para Delta < 0.";
		else
		{
			dR1=Raiz(1,dA,dB,dD);
			dR2=Raiz(2,dA,dB,dD);
			sIO="Raizes R1:"+dR1+" e R2:"+dR2;			
		}
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
		
		//Termina execu��o
      System.exit(0);

   }	//Fecha m�todo main

	public static double Digita(char	cX)
	{
		String	sTitle,sIO;
		
		sTitle="Equa��o do 2o. Grau - Digite";
		sIO="Valor de "+cX+":";
		return	Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
	}

	public static double Delta(double dA, double dB, double dC)
	{
		return	Math.pow(dB,2)-4*dA*dC;
	}
	
	public static double Raiz(int	iR,double dA, double dB, double dD)
	{
		if(iR==1)	return	(-dB+Math.sqrt(dD))/(2*dA);
		else			return	(-dB-Math.sqrt(dD))/(2*dA);
	}

}	//Fecha classe

