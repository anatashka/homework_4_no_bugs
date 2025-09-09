package practice_3;

public class GameSettings {
    /*
    Класс GameSettings
    Создайте класс GameSettings с полями:
    static int maxPlayers — общее ограничение игроков
    final String gameName — название (нельзя менять)
    int currentPlayers — сколько игроков в игре сейчас
    Реализуйте конструктор, статический метод setMaxPlayers(int),
    метод addPlayer() — добавляет 1 игрока, если не превышен maxPlayers,
    метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
    В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
     */

    static int maxPlayers; // — общее ограничение игроков
    final String gameName; // — название (нельзя менять)
    int currentPlayers;

    public GameSettings (String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static int setMaxPlayers(int count){
        return GameSettings.maxPlayers = count;
    }

    public int addPlayer(){
        if (this.currentPlayers < GameSettings.maxPlayers){
            this.currentPlayers++;
        }
        return this.currentPlayers;
    }

    public void printGameStatus(){
        System.out.println("название: " + this.gameName + " текущее количество игроков: " + this.currentPlayers + " и максимальное количество игроков: " + GameSettings.maxPlayers);
    }
}
