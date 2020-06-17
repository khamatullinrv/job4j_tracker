package ru.job4j.oop;

public class Jukebox {
    public void music(int choice){
        String song;
        if (choice == 1) {
             song = "Пусть бегут неуклюже";
        }
        else  if (choice == 2) {
             song = "Спокойной ночи";
        }
        else {
            song = "Песня не найдена";
        }
    System.out.println(song);
    }
    public static void main(String[] args) {
        Jukebox pesnya = new Jukebox();
        int position  = 3;
        pesnya.music(position);
    }
}
