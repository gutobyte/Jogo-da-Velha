package jogo;

public class Checagem {
	boolean ganhadorX=false;
	boolean ganhadorO=false;
	boolean situacaoJogo=false;
	
	/* A CHECAGEM CONSISTE EM VERIFICAR SE HOUVE EMPATE */
	
	protected boolean empate(char jogo[][])
	{
		
		if(jogo[0][0]=='X' && jogo[0][1]=='X' && jogo[0][2]=='O' && jogo[1][0]=='O' && jogo[1][1]=='O' && jogo[1][2]=='X' 
				&& jogo[2][0]=='X' && jogo[2][1]=='X' && jogo[2][2]=='O')
		{
			
				return situacaoJogo=true;
			
		}
		else if(jogo[0][0]=='O' && jogo[0][1]=='O' && jogo[0][2]=='X' && jogo[1][0]=='X' && jogo[1][1]=='X' && jogo[1][2]=='O' 
				&& jogo[2][0]=='O' && jogo[2][1]=='O' && jogo[2][2]=='X')
		{
			
			return situacaoJogo=true;
			
		}
		
		else if(jogo[0][0]=='O' && jogo[0][1]=='X' && jogo[0][2]=='X' && jogo[1][0]=='X' && jogo[1][1]=='O' && jogo[1][2]=='O' 
				&& jogo[2][0]=='O' && jogo[2][1]=='X' && jogo[2][2]=='X')
		{
			
			return situacaoJogo=true;
			
		}
		else if(jogo[0][0]=='X' && jogo[0][1]=='O' && jogo[0][2]=='O' && jogo[1][0]=='O' && jogo[1][1]=='X' && jogo[1][2]=='X' 
				&& jogo[2][0]=='X' && jogo[2][1]=='O' && jogo[2][2]=='O')
		{
			
			return situacaoJogo=true;
			
		}
		else
		{
			return situacaoJogo=false;
		}
			
		
	}
	
	/* A CHECAGEM CONSISTE EM VERIFICAR SE HOUVE GANHO DO JOGADOR X */
	protected boolean ganhadorX(char jogo[][])
	{
		
		if(jogo[0][0]=='X' && jogo[0][1]=='X' && jogo[0][2]=='X')
		{
			return ganhadorX=true;
		}
		else if(jogo[1][0]=='X' && jogo[1][1]=='X' && jogo[1][2]=='X')
		{
			return ganhadorX=true;
		}
		else if(jogo[2][0]=='X' && jogo[2][1]=='X' && jogo[2][2]=='X')
		{
			return ganhadorX=true;
		}
		else if(jogo[0][0]=='X' && jogo[1][0]=='X' && jogo[2][0]=='X')
		{
			return ganhadorX=true;
		}
		else if(jogo[0][1]=='X' && jogo[1][1]=='X' && jogo[2][1]=='X')
		{
			return ganhadorX=true;
		}
		else if(jogo[0][2]=='X' && jogo[1][2]=='X' && jogo[2][2]=='X')
		{
			return ganhadorX=true;
		}
		else if(jogo[0][0]=='X' && jogo[1][1]=='X' && jogo[2][2]=='X')
		{
			return ganhadorX=true;
		}
		else if(jogo[2][0]=='X' && jogo[1][1]=='X' && jogo[0][2]=='X')
		{
			return ganhadorX=true;
		}
		return ganhadorX=false;
	}
	/* A CHECAGEM CONSISTE EM VERIFICAR SE HOUVE GANHO DO JOGADOR O */
	protected boolean ganhadorO(char jogo[][])
	{
		if(jogo[0][0]=='O' && jogo[0][1]=='O' && jogo[0][2]=='O')
		{
			return ganhadorO=true;
		}
		else if(jogo[1][0]=='O' && jogo[1][1]=='O' && jogo[1][2]=='O')
		{
			return ganhadorO=true;
		}
		else if(jogo[2][0]=='O' && jogo[2][1]=='O' && jogo[2][2]=='O')
		{
			return ganhadorO=true;
		}
		else if(jogo[0][0]=='O' && jogo[1][0]=='O' && jogo[2][0]=='O')
		{
			return ganhadorO=true;
		}
		else if(jogo[0][1]=='O' && jogo[1][1]=='O' && jogo[2][1]=='O')
		{
			return ganhadorO=true;
		}
		else if(jogo[0][2]=='O' && jogo[1][2]=='O' && jogo[2][2]=='O')
		{
			return ganhadorO=true;
		}
		else if(jogo[0][0]=='O' && jogo[1][1]=='O' && jogo[2][2]=='O')
		{
			return ganhadorO=true;
		}
		else if(jogo[2][0]=='O' && jogo[1][1]=='O' && jogo[0][2]=='O')
		{
			return ganhadorO=true;
		}	
		return ganhadorO=false;
	}

}
