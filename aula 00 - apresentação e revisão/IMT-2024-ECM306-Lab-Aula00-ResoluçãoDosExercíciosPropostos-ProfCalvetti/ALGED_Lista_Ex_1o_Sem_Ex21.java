/*
 * ALGED - Lista Ex - 1o Sem - Ex21
 *
 *	Fatorial - Recursividade
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex21
{	
	public static void main(String Args[])
	{
		//Declara��o das vari�veis locais
		String	sIO,sTitle;
		int	iNumero,iFatorial;
				
		//Tela inicial
		sTitle="ALGED-Ex21";
		sIO="C�lculo do Fatorial de um n�mero digitado - Recursividade";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Recebe n�mero
		sTitle="C�lculo do Fatorial - Entrada";
		sIO="N�mero (N>=0):";
		do
		{
			iNumero=Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}while(iNumero<0);

		//Calcula Fatorial
		iFatorial=Fatorial(iNumero);
				
		//Apresenta resultado
		sTitle="C�lculo do Fatorial - Sa�da";
		sIO="O Fatorial de "+iNumero+" � "+iFatorial+".";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
			
		//Termina execu��o
      System.exit(0);
   }

	public	static	int	Fatorial(int	iN)
	{
		if(iN>0)	return	iN*Fatorial(iN-1);
		else		return	1;
	}
}
