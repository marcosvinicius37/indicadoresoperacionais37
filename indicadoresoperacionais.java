import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class indicadoresoperacionais extends JFrame {
//Declaração das variáveis
    public static void main (String[] args) {
        int Idade= 2; int horastrabalhadas = 97; int musicas = 3; int numerodelikes = (int) 260.000;
//Primeiro exercício
        Idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua Idade: "));
//Uso do <
        if(Idade < 22) {
            JOptionPane.showMessageDialog(null,"Voce perde tempo fazendo coisas inúteis quando está livre");
        }
        else{
            JOptionPane.showMessageDialog(null,"Nossa você é velho!");
        }

        if(Idade != 1){
            JOptionPane.showMessageDialog(null,"Agora vamos ver se você é CLT");
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Você não entendeu nada né?");
            JOptionPane.showMessageDialog(null,"Deixa para lá, depois você aprende isso");
        }
//Segundo exercício
        horastrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de horas que você já trabalhou no mês"));
//Número de horas trabalhadas e uso do >
        if(horastrabalhadas > 54) {
            JOptionPane.showMessageDialog(null,"Você é um baita CLT");
        }
        else{
            JOptionPane.showMessageDialog(null,"Se esforce mais");
            JOptionPane.showMessageDialog(null,"Se continuar trabalhando poucou vai ser demitido");
        }
//Terceiro exercício
        musicas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de músicas favoritas suas: "));
//Declaração de personalidade após saber o número de músicas favoritas e uso do ==
        if(musicas == 5) {
            JOptionPane.showMessageDialog(null,"Você tem um gosto muito especifíco");
            JOptionPane.showMessageDialog(null,"Você gosta de muitas músicas");
          }
          else{
            JOptionPane.showMessageDialog(null,"Sua vida é triste");
          }
          //Quarto exercício
          musicas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de músicas que você odeia: "));
//Uso do >=
          if(musicas >=15) {
            JOptionPane.showMessageDialog(null,"Você odeia muita coisa aparentemente");
          }
          else{
            JOptionPane.showMessageDialog(null,"Você gosta de bastante música então");
          }
//Quinto exercício
          numerodelikes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de likes que sua musica favorita tem: "));
//Uso <=
          if( numerodelikes <= 3.000){
            JOptionPane.showMessageDialog(null,"Não conheço sua música");
          }
          else{
            JOptionPane.showMessageDialog(null,"Sua música deve/é muito boa");
          }
          JOptionPane.showMessageDialog(null,"Obrigado por responde este questionário");
    }
}


