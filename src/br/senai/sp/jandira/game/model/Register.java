package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {
    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Player */
    Player player = new Player();

    /** Instancia Enemy*/
    Enemy enemy = new Enemy();

    public void BothRegister(){

        PlayerRegister();
        EnemyRegister();

    }

    public void PlayerRegister(){
        System.out.println("------------- Cadastro Player -------------");
        System.out.println("Qual é o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("----- Player Cadastrado com Sucesso ! -----");
    }
    public void EnemyRegister(){
        System.out.println("------------- Cadastro Enemy -------------");
        System.out.println("Qual é o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("----- Enemy Cadastrado com Sucesso ! -----");
            }
    public void Decision(){

        String decision;

        System.out.println("Seja Bem vindo!");
        System.out.println("Deseja cadastrar [Player - Enemy - Ambos]: ");
        decision = teclado.nextLine();

        switch (decision) {

            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                BothRegister();
                break;

            default:

                System.out.println(" Digite uma Opção Válida! ");
        }
    }
}
