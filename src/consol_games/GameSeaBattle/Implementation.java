package consol_games.GameSeaBattle;

import java.util.Random;

//  в классе Player, внизу(ниже 450 строки) оставлены образцы координат))
//  рекомендации по размежению шторки консоли(при запуске игры) указаны с расчетом на использование IntelliJ IDEA

public class Implementation {

    public static void main(String[] args) {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.printEmptyAndFirstText();
        System.out.println("---------------------------------------------------------------------------------------" +
                "\nДля удобства, рекомендуем поднять шторку консоли до начала изображаемого игрового поля.\n" +
                "---------------------------------------------------------------------------------------");
        player1.fillField();

        player2.printEmptyAndFirstText();
        player2.fillField();

        System.out.println("Начинаем боевые действия.\n" +
                "После нанесения первого удара, поднемите шторку косоли до начала 'текстового индикатора'");
        System.out.println(play(player1,player2));

    }

    public static String play(Player player1, Player player2){
        Random random = new Random();
        int a = random.nextInt(2)+1;
        if (a == 1){
            player1.striking(player2);
        } else {
            player2.striking(player1);
        }

        if (player2.getCountOfAllDecks() == 0){

            return "\n\n\n\n\n\n\n\n\n" +
                    "###### 'Player 1' выиграл! ######" +
                    "\nВсе корабли 'Player 2' поражены.";

        } else  if (player1.getCountOfAllDecks() == 0){

            return "\n\n\n\n\n\n\n\n\n" +
                    "###### 'Player 2' выиграл! ######" +
                 "\nВсе корабли 'Player 1' поражены.";

        } else {
            return "Ошибка";
        }

    }

    public static void print(FillCharacters[][] battlefield) {
        System.out.println();
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield.length; j++) {
                System.out.print(battlefield[i][j].getDesignation());
            }
            System.out.println();
        }
        System.out.println();
    }

}
