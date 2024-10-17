/*
 * ALGED - Lista Ex - 1o Sem - Ex16
 *
 *	Verifica se um n�mero digitado � par ou �mpar - M�todo com passagem de par�metros
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex16
{	
	public	static	void	main(String Args[])
	{	
		String	sIO,sTitle;
		String[]	sSN={"Sim","N�o"};
		int		iSN;
	
		int		iN,iResultado;
		
		//Tela inicial
		sTitle="ALGED-Ex16";
		sIO="Verifica se um n�mero digitado � par ou �mpar - M�todo com passagem de par�metros";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Digita��o do n�mero a ser analisado
		sTitle="Par ou Impar - Digite";
		sIO="N�mero a ser verificado:";
		iN=Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		
		//Chama o teste do n�mero
		iResultado=Par_ou_impar(iN);
		
		//Analisa resultado do teste do n�mero
		sIO="O n�mero digitado ("+iN+") � ";
		if(iResultado==0)	sIO+="Par";
		else	sIO+="�mpar";
		
		//Apresenta resultado
		sTitle="Par ou Impar - Resultado";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
		
		//Termina execu��o
      System.exit(0);
   }
	
	public	static	int	Par_ou_impar(int	iN)
	{
		return	iN%2;
	}
}
