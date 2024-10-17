/*
 * ALGED - Lista Ex - 1o Sem - Ex25
 *
 *	Busca linear em um vetor - Recursividade
 */
 
import	javax.swing.*;	

public class ALGED_Lista_Ex_1o_Sem_Ex25
{	
	public static void main(String Args[])
	{
		//Declara��o do vetor local
		int	iTAM=10;		// <----------------- Altere somente aqui o tamanho do Vetor 
		float	fVetor[]=new	float[iTAM];
		
		//Declara��o das vari�veis locais
		String	sIO,sTitle;
		int	iIndice;
		float	fNumero;
				
		//Tela inicial
		sTitle="ALGED-Ex25";
		sIO="Busca linear em um vetor - Recursividade";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
	
		//Recebe vetor
		sTitle="Busca Linear Recursiva - Entrada";
		for(iIndice=0;iIndice<fVetor.length;iIndice++)
		{
			sIO="Digite o elemento do Vetor["+iIndice+"]:";
			fVetor[iIndice]=Float.parseFloat(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));
		}
		
		//Recebe n�mero
		sIO="N�mero a ser localizado no vetor:";
		fNumero=Float.parseFloat(JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE));

		//Localiza n�mero no vetor
		iIndice=Busca(fVetor,0,fVetor.length-1,fNumero);
				
		//Apresenta resultado
		sTitle="Busca Linear Recursiva - Sa�da";
		sIO="O n�mero "+fNumero;
		if(iIndice<fVetor.length)	sIO+=" est� localizado no �ndice "+iIndice+" do vetor.";
		else	sIO+=" n�o est� localizado no vetor.";
		JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.INFORMATION_MESSAGE);
			
		//Termina execu��o
      System.exit(0);
   }//Fecha m�todo main

	public	static	int	Busca(float fVet[],int	iII, int iIF, float	fN)
	{
		if(iII<=iIF)	if(fN!=fVet[iII])	return	Busca(fVet,iII+1,iIF,fN);
		return	iII;
	}
	
}//Fecha classe
