/*
 * ALGED - Lista Ex - 1o Sem - Ex12
 *
 *	Verifica se um n�mero digitado � primo - Vari�veis Globais
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex12
{	//Abre classe
	//Declara��o das vari�veis globais
	public	static	String	sIO,sTitle;
	public	static	int	iN;

	public static void main(String Args[])
	{	//Abre m�todo main
						
		//Tela inicial
		sTitle="ALGED-Ex12";
		sIO="Verifica se o n�mero digitado � primo - Vari�veis Globais";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Chamada dos m�todos
		Digita_numero();
		Primo();

		//Termina execu��o
      System.exit(0);
   }	//Fecha m�todo main

	public static void Digita_numero()
	{	//Abre m�todo Digita_n�mero
		sTitle="N�meros primos - Digite";
		sIO="Valor de N (N>0):";
		do
		{
			iN=Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}while(iN<=0);
	}	//Fecha m�todo Digita_n�mero
	
	public static void Primo()
	{	//Abre m�todo Primo
		int	iI;
		sTitle="N�meros primos - Resultado";
		sIO="O n�mero "+iN+" � Primo.";
		for(iI=2;iI<iN;iI++)
		{
			if(iN%iI==0)
			{
				sIO="O n�mero "+iN+" n�o � Primo.";
				break;
			}			
		}
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
	}	//Fecha m�todo Primo
}	//Fecha classe
