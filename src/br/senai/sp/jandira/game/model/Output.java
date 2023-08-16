package br.senai.sp.jandira.game.model;

public class Output {

    public void PrintPlayer(Player player) {

        // Printar Informações

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("------------------ Player -------------------");
        System.out.println("O nome do Player é: " + player.nome);
        System.out.println("A Skin do seu player é: " + player.skin);
        System.out.println("A vida do seu Player é: " + player.getLife());
        System.out.println("---------------------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

    }

    public void PrintEnemy(Enemy enemy){

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("------------------ Enemy -------------------");
            System.out.println("O nome do Enemy é: " + enemy.nome);
            System.out.println("A Skin do seu Enemy é: " + enemy.skin);
            System.out.println("A vida do seu Enemy é: " + enemy.getLife());
            System.out.println("---------------------------------------------");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

    }

}
