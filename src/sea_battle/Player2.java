package sea_battle;

public class Player2 extends Player {

    public Player2(String playerName) {
        super(playerName);
    }

}
/*
  неисправности, причину которых не смог найти:
   - если в условии цикла while стоит (scanner.hasNextLine()), то при внесении нескольких координат
   последняя не вносится
   работает только если добавить лишнюю строчку(у меня ".")
   -.....


                          Player 2
  Sea                *   *   *   *   *
  Battle   |.0.|.1.|.2.|.3.|.4.|.5.|.6.|.7.|.8.|.9.|

  |.0.|     .-. 0,1 .-. .-. .-. .-. .-. .-. 0,8 .-.
  |.1.|     .-. .-. .-. 1,3;1,4 .-. .-. .-. 1,8 .-.
  |.2.|     2,0 .-. .-. .-. .-. .-. 2,6 .-. .-. .-.
  |.3.|     3,0 .-. .-. .-. .-. .-. 3,6 .-. .-. .-.
  |.4.|     4,0 .-. .-. 4,3 .-. .-. .-. .-. .-. .-.
  |.5.|     .-. .-. .-. 5,3 .-. .-. .-. .-. .-. 5,9
  |.6.|     .-. .-. .-. 6,3 .-. .-. 6,6 .-. .-. .-.
  |.7.|     7,0 .-. .-. .-. .-. .-. .-. .-. .-. .-.
  |.8.|     .-. .-. .-. .-. .-. .-. .-. .-. .-. .-.
  |.9.|     .-. .-. .-. .-. 9,4;9,5;9,6;9,7 .-. .-.


   Для расстановки кораблей:

   9,4;9,5;9,6;9,7
   2,0;3,0;4,0
   4,3;5,3;6,3
   1,3;1,4
   0,8;1,8
   2,6;3,6
   0,1
   7,0
   6,6
   5,9
   .

        Координаты с ошибками

 .                .      9,4;9,5;9,6;9,7
 . лишний корабль .      7,0;7,1;7,2;7,3
 . валидность 1.  .      2,0;3,1;4,0
 .                .      2,0;3,0;4,0
 . не "," а "."   .      4.3;5,3;6,3
 .                .      4,3;5,3;6,3
 . лишний корабль .      9,0;9,1;9,2
 .                .      1,3;1,4
 . разрозненость  .      1,3;1,5
 .                .      0,8;1,8
 .     ореол      .      0,6;0,7
 . ;  отсут-ет    .      2,63,6
 .                .      2,6;3,6
 . лишний корабль .      8,9;9,9
 .                .      0,1
 .    повтор      .      0,1
 .                .      7,0
 .     x > 9      .      11,0
 .     Y < 0      .      7,-2
 .                .      6,6
 .  ореол(i = 0)  .      5,7
 .                .      5,9
 .                .      .


    Для нанесения ударов:

            9,4
            9,5
            9,6
            9,7
            2,0
            3,0
            4,0
            4,3
            5,3
            6,3
            1,3
            1,4
            0,8
            1,8
            2,6
            3,6
            0,1
            7,0
            6,6
            5,9
            .

 */