import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class jogoquiz {
        public static void main(String[] args) throws IOException {
            System.out.println("-----------------------------------------|");
            System.out.println("SEJAM BEM VINDOS(AS) AO QUESTIONADOS! :) |");
            System.out.println("Digite 5 para iniciar o menu!            |");
            System.out.println("-----------------------------------------|");
            System.out.print("Digite: ");
            // variável de opçoẽs
            //int numberaleat;
            int number;
            int opc;
            int anonasc1;
            int anonasc2;
            // variáveis de usuários
            String nome;
            String nome2;
            String snome;
            String spvar;
            String var1;
            String var2;
            // respostas multiplayer
            String r1 = "d";
            String rr1 = "d";
	    String r2 = "d";
            String rr2 = "d";
            String r3 = "c";
            String rr3 = "d";
            String r4 = "a";
            String rr4 = "a";
            String r5 = "a";
            String rr5 = "b";
            //respostas single - player
            String spr1 = "b";
            String spr2 = "c";
            String spr3 = "c";
            String spr4 = "a";
            String spr5 = "b";
            // variáveis de pontuaçoẽs de usuários
            int p1 = 0;
            int p2 = 0;
            int sp = 0;
            int n1;
            int cont;
            // criação de objetos
            //FileWriter writer = new FileWriter(new File("saida.txt"),true);
            //FileWriter writer = new FileWriter("saida.txt",true);
            //PrintWriter saida = new PrintWriter(writer);
            //PrintWriter saida = new PrintWriter(writer,true);
            //FileReader reader = new FileReader("saida.txt");
            //BufferedReader leitor = new BufferedReader(reader);
            //PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("saida.txt")));
            Scanner ent = new Scanner(System.in);
            Desempate pessoa = new Desempate();
            nascimento plone = new nascimento();
            nascimento2 pltwo = new nascimento2();
            //perdedor perdigao = new perdedor();
            opc = ent.nextInt();
            System.out.println("");
            while (opc == 5) {
            System.out.println("-----");
	    System.out.println("/MENU");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
	    System.out.println("1 - Jogar Multiplayer | 2 - Jogar Singleplayer | 3 - Sobre o Autor | 4 - Sobre o jogo | 0 - Encerrar sessão");
	    System.out.println("-------------------------------------------------------------------------------------------------------------------");
	    System.out.print("Digite: ");
            opc = ent.nextInt();
            switch (opc) {
             case 0:
             System.out.println("---------------------|");
             System.out.println("Sessão encerrada! :( |");
             System.out.println("---------------------|");
             break;
             }
	    while (opc == 4) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Sobre o jogo:");
	    System.out.println("");
            System.out.println("O jogo Questionados é um jogo de perguntas e respostas / Cada pergunta tem 4 alternativas de a) até d) sobre Redes de Computadores / Cada questão vale 5 pontos / O jogo suporta single player (1 jogador) e multiplayer (até 2 jogadores) / Caso de empate tem uma pergunta extra que vai ser sorteada para um dos jogadores responder");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("-----------------------------------------|");
	    System.out.println("5 - Voltar ao Menu | 0 - Encerrar sessão |");
            System.out.println("-----------------------------------------|");
	    System.out.print("Digite: ");
	    opc = ent.nextInt();
            switch (opc) {
             case 0:
            System.out.println("---------------------|");
            System.out.println("Sessão encerrada! :( |");
            System.out.println("---------------------|");
            break;
            }
            }
	    while (opc == 3) {
            Scanner obj = new Scanner(new File("sobreautor.txt"));
            for (cont=1; cont<=5; cont++) {
            System.out.println(obj.nextLine());
            }
            System.out.println("---------------------------------------------");
            //System.out.println("Sobre o Autor:                               |");
	    //System.out.println("                                             |");
            //System.out.println("Instituição FATEC Osasco                     |");
            //System.out.println("Tutor: Leandro Palha                         |");
	    //System.out.println("Nome: Gabriel Reis                           |");
            //System.out.println("Idade: 18 anos                               |");
	    //System.out.println("Nacionalidade: Brazil                        |");
	    //System.out.println("Cidade: SP                                   |");
            //System.out.println("Bairro: Interlagos                           |");
	    //System.out.println("Data de nascimento: 05/12/2000               |");
	    //System.out.println("Phone: (11) 96953-1226                       |");
            //System.out.println("E-mail: gabriel.coni@hotmail.com             |");
	    //System.out.println("---------------------------------------------|");
            System.out.println("");
            System.out.println("-----------------------------------------|");
	    System.out.println("5 - Voltar ao menu |0 -  Encerrar sessão |");
            System.out.println("-----------------------------------------|");
	    System.out.print("Digite: ");
            //System.out.print("Digite: ");
             opc = ent.nextInt();
            switch (opc) {
             case 0:
            System.out.println("---------------------|");
            System.out.println("Sessão encerrada! :( |");
            System.out.println("---------------------|");
            break;
            }
            }
	    while (opc == 1) {
                  System.out.println("");
                  System.out.println("------------------");
                  System.out.println("SESSÃO DE CADASTRO");
                  System.out.println("");
                  System.out.print("Digite o nome do player 1: ");
                  nome = ent.next();
                  System.out.println("");
                  System.out.print("Digite o ano de nascimento player 1: ");
                  anonasc1 = ent.nextInt();
                  System.out.println("");
                  System.out.print("Digite o nome do player 2: ");
                  nome2 = ent.next();
                  System.out.println("");
                  System.out.print("Digite o ano de nascimento player 2: ");
                  anonasc2 = ent.nextInt();
                  plone.calplone(anonasc1, nome);
                  pltwo.calpltwo(anonasc2, nome2);
                  //System.out.println(pessoa1.carrega1());
                  System.out.println("");
                  System.out.println("--------------------------------------------|");
                  System.out.println("PREPAREM - SE " + nome + " e " + nome2 + "! |");
          	  System.out.println("--------------------------------------------|");
                  int rodada = 1;
                  //n = (int) (Math.random()*5);
                  do {
                  if (rodada == 1) {
                  System.out.println("");
                  System.out.println("------------------------------ Rodada 1 ---------------------------------------------");
                  System.out.println("");
                  }
                  else
                  if (rodada == 2) {
                  System.out.println("");
                  System.out.println("------------------------------ Rodada 2 ---------------------------------------------");
                  System.out.println("");
                  }
                  else
                  if (rodada == 3) {
                  System.out.println("");
                  System.out.println("------------------------------ Rodada 3 ---------------------------------------------");
                  System.out.println("");
                  }
                  Scanner entquestionM = new Scanner(new File("questionM.txt"));
                  //n = (int) (Math.random()*5);
                  switch (n1=0) {
                  case 0:
                  System.out.println("");
                  System.out.println("------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Questão destinada a " + nome + "!");
                  System.out.println("");
                  for (cont=1; cont<=10; cont++) {
                  System.out.println(entquestionM.nextLine());
                  }
                  System.out.println("");
		  System.out.print("Digite a letra da resposta " + nome + ": ");
                  var1 = ent.next();
                  if (r1.equals(var1)) {
		   p1=p1+5;
                   System.out.println("");
                   System.out.println("Voce acertouu, Parabéns " + nome + "!");
		   System.out.println("Pontuação de " + nome + " = " + p1);
		    }
                    else {
                    System.out.println("");
                    System.out.println("Infelizmente voce errouu " + nome  + "!");
                    System.out.println("Pontuação de " + nome + " = " + p1);
                     }
                     System.out.println("");
                     System.out.println("--------------------------------------------------------------------");
                     System.out.println("Questão destinada a " + nome2 + "!");
                     System.out.println("");
                     for (cont=11; cont<=20; cont++) {
                     System.out.println(entquestionM.nextLine());
                     }
                     //cont=cont-cont;
                     System.out.println("");
                     System.out.print("Digite a letra da resposta " + nome2 + ": ");
                     var2 = ent.next();
                     if (rr1.equals(var2)) {
                     p2=p2+5;
                     System.out.println("");
                     System.out.println("Voce acertou, Parabéns " + nome2 + "!");
                     System.out.println("Pontuacão de " + nome2 + " = " + p2);
                      }
                      else {
                      System.out.println("");
                      System.out.println("Infelizmente voce errou " + nome2 + "!");
                      System.out.println("Pontuação de " + nome2 + " = " + p2);
                       }
                       //n = (int) (Math.random()*5);
                       case 1:
                       System.out.println("");
		       System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                       System.out.println("Questão destinada a " + nome + "!");
                       System.out.println("");
                       for (cont=21; cont<=30; cont++) {
                       System.out.println(entquestionM.nextLine());
                       }
                       //cont=cont-cont;
		       System.out.print("Digite a letra da resposta " + nome + ": ");
		       var1 = ent.next();
		       if (r2.equals(var1)) {
                        p1=p1+5;
                        System.out.println("");
                        System.out.println("Voce acertou, Parabéns " + nome + "!");
		        System.out.println("Pontuação de " + nome + " = " + p1);
		         }
                         else {
                       System.out.println("");
                       System.out.println("Infelizmente voce errou " + nome + "!");
		       System.out.println("Pontuação de " + nome + " = " + p1);
		        }
                        System.out.println("");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Questão destinada a " + nome2 + "!");
                        System.out.println("");
                        for (cont=31; cont<=40; cont++) {
                        System.out.println(entquestionM.nextLine());
                        }
                        //cont=cont-cont;
                        System.out.println("");
                        System.out.print("Digite a letra da resposta " + nome2 + ": ");
                        var2 = ent.next();
                        if (rr2.equals(var2)) {
                         p2=p2+5;
                         System.out.println("");
                         System.out.println("Voce acertou, Parabéns " + nome2 + "!");
                         System.out.println("Pontuação de " + nome2 + " = " + p2);
                          }
                          else {
                          System.out.println("");
                          System.out.println("Infelizmente voce errou " + nome2 + "!");
                          System.out.println("Pontuação de " + nome2 + " = " + p2);
                           }
                           //n = (int) (Math.random()*5);
                           case 2:
                           System.out.println("");
			   System.out.println("---------------------------------------------------------------");
                           System.out.println("Questão destinada a " + nome + "!");
                           System.out.println("");
                           for (cont=41; cont<=50; cont++) {
                           System.out.println(entquestionM.nextLine());
                           }
                           //cont=cont-cont;
                           System.out.println("");
			   System.out.print("Digite a letra da resposta " + nome + ": ");
			   var1 = ent.next();
			   if (r3.equals(var1)) {
			    p1=p1+5;
                            System.out.println("");
                            System.out.println("Voce acertou, Parabéns " + nome + "!");
			    System.out.println("Pontuação de " + nome + " = " + p1);
                             }
			     else {
                             System.out.println("");
                             System.out.println("Infelizmente voce errou " + nome + "!");
   			     System.out.println("Pontuação de  " + nome + " = " + p1);
			      }
                              System.out.println("");
                              System.out.println("----------------------------------------------------------------------------------------------------------------------------");
                              System.out.println("Questão destinada a " + nome2 + "!");
                              System.out.println("");
                              for (cont=51; cont<=60; cont++) {
                              System.out.println(entquestionM.nextLine());
                              }
                              //cont=cont-cont;
                              System.out.println("");
                              System.out.print("Digite a letra da resposta " + nome2 + ": ");
                              var2 = ent.next();
                              if (rr3.equals(var2)) {
                               p2=p2+5;
                               System.out.println("");
                               System.out.println("Voce acertou, Parabéns " + nome2 + "!");
                               System.out.println("Pontuação de " + nome2 + " = " + p2);
                                }
                                else {
                                System.out.println("");
                                System.out.println("Infelizmente voce errou " + nome2 + "!");
                                System.out.println("Pontuação de " + nome2 + " = " + p2);
                                 }
                                 //n = (int) (Math.random()*5);
                                 case 3:
                                 System.out.println("");
			         System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                                 System.out.println("Questão destinada a " + nome + "!");
                                 System.out.println("");
                                 for (cont=61; cont<=70; cont++) {
                                 System.out.println(entquestionM.nextLine());
                                 }
                                 //cont=cont-cont;
                                 System.out.println("");
			         System.out.print("Digite a letra da resposta " + nome + ": ");
			         var1 = ent.next();
			         if (r4.equals(var1)) {
			         p1=p1+5;
                                 System.out.println("");
                                 System.out.println("Voce acertou, Parabéns " + nome + "!");
			         System.out.println("Pontuação de " + nome + " = " + p1);
                                  }
                                  else {
                                  System.out.println("");
                                  System.out.println("Infelizmente voce errou " + nome + "!");
			          System.out.println("Pontuação de " + nome + " = " + p1);
			           }
                                   System.out.println("");
                                   System.out.println("-------------------------------------------");
                                   System.out.println("Questão destinada a " + nome2 + "!");
                                   System.out.println("");
                                   for (cont=71; cont<=80; cont++) {
                                   System.out.println(entquestionM.nextLine());
                                   }
                                   //cont=cont-cont;
                                   System.out.println("");
                                   System.out.print("Digite a letra da resposta " + nome2 + ": ");
                                   var2 = ent.next();
                                   if (rr4.equals(var2)) {
                                   p2=p2+5;
                                   System.out.println("");
                                   System.out.println("Voce acertou, Parabéns " + nome2 + "!");
                                   System.out.println("Pontuação de " + nome2 + " = " + p2);
                                   }
                                   else {
                                   System.out.println("");
                                   System.out.println("Infelizmente voce errou " + nome2 + "!");
                                   System.out.println("Pontuação de " + nome2 + " = " + p2);
                                    }
                                    //n = (int) (Math.random()*5);
                                    case 4:
                                    System.out.println("");
			            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("Questão destinada a " + nome + "!");
                                    System.out.println("");
                                    for (cont=81; cont<=90; cont++) {
                                    System.out.println(entquestionM.nextLine());
                                    }
                                    //cont=cont-cont;
                                    System.out.println("");
			            System.out.print("Digite a letra da resposta " + nome + ": ");
			            var1 = ent.next();
			            if (r5.equals(var1)) {
                                    p1=p1+5;
                                    System.out.println("");
                                    System.out.println("Voce acertou, Parabéns " + nome + "!");
			            System.out.println("Pontuação de " + nome + " = " + p1);
				    }
				    else {
                                    System.out.println("");
                                    System.out.println("Infelizmente voce errou " + nome + "!");
                                    System.out.println("Pontuação de " + nome + " = " + p1);
                                     }
                                     System.out.println("");
                                     System.out.println("----------------------------------------------------------------------------------------------------------------");
                                     System.out.println("Questão destinada a " + nome2 + "!");
                                     System.out.println("");
                                     for (cont=91; cont<=99; cont++) {
                                     System.out.println(entquestionM.nextLine());
                                     }
                                     //cont=cont-cont;
                                     System.out.println("");
                                     System.out.print("Digite a letra da resposta " + nome2 + ": ");
                                     var2 = ent.next();
                                     if (rr5.equals(var2)) {
                                      p2=p2+5;
                                      System.out.println("");
                                      System.out.println("Voce acertou, Parabéns " + nome2 + "!");
                                      System.out.println("Pontuação de " + nome2 + " = " + p2);
                                      }
                                      else {
                                      System.out.println("");
                                      System.out.println("Infelizmente voce errou");
                                      System.out.println("Pontuação de " + nome2 + " = " + p2);
                                      }
                                      }
                                      //n = (int) (Math.random()*5);
                                      rodada=rodada+1;
                                      } while (rodada < 1);
                                     if (p1 == p2) {
                                      System.out.println("");
                                      System.out.println("---------------------------------------------------");
                                      System.out.println(nome + " e " + nome2 + ", voces empataram, parabéns!");
                                      System.out.println("");
                                      System.out.println("Pontuação total de " + nome + ": " + p1);
                                      System.out.println("Pontuação total de " + nome2 + ": " + p2);
                                      System.out.println("");
                                      System.out.println("--------------------------------------------|");
                                      System.out.println("6 - Desempatar o jogo | 5 - Manter empatado |");
                                      System.out.println("--------------------------------------------|");
                                      System.out.print("Digite: ");
                                      opc = ent.nextInt();
                                      pessoa.calcula(opc,p1,p2,nome,nome2);
                                      //System.out.println(pessoa.carrega());
                                      }
                                     if (p1 > p2) {
                                      System.out.println("");
                                      System.out.println("--------------------------------------------");
                                      System.out.println("O player 1, " + nome + ", é o(a) vencedor(a)");
                                      System.out.println("Pontuação player 1: " + p1);
                                      System.out.println("");
                                      System.out.println("Pontuação Bonus = + 25 pontos");
                                      p1=p1+25;
                                      System.out.println("");
                                      System.out.println("Pontuação total de " + nome + ": " + p1);
                                      System.out.println("Pontuação total de " + nome2 + ": " + p2);
                                      System.out.println("");
                                      //Scanner manipArq1 = new Scanner(new File("rankingteste.txt"));
                                      //FileOutputStream arquivo = new FileOutputStream("rankingteste.txt");
                                      //FileWriter writer = new FileWriter(new File("saida.txt"), true);
                                      //FileWriter writer = new FileWriter(new File("saida.txt"));
                                      //PrintWriter saida = new PrintWriter(writer);
                                      //PrintWriter saida = new PrintWriter(writer, true);
                                      //saida.println("RANKING");
                                      //saida.println(nome + " " + p1);
                                      //saida.println(nome2 + " " + p2);
                                      //saida.close();
                                      //writer.close();
                                      //FileReader reader = new FileReader("saida.txt");
                                      //BufferedReader leitor = new BufferedReader(reader);
                                      //String linha = null;
                                      //boolean b = Boolean.getBoolean(linha);
                                      //while((linha = leitor.readLine())) {
                                      //System.out.println("Linha: " + linha);
                                      //}
                                      //leitor.close();
                                      //reader.close();
                                      //int conta;
                                      //for (conta=1; conta<=3; conta++) {
                                      //System.out.println(manipArq1.nextLine());
                                      //}
                                      System.out.println("------------------Ranking--------------------|");
                                      System.out.println("                                             |");
                                      System.out.println("1 first - " + nome + ", pontos: " + p1+"      ");
                                      System.out.println("2 second - " + nome2 + ", pontos: " + p2+"    ");
                                      System.out.println("                                             |");
                                      System.out.println("---------------------------------------------|");
                                      System.out.println(nome + "," + " Long live the champion!");
                                      System.out.println(nome2 + "," + " Game Over!");
                                      //perdigao.castigo(numberaleat);
                                      //System.out.println(perdigao.carregado());
                                      //switch (numberaleat) {
                                      //case 1:
                                      //System.out.println("");
                                      //System.out.println(nome2 + " pague 10 flexoẽs");
                                      //case 2:
                                      //System.out.println("");
                                      //System.out.println(nome2 + " emagreça 5kg");
                                      //case 3:
                                      //System.out.println("");
                                      //System.out.println(nome2 + " seu castigo é não ter castigo");
                                      //}
                                      }
                                      else {
                                      if (p2 > p1) {
                                      System.out.println("");
                                      System.out.println("---------------------------------------------");
                                      System.out.println("O player 2, " + nome2 + ", é o(a) vencedor(a)");
                                      System.out.println("Pontuação player 2: " + p2);
                                      System.out.println("");
                                      System.out.println("Pontuação Bonus = + 25 pontos");
                                      p2=p2+25;
                                      System.out.println("Pontuação de " + nome2 + " = " + p2);
                                      System.out.println("");
                                      System.out.println("Pontuação total de " + nome2 + ": " + p2);
                                      System.out.println("Pontuação total de " + nome + ": " + p1);
                                      System.out.println("");
                                      //
                                      //int conta;
                                      //
                                      System.out.println("----------------Ranking---------------------|");
                                      System.out.println("                                            |");
                                      System.out.println("1 first - " + nome2 + ", pontos: " + p2+"    ");
                                      System.out.println("2 second - " + nome + ", pontos: " + p1+"    ");
                                      System.out.println("                                            |");
                                      System.out.println("--------------------------------------------|");
                                      //System.out.println(nome2 + "," + " Long live the champion!");
                                      //Scanner manipArq1 = new Scanner(new File("lema2.txt"));
                                      //FileOutputStream arquivo = new FileOutputStream("lema2.txt");
                                      //PrintWriter manipArq = new PrintWriter(arquivo);
                                      //manipArq.println(lema2);
                                      //manipArq.close();
                                      //arquivo.close();
                                      //for (cont=1; cont<=1; cont++) {
                                      //System.out.println(manipArq1.nextLine());
                                      //}
                                      System.out.println(nome + "," + " Game Over!");
                                      }
                                      }
                                      p1=p1-p1;
                                      p2=p2-p2;
                                      System.out.println("");
                                      System.out.println("---------------------------------------------------------------------------");
                                      System.out.println("1 - Jogar novamente c/ 2 players | 5 - Voltar ao Menu | 0 - Encerrar sessão");
                                      System.out.println("---------------------------------------------------------------------------");
                                      System.out.print("Digite: ");
                                      opc = ent.nextInt();
                                      switch (opc) {
                                       case 0:
                                      System.out.println("---------------------|");
                                      System.out.println("Sessão encerrada! :( |");
                                      System.out.println("---------------------|");
                                      break;
                                      }
                                      }
                                      while (opc == 2) {
                                      System.out.println("");
                                      System.out.println("----------------------------");
                                      System.out.println("Voce escolheu ser solitário!");
                                      System.out.println("");
                                      System.out.print("Digite seu nome: ");
                                      snome = ent.next();
                                      System.out.println("-------------------------------------------------------");
                                      System.out.println("");
                                      System.out.println("PREPARE - SE " + snome + "!");
                                      System.out.println("");
                                      System.out.println("-------------------------------------------------------");
                                      System.out.println("Question 1 - Quantas camadas tem o modelo padrão TCP/IP");
                                      System.out.println("a) 3 camadas");
                                      System.out.println("b) 4 camadas");
                                      System.out.println("c) 7 camadas");
                                      System.out.println("d) 2 camadas");
                                      System.out.print("Digite a letra da resposta " + snome + ": ");
                                      spvar = ent.next();
                                      if (spr1.equals(spvar)) {
                                       System.out.println("");
                                       System.out.println("Voce acertou, Parabéns " + snome + "!");
                                       sp=sp+5;
                                       System.out.println("");
                                       System.out.println("Pontuação de " + snome + ": " + sp);
                                       }
                                       else {
                                       System.out.println("");
                                       System.out.println("Infelizmente voce errou " + snome + "!");
                                       System.out.println("");
                                       System.out.println("Pontuação de " + snome + ": " + sp);
                                       }
                                       System.out.println("");
                                       System.out.println("--------------------------------------------------");
                                       System.out.println("Question 2 - A qual camada pertence o protocolo IP");
                                       System.out.println("a) Enlace");
                                       System.out.println("b) Transporte");
                                       System.out.println("c) Rede");
                                       System.out.println("d) Física");
                                       System.out.print("Digite a letra da resposta " + snome + ": ");
                                       spvar = ent.next();
                                       if (spr2.equals(spvar)) {
                                        System.out.println("");
                                        System.out.println("Voce acertou, Parabéns " + snome + "!");
                                        sp=sp+5;
                                        System.out.println("");
                                        System.out.println("Pontuação de " + snome + ": " + sp);
                                        }
                                        else {
                                        System.out.println("");
                                        System.out.println("Infelizmente voce errou " + snome + "!");
                                        System.out.println("");
                                        System.out.println("Pontuação de " + snome + ": " + sp);
                                        }
                                        System.out.println("");
                                        System.out.println("-------------------------------------------------------------------------");
                                        System.out.println("Question 3 - Como é denominado o protocolo de configuração dinamica de IP");
                                        System.out.println("a) HTTP");
                                        System.out.println("b) FTP");
                                        System.out.println("c) DHCP");
                                        System.out.println("d) DNS");
                                        System.out.print("Digite a letra da resposta " + snome + ": ");
                                        spvar = ent.next();
                                        if (spr3.equals(spvar)) {
                                         System.out.println("");
                                         System.out.println("Voce acertou, Parabéns " + snome + "!");
                                         sp=sp+5;
                                         System.out.println("");
                                         System.out.println("Pontuação de " + snome + ": " + sp);
                                         }
                                         else {
                                         System.out.println("");
                                         System.out.println("Infelizmente voce errou " + snome + "!");
                                         System.out.println("");
                                         System.out.println("Pontuação de " + snome + ": " + sp);
                                         }
                                         System.out.println("");
                                         System.out.println("-----------------------------------------------------------------------------------------------------");
                                         System.out.println("Question 4 - Qual é o comando usado para alterar ou criar senhas de usuário em uma distribuição Linux");
                                         System.out.println("a) passwd");
                                         System.out.println("b) chmod");
                                         System.out.println("c) pass wd -l");
                                         System.out.println("d) useradd");
                                         System.out.print("Digite o letra da resposta " + snome + ": ");
                                         spvar = ent.next();
                                         if (spr4.equals(spvar)) {
                                          System.out.println("");
                                          System.out.println("Voce acertou, Parabéns " + snome + "!");
                                          sp=sp+5;
                                          System.out.println("");
                                          System.out.println("Pontuação de " + snome + ": " + sp);
                                          }
                                          else {
                                          System.out.println("");
                                          System.out.println("Infelizmente voce errou " + snome + "!");
                                          System.out.println("");
                                          System.out.println("Pontuação de " + snome + ": " + sp);
                                          }
                                          System.out.println("");
                                          System.out.println("---------------------------------------------------------------------------------------");
                                          System.out.println("Question 5 - Qual comando é usado para configurar permissões para arquivos e diretórios");
                                          System.out.println("a) chconfig");
                                          System.out.println("b) chmod");
                                          System.out.println("c) cd");
                                          System.out.println("d) passwd");
                                          System.out.print("Digite a letra da resposta " + snome + ": ");
                                          spvar = ent.next();
                                          if (spr5.equals(spvar)) {
                                           System.out.println("");
                                           System.out.println("Voce acertou, Parabéns " + snome + "!");
                                           sp=sp+5;
                                           System.out.println("");
                                           System.out.println("Pontuação de " + snome + ": " + sp);
                                           }
                                           else {
                                           System.out.println("");
                                           System.out.println("Infelizmente voce errou " + snome + "!");
                                           System.out.println("");
                                           System.out.println("Pontuação de " + snome + ": " + sp);
                                           }
                                           System.out.println("");
                                           System.out.println("Pontuação total = " + sp);
                                           sp=sp-sp;
                                           System.out.println("");
                                           System.out.println("------------------------------------------------------------------------------------|");
                                           System.out.println("2 - Jogar novamente como single - player | 5 - Voltar ao menu | 0 - Encerrar sessão |");
                                           System.out.println("------------------------------------------------------------------------------------|");
                                           System.out.print("Digite: ");
                                           opc = ent.nextInt();
                                           System.out.println("");
                                           switch (opc) {
                                            case 0:
                                           System.out.println("---------------------|");
                                           System.out.println("Sessão encerrada! :( |");
                                           System.out.println("---------------------|");
                                           break;
                                        }
                          }
                  }
	}
}
class Desempate {
   private int desemp1; int n; int vard1; int vard2; int rd1 = 1; int rd2 = 2; Scanner entD = new Scanner(System.in); String desemp2 = "Até a próxima!";
    void calcula(int opc, int p1, int p2, String nome, String nome2) {
     if (opc == 6) {
     n = (int) (Math.random()*2)+1;
     switch (n) {
     case 1:
     System.out.println("");
     System.out.println("--------------------------------------");
     System.out.println("O player 1 foi sorteado para responder");
     System.out.println("");
     System.out.println("Questão destinada a " + nome + ": ");
     System.out.println("");
     System.out.println("Questao *DESEMPATE*");
     System.out.println("Definição de computador: Computador é toda máquina que armazena dados, processa dados e faz cálculos!");
     System.out.println("");
     System.out.println("1) Verdadeiro");
     System.out.println("2) Falso");
     System.out.println("");
     System.out.print("Digite o número da resposta " + nome + ": ");
     vard1 = entD.nextInt();
     if (vard1 == rd1) {
     System.out.println("---------------------------");
     System.out.println("Voce acertou " + nome + "!");
     desemp1 = p1 + 5;
     System.out.println("");
     System.out.println("O player 1, " + nome + " é o(a) vencedor(a)!");
     System.out.println("");
     System.out.println("Pontuação de " + nome + ": " + desemp1 + " pontos");
     }
     else {
     System.out.println("-------------------------");
     System.out.println("Voce errou " + nome + "!");
     desemp1 = p2 + 5;
     System.out.println("");
     System.out.println("O player 2, " + nome2 + " é o(a) vencedor(a)!");
     System.out.println("");
     System.out.println("Pontuação de " + nome2 + ": " + desemp1 + " pontos");
     }
     break;
     case 2:
     System.out.println("");
     System.out.println("---------------------------------------");
     System.out.println("O player 2 foi sorteado para responder");
     System.out.println("");
     System.out.println("Questão destinada a " + nome2 + ": ");
     System.out.println("");
     System.out.println("Questão *DESEMPATE*");
     System.out.println("Assim como no windows, o linux também utiliza o internet explorer como browser!");
     System.out.println("");
     System.out.println("1) Verdadeiro");
     System.out.println("2) Falso");
     System.out.println("");
     System.out.print("Digite o número da resposta " + nome2 + ": ");
     vard2 = entD.nextInt();
     if (vard2 == rd2) {
     System.out.println("----------------------------");
     System.out.println("Voce acertou " + nome2 + "!");
     desemp1 = p2 + 5;
     System.out.println("");
     System.out.println("O player 2, " + nome2 + " é o(a) vencedor(a)!");
     System.out.println("");
     System.out.println("Pontuação de " + nome2 + ": " + desemp1 + " pontos");
     }
     else {
     System.out.println("--------------------------");
     System.out.println("Voce errou " + nome2 + "!");
     desemp1 = p1 + 5;
     System.out.println("");
     System.out.println("O player 1, " + nome + "é o(a) vencedor(a)");
     System.out.println("");
     System.out.println("Pontuação de " + nome + ": " + desemp1 + " pontos");
     }
      }
     }
   }
   //public String carrega() {
    //System.out.println("");
    //System.out.println("---------------");
    //return desemp2;
   //}
}
class nascimento {
   private int idade1;
    void calplone(int anonasc1, String nome) {
     idade1 = 2019 - anonasc1;
     if (idade1 < 18) {
     System.out.println("");
     System.out.println("Bom jogo pequeno, " + nome + "!");
     }
     else {
     if (idade1 >= 18 && idade1 <= 50) {
     System.out.println("");
     System.out.println("Bom jogo jovem, " + nome + "!");
     }
     }
     if (idade1 > 50) {
     System.out.println("");
     System.out.println("Bom jogo tiozinho, " + nome + "!");
     }
   }
}
class nascimento2 {
   private int idade2;
    void calpltwo(int anonasc2, String nome2) {
     idade2 = 2019 - anonasc2;
     if (idade2 < 18) {
     System.out.println("");
     System.out.println("Bom jogo pequeno, " + nome2 + "!");
     }
     else {
     if (idade2 >= 18 && idade2 <= 50) {
     System.out.println("");
     System.out.println("Bom jogo jovem, " + nome2 + "!");
     }
     }
     if (idade2 > 50) {
     System.out.println("");
     System.out.println("Bom jogo tiozinho, " + nome2 + "!");
     }
   }
}
//class perdedor {
  // private int number;
    //void castigo(int numberaleat) {
     //numberaleat = (int) (Math.random()*3)+1;
   //}
   //public int carregado() {
    //return numberaleat;
// }
//}

