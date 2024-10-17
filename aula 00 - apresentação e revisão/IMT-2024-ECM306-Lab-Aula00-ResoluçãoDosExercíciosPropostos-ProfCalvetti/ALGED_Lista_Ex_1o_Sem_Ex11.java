/*
 * ALGED - Lista Ex - 1o Sem - Ex11
 *
 *	C�lculo do Delta e das Ra�zes de uma equa��o do 2o. grau - Vari�veis Globais
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex11
{	//Abre classe
	//Declara��o das vari�veis globais
	public	static	String	sIO,sTitle;
	public	static	double	dA,dB,dC,dD,dR1,dR2;

	public static void main(String Args[])
	{	//Abre m�todo main
						
		//Tela inicial
		sTitle="ALGED-Ex11";
		sIO="C�lculo do Delta e das Ra�zes de uma equa��o do 2o. grau - Vari�veis Globais";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Chamada dos m�todos
		Digita_a();
		Digita_b();
		Digita_c();
		Calcula_e_mostra_delta();
		Calcula_e_mostra_raiz1();
		Calcula_e_mostra_raiz2();
		//Termina execu��o
      System.exit(0);
   }	//Fecha m�todo main

	public static void Digita_a()
	{	//Abre m�todo Digita_a
		sTitle="Equa��o do 2o. Grau - Digite";
		sIO="Valor de a:";
		dA=Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
	}	//Fecha m�todo Digita_a
	
	public static void Digita_b()
	{	//Abre m�todo Digita_b
		sTitle="Equa��o do 2o. Grau - Digite";
		sIO="Valor de b:";
		dB=Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
	}	//Fecha m�todo Digita_b

	public static void Digita_c()
	{	//Abre m�todo Digita_c
		sTitle="Equa��o do 2o. Grau - Digite";
		sIO="Valor de c:";
		dC=Double.parseDouble(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
	}	//Fecha m�todo Digita_c
	
	public static void Calcula_e_mostra_delta()
	{	//Abre m�todo Calcula_delta
		dD=Math.pow(dB,2)-4*dA*dC;
		sTitle="Equa��o do 2o. Grau - Resultado";
		sIO="Valor do Delta: "+dD;
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Calcula_delta
	
	public static void Calcula_e_mostra_raiz1()
	{	//Abre m�todo Calcula_e_mostra_ra�z1
		sTitle="Equa��o do 2o. Grau - Resultado";
		if(dD<0)	sIO="Delta < 0 - N�o existe ra�z real r1!";
		else
		{
			dR1=(-dB+Math.sqrt(dD))/(2*dA);
			sIO="Valor da ra�z r1: "+dR1;
		}
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Calcula_e_mostra_ra�z1

	public static void Calcula_e_mostra_raiz2()
	{	//Abre m�todo Calcula_e_mostra_ra�z2
		sTitle="Equa��o do 2o. Grau - Resultado";
		if(dD<0)	sIO="Delta < 0 - N�o existe ra�z real r2!";
		else
		{
			dR2=(-dB-Math.sqrt(dD))/(2*dA);
			sIO="Valor da ra�z r2: "+dR2;
		}
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Calcula_e_mostra_ra�z2
}	//Fecha classe

