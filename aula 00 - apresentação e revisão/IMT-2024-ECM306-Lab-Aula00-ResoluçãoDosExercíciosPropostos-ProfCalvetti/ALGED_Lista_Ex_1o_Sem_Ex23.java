/*
 * ALGED - Lista Ex - 1o Sem - Ex23
 *
 *	Soma dos elementos de um vetor de tamanho N - Recursividade
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex23
{	
	public static void main(String Args[])
	{
		//Declara��o do vetor local
		int	iTAM=10;		//	<------------------------------- Alterar o tamanho do vetor aqui
		int	iVetor[]=new	int[iTAM];
		
		//Declara��o das vari�veis locais
		String	sIO,sTitle;
		int		iI,iSoma;
				
		//Tela inicial
		sTitle="ALGED-Ex23";
		sIO="Soma dos elementos de um vetor de tamanho "+iTAM+" - Recursividade";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);

		//Recebe vetor
		sTitle="Soma do Vetor - Entrada";
		for(iI=0;iI<iVetor.length;iI++)
		{
			sIO="Vetor["+iI+"]\nDigite o Elemento:";
			iVetor[iI]=Integer.parseInt(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}
		
		//Calcula
		iSoma=Soma(iVetor,iVetor.length-1);
				
		//Apresenta resultado
		sTitle="Soma do Vetor - Sa�da";
		sIO="O valor da soma do vetor digitado � "+iSoma+".";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
			
		//Termina execu��o
      System.exit(0);
		
   }//Fecha o m�todo main

	public	static	int	Soma(int	iVet[],int	iIndice)
	{
		if(iIndice>0)	return	iVet[iIndice]+Soma(iVet, iIndice-1);
		else				return	iVet[iIndice];
	}//Fecha o m�todo
	
}//Fecha a classe