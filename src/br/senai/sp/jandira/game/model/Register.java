package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Player */
    Player player = new Player();

    /** Instancia Enemy*/
    Enemy enemy = new Enemy();

    /**
    * Instancia Output
    * */

    Output output = new Output();

    public void BothRegister(){

        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);

    }

    public void PlayerRegister(){
        System.out.println("------------- Cadastro Player -------------");
        System.out.println("Qual é o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("----- Player Cadastrado com Sucesso ! -----");

        if (validaPrint != 1) {
            // Printa as Informações cadastradas
            output.PrintPlayer(player);
        }

    }
    public void EnemyRegister(){
        System.out.println("------------- Cadastro Enemy -------------");
        System.out.println("Qual é o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("----- Enemy Cadastrado com Sucesso ! -----");

        if (validaPrint != 1) {
            // Printa as Informações cadastradas
            output.PrintEnemy(enemy);
        }
            }
    public void Decision(){

        String decision;

        System.out.println("Seja Bem vindo!");
        System.out.println("Deseja cadastrar [Player - Enemy - Ambos]: ");
        decision = teclado.nextLine();

        switch (decision) {
            case "Player" -> PlayerRegister();
            case "Enemy" -> EnemyRegister();
            case "Ambos" -> BothRegister();
            default -> System.out.println(" Digite uma Opção Válida! ");
        }
        System.out.println("Deseja cadastrar novamente [ 1 - SIM | 2 -  NÃO]: ");
        int continuar = teclado.nextInt();

        if (continuar==1){
            Decision();
        }
    }
}
