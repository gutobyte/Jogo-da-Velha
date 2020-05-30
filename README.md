# Jogo-da-Velha

Um básico Jogo da Velha utilizando uma matriz 3x3 de tipo char.
Postei toda pasta do projeto, cairo queira compilar por conta propria basta copiar a pasta 'jogo' que representa o package e se encontra dentro de 'src'. A classe que possui o metodo 'main' é a Principal.java.
javac Principal.java 

O jogo não possui interface gráfica sendo rodado em prompt do Windows ou Terminal (GNU/Linux).

Funcionamento:

Player 1 - 'X'
Player 2 - 'O'

O que define as marcações são as letras A B C D E F G H I:

                     A B C
                     D E F
                     G H I
                     
OBS: Caso o jogador marque uma letra que não exista, a jogada é repetida, o mesmo vale se o jogador utilizar letras minusculas. Em caso do jogador querer marcar uma posição já marcada pelo adversário, o mesmo será avisado e a jogada repetida até que marque um quadrante certo ou que não tenha sido marcado.

