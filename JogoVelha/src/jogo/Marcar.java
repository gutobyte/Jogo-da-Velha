package jogo;
import java.util.Scanner;

public class Marcar {
	
	
	char d;
	Scanner scan = new Scanner(System.in);
	
	public void decisaoMarcarO(char jogoReceber[][])
	{		
		
		d =scan.next().charAt(0);
		if(d=='A' || d=='B' || d=='C' || d=='D' || d=='E' || d=='F' || d=='G' || d=='H' || d=='I')
		{
		marcacaoO(jogoReceber, d);
		}
		else
		{
		foraO(jogoReceber);
		}
			
	}
	
	public void foraX(char jogoReceber[][])
	{
		System.out.println("POR FAVOR ESCOLHA APENAS DENTRO DO QUADRANTE DO TABULEIRO (A,B,C,D,E,F,G,H,I)");
		decisaoMarcarX(jogoReceber);
	}
	
	public void foraO(char jogoReceber[][])
	{
		System.out.println("POR FAVOR ESCOLHA APENAS DENTRO DO QUADRANTE DO TABULEIRO (A,B,C,D,E,F,G,H,I)");
		decisaoMarcarO(jogoReceber);
	}
	
	public void decisaoMarcarX(char jogoReceber[][])
	{		
		d =scan.next().charAt(0);
		if(d=='A' || d=='B' || d=='C' || d=='D' || d=='E' || d=='F' || d=='G' || d=='H' || d=='I')
			{
			marcacaoX(jogoReceber, d);
			}
		else
			{
			foraX(jogoReceber);
			}
		
	}
	
	
//   MARCAÇÃO DO JOGO X:
	//              A       B                C
	
	public void marcacaoX(char jogo[][], char posicao)
	{
		if(d=='A')
		{
			if(jogo[0][0]=='A')
			{
			jogo[0][0]='X';	
			}
			else
			{
				System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
				decisaoMarcarX(jogo);
			}
		}
		else if(d=='B')
		{
		
			if(jogo[0][1]=='B')
			{
				jogo[0][1]='X';	
			}
			else
			{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);
			}
		}
			else if(d=='C')
			{
				if(jogo[0][2]=='C')
				{
					jogo[0][2]='X';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);	
				}
			}
			
			//          D       E         F
			else if(d=='D')
			{
				if(jogo[1][0]=='D')
				{
					jogo[1][0]='X';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);
				}
			}
			else if(d=='E')
			{
				if(jogo[1][1]=='E')
				{
					jogo[1][1]='X';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);
				}
				
			}
			else if(d=='F')
			{
				if(jogo[1][2]=='F')
				{
					jogo[1][2]='X';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);
				}
			}
			
			//          G       H         I
			
			else if(d=='G')
			{
				
				if(jogo[2][0]=='G')
				{
					jogo[2][0]='X';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);
				}
				
			}
			else if(d=='H')
			{
				if(jogo[2][1]=='H')
				{
					jogo[2][1]='X';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);
				}
				
			}
			else if(d=='I')
			{
				if(jogo[2][2]=='I')
				{
					jogo[2][2]='X';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarX(jogo);
				}
			}
		
		
		
		}
	
//  MARCAÇÃO DO JOGO O:
	//              A       B                C
	
	public void marcacaoO(char jogo[][], char posicao)
	{
		if(d=='A')
		{
			if(jogo[0][0]=='A')
			{
			jogo[0][0]='O';	
			}
			else
			{
				System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
				decisaoMarcarO(jogo);
			}
		}
		else if(d=='B')
		{
			
				if(jogo[0][1]=='B')
				{
				jogo[0][1]='O';	
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);
				}
		}
		
			else if(d=='C')
			{
				if(jogo[0][2]=='C')
				{
					jogo[0][2]='O';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);	
				}
			}
			
			//          D       E         F
			else if(d=='D')
			{
				if(jogo[1][0]=='D')
				{
					jogo[1][0]='O';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);
				}
			}
			else if(d=='E')
			{
				if(jogo[1][1]=='E')
				{
					jogo[1][1]='O';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);
				}
				
			}
			else if(d=='F')
			{
				if(jogo[1][2]=='F')
				{
					jogo[1][2]='O';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);
				}
			}
			
			//          G       H         I
			
			else if(d=='G')
			{
				
				if(jogo[2][0]=='G')
				{
					jogo[2][0]='O';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);
				}
				
			}
			else if(d=='H')
			{
				if(jogo[2][1]=='H')
				{
					jogo[2][1]='O';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);
				}
				
			}
			else if(d=='I')
			{
				if(jogo[2][2]=='I')
				{
					jogo[2][2]='O';
				}
				else
				{
					System.out.println("O QUADRANTE ESCOLHIDO JÁ FOI MARCADO PELO ADVERSÁRIO, ESCOLHA OUTRO:");
					decisaoMarcarO(jogo);
				}
			}
		
		
		
		}
	
				}
	
	
	
	
	
	
	



